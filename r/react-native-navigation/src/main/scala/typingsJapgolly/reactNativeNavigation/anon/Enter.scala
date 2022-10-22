package typingsJapgolly.reactNativeNavigation.anon

import typingsJapgolly.reactNativeNavigation.libDistSrcInterfacesOptionsMod.ViewAnimationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  var enter: js.UndefOr[ViewAnimationOptions] = js.undefined
  
  var exit: js.UndefOr[ViewAnimationOptions] = js.undefined
}
object Enter {
  
  inline def apply(): Enter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enter]
  }
  
  extension [Self <: Enter](x: Self) {
    
    inline def setEnter(value: ViewAnimationOptions): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setExit(value: ViewAnimationOptions): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
  }
}
