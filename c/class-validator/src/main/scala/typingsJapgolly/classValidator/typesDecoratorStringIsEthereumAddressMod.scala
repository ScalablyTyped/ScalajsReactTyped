package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsEthereumAddressMod {
  
  @JSImport("class-validator/types/decorator/string/IsEthereumAddress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsEthereumAddress", "IS_ETHEREUM_ADDRESS")
  @js.native
  val IS_ETHEREUM_ADDRESS: /* "isEthereumAddress" */ String = js.native
  
  inline def IsEthereumAddress_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEthereumAddress")().asInstanceOf[PropertyDecorator]
  inline def IsEthereumAddress_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEthereumAddress")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isEthereumAddress(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEthereumAddress")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
