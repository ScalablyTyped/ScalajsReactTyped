package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libButtonButtonMod.ButtonProps
import typingsJapgolly.antd.libButtonButtonMod.LegacyButtonType
import typingsJapgolly.antd.libTooltipMod.AbstractTooltipProps
import typingsJapgolly.antd.libUtilGetRenderPropValueMod.RenderFunction
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopconfirmMod extends Shortcut {
  
  @JSImport("antd/lib/popconfirm", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopconfirmProps & RefAttributes[Any]] = js.native
  
  trait PopconfirmProps
    extends StObject
       with AbstractTooltipProps {
    
    var cancelButtonProps: js.UndefOr[ButtonProps] = js.undefined
    
    var cancelText: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var okButtonProps: js.UndefOr[ButtonProps] = js.undefined
    
    var okText: js.UndefOr[Node] = js.undefined
    
    var okType: js.UndefOr[LegacyButtonType] = js.undefined
    
    var onCancel: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], Unit]] = js.undefined
    
    var onConfirm: js.UndefOr[js.Function1[/* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]], Unit]] = js.undefined
    
    @JSName("onOpenChange")
    var onOpenChange_PopconfirmProps: js.UndefOr[
        js.Function2[
          /* open */ Boolean, 
          /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLDivElement]], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @deprecated `onVisibleChange` is deprecated which will be removed in next major version. Please
      *   use `onOpenChange` instead.
      */
    @JSName("onVisibleChange")
    var onVisibleChange_PopconfirmProps: js.UndefOr[
        js.Function2[
          /* visible */ Boolean, 
          /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLDivElement]], 
          Unit
        ]
      ] = js.undefined
    
    var showCancel: js.UndefOr[Boolean] = js.undefined
    
    var title: Node | RenderFunction
  }
  object PopconfirmProps {
    
    inline def apply(): PopconfirmProps = {
      val __obj = js.Dynamic.literal(title = null)
      __obj.asInstanceOf[PopconfirmProps]
    }
    
    extension [Self <: PopconfirmProps](x: Self) {
      
      inline def setCancelButtonProps(value: ButtonProps): Self = StObject.set(x, "cancelButtonProps", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonPropsUndefined: Self = StObject.set(x, "cancelButtonProps", js.undefined)
      
      inline def setCancelText(value: VdomNode): Self = StObject.set(x, "cancelText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCancelTextNull: Self = StObject.set(x, "cancelText", null)
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setCancelTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancelText", js.Array(value*))
      
      inline def setCancelTextVdomElement(value: VdomElement): Self = StObject.set(x, "cancelText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOkButtonProps(value: ButtonProps): Self = StObject.set(x, "okButtonProps", value.asInstanceOf[js.Any])
      
      inline def setOkButtonPropsUndefined: Self = StObject.set(x, "okButtonProps", js.undefined)
      
      inline def setOkText(value: VdomNode): Self = StObject.set(x, "okText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOkTextNull: Self = StObject.set(x, "okText", null)
      
      inline def setOkTextUndefined: Self = StObject.set(x, "okText", js.undefined)
      
      inline def setOkTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "okText", js.Array(value*))
      
      inline def setOkTextVdomElement(value: VdomElement): Self = StObject.set(x, "okText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOkType(value: LegacyButtonType): Self = StObject.set(x, "okType", value.asInstanceOf[js.Any])
      
      inline def setOkTypeUndefined: Self = StObject.set(x, "okType", js.undefined)
      
      inline def setOnCancel(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnConfirm(value: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]] => Callback): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setOnOpenChange(
        value: (/* open */ Boolean, /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLDivElement]]) => Callback
      ): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2((t0: /* open */ Boolean, t1: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLDivElement]]) => (value(t0, t1)).runNow()))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnVisibleChange(
        value: (/* visible */ Boolean, /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLDivElement]]) => Callback
      ): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction2((t0: /* visible */ Boolean, t1: /* e */ js.UndefOr[ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLDivElement]]) => (value(t0, t1)).runNow()))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
      
      inline def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
      
      inline def setTitle(value: Node | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "title", value.toJsFn)
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait PopconfirmState extends StObject {
    
    var open: js.UndefOr[Boolean] = js.undefined
  }
  object PopconfirmState {
    
    inline def apply(): PopconfirmState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopconfirmState]
    }
    
    extension [Self <: PopconfirmState](x: Self) {
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopconfirmProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPopconfirmMod.foo` */
  override def _to: ForwardRefExoticComponent[PopconfirmProps & RefAttributes[Any]] = default
}
