package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorNumberIsDivisibleByMod {
  
  @JSImport("class-validator/types/decorator/number/IsDivisibleBy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/number/IsDivisibleBy", "IS_DIVISIBLE_BY")
  @js.native
  val IS_DIVISIBLE_BY: /* "isDivisibleBy" */ String = js.native
  
  inline def IsDivisibleBy_(num: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDivisibleBy")(num.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsDivisibleBy_(num: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDivisibleBy")(num.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isDivisibleBy(value: Any, num: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDivisibleBy")(value.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
