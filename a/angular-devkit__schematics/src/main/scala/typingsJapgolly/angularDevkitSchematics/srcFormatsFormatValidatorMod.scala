package typingsJapgolly.angularDevkitSchematics

import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaFormat
import typingsJapgolly.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaValidatorResult
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFormatsFormatValidatorMod {
  
  @JSImport("@angular-devkit/schematics/src/formats/format-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatValidator(data: JsonValue, dataSchema: JsonObject, formats: js.Array[SchemaFormat]): Observable_[SchemaValidatorResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValidator")(data.asInstanceOf[js.Any], dataSchema.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Observable_[SchemaValidatorResult]]
}
