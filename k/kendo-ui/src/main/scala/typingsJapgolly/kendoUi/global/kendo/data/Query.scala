package typingsJapgolly.kendoUi.global.kendo.data

import typingsJapgolly.kendoUi.kendo.data.DataSourceTransportReadOptionsData
import typingsJapgolly.kendoUi.kendo.data.QueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.Query")
@js.native
open class Query protected ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.data.Query {
  def this(data: js.Array[Any]) = this()
}
object Query {
  
  @JSGlobal("kendo.data.Query")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def process(data: js.Array[Any], options: DataSourceTransportReadOptionsData): QueryResult = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[QueryResult]
}
