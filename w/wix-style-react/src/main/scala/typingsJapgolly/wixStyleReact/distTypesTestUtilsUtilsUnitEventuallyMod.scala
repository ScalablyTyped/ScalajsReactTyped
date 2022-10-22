package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.anon.Interval
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTestUtilsUtilsUnitEventuallyMod {
  
  @JSImport("wix-style-react/dist/types/test-utils/utils/unit/eventually", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventually(fn: Any): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def eventually(fn: Any, has_timeout_interval: Interval): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eventually")(fn.asInstanceOf[js.Any], has_timeout_interval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
