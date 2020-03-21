package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.POLYGON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonNode
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
  var pointCount: Double = js.native
  val `type`: POLYGON = js.native
}

