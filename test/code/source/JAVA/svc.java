package JAVA;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class svc

{
	// ---( internal utility methods )---

	final static svc _instance = new svc();

	static svc _newInstance() { return new svc(); }

	static svc _cast(Object o) { return (svc)o; }

	// ---( server methods )---




	public static final void svc_IF0006_endsWith (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(svc_IF0006_endsWith)>> ---
		// @sigtype java 3.5
		// [i] field:0:required string
		// [i] field:0:required suffix
		// [o] field:0:required value
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	string = IDataUtil.getString( pipelineCursor, "string" );
			String	suffix = IDataUtil.getString( pipelineCursor, "suffix" );
		pipelineCursor.destroy();
		
		// \uC791\uC131 \uCF54\uB4DC \uBD80\uBD84
		String value = string.endsWith(suffix) ? "true" : "false";
		
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		IDataUtil.put( pipelineCursor_1, "value", value );
		pipelineCursor_1.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

