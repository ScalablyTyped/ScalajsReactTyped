package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringContainsMod {
  
  @JSImport("class-validator/types/decorator/string/Contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/Contains", "CONTAINS")
  @js.native
  val CONTAINS__ : /* "contains" */ String = js.native
  
  inline def Contains_(seed: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(seed.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Contains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(seed.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def contains(value: Any, seed: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(value.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
