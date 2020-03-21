package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.sinon.mod.SinonSpy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/test", JSImport.Namespace)
@js.native
object testMod extends js.Object {
  def injectWrapperMethod(
    wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]],
    methodName: String,
    fn: js.Function0[Unit]
  ): Unit = js.native
  def setRenderSpy(wrapper: ReactWrapper[js.Object, js.Object, Component[js.Object, js.Object]]): SinonSpy = js.native
}

