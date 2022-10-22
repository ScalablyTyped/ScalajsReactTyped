package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorCommonIsNotEmptyMod {
  
  @JSImport("class-validator/types/decorator/common/IsNotEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsNotEmpty", "IS_NOT_EMPTY")
  @js.native
  val IS_NOT_EMPTY: /* "isNotEmpty" */ String = js.native
  
  inline def IsNotEmpty_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmpty")().asInstanceOf[PropertyDecorator]
  inline def IsNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmpty")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isNotEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
