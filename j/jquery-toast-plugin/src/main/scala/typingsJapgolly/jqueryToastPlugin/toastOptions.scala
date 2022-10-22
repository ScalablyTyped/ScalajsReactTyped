package typingsJapgolly.jqueryToastPlugin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginBooleans.`false`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-center`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-left`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`bottom-right`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`mid-center`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`top-center`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`top-left`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.`top-right`
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.center
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.error
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.fade
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.info
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.left
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.plain
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.right
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.slide
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.success
import typingsJapgolly.jqueryToastPlugin.jqueryToastPluginStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait toastOptions extends StObject {
  
  var afterHidden: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var afterShown: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var allowToastClose: js.UndefOr[Boolean] = js.undefined
  
  var beforeHide: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var beforeShow: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var bgColor: js.UndefOr[String] = js.undefined
  
  var heading: js.UndefOr[String] = js.undefined
  
  var hideAfter: js.UndefOr[Double | `false`] = js.undefined
  
  var icon: js.UndefOr[info | warning | error | success] = js.undefined
  
  var loader: js.UndefOr[Boolean] = js.undefined
  
  var loaderBg: js.UndefOr[String] = js.undefined
  
  var position: js.UndefOr[
    `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
  ] = js.undefined
  
  var showHideTransition: js.UndefOr[fade | slide | plain] = js.undefined
  
  var stack: js.UndefOr[Double | `false`] = js.undefined
  
  var text: String
  
  var textAlign: js.UndefOr[left | right | center] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object toastOptions {
  
  inline def apply(text: String): toastOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[toastOptions]
  }
  
  extension [Self <: toastOptions](x: Self) {
    
    inline def setAfterHidden(value: CallbackTo[Any]): Self = StObject.set(x, "afterHidden", value.toJsFn)
    
    inline def setAfterHiddenUndefined: Self = StObject.set(x, "afterHidden", js.undefined)
    
    inline def setAfterShown(value: CallbackTo[Any]): Self = StObject.set(x, "afterShown", value.toJsFn)
    
    inline def setAfterShownUndefined: Self = StObject.set(x, "afterShown", js.undefined)
    
    inline def setAllowToastClose(value: Boolean): Self = StObject.set(x, "allowToastClose", value.asInstanceOf[js.Any])
    
    inline def setAllowToastCloseUndefined: Self = StObject.set(x, "allowToastClose", js.undefined)
    
    inline def setBeforeHide(value: CallbackTo[Any]): Self = StObject.set(x, "beforeHide", value.toJsFn)
    
    inline def setBeforeHideUndefined: Self = StObject.set(x, "beforeHide", js.undefined)
    
    inline def setBeforeShow(value: CallbackTo[Any]): Self = StObject.set(x, "beforeShow", value.toJsFn)
    
    inline def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
    
    inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHideAfter(value: Double | `false`): Self = StObject.set(x, "hideAfter", value.asInstanceOf[js.Any])
    
    inline def setHideAfterUndefined: Self = StObject.set(x, "hideAfter", js.undefined)
    
    inline def setIcon(value: info | warning | error | success): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLoader(value: Boolean): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderBg(value: String): Self = StObject.set(x, "loaderBg", value.asInstanceOf[js.Any])
    
    inline def setLoaderBgUndefined: Self = StObject.set(x, "loaderBg", js.undefined)
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setPosition(
      value: `bottom-left` | `bottom-right` | `bottom-center` | `top-right` | `top-left` | `top-center` | `mid-center` | CustomPosition
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowHideTransition(value: fade | slide | plain): Self = StObject.set(x, "showHideTransition", value.asInstanceOf[js.Any])
    
    inline def setShowHideTransitionUndefined: Self = StObject.set(x, "showHideTransition", js.undefined)
    
    inline def setStack(value: Double | `false`): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: left | right | center): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
