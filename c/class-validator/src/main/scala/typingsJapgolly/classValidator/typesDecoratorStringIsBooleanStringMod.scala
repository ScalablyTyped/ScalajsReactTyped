package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsBooleanStringMod {
  
  @JSImport("class-validator/types/decorator/string/IsBooleanString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsBooleanString", "IS_BOOLEAN_STRING")
  @js.native
  val IS_BOOLEAN_STRING: /* "isBooleanString" */ String = js.native
  
  inline def IsBooleanString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBooleanString")().asInstanceOf[PropertyDecorator]
  inline def IsBooleanString_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBooleanString")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isBooleanString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
