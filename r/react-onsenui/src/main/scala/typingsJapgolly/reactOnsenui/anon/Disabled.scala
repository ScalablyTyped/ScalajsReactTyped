package typingsJapgolly.reactOnsenui.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Disabled {
  
  inline def apply(): Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabled]
  }
  
  extension [Self <: Disabled](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
