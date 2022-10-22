package typingsJapgolly.ionicCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRefresherElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRefresherRefresherInterfaceMod {
  
  @js.native
  trait RefresherCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_RefresherCustomEvent: RefresherEventDetail = js.native
    
    @JSName("target")
    var target_RefresherCustomEvent: HTMLIonRefresherElement = js.native
  }
  
  trait RefresherEventDetail extends StObject {
    
    def complete(): Unit
  }
  object RefresherEventDetail {
    
    inline def apply(complete: Callback): RefresherEventDetail = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn)
      __obj.asInstanceOf[RefresherEventDetail]
    }
    
    extension [Self <: RefresherEventDetail](x: Self) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    }
  }
}
