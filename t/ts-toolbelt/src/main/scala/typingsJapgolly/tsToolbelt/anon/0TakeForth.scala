package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationPrevMod.Prev
import typingsJapgolly.tsToolbelt.outListPrependMod.Prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0TakeForth`[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */, I /* <: Iteration */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */] extends StObject {
  
  var `0`: typingsJapgolly.tsToolbelt.outListTakeMod.TakeForth[
    L, 
    N, 
    Prev[I], 
    Prepend[
      LN, 
      /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
    ]
  ]
  
  var `1`: LN
}
object `0TakeForth` {
  
  inline def apply[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */, I /* <: Iteration */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */](
    `0`: typingsJapgolly.tsToolbelt.outListTakeMod.TakeForth[
      L, 
      N, 
      Prev[I], 
      Prepend[
        LN, 
        /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
      ]
    ],
    `1`: LN
  ): `0TakeForth`[L, N, I, LN] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0TakeForth`[L, N, I, LN]]
  }
  
  extension [Self <: `0TakeForth`[?, ?, ?, ?], L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, N /* <: Iteration */, I /* <: Iteration */, LN /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */](x: Self & (`0TakeForth`[L, N, I, LN])) {
    
    inline def set0(
      value: typingsJapgolly.tsToolbelt.outListTakeMod.TakeForth[
          L, 
          N, 
          Prev[I], 
          Prepend[
            LN, 
            /* import warning: importer.ImportType#apply Failed type conversion: L[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: LN): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
