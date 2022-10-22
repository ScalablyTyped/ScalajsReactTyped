package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsLocaleMod {
  
  @JSImport("class-validator/types/decorator/string/IsLocale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsLocale", "IS_LOCALE")
  @js.native
  val IS_LOCALE: /* "isLocale" */ String = js.native
  
  inline def IsLocale_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLocale")().asInstanceOf[PropertyDecorator]
  inline def IsLocale_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLocale")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isLocale(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocale")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
