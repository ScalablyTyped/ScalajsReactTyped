package typingsJapgolly.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIsByteLengthMod {
  
  @JSImport("validator/lib/isByteLength", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Check if the string's length (in UTF-8 bytes) falls in a range.
    *
    * @param [options] - Options
    */
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, options: typingsJapgolly.validator.mod.validator.IsByteLengthOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type IsByteLengthOptions = typingsJapgolly.validator.mod.validator.IsByteLengthOptions
}
