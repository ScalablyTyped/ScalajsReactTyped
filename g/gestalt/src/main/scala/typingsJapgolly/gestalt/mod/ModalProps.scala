package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.gestaltStrings.`100`
import typingsJapgolly.gestalt.gestaltStrings.`200`
import typingsJapgolly.gestalt.gestaltStrings.`300`
import typingsJapgolly.gestalt.gestaltStrings.`400`
import typingsJapgolly.gestalt.gestaltStrings.`500`
import typingsJapgolly.gestalt.gestaltStrings.`600`
import typingsJapgolly.gestalt.gestaltStrings.alertdialog
import typingsJapgolly.gestalt.gestaltStrings.center
import typingsJapgolly.gestalt.gestaltStrings.dialog
import typingsJapgolly.gestalt.gestaltStrings.left
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModalProps extends StObject {
  
  /*
    * Temporary undocumented prop to disable ScrollBoundaryContainer.
    */
  var _dangerouslyDisableScrollBoundaryContainer: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityModalLabel: String
  
  /**
    * Use to specify the alignment of `heading` & `subHeading` strings
    *
    * @default "center"
    */
  var align: js.UndefOr[center | left] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * Close the modal when you click outside of it
    *
    * @default true
    */
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.undefined
  
  var footer: js.UndefOr[Node] = js.undefined
  
  var heading: js.UndefOr[Node] = js.undefined
  
  def onDismiss(): Unit
  
  var role: js.UndefOr[alertdialog | dialog] = js.undefined
  
  var size: js.UndefOr[sm | md | lg | `100` | `200` | `300` | `400` | `500` | `600`] = js.undefined
  
  /**
    * Only renders with `heading` strings
    */
  var subHeading: js.UndefOr[String] = js.undefined
}
object ModalProps {
  
  inline def apply(accessibilityModalLabel: String, onDismiss: Callback): ModalProps = {
    val __obj = js.Dynamic.literal(accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], onDismiss = onDismiss.toJsFn)
    __obj.asInstanceOf[ModalProps]
  }
  
  extension [Self <: ModalProps](x: Self) {
    
    inline def setAccessibilityModalLabel(value: String): Self = StObject.set(x, "accessibilityModalLabel", value.asInstanceOf[js.Any])
    
    inline def setAlign(value: center | left): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClick(value: Boolean): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def setFooterNull: Self = StObject.set(x, "footer", null)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setFooterVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "footer", js.Array(value*))
    
    inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHeading(value: VdomNode): Self = StObject.set(x, "heading", value.rawNode.asInstanceOf[js.Any])
    
    inline def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHeadingVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "heading", js.Array(value*))
    
    inline def setHeadingVdomElement(value: VdomElement): Self = StObject.set(x, "heading", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOnDismiss(value: Callback): Self = StObject.set(x, "onDismiss", value.toJsFn)
    
    inline def setRole(value: alertdialog | dialog): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSize(value: sm | md | lg | `100` | `200` | `300` | `400` | `500` | `600`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSubHeading(value: String): Self = StObject.set(x, "subHeading", value.asInstanceOf[js.Any])
    
    inline def setSubHeadingUndefined: Self = StObject.set(x, "subHeading", js.undefined)
    
    inline def set_dangerouslyDisableScrollBoundaryContainer(value: Boolean): Self = StObject.set(x, "_dangerouslyDisableScrollBoundaryContainer", value.asInstanceOf[js.Any])
    
    inline def set_dangerouslyDisableScrollBoundaryContainerUndefined: Self = StObject.set(x, "_dangerouslyDisableScrollBoundaryContainer", js.undefined)
  }
}
