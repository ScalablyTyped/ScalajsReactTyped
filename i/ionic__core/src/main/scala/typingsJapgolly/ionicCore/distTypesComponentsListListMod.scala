package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.full
import typingsJapgolly.ionicCore.ionicCoreStrings.inset
import typingsJapgolly.ionicCore.ionicCoreStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsListListMod {
  
  @JSImport("@ionic/core/dist/types/components/list/list", "List")
  @js.native
  open class List ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `ion-item-sliding` are used inside the list, this method closes
      * any open sliding item.
      *
      * Returns `true` if an actual `ion-item-sliding` is closed.
      */
    def closeSlidingItems(): js.Promise[Boolean] = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * If `true`, the list will have margin around it and rounded corners.
      */
    var inset: Boolean = js.native
    
    /**
      * How the bottom border should be displayed on all items.
      */
    var lines: js.UndefOr[full | inset | none] = js.native
    
    @JSName("render")
    def render_MList(): Any = js.native
  }
}
