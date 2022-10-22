package typingsJapgolly.fortawesomeFontawesomeSvgCore.mod

import typingsJapgolly.fortawesomeFontawesomeCommonTypes.mod.IconLookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconParams
  extends StObject
     with Params {
  
  var mask: js.UndefOr[IconLookup] = js.undefined
  
  var maskId: js.UndefOr[String] = js.undefined
  
  var symbol: js.UndefOr[FaSymbol] = js.undefined
  
  var transform: js.UndefOr[Transform] = js.undefined
}
object IconParams {
  
  inline def apply(): IconParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconParams]
  }
  
  extension [Self <: IconParams](x: Self) {
    
    inline def setMask(value: IconLookup): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskId(value: String): Self = StObject.set(x, "maskId", value.asInstanceOf[js.Any])
    
    inline def setMaskIdUndefined: Self = StObject.set(x, "maskId", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setSymbol(value: FaSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
