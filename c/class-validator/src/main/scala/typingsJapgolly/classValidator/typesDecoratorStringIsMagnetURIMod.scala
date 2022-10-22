package typingsJapgolly.classValidator

import typingsJapgolly.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typingsJapgolly.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorStringIsMagnetURIMod {
  
  @JSImport("class-validator/types/decorator/string/IsMagnetURI", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/string/IsMagnetURI", "IS_MAGNET_URI")
  @js.native
  val IS_MAGNET_URI: /* "isMagnetURI" */ String = js.native
  
  inline def IsMagnetURI_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMagnetURI")().asInstanceOf[PropertyDecorator]
  inline def IsMagnetURI_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMagnetURI")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def isMagnetURI(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMagnetURI")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
