package typingsJapgolly.reactSketchapp.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactSketchapp.typesMod.SketchLayer
import typingsJapgolly.reactSketchapp.typesMod.WrappedSketchLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "render")
@js.native
object render extends js.Object {
  def apply(element: Element): SketchLayer | js.Array[SketchLayer] = js.native
  def apply(element: Element, container: SketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
  def apply(element: Element, container: WrappedSketchLayer): SketchLayer | js.Array[SketchLayer] = js.native
}

