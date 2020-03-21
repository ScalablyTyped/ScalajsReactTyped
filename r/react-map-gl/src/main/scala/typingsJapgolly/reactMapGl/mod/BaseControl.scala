package typingsJapgolly.reactMapGl.mod

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-map-gl", "BaseControl")
@js.native
class BaseControl[T /* <: BaseControlProps */, S /* <: Element */] ()
  extends Component[T, js.Object, js.Any] {
  var _containerRef: RefHandle[S] = js.native
  var _context: MapContextProps = js.native
}

