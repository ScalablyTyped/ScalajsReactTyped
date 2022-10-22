package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonNavElement
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var forwardedRef: js.UndefOr[
    (MutableRefObject[HTMLIonNavElement | Null]) | (js.Function1[/* instance */ HTMLIonNavElement | Null, Unit]) | Null
  ] = js.undefined
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setForwardedRef(
      value: (MutableRefObject[HTMLIonNavElement | Null]) | (js.Function1[/* instance */ HTMLIonNavElement | Null, Unit])
    ): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ HTMLIonNavElement | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLIonNavElement | Null) => value(t0).runNow()))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
