package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.ELLIPSE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EllipseNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with BlendMixin
     with GeometryMixin
     with LayoutMixin
     with ExportMixin
     with ConstraintMixin
     with CornerMixin {
  var arcData: ArcData = js.native
  val `type`: ELLIPSE = js.native
}

