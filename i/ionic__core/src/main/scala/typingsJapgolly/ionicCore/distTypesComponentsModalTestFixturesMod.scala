package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageUtilsLocatorMod.E2ELocator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsModalTestFixturesMod {
  
  @JSImport("@ionic/core/dist/types/components/modal/test/fixtures", "CardModalPage")
  @js.native
  open class CardModalPage protected () extends StObject {
    def this(page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any) = this()
    
    /* private */ var ionModalDidDismiss: Any = js.native
    
    /* private */ var ionModalDidPresent: Any = js.native
    
    def navigate(url: String): js.Promise[Unit] = js.native
    
    def openModalByTrigger(selector: String): js.Promise[E2ELocator] = js.native
    
    /* private */ var page: Any = js.native
    
    def swipeToCloseModal(selector: String): js.Promise[Unit] = js.native
    def swipeToCloseModal(selector: String, waitForDismiss: Boolean): js.Promise[Unit] = js.native
    def swipeToCloseModal(selector: String, waitForDismiss: Boolean, swipeY: Double): js.Promise[Unit] = js.native
    def swipeToCloseModal(selector: String, waitForDismiss: Unit, swipeY: Double): js.Promise[Unit] = js.native
  }
}
