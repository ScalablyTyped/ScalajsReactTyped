package typingsJapgolly.reactAsync.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactAsync.AnonChildren
import typingsJapgolly.reactAsync.AnonChildrenPersist
import typingsJapgolly.reactAsync.AnonChildrenSettledChildren
import typingsJapgolly.reactAsync.AnonInitial
import typingsJapgolly.reactAsync.AnonPersist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "Async")
@js.native
class Async[T] ()
  extends Component[AsyncProps[T], AsyncState[T], js.Any]

@JSImport("react-async", "Async")
@js.native
object Async extends js.Object {
  def Fulfilled[T](props: AnonPersist[T]): Element = js.native
  def Initial[T](props: AnonChildren[T]): Element = js.native
  def Loading[T](props: AnonInitial[T]): Element = js.native
  def Pending[T](props: AnonInitial[T]): Element = js.native
  def Rejected[T](props: AnonChildrenPersist[T]): Element = js.native
  def Resolved[T](props: AnonPersist[T]): Element = js.native
  def Settled[T](props: AnonChildrenSettledChildren[T]): Element = js.native
}

