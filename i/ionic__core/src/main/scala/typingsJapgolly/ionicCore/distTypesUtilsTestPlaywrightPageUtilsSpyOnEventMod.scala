package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.E2EPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageUtilsSpyOnEventMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/utils/spy-on-event", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spyOnEvent(page: E2EPage, eventName: String): js.Promise[EventSpy] = (^.asInstanceOf[js.Dynamic].applyDynamic("spyOnEvent")(page.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EventSpy]]
}
