package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outAnyAtMod.At
import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outFunctionValidPathMod.ValidatePath
import typingsJapgolly.tsToolbelt.outFunctionValidPathMod.__ValidPath
import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationNextMod.Next
import typingsJapgolly.tsToolbelt.outUnionNonNullableMod.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0ValidPath`[O, Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */] extends StObject {
  
  var `0`: __ValidPath[
    NonNullable[
      At[
        O & js.Object, 
        /* import warning: importer.ImportType#apply Failed type conversion: Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
      ]
    ], 
    ValidatePath[O, Path, I], 
    Next[I]
  ]
  
  var `1`: Path
}
object `0ValidPath` {
  
  inline def apply[O, Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */](
    `0`: __ValidPath[
      NonNullable[
        At[
          O & js.Object, 
          /* import warning: importer.ImportType#apply Failed type conversion: Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
        ]
      ], 
      ValidatePath[O, Path, I], 
      Next[I]
    ],
    `1`: Path
  ): `0ValidPath`[O, Path, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0ValidPath`[O, Path, I]]
  }
  
  extension [Self <: `0ValidPath`[?, ?, ?], O, Path /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, I /* <: Iteration */](x: Self & (`0ValidPath`[O, Path, I])) {
    
    inline def set0(
      value: __ValidPath[
          NonNullable[
            At[
              O & js.Object, 
              /* import warning: importer.ImportType#apply Failed type conversion: Path[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any
            ]
          ], 
          ValidatePath[O, Path, I], 
          Next[I]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: Path): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
