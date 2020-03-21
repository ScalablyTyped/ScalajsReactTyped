package typingsJapgolly.stardustUiReactComponentRef

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@stardust-ui/react-component-ref/dist/es/toRefObject", JSImport.Namespace)
@js.native
object toRefObjectMod extends js.Object {
  /** Creates a React ref object from existing DOM node. */
  def default[T /* <: Node */](node: T): RefHandle[T] = js.native
}

