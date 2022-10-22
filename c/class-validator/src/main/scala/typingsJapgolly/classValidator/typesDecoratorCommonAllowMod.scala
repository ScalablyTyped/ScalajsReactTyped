package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorCommonAllowMod {
  
  @JSImport("class-validator/types/decorator/common/Allow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Allow(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Allow")().asInstanceOf[PropertyDecorator]
  inline def Allow(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Allow")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
