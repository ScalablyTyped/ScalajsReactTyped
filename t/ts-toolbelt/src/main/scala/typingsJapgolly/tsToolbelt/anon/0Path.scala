package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outAnyAtMod.At
import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationNextMod.Next
import typingsJapgolly.tsToolbelt.outObjectPathMod._Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0Path`[O, P /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */] extends StObject {
  
  var `0`: _Path[
    At[
      O, 
      /* import warning: importer.ImportType#apply Failed type conversion: P[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
    ], 
    P, 
    Next[I]
  ]
  
  var `1`: O
}
object `0Path` {
  
  inline def apply[O, P /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */](
    `0`: _Path[
      At[
        O, 
        /* import warning: importer.ImportType#apply Failed type conversion: P[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
      ], 
      P, 
      Next[I]
    ],
    `1`: O
  ): `0Path`[O, P, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0Path`[O, P, I]]
  }
  
  extension [Self <: `0Path`[?, ?, ?], O, P /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */](x: Self & (`0Path`[O, P, I])) {
    
    inline def set0(
      value: _Path[
          At[
            O, 
            /* import warning: importer.ImportType#apply Failed type conversion: P[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
          ], 
          P, 
          Next[I]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: O): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
