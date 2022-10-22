package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.anon.Referer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageUtilsGotoMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/utils/goto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
}
