package typingsJapgolly.confirmdialog

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object options {
  
  trait buttonOptionss extends StObject {
    
    var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var confirm: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object buttonOptionss {
    
    inline def apply(): buttonOptionss = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[buttonOptionss]
    }
    
    extension [Self <: buttonOptionss](x: Self) {
      
      inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setConfirm(value: Callback): Self = StObject.set(x, "confirm", value.toJsFn)
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
    }
  }
  
  trait confirmOptions extends StObject {
    
    var autoClose: js.UndefOr[String] = js.undefined
    
    var backgroundDismiss: js.UndefOr[Any] = js.undefined
    
    var backgroundDismissAnimation: js.UndefOr[String] = js.undefined
    
    var bootstrapClasses: js.UndefOr[Any] = js.undefined
    
    var boxWidth: js.UndefOr[String] = js.undefined
    
    var buttons: js.UndefOr[Any] = js.undefined
    
    var closeIcon: js.UndefOr[Any] = js.undefined
    
    var closeIconClass: js.UndefOr[String] = js.undefined
    
    var columnClass: js.UndefOr[String] = js.undefined
    
    var containerFluid: js.UndefOr[Boolean] = js.undefined
    
    var content: js.UndefOr[Any] = js.undefined
    
    var contentLoaded: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var dragWindowBorder: js.UndefOr[Boolean] = js.undefined
    
    var dragWindowGap: js.UndefOr[Double] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var escapeKey: js.UndefOr[String | Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var lazyOpen: js.UndefOr[Boolean] = js.undefined
    
    var onAction: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onContentReady: js.UndefOr[Any] = js.undefined
    
    var onDestroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpenBefore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var title: js.UndefOr[String | Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var typeAnimated: js.UndefOr[Boolean] = js.undefined
    
    var useBootstrap: js.UndefOr[Boolean] = js.undefined
  }
  object confirmOptions {
    
    inline def apply(): confirmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[confirmOptions]
    }
    
    extension [Self <: confirmOptions](x: Self) {
      
      inline def setAutoClose(value: String): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setBackgroundDismiss(value: Any): Self = StObject.set(x, "backgroundDismiss", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDismissAnimation(value: String): Self = StObject.set(x, "backgroundDismissAnimation", value.asInstanceOf[js.Any])
      
      inline def setBackgroundDismissAnimationUndefined: Self = StObject.set(x, "backgroundDismissAnimation", js.undefined)
      
      inline def setBackgroundDismissUndefined: Self = StObject.set(x, "backgroundDismiss", js.undefined)
      
      inline def setBootstrapClasses(value: Any): Self = StObject.set(x, "bootstrapClasses", value.asInstanceOf[js.Any])
      
      inline def setBootstrapClassesUndefined: Self = StObject.set(x, "bootstrapClasses", js.undefined)
      
      inline def setBoxWidth(value: String): Self = StObject.set(x, "boxWidth", value.asInstanceOf[js.Any])
      
      inline def setBoxWidthUndefined: Self = StObject.set(x, "boxWidth", js.undefined)
      
      inline def setButtons(value: Any): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setCloseIcon(value: Any): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconClass(value: String): Self = StObject.set(x, "closeIconClass", value.asInstanceOf[js.Any])
      
      inline def setCloseIconClassUndefined: Self = StObject.set(x, "closeIconClass", js.undefined)
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setColumnClass(value: String): Self = StObject.set(x, "columnClass", value.asInstanceOf[js.Any])
      
      inline def setColumnClassUndefined: Self = StObject.set(x, "columnClass", js.undefined)
      
      inline def setContainerFluid(value: Boolean): Self = StObject.set(x, "containerFluid", value.asInstanceOf[js.Any])
      
      inline def setContainerFluidUndefined: Self = StObject.set(x, "containerFluid", js.undefined)
      
      inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentLoaded(value: Callback): Self = StObject.set(x, "contentLoaded", value.toJsFn)
      
      inline def setContentLoadedUndefined: Self = StObject.set(x, "contentLoaded", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDragWindowBorder(value: Boolean): Self = StObject.set(x, "dragWindowBorder", value.asInstanceOf[js.Any])
      
      inline def setDragWindowBorderUndefined: Self = StObject.set(x, "dragWindowBorder", js.undefined)
      
      inline def setDragWindowGap(value: Double): Self = StObject.set(x, "dragWindowGap", value.asInstanceOf[js.Any])
      
      inline def setDragWindowGapUndefined: Self = StObject.set(x, "dragWindowGap", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEscapeKey(value: String | Boolean): Self = StObject.set(x, "escapeKey", value.asInstanceOf[js.Any])
      
      inline def setEscapeKeyUndefined: Self = StObject.set(x, "escapeKey", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setLazyOpen(value: Boolean): Self = StObject.set(x, "lazyOpen", value.asInstanceOf[js.Any])
      
      inline def setLazyOpenUndefined: Self = StObject.set(x, "lazyOpen", js.undefined)
      
      inline def setOnAction(value: Callback): Self = StObject.set(x, "onAction", value.toJsFn)
      
      inline def setOnActionUndefined: Self = StObject.set(x, "onAction", js.undefined)
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnContentReady(value: Any): Self = StObject.set(x, "onContentReady", value.asInstanceOf[js.Any])
      
      inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
      
      inline def setOnDestroy(value: Callback): Self = StObject.set(x, "onDestroy", value.toJsFn)
      
      inline def setOnDestroyUndefined: Self = StObject.set(x, "onDestroy", js.undefined)
      
      inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
      
      inline def setOnOpenBefore(value: Callback): Self = StObject.set(x, "onOpenBefore", value.toJsFn)
      
      inline def setOnOpenBeforeUndefined: Self = StObject.set(x, "onOpenBefore", js.undefined)
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setTitle(value: String | Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeAnimated(value: Boolean): Self = StObject.set(x, "typeAnimated", value.asInstanceOf[js.Any])
      
      inline def setTypeAnimatedUndefined: Self = StObject.set(x, "typeAnimated", js.undefined)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUseBootstrap(value: Boolean): Self = StObject.set(x, "useBootstrap", value.asInstanceOf[js.Any])
      
      inline def setUseBootstrapUndefined: Self = StObject.set(x, "useBootstrap", js.undefined)
    }
  }
}
