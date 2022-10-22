package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.MarkDef
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typingsJapgolly.vegaLite.vegaLiteStrings.encoding
import typingsJapgolly.vegaLite.vegaLiteStrings.visual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkEncodeOffsetMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positionOffset(hasBaseChannelMarkDefEncodingModelBandPosition: MarkDef): Offset = ^.asInstanceOf[js.Dynamic].applyDynamic("positionOffset")(hasBaseChannelMarkDefEncodingModelBandPosition.asInstanceOf[js.Any]).asInstanceOf[Offset]
  
  trait Offset extends StObject {
    
    var offset: js.UndefOr[Double | VgValueRef] = js.undefined
    
    var offsetType: js.UndefOr[visual | encoding] = js.undefined
  }
  object Offset {
    
    inline def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: Double | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetType(value: visual | encoding): Self = StObject.set(x, "offsetType", value.asInstanceOf[js.Any])
      
      inline def setOffsetTypeUndefined: Self = StObject.set(x, "offsetType", js.undefined)
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
}
