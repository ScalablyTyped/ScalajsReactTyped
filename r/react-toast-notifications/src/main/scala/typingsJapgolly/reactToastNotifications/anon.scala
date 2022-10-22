package typingsJapgolly.reactToastNotifications

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactToastNotifications.mod.AppearanceTypes
import typingsJapgolly.reactToastNotifications.mod.Options
import typingsJapgolly.reactToastNotifications.mod.RemoveAllToasts
import typingsJapgolly.reactToastNotifications.mod.RemoveToast
import typingsJapgolly.reactToastNotifications.mod.ToastContainerProps
import typingsJapgolly.reactToastNotifications.mod.ToastProps
import typingsJapgolly.reactToastNotifications.mod.UpdateOptions
import typingsJapgolly.reactToastNotifications.mod.UpdateToast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddToast extends StObject {
    
    var addToast: typingsJapgolly.reactToastNotifications.mod.AddToast
    
    var removeAllToasts: RemoveAllToasts
    
    var removeToast: RemoveToast
    
    var toastStack: js.Array[Appearance]
    
    var updateToast: UpdateToast
  }
  object AddToast {
    
    inline def apply(
      addToast: (/* content */ Node, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback,
      removeAllToasts: Callback,
      removeToast: (/* id */ String, /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback,
      toastStack: js.Array[Appearance],
      updateToast: (/* id */ String, /* options */ js.UndefOr[UpdateOptions], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback
    ): AddToast = {
      val __obj = js.Dynamic.literal(addToast = js.Any.fromFunction3((t0: /* content */ Node, t1: /* options */ js.UndefOr[Options], t2: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (addToast(t0, t1, t2)).runNow()), removeAllToasts = removeAllToasts.toJsFn, removeToast = js.Any.fromFunction2((t0: /* id */ String, t1: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (removeToast(t0, t1)).runNow()), toastStack = toastStack.asInstanceOf[js.Any], updateToast = js.Any.fromFunction3((t0: /* id */ String, t1: /* options */ js.UndefOr[UpdateOptions], t2: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (updateToast(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[AddToast]
    }
    
    extension [Self <: AddToast](x: Self) {
      
      inline def setAddToast(
        value: (/* content */ Node, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback
      ): Self = StObject.set(x, "addToast", js.Any.fromFunction3((t0: /* content */ Node, t1: /* options */ js.UndefOr[Options], t2: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRemoveAllToasts(value: Callback): Self = StObject.set(x, "removeAllToasts", value.toJsFn)
      
      inline def setRemoveToast(
        value: (/* id */ String, /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback
      ): Self = StObject.set(x, "removeToast", js.Any.fromFunction2((t0: /* id */ String, t1: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (value(t0, t1)).runNow()))
      
      inline def setToastStack(value: js.Array[Appearance]): Self = StObject.set(x, "toastStack", value.asInstanceOf[js.Any])
      
      inline def setToastStackVarargs(value: Appearance*): Self = StObject.set(x, "toastStack", js.Array(value*))
      
      inline def setUpdateToast(
        value: (/* id */ String, /* options */ js.UndefOr[UpdateOptions], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Callback
      ): Self = StObject.set(x, "updateToast", js.Any.fromFunction3((t0: /* id */ String, t1: /* options */ js.UndefOr[UpdateOptions], t2: /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait Appearance extends StObject {
    
    var appearance: AppearanceTypes
    
    var content: Node
    
    var id: String
  }
  object Appearance {
    
    inline def apply(appearance: AppearanceTypes, id: String): Appearance = {
      val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], content = null)
      __obj.asInstanceOf[Appearance]
    }
    
    extension [Self <: Appearance](x: Self) {
      
      inline def setAppearance(value: AppearanceTypes): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Toast extends StObject {
    
    var Toast: js.UndefOr[ComponentType[ToastProps]] = js.undefined
    
    var ToastContainer: js.UndefOr[ComponentType[ToastContainerProps]] = js.undefined
  }
  object Toast {
    
    inline def apply(): Toast = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Toast]
    }
    
    extension [Self <: Toast](x: Self) {
      
      inline def setToast(value: ComponentType[ToastProps]): Self = StObject.set(x, "Toast", value.asInstanceOf[js.Any])
      
      inline def setToastContainer(value: ComponentType[ToastContainerProps]): Self = StObject.set(x, "ToastContainer", value.asInstanceOf[js.Any])
      
      inline def setToastContainerUndefined: Self = StObject.set(x, "ToastContainer", js.undefined)
      
      inline def setToastUndefined: Self = StObject.set(x, "Toast", js.undefined)
    }
  }
}
