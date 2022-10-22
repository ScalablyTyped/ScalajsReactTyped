package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageUtilsSetContentMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/utils/set-content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setContent(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    html: String,
    testInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestInfo */ Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setContent")(page.asInstanceOf[js.Any], html.asInstanceOf[js.Any], testInfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
