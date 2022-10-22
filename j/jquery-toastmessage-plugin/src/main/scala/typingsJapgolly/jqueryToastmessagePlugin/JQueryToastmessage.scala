package typingsJapgolly.jqueryToastmessagePlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.removeToast
import typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showToast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** jQuery Toastmessage (http://akquinet.github.io/jquery-toastmessage-plugin/) */
object JQueryToastmessage {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showNoticeToast
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showSuccessToast
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showWarningToast
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showErrorToast
  */
  trait ShowToastCommand extends StObject
  object ShowToastCommand {
    
    inline def showErrorToast: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showErrorToast = "showErrorToast".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showErrorToast]
    
    inline def showNoticeToast: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showNoticeToast = "showNoticeToast".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showNoticeToast]
    
    inline def showSuccessToast: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showSuccessToast = "showSuccessToast".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showSuccessToast]
    
    inline def showWarningToast: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showWarningToast = "showWarningToast".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.showWarningToast]
  }
  
  trait ToastOptions extends StObject {
    
    /** callback function when the toastmessage is closed @default null */
    var close: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * text which will be shown as close button,
      * set to '' when you want to introduce an image via css
      * @default ''
      */
    var closeText: js.UndefOr[String] = js.undefined
    
    /** in effect duration in miliseconds @default 600 */
    var inEffectDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Position of the toast container holding different toast.
      * Position can be set only once at the very first call,
      * changing the position after the first call does nothing
      * @default 'top-right'
      */
    var position: js.UndefOr[ToastPosition] = js.undefined
    
    /**
      * time in miliseconds before the item has to disappear @default 3000
      */
    var stayTime: js.UndefOr[Double] = js.undefined
    
    /** should the toast item sticky or not? @default false */
    var sticky: js.UndefOr[Boolean] = js.undefined
    
    /** content of the item @default '' */
    var text: js.UndefOr[String] = js.undefined
    
    /** the type of toast @default 'notice' */
    var `type`: js.UndefOr[ToastType] = js.undefined
  }
  object ToastOptions {
    
    inline def apply(): ToastOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastOptions]
    }
    
    extension [Self <: ToastOptions](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      inline def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setInEffectDuration(value: Double): Self = StObject.set(x, "inEffectDuration", value.asInstanceOf[js.Any])
      
      inline def setInEffectDurationUndefined: Self = StObject.set(x, "inEffectDuration", js.undefined)
      
      inline def setPosition(value: ToastPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStayTime(value: Double): Self = StObject.set(x, "stayTime", value.asInstanceOf[js.Any])
      
      inline def setStayTimeUndefined: Self = StObject.set(x, "stayTime", js.undefined)
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: ToastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-left`
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-center`
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-right`
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-left`
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-center`
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-right`
  */
  trait ToastPosition extends StObject
  object ToastPosition {
    
    inline def `middle-center`: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-center` = "middle-center".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-center`]
    
    inline def `middle-left`: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-left` = "middle-left".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-left`]
    
    inline def `middle-right`: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-right` = "middle-right".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`middle-right`]
    
    inline def `top-center`: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-center` = "top-center".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-center`]
    
    inline def `top-left`: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-left` = "top-left".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-left`]
    
    inline def `top-right`: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-right` = "top-right".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error
    - typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success
  */
  trait ToastType extends StObject
  object ToastType {
    
    inline def error: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error = "error".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.error]
    
    inline def notice: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice = "notice".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.notice]
    
    inline def success: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success = "success".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.success]
    
    inline def warning: typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning = "warning".asInstanceOf[typingsJapgolly.jqueryToastmessagePlugin.jqueryToastmessagePluginStrings.warning]
  }
  
  @js.native
  trait ToastmessageStatic extends StObject {
    
    /* shows a toast message of the specified type */
    def apply(command: ShowToastCommand, message: String): JQuery = js.native
    /** removes the specified toast and returns it */
    def apply(command: removeToast, toast: JQuery): Unit = js.native
    def apply(command: removeToast, toast: JQuery, closeOpts: ToastOptions): Unit = js.native
    /** shows a custom toast */
    def apply(command: showToast, toastOpts: ToastOptions): JQuery = js.native
    /** configures the default toast options */
    def apply(toastOpts: ToastOptions): Unit = js.native
  }
}
