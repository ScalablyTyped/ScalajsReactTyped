package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofjson extends StObject {
  
  def isJsonArray(value: JsonValue): /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray */ Boolean
  
  def isJsonObject(value: JsonValue): /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject */ Boolean
  
  val schema: TypeofschemaBuildJsonPointer
}
object Typeofjson {
  
  inline def apply(
    isJsonArray: JsonValue => /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray */ Boolean,
    isJsonObject: JsonValue => /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject */ Boolean,
    schema: TypeofschemaBuildJsonPointer
  ): Typeofjson = {
    val __obj = js.Dynamic.literal(isJsonArray = js.Any.fromFunction1(isJsonArray), isJsonObject = js.Any.fromFunction1(isJsonObject), schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofjson]
  }
  
  extension [Self <: Typeofjson](x: Self) {
    
    inline def setIsJsonArray(
      value: JsonValue => /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray */ Boolean
    ): Self = StObject.set(x, "isJsonArray", js.Any.fromFunction1(value))
    
    inline def setIsJsonObject(
      value: JsonValue => /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject */ Boolean
    ): Self = StObject.set(x, "isJsonObject", js.Any.fromFunction1(value))
    
    inline def setSchema(value: TypeofschemaBuildJsonPointer): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
