package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.E2EPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageEventSpyMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/event-spy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/event-spy", "EventSpy")
  @js.native
  open class EventSpy protected () extends StObject {
    def this(eventName: String) = this()
    
    /**
      * Keeping track of a cursor
      * ensures that no two spy.next()
      * calls point to the same event.
      */
    /* private */ var cursor: Any = js.native
    
    var eventName: String = js.native
    
    var events: js.Array[CustomEvent] = js.native
    
    def firstEvent: CustomEvent = js.native
    
    def lastEvent: CustomEvent = js.native
    
    def length: Double = js.native
    
    def next(): js.Promise[CustomEvent] = js.native
    
    def push(ev: CustomEvent): Unit = js.native
    
    /* private */ var queuedHandler: Any = js.native
  }
  
  inline def addE2EListener(
    page: E2EPage,
    elmHandle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSHandle */ Any,
    eventName: String,
    callback: js.Function1[/* ev */ Any, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addE2EListener")(page.asInstanceOf[js.Any], elmHandle.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def initPageEvents(page: E2EPage): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initPageEvents")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
