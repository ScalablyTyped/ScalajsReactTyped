package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesThumbnailMod {
  
  @JSImport("wix-style-react/dist/types/Thumbnail", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[ThumbnailProps, js.Object, Any]
  
  type Thumbnail = PureComponent[ThumbnailProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.top
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
  */
  trait ThumbnailContentAlignment extends StObject
  object ThumbnailContentAlignment {
    
    inline def center: typingsJapgolly.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.center]
    
    inline def top: typingsJapgolly.wixStyleReact.wixStyleReactStrings.top = "top".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.top]
  }
  
  trait ThumbnailProps extends StObject {
    
    var backgroundImage: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentAlignment: js.UndefOr[ThumbnailContentAlignment] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var hideSelectedIcon: js.UndefOr[Boolean] = js.undefined
    
    var image: js.UndefOr[Node] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[
          /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[ThumbnailSize] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object ThumbnailProps {
    
    inline def apply(): ThumbnailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbnailProps]
    }
    
    extension [Self <: ThumbnailProps](x: Self) {
      
      inline def setBackgroundImage(value: VdomNode): Self = StObject.set(x, "backgroundImage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBackgroundImageNull: Self = StObject.set(x, "backgroundImage", null)
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setBackgroundImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "backgroundImage", js.Array(value*))
      
      inline def setBackgroundImageVdomElement(value: VdomElement): Self = StObject.set(x, "backgroundImage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentAlignment(value: ThumbnailContentAlignment): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
      
      inline def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDescription(value: VdomNode): Self = StObject.set(x, "description", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHideSelectedIcon(value: Boolean): Self = StObject.set(x, "hideSelectedIcon", value.asInstanceOf[js.Any])
      
      inline def setHideSelectedIconUndefined: Self = StObject.set(x, "hideSelectedIcon", js.undefined)
      
      inline def setImage(value: VdomNode): Self = StObject.set(x, "image", value.rawNode.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setImageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "image", js.Array(value*))
      
      inline def setImageVdomElement(value: VdomElement): Self = StObject.set(x, "image", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(
        value: /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement] => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSize(value: ThumbnailSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
  */
  trait ThumbnailSize extends StObject
  object ThumbnailSize {
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
}
