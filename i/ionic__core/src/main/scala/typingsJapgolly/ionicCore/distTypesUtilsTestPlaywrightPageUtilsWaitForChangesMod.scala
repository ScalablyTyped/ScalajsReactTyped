package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageUtilsWaitForChangesMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/utils/wait-for-changes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def waitForChanges(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForChanges")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForChanges(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    timeoutMs: Double
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForChanges")(page.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
