package typingsJapgolly.figma.mod._Global_

import typingsJapgolly.figma.figmaStrings.BOOLEAN_OPERATION
import typingsJapgolly.figma.figmaStrings.EXCLUDE
import typingsJapgolly.figma.figmaStrings.INTERSECT
import typingsJapgolly.figma.figmaStrings.SUBTRACT
import typingsJapgolly.figma.figmaStrings.UNION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BooleanOperationNode
  extends SceneNode
     with BaseNodeMixin
     with SceneNodeMixin
     with ReactionMixin
     with BlendMixin
     with GeometryMixin
     with LayoutMixin
     with ExportMixin
     with ChildrenMixin
     with CornerMixin {
  var booleanOperation: UNION | INTERSECT | SUBTRACT | EXCLUDE = js.native
  val `type`: BOOLEAN_OPERATION = js.native
}

