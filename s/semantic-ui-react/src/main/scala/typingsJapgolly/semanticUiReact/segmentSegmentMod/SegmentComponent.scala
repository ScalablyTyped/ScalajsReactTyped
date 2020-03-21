package typingsJapgolly.semanticUiReact.segmentSegmentMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.segmentGroupMod.SegmentGroupProps
import typingsJapgolly.semanticUiReact.segmentInlineMod.SegmentInlineComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentComponent extends FunctionComponent[SegmentProps] {
  var Group: StatelessComponent[SegmentGroupProps] = js.native
  var Inline: SegmentInlineComponent = js.native
}

