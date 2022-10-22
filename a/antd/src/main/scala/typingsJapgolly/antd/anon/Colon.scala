package typingsJapgolly.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colon extends StObject {
  
  var colon: js.UndefOr[Boolean] = js.undefined
  
  var requiredMark: js.UndefOr[typingsJapgolly.antd.libFormFormMod.RequiredMark] = js.undefined
}
object Colon {
  
  inline def apply(): Colon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colon]
  }
  
  extension [Self <: Colon](x: Self) {
    
    inline def setColon(value: Boolean): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
    
    inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
    
    inline def setRequiredMark(value: typingsJapgolly.antd.libFormFormMod.RequiredMark): Self = StObject.set(x, "requiredMark", value.asInstanceOf[js.Any])
    
    inline def setRequiredMarkUndefined: Self = StObject.set(x, "requiredMark", js.undefined)
  }
}
