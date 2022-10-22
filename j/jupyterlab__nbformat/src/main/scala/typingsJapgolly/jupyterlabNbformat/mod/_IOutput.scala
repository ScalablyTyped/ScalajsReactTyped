package typingsJapgolly.jupyterlabNbformat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _IOutput extends StObject
object _IOutput {
  
  inline def IDisplayData(data: IMimeBundle, metadata: OutputMetadata): typingsJapgolly.jupyterlabNbformat.mod.IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = "display_data")
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.IDisplayData]
  }
  
  inline def IError(ename: String, evalue: String, traceback: js.Array[String]): typingsJapgolly.jupyterlabNbformat.mod.IError = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = "error", traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.IError]
  }
  
  inline def IExecuteResult(data: IMimeBundle, metadata: OutputMetadata): typingsJapgolly.jupyterlabNbformat.mod.IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], output_type = "execute_result", execution_count = null)
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.IExecuteResult]
  }
  
  inline def IStream(name: StreamType, text: MultilineString): typingsJapgolly.jupyterlabNbformat.mod.IStream = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = "stream", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.jupyterlabNbformat.mod.IStream]
  }
}
