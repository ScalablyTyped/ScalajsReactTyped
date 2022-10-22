package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outFunctionCurryMod.GapOf
import typingsJapgolly.tsToolbelt.outFunctionCurryMod.JoinParams
import typingsJapgolly.tsToolbelt.outFunctionCurryMod._GapsOf
import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationNextMod.Next
import typingsJapgolly.tsToolbelt.outListConcatMod.Concat
import typingsJapgolly.tsToolbelt.outListTailMod.Tail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0GapsOf`[L1 /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, L2 /* <: js.Array[typingsJapgolly.tsToolbelt.outListListMod.List[Any]] */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typingsJapgolly.tsToolbelt.outListListMod.List[Any]] */] extends StObject {
  
  var `0`: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]]
  
  var `1`: Concat[LN, JoinParams[L2D]]
}
object `0GapsOf` {
  
  inline def apply[L1 /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, L2 /* <: js.Array[typingsJapgolly.tsToolbelt.outListListMod.List[Any]] */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typingsJapgolly.tsToolbelt.outListListMod.List[Any]] */](`0`: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]], `1`: Concat[LN, JoinParams[L2D]]): `0GapsOf`[L1, L2, LN, I, L2D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0GapsOf`[L1, L2, LN, I, L2D]]
  }
  
  extension [Self <: `0GapsOf`[?, ?, ?, ?, ?], L1 /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, L2 /* <: js.Array[typingsJapgolly.tsToolbelt.outListListMod.List[Any]] */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */, L2D /* <: js.Array[typingsJapgolly.tsToolbelt.outListListMod.List[Any]] */](x: Self & (`0GapsOf`[L1, L2, LN, I, L2D])) {
    
    inline def set0(value: _GapsOf[L1, L2, GapOf[L1, L2, LN, I], Tail[L2D], Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: Concat[LN, JoinParams[L2D]]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set1Varargs(value: LN*): Self = StObject.set(x, "1", js.Array(value*))
  }
}
