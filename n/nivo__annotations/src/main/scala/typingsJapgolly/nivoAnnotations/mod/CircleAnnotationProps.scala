package typingsJapgolly.nivoAnnotations.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.nivoAnnotations.nivoAnnotationsStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @nivo/annotations.@nivo/annotations.CommonAnnotationProps & {  type  :'circle',   size  :number} */
trait CircleAnnotationProps extends AnnotationProps {
  var animate: js.UndefOr[Boolean] = js.undefined
  var containerHeight: Double
  var containerWidth: Double
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var note: Node
  var noteTextOffset: js.UndefOr[Double] = js.undefined
  var noteWidth: js.UndefOr[Double] = js.undefined
  var noteX: NoteCoordinate
  var noteY: NoteCoordinate
  var size: Double
  var `type`: circle
  var x: Double
  var y: Double
}

object CircleAnnotationProps {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    noteX: NoteCoordinate,
    noteY: NoteCoordinate,
    size: Double,
    `type`: circle,
    x: Double,
    y: Double,
    animate: js.UndefOr[Boolean] = js.undefined,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    note: VdomNode = null,
    noteTextOffset: Int | Double = null,
    noteWidth: Int | Double = null
  ): CircleAnnotationProps = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], noteX = noteX.asInstanceOf[js.Any], noteY = noteY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.rawNode.asInstanceOf[js.Any])
    if (noteTextOffset != null) __obj.updateDynamic("noteTextOffset")(noteTextOffset.asInstanceOf[js.Any])
    if (noteWidth != null) __obj.updateDynamic("noteWidth")(noteWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleAnnotationProps]
  }
}

