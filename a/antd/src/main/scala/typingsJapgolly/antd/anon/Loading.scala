package typingsJapgolly.antd.anon

import typingsJapgolly.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loading extends StObject {
  
  var error: ForwardRefExoticComponent[PickAntdIconPropschildren]
  
  var info: ForwardRefExoticComponent[PickAntdIconPropschildren]
  
  var loading: ForwardRefExoticComponent[PickAntdIconPropschildren]
  
  var success: ForwardRefExoticComponent[PickAntdIconPropschildren]
  
  var warning: ForwardRefExoticComponent[PickAntdIconPropschildren]
}
object Loading {
  
  inline def apply(
    error: ForwardRefExoticComponent[PickAntdIconPropschildren],
    info: ForwardRefExoticComponent[PickAntdIconPropschildren],
    loading: ForwardRefExoticComponent[PickAntdIconPropschildren],
    success: ForwardRefExoticComponent[PickAntdIconPropschildren],
    warning: ForwardRefExoticComponent[PickAntdIconPropschildren]
  ): Loading = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loading]
  }
  
  extension [Self <: Loading](x: Self) {
    
    inline def setError(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: ForwardRefExoticComponent[PickAntdIconPropschildren]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
