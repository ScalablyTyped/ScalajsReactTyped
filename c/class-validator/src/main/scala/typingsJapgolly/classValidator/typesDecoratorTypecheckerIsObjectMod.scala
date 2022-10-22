package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorTypecheckerIsObjectMod {
  
  @JSImport("class-validator/types/decorator/typechecker/IsObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/typechecker/IsObject", "IS_OBJECT")
  @js.native
  val IS_OBJECT: /* "isObject" */ String = js.native
  
  inline def IsObject_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsObject")().asInstanceOf[PropertyDecorator]
  inline def IsObject_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsObject")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isObject(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
}
