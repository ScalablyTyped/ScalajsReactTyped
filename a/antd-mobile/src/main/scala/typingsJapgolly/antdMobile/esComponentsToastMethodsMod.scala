package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antdMobile.anon.CSSPropertiesPartialRecorAlignmentBaseline
import typingsJapgolly.antdMobile.anon.PickToastPropsdurationpos
import typingsJapgolly.antdMobile.antdMobileStrings.bottom
import typingsJapgolly.antdMobile.antdMobileStrings.center
import typingsJapgolly.antdMobile.antdMobileStrings.fail
import typingsJapgolly.antdMobile.antdMobileStrings.loading
import typingsJapgolly.antdMobile.antdMobileStrings.success
import typingsJapgolly.antdMobile.antdMobileStrings.top
import typingsJapgolly.antdMobile.esUtilsRenderToContainerMod.GetContainer
import typingsJapgolly.antdMobile.esUtilsWithStopPropagationMod.PropagationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsToastMethodsMod {
  
  @JSImport("antd-mobile/es/components/toast/methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def config(`val`: PickToastPropsdurationpos): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def show(p: String): ToastHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(p.asInstanceOf[js.Any]).asInstanceOf[ToastHandler]
  inline def show(p: ToastShowProps): ToastHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(p.asInstanceOf[js.Any]).asInstanceOf[ToastHandler]
  
  trait ToastHandler extends StObject {
    
    def close(): Unit
  }
  object ToastHandler {
    
    inline def apply(close: Callback): ToastHandler = {
      val __obj = js.Dynamic.literal(close = close.toJsFn)
      __obj.asInstanceOf[ToastHandler]
    }
    
    extension [Self <: ToastHandler](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    }
  }
  
  /* Inlined std.Omit<antd-mobile.antd-mobile/es/components/toast/toast.ToastProps, 'visible'> */
  trait ToastShowProps extends StObject {
    
    var afterClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var content: js.UndefOr[Node] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var getContainer: js.UndefOr[GetContainer] = js.undefined
    
    var icon: js.UndefOr[success | fail | loading | Node] = js.undefined
    
    var maskClassName: js.UndefOr[String] = js.undefined
    
    var maskClickable: js.UndefOr[Boolean] = js.undefined
    
    var maskStyle: js.UndefOr[CSSPropertiesPartialRecorAlignmentBaseline] = js.undefined
    
    var position: js.UndefOr[top | bottom | center] = js.undefined
    
    var stopPropagation: js.UndefOr[js.Array[PropagationEvent]] = js.undefined
  }
  object ToastShowProps {
    
    inline def apply(): ToastShowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastShowProps]
    }
    
    extension [Self <: ToastShowProps](x: Self) {
      
      inline def setAfterClose(value: Callback): Self = StObject.set(x, "afterClose", value.toJsFn)
      
      inline def setAfterCloseUndefined: Self = StObject.set(x, "afterClose", js.undefined)
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: GetContainer): Self = StObject.set(x, "getContainer", value.asInstanceOf[js.Any])
      
      inline def setGetContainerCallbackTo(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContainer", value.toJsFn)
      
      inline def setGetContainerNull: Self = StObject.set(x, "getContainer", null)
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
      
      inline def setIcon(value: success | fail | loading | Node): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      inline def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      inline def setMaskClickable(value: Boolean): Self = StObject.set(x, "maskClickable", value.asInstanceOf[js.Any])
      
      inline def setMaskClickableUndefined: Self = StObject.set(x, "maskClickable", js.undefined)
      
      inline def setMaskStyle(value: CSSPropertiesPartialRecorAlignmentBaseline): Self = StObject.set(x, "maskStyle", value.asInstanceOf[js.Any])
      
      inline def setMaskStyleUndefined: Self = StObject.set(x, "maskStyle", js.undefined)
      
      inline def setPosition(value: top | bottom | center): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStopPropagation(value: js.Array[PropagationEvent]): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
      
      inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      inline def setStopPropagationVarargs(value: PropagationEvent*): Self = StObject.set(x, "stopPropagation", js.Array(value*))
    }
  }
}
