package typingsJapgolly.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRefresherTestTestDotutilsMod {
  
  @JSImport("@ionic/core/dist/types/components/refresher/test/test.utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Emulates a pull-to-refresh drag gesture (pulls down and releases).
    *
    * You will need to manually dispatch an event called `ionRefreshComplete`
    * in your `complete()` handler for the refresh event. Otherwise the `waitForEvent`
    * will complete when the timeout completes (5000ms).
    *
    * @param page The E2E Page object.
    * @param selector The element selector to center the drag gesture on. Defaults to `body`.
    */
  inline def pullToRefresh(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any
  ): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pullToRefresh")(page.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def pullToRefresh(
    page: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify E2EPage */ Any,
    selector: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullToRefresh")(page.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
