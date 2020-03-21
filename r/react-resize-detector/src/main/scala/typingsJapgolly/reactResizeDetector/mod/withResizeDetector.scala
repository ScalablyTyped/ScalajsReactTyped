package typingsJapgolly.reactResizeDetector.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactResizeDetector.PartialReactResizeDetecto
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.height
import typingsJapgolly.reactResizeDetector.reactResizeDetectorStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-resize-detector", "withResizeDetector")
@js.native
object withResizeDetector extends js.Object {
  def apply[T /* <: PartialReactResizeDetecto */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, height | width]] = js.native
  def apply[T /* <: PartialReactResizeDetecto */](WrappedComponent: ComponentType[T], props: ReactResizeDetectorProps): ComponentType[Omit[T, height | width]] = js.native
}

