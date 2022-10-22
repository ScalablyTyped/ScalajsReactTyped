package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsCreditCardMod {
  
  @JSImport("class-validator/types/decorator/string/IsCreditCard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsCreditCard", "IS_CREDIT_CARD")
  @js.native
  val IS_CREDIT_CARD: /* "isCreditCard" */ String = js.native
  
  inline def IsCreditCard_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCreditCard")().asInstanceOf[PropertyDecorator]
  inline def IsCreditCard_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCreditCard")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isCreditCard(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreditCard")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
