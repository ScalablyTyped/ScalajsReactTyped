package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownProps extends StObject {
  
  /**
    * Ref for the element that the Dropdown will attach to, will most likely be a Button
    */
  var anchor: js.UndefOr[HTMLElement] = js.undefined
  
  var children: Element | js.Array[Element]
  
  /**
    * Removes the Layer component around Popover.
    * Should only be used in cases where Layer breaks the Dropdown positionings such as
    * when the anchor element is within a sticky component.
    */
  var dangerouslyRemoveLayer: js.UndefOr[Boolean] = js.undefined
  
  var headerContent: js.UndefOr[Node] = js.undefined
  
  /**
    * Unique id to identify this Dropdown
    */
  var id: String
  
  /**
    * Preferred direction for the Dropdown to open
    *
    * @default "down"
    */
  var idealDirection: js.UndefOr[FourDirections] = js.undefined
  
  def onDismiss(): Unit
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object DropdownProps {
  
  inline def apply(children: Element | js.Array[Element], id: String, onDismiss: Callback): DropdownProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onDismiss = onDismiss.toJsFn)
    __obj.asInstanceOf[DropdownProps]
  }
  
  extension [Self <: DropdownProps](x: Self) {
    
    inline def setAnchor(value: HTMLElement): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDangerouslyRemoveLayer(value: Boolean): Self = StObject.set(x, "dangerouslyRemoveLayer", value.asInstanceOf[js.Any])
    
    inline def setDangerouslyRemoveLayerUndefined: Self = StObject.set(x, "dangerouslyRemoveLayer", js.undefined)
    
    inline def setHeaderContent(value: VdomNode): Self = StObject.set(x, "headerContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setHeaderContentNull: Self = StObject.set(x, "headerContent", null)
    
    inline def setHeaderContentUndefined: Self = StObject.set(x, "headerContent", js.undefined)
    
    inline def setHeaderContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "headerContent", js.Array(value*))
    
    inline def setHeaderContentVdomElement(value: VdomElement): Self = StObject.set(x, "headerContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdealDirection(value: FourDirections): Self = StObject.set(x, "idealDirection", value.asInstanceOf[js.Any])
    
    inline def setIdealDirectionUndefined: Self = StObject.set(x, "idealDirection", js.undefined)
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
