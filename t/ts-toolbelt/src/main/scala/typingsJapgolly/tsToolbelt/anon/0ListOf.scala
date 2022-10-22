package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationKeyMod.Key
import typingsJapgolly.tsToolbelt.outIterationNextMod.Next
import typingsJapgolly.tsToolbelt.outObjectListOfMod.AppendExists
import typingsJapgolly.tsToolbelt.outObjectListOfMod.___ListOf
import typingsJapgolly.tsToolbelt.outUnionExcludeMod.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0ListOf`[O /* <: js.Object */, K, I /* <: Iteration */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */] extends StObject {
  
  var `0`: ___ListOf[O, Exclude[K, Key[I]], AppendExists[O, LN, I], Next[I]]
  
  var `1`: LN
}
object `0ListOf` {
  
  inline def apply[O /* <: js.Object */, K, I /* <: Iteration */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */](`0`: ___ListOf[O, Exclude[K, Key[I]], AppendExists[O, LN, I], Next[I]], `1`: LN): `0ListOf`[O, K, I, LN] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0ListOf`[O, K, I, LN]]
  }
  
  extension [Self <: `0ListOf`[?, ?, ?, ?], O /* <: js.Object */, K, I /* <: Iteration */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */](x: Self & (`0ListOf`[O, K, I, LN])) {
    
    inline def set0(value: ___ListOf[O, Exclude[K, Key[I]], AppendExists[O, LN, I], Next[I]]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: LN): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
