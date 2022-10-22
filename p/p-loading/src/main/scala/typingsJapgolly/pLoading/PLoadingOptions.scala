package typingsJapgolly.pLoading

import japgolly.scalajs.react.Callback
import typingsJapgolly.pLoading.pLoadingStrings.destroy
import typingsJapgolly.pLoading.pLoadingStrings.hide
import typingsJapgolly.pLoading.pLoadingStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PLoadingOptions extends StObject {
  
  var action: js.UndefOr[show | hide | destroy] = js.undefined
  
  var containerAttrs: js.UndefOr[js.Object] = js.undefined
  
  var containerClass: js.UndefOr[String] = js.undefined
  
  var containerHTML: js.UndefOr[String] = js.undefined
  
  var destroyAfterHide: js.UndefOr[Boolean] = js.undefined
  
  var hideAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  
  var idPrefix: js.UndefOr[String] = js.undefined
  
  var maskColor: js.UndefOr[String] = js.undefined
  
  /**
    * @deprecated
    */
  var onDestroyContainer: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  
  /**
    * @deprecated
    */
  var onHideContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.undefined
  
  /**
    * @deprecated
    */
  var onShowContainer: js.UndefOr[js.Function2[/* $pluginElement */ JQuery, /* $container */ JQuery, Unit]] = js.undefined
  
  var pluginNameSpace: js.UndefOr[String] = js.undefined
  
  var showAnimation: js.UndefOr[js.Function1[/* $container */ JQuery, Unit]] = js.undefined
  
  var spinnerAttrs: js.UndefOr[js.Object] = js.undefined
  
  var spinnerClass: js.UndefOr[String] = js.undefined
  
  var spinnerHTML: js.UndefOr[String] = js.undefined
  
  var useAddOns: js.UndefOr[js.Array[String]] = js.undefined
}
object PLoadingOptions {
  
  inline def apply(): PLoadingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PLoadingOptions]
  }
  
  extension [Self <: PLoadingOptions](x: Self) {
    
    inline def setAction(value: show | hide | destroy): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setContainerAttrs(value: js.Object): Self = StObject.set(x, "containerAttrs", value.asInstanceOf[js.Any])
    
    inline def setContainerAttrsUndefined: Self = StObject.set(x, "containerAttrs", js.undefined)
    
    inline def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
    
    inline def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
    
    inline def setContainerHTML(value: String): Self = StObject.set(x, "containerHTML", value.asInstanceOf[js.Any])
    
    inline def setContainerHTMLUndefined: Self = StObject.set(x, "containerHTML", js.undefined)
    
    inline def setDestroyAfterHide(value: Boolean): Self = StObject.set(x, "destroyAfterHide", value.asInstanceOf[js.Any])
    
    inline def setDestroyAfterHideUndefined: Self = StObject.set(x, "destroyAfterHide", js.undefined)
    
    inline def setHideAnimation(value: /* $container */ JQuery => Callback): Self = StObject.set(x, "hideAnimation", js.Any.fromFunction1((t0: /* $container */ JQuery) => value(t0).runNow()))
    
    inline def setHideAnimationUndefined: Self = StObject.set(x, "hideAnimation", js.undefined)
    
    inline def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
    
    inline def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
    
    inline def setMaskColor(value: String): Self = StObject.set(x, "maskColor", value.asInstanceOf[js.Any])
    
    inline def setMaskColorUndefined: Self = StObject.set(x, "maskColor", js.undefined)
    
    inline def setOnDestroyContainer(value: /* $container */ JQuery => Callback): Self = StObject.set(x, "onDestroyContainer", js.Any.fromFunction1((t0: /* $container */ JQuery) => value(t0).runNow()))
    
    inline def setOnDestroyContainerUndefined: Self = StObject.set(x, "onDestroyContainer", js.undefined)
    
    inline def setOnHideContainer(value: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Callback): Self = StObject.set(x, "onHideContainer", js.Any.fromFunction2((t0: /* $pluginElement */ JQuery, t1: /* $container */ JQuery) => (value(t0, t1)).runNow()))
    
    inline def setOnHideContainerUndefined: Self = StObject.set(x, "onHideContainer", js.undefined)
    
    inline def setOnShowContainer(value: (/* $pluginElement */ JQuery, /* $container */ JQuery) => Callback): Self = StObject.set(x, "onShowContainer", js.Any.fromFunction2((t0: /* $pluginElement */ JQuery, t1: /* $container */ JQuery) => (value(t0, t1)).runNow()))
    
    inline def setOnShowContainerUndefined: Self = StObject.set(x, "onShowContainer", js.undefined)
    
    inline def setPluginNameSpace(value: String): Self = StObject.set(x, "pluginNameSpace", value.asInstanceOf[js.Any])
    
    inline def setPluginNameSpaceUndefined: Self = StObject.set(x, "pluginNameSpace", js.undefined)
    
    inline def setShowAnimation(value: /* $container */ JQuery => Callback): Self = StObject.set(x, "showAnimation", js.Any.fromFunction1((t0: /* $container */ JQuery) => value(t0).runNow()))
    
    inline def setShowAnimationUndefined: Self = StObject.set(x, "showAnimation", js.undefined)
    
    inline def setSpinnerAttrs(value: js.Object): Self = StObject.set(x, "spinnerAttrs", value.asInstanceOf[js.Any])
    
    inline def setSpinnerAttrsUndefined: Self = StObject.set(x, "spinnerAttrs", js.undefined)
    
    inline def setSpinnerClass(value: String): Self = StObject.set(x, "spinnerClass", value.asInstanceOf[js.Any])
    
    inline def setSpinnerClassUndefined: Self = StObject.set(x, "spinnerClass", js.undefined)
    
    inline def setSpinnerHTML(value: String): Self = StObject.set(x, "spinnerHTML", value.asInstanceOf[js.Any])
    
    inline def setSpinnerHTMLUndefined: Self = StObject.set(x, "spinnerHTML", js.undefined)
    
    inline def setUseAddOns(value: js.Array[String]): Self = StObject.set(x, "useAddOns", value.asInstanceOf[js.Any])
    
    inline def setUseAddOnsUndefined: Self = StObject.set(x, "useAddOns", js.undefined)
    
    inline def setUseAddOnsVarargs(value: String*): Self = StObject.set(x, "useAddOns", js.Array(value*))
  }
}
