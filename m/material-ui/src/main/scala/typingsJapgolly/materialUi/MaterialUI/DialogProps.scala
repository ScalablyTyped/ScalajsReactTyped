package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogProps
  extends StObject
     with DOMAttributes[js.Object] {
  
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[String] = js.undefined
  
  var actions: js.UndefOr[js.Array[DialogAction | Element]] = js.undefined
  
  var actionsContainerClassName: js.UndefOr[String] = js.undefined
  
  var actionsContainerStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var autoDetectWindowHeight: js.UndefOr[Boolean] = js.undefined
  
  var autoScrollBodyContent: js.UndefOr[Boolean] = js.undefined
  
  var bodyClassName: js.UndefOr[String] = js.undefined
  
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var contentClassName: js.UndefOr[String] = js.undefined
  
  var contentStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var modal: js.UndefOr[Boolean] = js.undefined
  
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ Boolean, Unit]] = js.undefined
  
  var open: Boolean
  
  var overlayClassName: js.UndefOr[String] = js.undefined
  
  var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var paperClassName: js.UndefOr[String] = js.undefined
  
  var paperProps: js.UndefOr[Any] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[Component[DialogProps & js.Object, js.Object]]] = js.undefined
  
  var repositionOnUpdate: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
  
  var title: js.UndefOr[Node] = js.undefined
  
  var titleClassName: js.UndefOr[String] = js.undefined
  
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}
object DialogProps {
  
  inline def apply(open: Boolean): DialogProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  
  extension [Self <: DialogProps](x: Self) {
    
    inline def setActionFocus(value: String): Self = StObject.set(x, "actionFocus", value.asInstanceOf[js.Any])
    
    inline def setActionFocusUndefined: Self = StObject.set(x, "actionFocus", js.undefined)
    
    inline def setActions(value: js.Array[DialogAction | Element]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsContainerClassName(value: String): Self = StObject.set(x, "actionsContainerClassName", value.asInstanceOf[js.Any])
    
    inline def setActionsContainerClassNameUndefined: Self = StObject.set(x, "actionsContainerClassName", js.undefined)
    
    inline def setActionsContainerStyle(value: CSSProperties): Self = StObject.set(x, "actionsContainerStyle", value.asInstanceOf[js.Any])
    
    inline def setActionsContainerStyleUndefined: Self = StObject.set(x, "actionsContainerStyle", js.undefined)
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (DialogAction | Element)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setAutoDetectWindowHeight(value: Boolean): Self = StObject.set(x, "autoDetectWindowHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoDetectWindowHeightUndefined: Self = StObject.set(x, "autoDetectWindowHeight", js.undefined)
    
    inline def setAutoScrollBodyContent(value: Boolean): Self = StObject.set(x, "autoScrollBodyContent", value.asInstanceOf[js.Any])
    
    inline def setAutoScrollBodyContentUndefined: Self = StObject.set(x, "autoScrollBodyContent", js.undefined)
    
    inline def setBodyClassName(value: String): Self = StObject.set(x, "bodyClassName", value.asInstanceOf[js.Any])
    
    inline def setBodyClassNameUndefined: Self = StObject.set(x, "bodyClassName", js.undefined)
    
    inline def setBodyStyle(value: CSSProperties): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
    
    inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
    
    inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
    
    inline def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
    
    inline def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setOnRequestClose(value: /* buttonClicked */ Boolean => Callback): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1((t0: /* buttonClicked */ Boolean) => value(t0).runNow()))
    
    inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
    
    inline def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
    
    inline def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
    
    inline def setPaperClassName(value: String): Self = StObject.set(x, "paperClassName", value.asInstanceOf[js.Any])
    
    inline def setPaperClassNameUndefined: Self = StObject.set(x, "paperClassName", js.undefined)
    
    inline def setPaperProps(value: Any): Self = StObject.set(x, "paperProps", value.asInstanceOf[js.Any])
    
    inline def setPaperPropsUndefined: Self = StObject.set(x, "paperProps", js.undefined)
    
    inline def setRef(value: LegacyRef[Component[DialogProps & js.Object, js.Object]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: (Component[DialogProps & js.Object, js.Object]) | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (Component[DialogProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRepositionOnUpdate(value: Boolean): Self = StObject.set(x, "repositionOnUpdate", value.asInstanceOf[js.Any])
    
    inline def setRepositionOnUpdateUndefined: Self = StObject.set(x, "repositionOnUpdate", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTitleClassName(value: String): Self = StObject.set(x, "titleClassName", value.asInstanceOf[js.Any])
    
    inline def setTitleClassNameUndefined: Self = StObject.set(x, "titleClassName", js.undefined)
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleStyle(value: CSSProperties): Self = StObject.set(x, "titleStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleStyleUndefined: Self = StObject.set(x, "titleStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
    
    inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
  }
}
