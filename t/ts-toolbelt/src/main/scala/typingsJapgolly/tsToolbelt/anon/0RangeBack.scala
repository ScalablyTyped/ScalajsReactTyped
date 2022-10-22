package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationNextMod.Next
import typingsJapgolly.tsToolbelt.outIterationPosMod.Pos
import typingsJapgolly.tsToolbelt.outListPrependMod.Prepend
import typingsJapgolly.tsToolbelt.outNumberRangeMod.RangeBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0RangeBack`[From /* <: Iteration */, To /* <: Iteration */, L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */] extends StObject {
  
  var `0`: RangeBack[Next[From], To, Prepend[L, Pos[From]]]
  
  var `1`: L
}
object `0RangeBack` {
  
  inline def apply[From /* <: Iteration */, To /* <: Iteration */, L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */](`0`: RangeBack[Next[From], To, Prepend[L, Pos[From]]], `1`: L): `0RangeBack`[From, To, L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0RangeBack`[From, To, L]]
  }
  
  extension [Self <: `0RangeBack`[?, ?, ?], From /* <: Iteration */, To /* <: Iteration */, L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */](x: Self & (`0RangeBack`[From, To, L])) {
    
    inline def set0(value: RangeBack[Next[From], To, Prepend[L, Pos[From]]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: L): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
