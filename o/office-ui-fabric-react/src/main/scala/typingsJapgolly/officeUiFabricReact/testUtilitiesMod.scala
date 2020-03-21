package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.reactDom.testUtilsMod.SyntheticEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/common/testUtilities", JSImport.Namespace)
@js.native
object testUtilitiesMod extends js.Object {
  def delay(millisecond: Double): js.Promise[Unit] = js.native
  def expectMissing(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object]], className: String): Unit = js.native
  def expectNodes(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object]], className: String, n: Double): Unit = js.native
  def expectOne(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object]], className: String): Unit = js.native
  def findNodes(wrapper: ReactWrapper[_, _, Component[js.Object, js.Object]], className: String): ReactWrapper[_, _, Component[js.Object, js.Object]] = js.native
  def flushPromises(): js.Promise[Unit] = js.native
  def mockEvent(): SyntheticEventData = js.native
  def mockEvent(targetValue: String): SyntheticEventData = js.native
  def mountAttached[C /* <: Component[js.Object, js.Object] */, P, S](element: Element): ReactWrapper[P, S, C] = js.native
  def renderIntoDocument(element: Element): HTMLElement = js.native
}

