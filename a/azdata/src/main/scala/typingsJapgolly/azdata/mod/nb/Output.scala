package typingsJapgolly.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azdata.mod.nb.IDisplayData
  - typingsJapgolly.azdata.mod.nb.IUpdateDisplayData
  - typingsJapgolly.azdata.mod.nb.IExecuteResult
  - typingsJapgolly.azdata.mod.nb.IErrorResult
  - typingsJapgolly.azdata.mod.nb.IStreamResult
*/
trait Output extends StObject
object Output {
  
  inline def IDisplayData(data: DisplayResultData): typingsJapgolly.azdata.mod.nb.IDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = "display_data")
    __obj.asInstanceOf[typingsJapgolly.azdata.mod.nb.IDisplayData]
  }
  
  inline def IErrorResult(ename: String, evalue: String): typingsJapgolly.azdata.mod.nb.IErrorResult = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], output_type = "error")
    __obj.asInstanceOf[typingsJapgolly.azdata.mod.nb.IErrorResult]
  }
  
  inline def IExecuteResult(data: DisplayResultData, execution_count: Double): typingsJapgolly.azdata.mod.nb.IExecuteResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], execution_count = execution_count.asInstanceOf[js.Any], output_type = "execute_result")
    __obj.asInstanceOf[typingsJapgolly.azdata.mod.nb.IExecuteResult]
  }
  
  inline def IStreamResult(name: StreamType, text: MultilineString): typingsJapgolly.azdata.mod.nb.IStreamResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], output_type = "stream", text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azdata.mod.nb.IStreamResult]
  }
  
  inline def IUpdateDisplayData(data: DisplayResultData): typingsJapgolly.azdata.mod.nb.IUpdateDisplayData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], output_type = "update_display_data")
    __obj.asInstanceOf[typingsJapgolly.azdata.mod.nb.IUpdateDisplayData]
  }
}
