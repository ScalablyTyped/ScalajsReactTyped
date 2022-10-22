package typingsJapgolly.antDesignReactNative

import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.ghost
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.large
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.primary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.small
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonPropsTypeMod {
  
  trait ButtonPropsType extends StObject {
    
    var disabled: js.UndefOr[Boolean | Null] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[large | small] = js.undefined
    
    var `type`: js.UndefOr[primary | warning | ghost] = js.undefined
  }
  object ButtonPropsType {
    
    inline def apply(): ButtonPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonPropsType]
    }
    
    extension [Self <: ButtonPropsType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setSize(value: large | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: primary | warning | ghost): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
