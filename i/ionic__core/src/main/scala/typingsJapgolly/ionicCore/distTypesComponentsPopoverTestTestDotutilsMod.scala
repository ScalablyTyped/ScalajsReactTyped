package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPopoverTestTestDotutilsMod {
  
  @JSImport("@ionic/core/dist/types/components/popover/test/test.utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closePopover(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closePopover")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def closePopover(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    popover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locator */ Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("closePopover")(page.asInstanceOf[js.Any], popover.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def openPopover(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    buttonID: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openPopover")(page.asInstanceOf[js.Any], buttonID.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def openPopover(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    buttonID: String,
    useEvalClick: Boolean
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("openPopover")(page.asInstanceOf[js.Any], buttonID.asInstanceOf[js.Any], useEvalClick.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def screenshotPopover(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    buttonID: String,
    testName: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("screenshotPopover")(page.asInstanceOf[js.Any], buttonID.asInstanceOf[js.Any], testName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
