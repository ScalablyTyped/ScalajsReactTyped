package typingsJapgolly.reactLeaflet.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactLeaflet.reactLeafletStrings.leaflet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-leaflet", "withLeaflet")
@js.native
object withLeaflet extends js.Object {
  def apply[T /* <: ContextProps */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, leaflet]] = js.native
}

