package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import typingsJapgolly.validator.mod.validator.IdentityCardLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsIdentityCardMod {
  
  @JSImport("class-validator/types/decorator/string/IsIdentityCard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsIdentityCard", "IS_IDENTITY_CARD")
  @js.native
  val IS_IDENTITY_CARD: /* "isIdentityCard" */ String = js.native
  
  inline def IsIdentityCard_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentityCard")().asInstanceOf[PropertyDecorator]
  inline def IsIdentityCard_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentityCard")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsIdentityCard_(locale: IdentityCardLocale): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentityCard")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsIdentityCard_(locale: IdentityCardLocale, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentityCard")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isIdentityCard(value: Any, locale: IdentityCardLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentityCard")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
