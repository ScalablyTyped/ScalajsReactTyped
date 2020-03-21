package typingsJapgolly.baseui.ratingMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/rating", "StarRating")
@js.native
class StarRating ()
  extends Component[StarRatingProps, RatingState, js.Any] {
  def renderRatingContents(): js.Array[Node] = js.native
  def selectItem(value: Double): Unit = js.native
  def updatePreview(): Unit = js.native
  def updatePreview(previewIndex: Double): Unit = js.native
}

