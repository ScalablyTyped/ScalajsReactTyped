package typingsJapgolly.popperjsCore

import typingsJapgolly.popperjsCore.anon.Reference
import typingsJapgolly.popperjsCore.libEnumsMod.Placement
import typingsJapgolly.popperjsCore.libTypesMod.Modifier
import typingsJapgolly.popperjsCore.libTypesMod.Offsets
import typingsJapgolly.popperjsCore.popperjsCoreStrings.offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModifiersOffsetMod {
  
  @JSImport("@popperjs/core/lib/modifiers/offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@popperjs/core/lib/modifiers/offset", JSImport.Default)
  @js.native
  val default: OffsetModifier = js.native
  
  inline def distanceAndSkiddingToXY(placement: Placement, rects: Reference, offset: Offset): Offsets = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceAndSkiddingToXY")(placement.asInstanceOf[js.Any], rects.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Offsets]
  
  type Offset = OffsetsFunction | (js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]])
  
  type OffsetModifier = Modifier[offset, Options]
  
  type OffsetsFunction = js.Function1[
    /* arg0 */ typingsJapgolly.popperjsCore.anon.Placement, 
    js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
  ]
  
  trait Options extends StObject {
    
    var offset: Offset
  }
  object Options {
    
    inline def apply(offset: Offset): Options = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(
        value: /* arg0 */ typingsJapgolly.popperjsCore.anon.Placement => js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
      ): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
    }
  }
}
