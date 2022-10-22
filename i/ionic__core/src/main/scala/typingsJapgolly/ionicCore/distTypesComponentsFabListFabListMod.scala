package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonFabElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.bottom
import typingsJapgolly.ionicCore.ionicCoreStrings.end
import typingsJapgolly.ionicCore.ionicCoreStrings.start
import typingsJapgolly.ionicCore.ionicCoreStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsFabListFabListMod {
  
  @JSImport("@ionic/core/dist/types/components/fab-list/fab-list", "FabList")
  @js.native
  open class FabList ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, the fab list will show all fab buttons in the list.
      */
    var activated: Boolean = js.native
    
    /* protected */ def activatedChanged(activated: Boolean): Unit = js.native
    
    var el: HTMLIonFabElement = js.native
    
    @JSName("render")
    def render_MFabList(): Any = js.native
    
    /**
      * The side the fab list will show on relative to the main fab button.
      */
    var side: start | end | top | bottom = js.native
  }
}
