package typingsJapgolly.figma.mod.global

import typingsJapgolly.figma.figmaStrings.AUTO
import typingsJapgolly.figma.figmaStrings.FIXED
import typingsJapgolly.figma.figmaStrings.HORIZONTAL
import typingsJapgolly.figma.figmaStrings.NONE
import typingsJapgolly.figma.figmaStrings.VERTICAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultFrameMixin
  extends StObject
     with BaseNodeMixin
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
  
  var clipsContent: Boolean = js.native
  
  var counterAxisSizingMode: FIXED | AUTO = js.native
  
  var gridStyleId: String = js.native
  
  var guides: js.Array[Guide] = js.native
  
  // applicable only if layoutMode != "NONE"
  var horizontalPadding: Double = js.native
  
  // applicable only if layoutMode != "NONE"
  var itemSpacing: Double = js.native
  
  // applicable only if layoutMode != "NONE"
  var layoutGrids: js.Array[LayoutGrid] = js.native
  
  var layoutMode: NONE | HORIZONTAL | VERTICAL = js.native
  
  var numberOfFixedChildren: Double = js.native
  
  var overflowDirection: OverflowDirection = js.native
  
  val overlayBackground: OverlayBackground = js.native
  
  val overlayBackgroundInteraction: OverlayBackgroundInteraction = js.native
  
  val overlayPositionType: OverlayPositionType = js.native
  
  // applicable only if layoutMode != "NONE"
  var verticalPadding: Double = js.native
}
