package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonReorderGroupElement
import typingsJapgolly.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReorderGroupReorderGroupInterfaceMod {
  
  @js.native
  trait ItemReorderCustomEvent
    extends StObject
       with CustomEvent[Any] {
    
    @JSName("detail")
    var detail_ItemReorderCustomEvent: ItemReorderEventDetail = js.native
    
    @JSName("target")
    var target_ItemReorderCustomEvent: HTMLIonReorderGroupElement = js.native
  }
  
  @js.native
  trait ItemReorderEventDetail extends StObject {
    
    def complete(): Any = js.native
    def complete(data: js.Array[Any]): Any = js.native
    def complete(data: Boolean): Any = js.native
    
    var from: Double = js.native
    
    var to: Double = js.native
  }
}
