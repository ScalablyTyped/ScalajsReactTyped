package typingsJapgolly.reachUtils

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.ReactEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@reach/utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def assignRef(): Unit = js.native
  def assignRef(ref: Ref): Unit = js.native
  def assignRef(ref: Ref, value: Node): Unit = js.native
  def checkStyles(pkg: String): js.Function0[Unit] = js.native
  def wrapEvent(handler: js.UndefOr[scala.Nothing], cb: ReactEventHandler[Element]): ReactEventHandler[Element] = js.native
  def wrapEvent(handler: ReactEventHandler[typingsJapgolly.std.Element], cb: ReactEventHandler[Element]): ReactEventHandler[Element] = js.native
}

