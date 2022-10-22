package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import typingsJapgolly.validator.mod.validator.IsURLOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsUrlMod {
  
  @JSImport("class-validator/types/decorator/string/IsUrl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsUrl", "IS_URL")
  @js.native
  val IS_URL: /* "isUrl" */ String = js.native
  
  inline def IsUrl_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUrl")().asInstanceOf[PropertyDecorator]
  inline def IsUrl_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUrl")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsUrl_(options: IsURLOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUrl")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsUrl_(options: IsURLOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUrl")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isURL(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isURL(value: String, options: IsURLOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
