package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.csstype.mod.Property.Width
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHorizontalTimelineMod {
  
  @JSImport("wix-style-react/dist/types/HorizontalTimeline", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[HorizontalTimelineProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.ActiveIcon")
    @js.native
    def ActiveIcon: FC[HorizontalTimelineIcon] = js.native
    inline def ActiveIcon_=(x: FC[HorizontalTimelineIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ActiveIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.BoundaryIcon")
    @js.native
    def BoundaryIcon: FC[HorizontalTimelineIcon] = js.native
    inline def BoundaryIcon_=(x: FC[HorizontalTimelineIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BoundaryIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.CompleteIcon")
    @js.native
    def CompleteIcon: FC[HorizontalTimelineIcon] = js.native
    inline def CompleteIcon_=(x: FC[HorizontalTimelineIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CompleteIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.DefaultIcon")
    @js.native
    def DefaultIcon: FC[HorizontalTimelineIcon] = js.native
    inline def DefaultIcon_=(x: FC[HorizontalTimelineIcon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/HorizontalTimeline", "default.DestructiveIcon")
    @js.native
    def DestructiveIcon: FC[js.Object] = js.native
    inline def DestructiveIcon_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DestructiveIcon")(x.asInstanceOf[js.Any])
  }
  
  type HorizontalTimeline = PureComponent[HorizontalTimelineProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
  */
  trait HorizontalTimelineAlignLabel extends StObject
  object HorizontalTimelineAlignLabel {
    
    inline def center: typingsJapgolly.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.center]
    
    inline def start: typingsJapgolly.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait HorizontalTimelineIcon extends StObject {
    
    var skin: js.UndefOr[HorizontalTimelineSkin] = js.undefined
  }
  object HorizontalTimelineIcon {
    
    inline def apply(): HorizontalTimelineIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalTimelineIcon]
    }
    
    extension [Self <: HorizontalTimelineIcon](x: Self) {
      
      inline def setSkin(value: HorizontalTimelineSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  trait HorizontalTimelineItem extends StObject {
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var label: js.UndefOr[Node] = js.undefined
    
    var labelEllipsis: js.UndefOr[Boolean] = js.undefined
    
    var line: js.UndefOr[HorizontalTimelineItemLine] = js.undefined
    
    var skin: js.UndefOr[HorizontalTimelineItemSkin] = js.undefined
    
    var width: js.UndefOr[Width[String | Double]] = js.undefined
  }
  object HorizontalTimelineItem {
    
    inline def apply(): HorizontalTimelineItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalTimelineItem]
    }
    
    extension [Self <: HorizontalTimelineItem](x: Self) {
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelEllipsis(value: Boolean): Self = StObject.set(x, "labelEllipsis", value.asInstanceOf[js.Any])
      
      inline def setLabelEllipsisUndefined: Self = StObject.set(x, "labelEllipsis", js.undefined)
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLine(value: HorizontalTimelineItemLine): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setSkin(value: HorizontalTimelineItemSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setWidth(value: Width[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.filled
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dashed
  */
  trait HorizontalTimelineItemLine extends StObject
  object HorizontalTimelineItemLine {
    
    inline def dashed: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dashed = "dashed".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dashed]
    
    inline def filled: typingsJapgolly.wixStyleReact.wixStyleReactStrings.filled = "filled".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.filled]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.light
  */
  trait HorizontalTimelineItemSkin extends StObject
  object HorizontalTimelineItemSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def light: typingsJapgolly.wixStyleReact.wixStyleReactStrings.light = "light".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.light]
  }
  
  trait HorizontalTimelineProps extends StObject {
    
    var alignLabel: js.UndefOr[HorizontalTimelineAlignLabel] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[HorizontalTimelineItem]] = js.undefined
    
    var skin: js.UndefOr[HorizontalTimelineSkin] = js.undefined
  }
  object HorizontalTimelineProps {
    
    inline def apply(): HorizontalTimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalTimelineProps]
    }
    
    extension [Self <: HorizontalTimelineProps](x: Self) {
      
      inline def setAlignLabel(value: HorizontalTimelineAlignLabel): Self = StObject.set(x, "alignLabel", value.asInstanceOf[js.Any])
      
      inline def setAlignLabelUndefined: Self = StObject.set(x, "alignLabel", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setItems(value: js.Array[HorizontalTimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: HorizontalTimelineItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSkin(value: HorizontalTimelineSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
  */
  trait HorizontalTimelineSkin extends StObject
  object HorizontalTimelineSkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def standard: typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard]
  }
}
