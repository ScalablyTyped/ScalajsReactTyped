package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.BOOLEAN_OPERATION
import typingsJapgolly.figma.figmaStrings.EXCLUDE
import typingsJapgolly.figma.figmaStrings.INTERSECT
import typingsJapgolly.figma.figmaStrings.SUBTRACT
import typingsJapgolly.figma.figmaStrings.UNION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BooleanOperationNode
  extends StObject
     with DefaultShapeMixin
     with ChildrenMixin
     with CornerMixin
     with SceneNode {
  
  var booleanOperation: UNION | INTERSECT | SUBTRACT | EXCLUDE = js.native
  
  var expanded: Boolean = js.native
  
  val `type`: BOOLEAN_OPERATION = js.native
}
