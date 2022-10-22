package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeTypesMod {
  
  trait BadgeOverrides extends StObject {
    
    var Badge: js.UndefOr[Override[Any]] = js.undefined
    
    var Positioner: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object BadgeOverrides {
    
    inline def apply(): BadgeOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeOverrides]
    }
    
    extension [Self <: BadgeOverrides](x: Self) {
      
      inline def setBadge(value: Override[Any]): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
      
      inline def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
      
      inline def setPositioner(value: Override[Any]): Self = StObject.set(x, "Positioner", value.asInstanceOf[js.Any])
      
      inline def setPositionerUndefined: Self = StObject.set(x, "Positioner", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait BadgeProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var content: Node
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var hierarchy: js.UndefOr[Hierarchy] = js.undefined
    
    var horizontalOffset: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[BadgeOverrides] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var shape: js.UndefOr[Shape] = js.undefined
    
    var verticalOffset: js.UndefOr[String] = js.undefined
  }
  object BadgeProps {
    
    inline def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal(content = null)
      __obj.asInstanceOf[BadgeProps]
    }
    
    extension [Self <: BadgeProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHierarchy(value: Hierarchy): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
      
      inline def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
      
      inline def setHorizontalOffset(value: String): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setOverrides(value: BadgeOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setVerticalOffset(value: String): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.accent
    - typingsJapgolly.baseui.baseuiStrings.primary
    - typingsJapgolly.baseui.baseuiStrings.positive
    - typingsJapgolly.baseui.baseuiStrings.warning
    - typingsJapgolly.baseui.baseuiStrings.negative
  */
  trait Color extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.primary
    - typingsJapgolly.baseui.baseuiStrings.secondary
  */
  trait Hierarchy extends StObject
  
  trait HintDotProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var horizontalOffset: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[BadgeOverrides] = js.undefined
    
    var verticalOffset: js.UndefOr[String] = js.undefined
  }
  object HintDotProps {
    
    inline def apply(): HintDotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HintDotProps]
    }
    
    extension [Self <: HintDotProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHorizontalOffset(value: String): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setOverrides(value: BadgeOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setVerticalOffset(value: String): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  trait NotificationCircleProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var content: Node
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var horizontalOffset: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[BadgeOverrides] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var verticalOffset: js.UndefOr[String] = js.undefined
  }
  object NotificationCircleProps {
    
    inline def apply(): NotificationCircleProps = {
      val __obj = js.Dynamic.literal(content = null)
      __obj.asInstanceOf[NotificationCircleProps]
    }
    
    extension [Self <: NotificationCircleProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setHorizontalOffset(value: String): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      inline def setOverrides(value: BadgeOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setVerticalOffset(value: String): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.bottomRightEdge
    - typingsJapgolly.baseui.baseuiStrings.topLeft
    - typingsJapgolly.baseui.baseuiStrings.rightTopEdge
    - typingsJapgolly.baseui.baseuiStrings.leftTopEdge
    - typingsJapgolly.baseui.baseuiStrings.topRightEdge
    - typingsJapgolly.baseui.baseuiStrings.topRight
    - typingsJapgolly.baseui.baseuiStrings.bottomLeft
    - typingsJapgolly.baseui.baseuiStrings.topLeftEdge
    - typingsJapgolly.baseui.baseuiStrings.topEdge
    - typingsJapgolly.baseui.baseuiStrings.bottomLeftEdge
    - typingsJapgolly.baseui.baseuiStrings.bottomRight
    - typingsJapgolly.baseui.baseuiStrings.rightBottomEdge
    - typingsJapgolly.baseui.baseuiStrings.bottomEdge
    - typingsJapgolly.baseui.baseuiStrings.leftBottomEdge
  */
  trait Placement extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.badge
    - typingsJapgolly.baseui.baseuiStrings.notificationCircle
    - typingsJapgolly.baseui.baseuiStrings.hintDot
  */
  trait Role extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.baseui.baseuiStrings.pill
    - typingsJapgolly.baseui.baseuiStrings.rectangle
  */
  trait Shape extends StObject
}
