package typingsJapgolly.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringRegexOptions extends StObject {
  
  /**
    * when true, the provided pattern will be disallowed instead of required.
    *
    * @default false
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * optional pattern name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object StringRegexOptions {
  
  inline def apply(): StringRegexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringRegexOptions]
  }
  
  extension [Self <: StringRegexOptions](x: Self) {
    
    inline def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
