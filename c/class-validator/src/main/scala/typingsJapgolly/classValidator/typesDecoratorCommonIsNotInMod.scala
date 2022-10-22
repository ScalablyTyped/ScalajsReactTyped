package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorCommonIsNotInMod {
  
  @JSImport("class-validator/types/decorator/common/IsNotIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/common/IsNotIn", "IS_NOT_IN")
  @js.native
  val IS_NOT_IN: /* "isNotIn" */ String = js.native
  
  inline def IsNotIn_(values: js.Array[Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotIn")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNotIn_(values: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotIn")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isNotIn(value: Any, possibleValues: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotIn")(value.asInstanceOf[js.Any], possibleValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
