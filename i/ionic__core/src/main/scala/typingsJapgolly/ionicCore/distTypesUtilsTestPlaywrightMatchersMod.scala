package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Message
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightMatchersMod {
  
  object matchers {
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright/matchers", "matchers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright/matchers", "matchers.toHaveReceivedEvent")
    @js.native
    def toHaveReceivedEvent: js.Function1[/* eventSpy */ EventSpy, Message] = js.native
    inline def toHaveReceivedEvent(eventSpy: EventSpy): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("toHaveReceivedEvent")(eventSpy.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright/matchers", "matchers.toHaveReceivedEventDetail")
    @js.native
    def toHaveReceivedEventDetail: js.Function2[/* eventSpy */ EventSpy, /* eventDetail */ Any, Message] = js.native
    inline def toHaveReceivedEventDetail(eventSpy: EventSpy, eventDetail: Any): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("toHaveReceivedEventDetail")(eventSpy.asInstanceOf[js.Any], eventDetail.asInstanceOf[js.Any])).asInstanceOf[Message]
    inline def toHaveReceivedEventDetail_=(x: js.Function2[/* eventSpy */ EventSpy, /* eventDetail */ Any, Message]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHaveReceivedEventDetail")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright/matchers", "matchers.toHaveReceivedEventTimes")
    @js.native
    def toHaveReceivedEventTimes: js.Function2[/* eventSpy */ EventSpy, /* count */ Double, Message] = js.native
    inline def toHaveReceivedEventTimes(eventSpy: EventSpy, count: Double): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("toHaveReceivedEventTimes")(eventSpy.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Message]
    inline def toHaveReceivedEventTimes_=(x: js.Function2[/* eventSpy */ EventSpy, /* count */ Double, Message]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHaveReceivedEventTimes")(x.asInstanceOf[js.Any])
    
    inline def toHaveReceivedEvent_=(x: js.Function1[/* eventSpy */ EventSpy, Message]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHaveReceivedEvent")(x.asInstanceOf[js.Any])
  }
}
