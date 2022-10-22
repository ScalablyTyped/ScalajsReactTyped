package typingsJapgolly.reactOnsenui.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactOnsenui.mod.Navigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modifier extends StObject {
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* navigator */ Navigator, Unit]] = js.undefined
}
object Modifier {
  
  inline def apply(): Modifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modifier]
  }
  
  extension [Self <: Modifier](x: Self) {
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    inline def setOnClick(value: /* navigator */ Navigator => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* navigator */ Navigator) => value(t0).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
