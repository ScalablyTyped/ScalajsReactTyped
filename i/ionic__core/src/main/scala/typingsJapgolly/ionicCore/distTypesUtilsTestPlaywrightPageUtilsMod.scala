package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Referer
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageEventSpyMod.EventSpy
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageUtilsLocatorMod.E2ELocator
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPageUtilsLocatorMod.LocatorOptions
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.E2EPage
import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.SetIonViewportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageUtilsMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSnapshotSettings(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    testInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestInfo */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotSettings")(page.asInstanceOf[js.Any], testInfo.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def goto(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    url: String,
    options: Any,
    testInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestInfo */ Any,
    originalFn: js.Function2[
      /* url */ String, 
      /* options */ js.UndefOr[Referer], 
      js.Promise[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_playwright-core.Response */ Any) | Null
      ]
    ]
  ): js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_playwright-core.Response */ Any) | Null
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("goto")(page.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], testInfo.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_playwright-core.Response */ Any) | Null
  ]]
  
  inline def locator(
    page: E2EPage,
    originalFn: js.Function2[/* selector */ String, /* options */ js.UndefOr[LocatorOptions], E2ELocator],
    selector: String
  ): E2ELocator = (^.asInstanceOf[js.Dynamic].applyDynamic("locator")(page.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[E2ELocator]
  inline def locator(
    page: E2EPage,
    originalFn: js.Function2[/* selector */ String, /* options */ js.UndefOr[LocatorOptions], E2ELocator],
    selector: String,
    options: LocatorOptions
  ): E2ELocator = (^.asInstanceOf[js.Dynamic].applyDynamic("locator")(page.asInstanceOf[js.Any], originalFn.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[E2ELocator]
  
  inline def setContent(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    html: String,
    testInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestInfo */ Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContent")(page.asInstanceOf[js.Any], html.asInstanceOf[js.Any], testInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setIonViewport(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIonViewport")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setIonViewport(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    options: SetIonViewportOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIonViewport")(page.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def spyOnEvent(page: E2EPage, eventName: String): js.Promise[EventSpy] = (^.asInstanceOf[js.Dynamic].applyDynamic("spyOnEvent")(page.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[EventSpy]]
  
  inline def waitForChanges(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForChanges")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForChanges(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    timeoutMs: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForChanges")(page.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
