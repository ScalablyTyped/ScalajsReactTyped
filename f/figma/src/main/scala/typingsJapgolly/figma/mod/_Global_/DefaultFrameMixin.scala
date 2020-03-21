package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.AUTO
import typingsJapgolly.figma.figmaStrings.FIXED
import typingsJapgolly.figma.figmaStrings.HORIZONTAL
import typingsJapgolly.figma.figmaStrings.NONE
import typingsJapgolly.figma.figmaStrings.VERTICAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultFrameMixin
  extends BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with ChildrenMixin
     with ContainerMixin
     with GeometryMixin
     with CornerMixin
     with RectangleCornerMixin
     with BlendMixin
     with ConstraintMixin
     with LayoutMixin
     with ExportMixin {
  var counterAxisSizingMode: FIXED | AUTO = js.native
   // applicable only if layoutMode != "NONE"
  var horizontalPadding: Double = js.native
   // applicable only if layoutMode != "NONE"
  var itemSpacing: Double = js.native
  var layoutMode: NONE | HORIZONTAL | VERTICAL = js.native
   // PROPOSED API ONLY
  var numberOfFixedChildren: Double = js.native
   // applicable only if layoutMode != "NONE"
  var overflowDirection: OverflowDirection = js.native
   // PROPOSED API ONLY
  val overlayBackground: OverlayBackground = js.native
   // PROPOSED API ONLY
  val overlayBackgroundInteraction: OverlayBackgroundInteraction = js.native
   // PROPOSED API ONLY
  val overlayPositionType: OverlayPositionType = js.native
   // applicable only if layoutMode != "NONE"
  var verticalPadding: Double = js.native
}

