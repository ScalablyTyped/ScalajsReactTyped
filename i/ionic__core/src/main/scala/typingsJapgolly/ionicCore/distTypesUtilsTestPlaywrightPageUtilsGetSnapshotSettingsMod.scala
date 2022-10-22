package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageUtilsGetSnapshotSettingsMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/utils/get-snapshot-settings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSnapshotSettings(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    testInfo: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TestInfo */ Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSnapshotSettings")(page.asInstanceOf[js.Any], testInfo.asInstanceOf[js.Any])).asInstanceOf[String]
}
