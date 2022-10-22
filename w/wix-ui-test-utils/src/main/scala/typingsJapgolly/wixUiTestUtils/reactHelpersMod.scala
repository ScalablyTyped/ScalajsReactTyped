package typingsJapgolly.wixUiTestUtils

import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixUiTestUtils.anon.Instantiable
import typingsJapgolly.wixUiTestUtils.anon.TypeofSimulate
import typingsJapgolly.wixUiTestUtils.distSrcReactHelpersHelpersMod.ControlledComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactHelpersMod {
  
  @JSImport("wix-ui-test-utils/react-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClassExists(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExists")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeControlled[T /* <: ControlledComponentProps */](Component: FunctionComponent[T]): Instantiable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeControlled")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable[T]]
  
  inline def reactEventTrigger(): TypeofSimulate = ^.asInstanceOf[js.Dynamic].applyDynamic("reactEventTrigger")().asInstanceOf[TypeofSimulate]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
