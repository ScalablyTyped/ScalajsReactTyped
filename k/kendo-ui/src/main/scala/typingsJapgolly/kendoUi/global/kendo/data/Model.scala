package typingsJapgolly.kendoUi.global.kendo.data

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.kendoUi.anon.TypeofModel
import typingsJapgolly.kendoUi.kendo.data.DataSourceSchemaModelFields
import typingsJapgolly.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsArray
import typingsJapgolly.kendoUi.kendo.data.DataSourceSchemaModelWithFieldsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("kendo.data.Model")
@js.native
open class Model ()
  extends StObject
     with typingsJapgolly.kendoUi.kendo.data.Model {
  def this(data: Any) = this()
}
object Model {
  
  @JSGlobal("kendo.data.Model")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsArray): TypeofModel & (Instantiable1[/* data */ js.UndefOr[Any], typingsJapgolly.kendoUi.kendo.data.Model]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofModel & (Instantiable1[/* data */ js.UndefOr[Any], typingsJapgolly.kendoUi.kendo.data.Model])]
  /* static member */
  inline def define(options: DataSourceSchemaModelWithFieldsObject): TypeofModel & (Instantiable1[/* data */ js.UndefOr[Any], typingsJapgolly.kendoUi.kendo.data.Model]) = ^.asInstanceOf[js.Dynamic].applyDynamic("define")(options.asInstanceOf[js.Any]).asInstanceOf[TypeofModel & (Instantiable1[/* data */ js.UndefOr[Any], typingsJapgolly.kendoUi.kendo.data.Model])]
  
  /* static member */
  @JSGlobal("kendo.data.Model.fields")
  @js.native
  def fields: DataSourceSchemaModelFields = js.native
  inline def fields_=(x: DataSourceSchemaModelFields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fields")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("kendo.data.Model.idField")
  @js.native
  def idField: String = js.native
  inline def idField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("idField")(x.asInstanceOf[js.Any])
}
