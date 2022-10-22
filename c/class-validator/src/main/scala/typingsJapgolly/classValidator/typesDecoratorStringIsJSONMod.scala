package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsJSONMod {
  
  @JSImport("class-validator/types/decorator/string/IsJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsJSON", "IS_JSON")
  @js.native
  val IS_JSON: /* "isJson" */ String = js.native
  
  inline def IsJSON_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJSON")().asInstanceOf[PropertyDecorator]
  inline def IsJSON_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJSON")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isJSON(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSON")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
