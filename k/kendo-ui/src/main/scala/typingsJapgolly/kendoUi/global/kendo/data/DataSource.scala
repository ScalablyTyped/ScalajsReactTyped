package typingsJapgolly.kendoUi.global.kendo.data

import typingsJapgolly.kendoUi.kendo.data.DataSourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.DataSource")
@js.native
open class DataSource ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.data.DataSource {
  def this(options: DataSourceOptions) = this()
}
object DataSource {
  
  @JSGlobal("kendo.data.DataSource")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(): typingsJapgolly.kendoUi.kendo.data.DataSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.kendoUi.kendo.data.DataSource]
  inline def create(options: DataSourceOptions): typingsJapgolly.kendoUi.kendo.data.DataSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.data.DataSource]
}
