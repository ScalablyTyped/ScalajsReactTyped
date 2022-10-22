package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import typingsJapgolly.wixStyleReact.distTypesListItemEditableMod.ListItemEditableMargins
import typingsJapgolly.wixStyleReact.distTypesListItemEditableMod.ListItemEditableSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApproveButtonTooltipProps extends StObject {
  
  var approveButtonTooltipContent: js.UndefOr[Node] = js.undefined
  
  var approveButtonTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  
  var cancelButtonTooltipContent: js.UndefOr[Node] = js.undefined
  
  var cancelButtonTooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var dataHook: js.UndefOr[String] = js.undefined
  
  var id: String | Double
  
  var margins: js.UndefOr[ListItemEditableMargins] = js.undefined
  
  def onApprove(value: String): Unit
  
  def onCancel(): Unit
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[ListItemEditableSize] = js.undefined
  
  var status: js.UndefOr[InputStatus] = js.undefined
  
  var statusMessage: js.UndefOr[Node] = js.undefined
}
object ApproveButtonTooltipProps {
  
  inline def apply(id: String | Double, onApprove: String => Callback, onCancel: Callback): ApproveButtonTooltipProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onApprove = js.Any.fromFunction1((t0: String) => onApprove(t0).runNow()), onCancel = onCancel.toJsFn)
    __obj.asInstanceOf[ApproveButtonTooltipProps]
  }
  
  extension [Self <: ApproveButtonTooltipProps](x: Self) {
    
    inline def setApproveButtonTooltipContent(value: VdomNode): Self = StObject.set(x, "approveButtonTooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setApproveButtonTooltipContentNull: Self = StObject.set(x, "approveButtonTooltipContent", null)
    
    inline def setApproveButtonTooltipContentUndefined: Self = StObject.set(x, "approveButtonTooltipContent", js.undefined)
    
    inline def setApproveButtonTooltipContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "approveButtonTooltipContent", js.Array(value*))
    
    inline def setApproveButtonTooltipContentVdomElement(value: VdomElement): Self = StObject.set(x, "approveButtonTooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setApproveButtonTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "approveButtonTooltipProps", value.asInstanceOf[js.Any])
    
    inline def setApproveButtonTooltipPropsUndefined: Self = StObject.set(x, "approveButtonTooltipProps", js.undefined)
    
    inline def setCancelButtonTooltipContent(value: VdomNode): Self = StObject.set(x, "cancelButtonTooltipContent", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCancelButtonTooltipContentNull: Self = StObject.set(x, "cancelButtonTooltipContent", null)
    
    inline def setCancelButtonTooltipContentUndefined: Self = StObject.set(x, "cancelButtonTooltipContent", js.undefined)
    
    inline def setCancelButtonTooltipContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "cancelButtonTooltipContent", js.Array(value*))
    
    inline def setCancelButtonTooltipContentVdomElement(value: VdomElement): Self = StObject.set(x, "cancelButtonTooltipContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCancelButtonTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "cancelButtonTooltipProps", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTooltipPropsUndefined: Self = StObject.set(x, "cancelButtonTooltipProps", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMargins(value: ListItemEditableMargins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    inline def setOnApprove(value: String => Callback): Self = StObject.set(x, "onApprove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOnCancel(value: Callback): Self = StObject.set(x, "onCancel", value.toJsFn)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: ListItemEditableSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
    
    inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
