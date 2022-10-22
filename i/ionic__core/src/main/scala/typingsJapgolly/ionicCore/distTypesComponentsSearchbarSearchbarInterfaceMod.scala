package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSearchbarElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSearchbarSearchbarInterfaceMod {
  
  trait SearchbarChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SearchbarChangeEventDetail {
    
    inline def apply(): SearchbarChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchbarChangeEventDetail]
    }
    
    extension [Self <: SearchbarChangeEventDetail](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SearchbarCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_SearchbarCustomEvent: SearchbarChangeEventDetail = js.native
    
    @JSName("target")
    var target_SearchbarCustomEvent: HTMLIonSearchbarElement = js.native
  }
}
