package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesUtilsTestPlaywrightPlaywrightDeclarationsMod.SetIonViewportOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsTestPlaywrightPageUtilsSetIonViewportMod {
  
  @JSImport("@ionic/core/dist/types/utils/test/playwright/page/utils/set-ion-viewport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setIonViewport(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIonViewport")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setIonViewport(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Page */ Any,
    options: SetIonViewportOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIonViewport")(page.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
