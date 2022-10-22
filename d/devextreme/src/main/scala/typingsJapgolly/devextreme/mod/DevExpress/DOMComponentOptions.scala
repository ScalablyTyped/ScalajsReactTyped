package typingsJapgolly.devextreme.mod.DevExpress

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.events.InitializedEventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMComponentOptions[TComponent]
  extends StObject
     with ComponentOptions[
      EventInfo[TComponent], 
      InitializedEventInfo[TComponent], 
      OptionChangedEventInfo[TComponent]
    ] {
  
  /**
    * 
    */
  var bindingOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Specifies the global attributes to be attached to the UI component&apos;s container element.
    */
  var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Specifies the UI component&apos;s height.
    */
  var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  /**
    * Switches the UI component to a right-to-left representation.
    */
  var rtlEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the UI component&apos;s width.
    */
  var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
}
object DOMComponentOptions {
  
  inline def apply[TComponent](): DOMComponentOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMComponentOptions[TComponent]]
  }
  
  extension [Self <: DOMComponentOptions[?], TComponent](x: Self & DOMComponentOptions[TComponent]) {
    
    inline def setBindingOptions(value: StringDictionary[Any]): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
    
    inline def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
    
    inline def setElementAttr(value: StringDictionary[Any]): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
    
    inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
    
    inline def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightCallbackTo(value: CallbackTo[Double | String]): Self = StObject.set(x, "height", value.toJsFn)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
    
    inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
    
    inline def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthCallbackTo(value: CallbackTo[Double | String]): Self = StObject.set(x, "width", value.toJsFn)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
