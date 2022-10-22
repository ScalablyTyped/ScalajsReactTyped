package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Message
import typingsJapgolly.ionicCore.anon.Portrait
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.E2EPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright", "EventSpy")
  @js.native
  open class EventSpy protected ()
    extends typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy {
    def this(eventName: String) = this()
  }
  
  object Viewports {
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright", "Viewports")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright", "Viewports.tablet")
    @js.native
    def tablet: Portrait = js.native
    inline def tablet_=(x: Portrait): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tablet")(x.asInstanceOf[js.Any])
  }
  
  inline def addE2EListener(
    page: E2EPage,
    elmHandle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSHandle */ Any,
    eventName: String,
    callback: js.Function1[/* ev */ Any, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addE2EListener")(page.asInstanceOf[js.Any], elmHandle.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Double,
    dragByY: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Double,
    dragByY: Double,
    startXCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Double,
    dragByY: Double,
    startXCoord: Double,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Double,
    dragByY: Double,
    startXCoord: Unit,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Double,
    dragByY: Unit,
    startXCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Double,
    dragByY: Unit,
    startXCoord: Double,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Double,
    dragByY: Unit,
    startXCoord: Unit,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Unit,
    dragByY: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Unit,
    dragByY: Double,
    startXCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Unit,
    dragByY: Double,
    startXCoord: Double,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Unit,
    dragByY: Double,
    startXCoord: Unit,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Unit,
    dragByY: Unit,
    startXCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Unit,
    dragByY: Unit,
    startXCoord: Double,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementBy(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByX: Unit,
    dragByY: Unit,
    startXCoord: Unit,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementBy")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByX.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startXCoord.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def dragElementByYAxis(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByY: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementByYAxis")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def dragElementByYAxis(
    el: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ElementHandle<SVGElement | HTMLElement> */ Any,
    page: E2EPage,
    dragByY: Double,
    startYCoord: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("dragElementByYAxis")(el.asInstanceOf[js.Any], page.asInstanceOf[js.Any], dragByY.asInstanceOf[js.Any], startYCoord.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def extendPageFixture(
    page: E2EPage,
    testInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestInfo */ Any
  ): js.Promise[E2EPage] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendPageFixture")(page.asInstanceOf[js.Any], testInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[E2EPage]]
  
  inline def initPageEvents(page: E2EPage): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("initPageEvents")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  object matchers {
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright", "matchers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright", "matchers.toHaveReceivedEvent")
    @js.native
    def toHaveReceivedEvent: js.Function1[
        /* eventSpy */ typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy, 
        Message
      ] = js.native
    inline def toHaveReceivedEvent(eventSpy: typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy): Message = ^.asInstanceOf[js.Dynamic].applyDynamic("toHaveReceivedEvent")(eventSpy.asInstanceOf[js.Any]).asInstanceOf[Message]
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright", "matchers.toHaveReceivedEventDetail")
    @js.native
    def toHaveReceivedEventDetail: js.Function2[
        /* eventSpy */ typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy, 
        /* eventDetail */ Any, 
        Message
      ] = js.native
    inline def toHaveReceivedEventDetail(
      eventSpy: typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy,
      eventDetail: Any
    ): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("toHaveReceivedEventDetail")(eventSpy.asInstanceOf[js.Any], eventDetail.asInstanceOf[js.Any])).asInstanceOf[Message]
    inline def toHaveReceivedEventDetail_=(
      x: js.Function2[
          /* eventSpy */ typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy, 
          /* eventDetail */ Any, 
          Message
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHaveReceivedEventDetail")(x.asInstanceOf[js.Any])
    
    @JSImport("@ionic/core/dist/types/utils/test/playwright", "matchers.toHaveReceivedEventTimes")
    @js.native
    def toHaveReceivedEventTimes: js.Function2[
        /* eventSpy */ typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy, 
        /* count */ Double, 
        Message
      ] = js.native
    inline def toHaveReceivedEventTimes(
      eventSpy: typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy,
      count: Double
    ): Message = (^.asInstanceOf[js.Dynamic].applyDynamic("toHaveReceivedEventTimes")(eventSpy.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Message]
    inline def toHaveReceivedEventTimes_=(
      x: js.Function2[
          /* eventSpy */ typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy, 
          /* count */ Double, 
          Message
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHaveReceivedEventTimes")(x.asInstanceOf[js.Any])
    
    inline def toHaveReceivedEvent_=(
      x: js.Function1[
          /* eventSpy */ typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy, 
          Message
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toHaveReceivedEvent")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright", "test")
  @js.native
  val test: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_test.TestType<PlaywrightTestArgs & PlaywrightTestOptions & CustomFixtures, PlaywrightWorkerArgs & PlaywrightWorkerOptions> */ Any = js.native
}
