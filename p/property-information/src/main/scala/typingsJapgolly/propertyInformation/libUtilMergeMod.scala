package typingsJapgolly.propertyInformation

import typingsJapgolly.propertyInformation.libUtilSchemaMod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMergeMod {
  
  @JSImport("property-information/lib/util/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def merge(definitions: js.Array[Schema]): Schema = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(definitions.asInstanceOf[js.Any]).asInstanceOf[Schema]
  inline def merge(definitions: js.Array[Schema], space: String): Schema = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(definitions.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[Schema]
  
  type Normal = typingsJapgolly.propertyInformation.libUtilSchemaMod.Normal
  
  type Properties = typingsJapgolly.propertyInformation.libUtilSchemaMod.Properties
}
