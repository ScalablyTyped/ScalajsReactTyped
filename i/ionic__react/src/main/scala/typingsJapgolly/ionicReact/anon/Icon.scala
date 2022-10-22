package typingsJapgolly.ionicReact.anon

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonBackButtonElement
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: js.UndefOr[Ios | String] = js.undefined
  
  var ref: js.UndefOr[Ref[HTMLIonBackButtonElement]] = js.undefined
}
object Icon {
  
  inline def apply(): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icon]
  }
  
  extension [Self <: Icon](x: Self) {
    
    inline def setIcon(value: Ios | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setRef(value: Ref[HTMLIonBackButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: HTMLIonBackButtonElement | Null => japgolly.scalajs.react.Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLIonBackButtonElement | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
