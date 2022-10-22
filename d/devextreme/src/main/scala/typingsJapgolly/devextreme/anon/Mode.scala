package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.common.ScrollMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  /**
    * Specifies the scrolling mode.
    */
  var mode: js.UndefOr[ScrollMode] = js.undefined
  
  /**
    * Specifies whether or not the UI component uses native scrolling.
    */
  var useNative: js.UndefOr[Boolean | typingsJapgolly.devextreme.mod.DevExpress.common.Mode] = js.undefined
}
object Mode {
  
  inline def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: ScrollMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setUseNative(value: Boolean | typingsJapgolly.devextreme.mod.DevExpress.common.Mode): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
