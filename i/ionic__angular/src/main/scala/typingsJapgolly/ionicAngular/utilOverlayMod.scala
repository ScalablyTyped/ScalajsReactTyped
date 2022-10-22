package typingsJapgolly.ionicAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilOverlayMod {
  
  @JSImport("@ionic/angular/util/overlay", "OverlayBaseController")
  @js.native
  open class OverlayBaseController[Opts, Overlay] protected ()
    extends StObject
       with ControllerShape[Opts, Overlay] {
    def this(ctrl: ControllerShape[Opts, Overlay]) = this()
    
    /**
      * Creates a new overlay
      */
    def create(): js.Promise[Overlay] = js.native
    
    /* private */ var ctrl: Any = js.native
  }
  
  @js.native
  trait ControllerShape[Opts, HTMLElm] extends StObject {
    
    def create(options: Opts): js.Promise[HTMLElm] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: Any): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: String, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: Unit, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = js.native
    
    def getTop(): js.Promise[js.UndefOr[HTMLElm]] = js.native
  }
}
