package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorTypecheckerIsArrayMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsArray", "IS_ARRAY")
  @js.native
  val IS_ARRAY: /* "isArray" */ String = js.native
  
  inline def IsArray_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsArray")().asInstanceOf[PropertyDecorator]
  inline def IsArray_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsArray")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isArray(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
