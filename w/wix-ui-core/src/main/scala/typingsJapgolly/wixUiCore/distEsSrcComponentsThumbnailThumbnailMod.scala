package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.EventHandler
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsThumbnailThumbnailMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/thumbnail/Thumbnail", "Thumbnail")
  @js.native
  val Thumbnail: FunctionComponent[ThumbnailProps] = js.native
  
  trait ThumbnailProps extends StObject {
    
    /** Item to sit inside the Thumbnail */
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Is the thumbnail disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Callback when the element is clicked */
    var onClick: js.UndefOr[EventHandler[ReactMouseEventFrom[HTMLElement]]] = js.undefined
    
    /** Is the thumbnail selected */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /** Icon to display in when thumbnail is selected */
    var selectedIcon: js.UndefOr[Node] = js.undefined
  }
  object ThumbnailProps {
    
    inline def apply(): ThumbnailProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThumbnailProps]
    }
    
    extension [Self <: ThumbnailProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedIcon(value: VdomNode): Self = StObject.set(x, "selectedIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSelectedIconNull: Self = StObject.set(x, "selectedIcon", null)
      
      inline def setSelectedIconUndefined: Self = StObject.set(x, "selectedIcon", js.undefined)
      
      inline def setSelectedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "selectedIcon", js.Array(value*))
      
      inline def setSelectedIconVdomElement(value: VdomElement): Self = StObject.set(x, "selectedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
