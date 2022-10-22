package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonActionSheetElement
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedRef extends StObject {
  
  var forwardedRef: js.UndefOr[
    (MutableRefObject[HTMLIonActionSheetElement | Null]) | (js.Function1[/* instance */ HTMLIonActionSheetElement | Null, Unit]) | Null
  ] = js.undefined
}
object ForwardedRef {
  
  inline def apply(): ForwardedRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef]
  }
  
  extension [Self <: ForwardedRef](x: Self) {
    
    inline def setForwardedRef(
      value: (MutableRefObject[HTMLIonActionSheetElement | Null]) | (js.Function1[/* instance */ HTMLIonActionSheetElement | Null, Unit])
    ): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    inline def setForwardedRefFunction1(value: /* instance */ HTMLIonActionSheetElement | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1((t0: /* instance */ HTMLIonActionSheetElement | Null) => value(t0).runNow()))
    
    inline def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    inline def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
