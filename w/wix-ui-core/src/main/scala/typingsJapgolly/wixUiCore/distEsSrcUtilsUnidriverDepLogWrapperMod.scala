package typingsJapgolly.wixUiCore

import typingsJapgolly.unidriverCore.mod.UniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcUtilsUnidriverDepLogWrapperMod {
  
  @JSImport("wix-ui-core/dist/es/src/utils/unidriver-dep-log-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unidriverDepLogWrapper[T](originalDriverFactory: js.Function1[/* base */ UniDriver[Any], T], driverFactoryName: String): js.Function1[/* base */ UniDriver[Any], T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unidriverDepLogWrapper")(originalDriverFactory.asInstanceOf[js.Any], driverFactoryName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* base */ UniDriver[Any], T]]
}
