package typingsJapgolly.ssri.anon

import typingsJapgolly.ssri.ssriBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsSingle extends StObject {
  
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  var single: js.UndefOr[`false`] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object OptionsSingle {
  
  inline def apply(): OptionsSingle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSingle]
  }
  
  extension [Self <: OptionsSingle](x: Self) {
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSingle(value: `false`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
