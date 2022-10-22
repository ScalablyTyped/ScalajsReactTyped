package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationNextMod.Next
import typingsJapgolly.tsToolbelt.outListUnNestMod.Flatter
import typingsJapgolly.tsToolbelt.outListUnNestMod.UnNestStrict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0UnNestStrict`[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */] extends StObject {
  
  var `0`: UnNestStrict[L, Flatter[L, LN, I], Next[I]]
  
  var `1`: LN
}
object `0UnNestStrict` {
  
  inline def apply[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */](`0`: UnNestStrict[L, Flatter[L, LN, I], Next[I]], `1`: LN): `0UnNestStrict`[L, LN, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0UnNestStrict`[L, LN, I]]
  }
  
  extension [Self <: `0UnNestStrict`[?, ?, ?], L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, I /* <: Iteration */](x: Self & (`0UnNestStrict`[L, LN, I])) {
    
    inline def set0(value: UnNestStrict[L, Flatter[L, LN, I], Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: LN): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
