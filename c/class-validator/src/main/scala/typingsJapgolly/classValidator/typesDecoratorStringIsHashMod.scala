package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import typingsJapgolly.validator.mod.validator.HashAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsHashMod {
  
  @JSImport("class-validator/types/decorator/string/IsHash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsHash", "IS_HASH")
  @js.native
  val IS_HASH: /* "isHash" */ String = js.native
  
  inline def IsHash_(algorithm: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsHash_(algorithm: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsHash")(algorithm.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def isHash(value: Any, algorithm: HashAlgorithm): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHash")(value.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
