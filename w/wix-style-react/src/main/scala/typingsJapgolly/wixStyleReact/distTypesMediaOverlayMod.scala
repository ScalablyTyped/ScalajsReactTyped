package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMediaOverlayMod {
  
  @JSImport("wix-style-react/dist/types/MediaOverlay", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[MediaOverlayProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/MediaOverlay", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/MediaOverlay", "default.Content")
    @js.native
    def Content: FC[MediaOverlayContentProps] = js.native
    inline def Content_=(x: FC[MediaOverlayContentProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/MediaOverlay", "default.DragHandle")
    @js.native
    def DragHandle: FC[js.Object] = js.native
    inline def DragHandle_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DragHandle")(x.asInstanceOf[js.Any])
  }
  
  type MediaOverlay = PureComponent[MediaOverlayProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.`top-start`
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.`top-end`
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.`bottom-end`
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.`bottom-start`
  */
  trait MediaOverlayContentPlacement extends StObject
  object MediaOverlayContentPlacement {
    
    inline def `bottom-end`: typingsJapgolly.wixStyleReact.wixStyleReactStrings.`bottom-end` = "bottom-end".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.`bottom-end`]
    
    inline def `bottom-start`: typingsJapgolly.wixStyleReact.wixStyleReactStrings.`bottom-start` = "bottom-start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.`bottom-start`]
    
    inline def middle: typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle = "middle".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.middle]
    
    inline def `top-end`: typingsJapgolly.wixStyleReact.wixStyleReactStrings.`top-end` = "top-end".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.`top-end`]
    
    inline def `top-start`: typingsJapgolly.wixStyleReact.wixStyleReactStrings.`top-start` = "top-start".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.`top-start`]
  }
  
  trait MediaOverlayContentProps extends StObject {
    
    var placement: js.UndefOr[MediaOverlayContentPlacement] = js.undefined
    
    var visible: js.UndefOr[MediaOverlayContentVisible] = js.undefined
  }
  object MediaOverlayContentProps {
    
    inline def apply(): MediaOverlayContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOverlayContentProps]
    }
    
    extension [Self <: MediaOverlayContentProps](x: Self) {
      
      inline def setPlacement(value: MediaOverlayContentPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setVisible(value: MediaOverlayContentVisible): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.default
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.always
  */
  trait MediaOverlayContentVisible extends StObject
  object MediaOverlayContentVisible {
    
    inline def default: typingsJapgolly.wixStyleReact.wixStyleReactStrings.default = "default".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.default]
    
    inline def always: typingsJapgolly.wixStyleReact.wixStyleReactStrings.always = "always".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.always]
    
    inline def hover: typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover = "hover".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.hover]
  }
  
  trait MediaOverlayProps extends StObject {
    
    var borderRadius: js.UndefOr[String | Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var hoverSkin: js.UndefOr[MediaOverlaySkin] = js.undefined
    
    var hovered: js.UndefOr[Boolean] = js.undefined
    
    var media: Node
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var removeRoundedBorders: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[MediaOverlaySkin] = js.undefined
  }
  object MediaOverlayProps {
    
    inline def apply(): MediaOverlayProps = {
      val __obj = js.Dynamic.literal(media = null)
      __obj.asInstanceOf[MediaOverlayProps]
    }
    
    extension [Self <: MediaOverlayProps](x: Self) {
      
      inline def setBorderRadius(value: String | Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setHoverSkin(value: MediaOverlaySkin): Self = StObject.set(x, "hoverSkin", value.asInstanceOf[js.Any])
      
      inline def setHoverSkinUndefined: Self = StObject.set(x, "hoverSkin", js.undefined)
      
      inline def setHovered(value: Boolean): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
      
      inline def setHoveredUndefined: Self = StObject.set(x, "hovered", js.undefined)
      
      inline def setMedia(value: VdomNode): Self = StObject.set(x, "media", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMediaNull: Self = StObject.set(x, "media", null)
      
      inline def setMediaVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "media", js.Array(value*))
      
      inline def setMediaVdomElement(value: VdomElement): Self = StObject.set(x, "media", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRemoveRoundedBorders(value: Boolean): Self = StObject.set(x, "removeRoundedBorders", value.asInstanceOf[js.Any])
      
      inline def setRemoveRoundedBordersUndefined: Self = StObject.set(x, "removeRoundedBorders", js.undefined)
      
      inline def setSkin(value: MediaOverlaySkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark
  */
  trait MediaOverlaySkin extends StObject
  object MediaOverlaySkin {
    
    inline def dark: typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark = "dark".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.dark]
    
    inline def gradient: typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient = "gradient".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.gradient]
    
    inline def none: none_ = "none".asInstanceOf[none_]
  }
}
