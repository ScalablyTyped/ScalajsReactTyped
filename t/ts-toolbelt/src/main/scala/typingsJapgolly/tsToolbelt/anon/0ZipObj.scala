package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outIterationIterationMod.Iteration
import typingsJapgolly.tsToolbelt.outIterationNextMod.Next
import typingsJapgolly.tsToolbelt.outListZipObjMod.__ZipObj
import typingsJapgolly.tsToolbelt.outMiscBuiltInMod.BuiltIn
import typingsJapgolly.tsToolbelt.outObjectPatchMod.PatchFlat
import typingsJapgolly.tsToolbelt.outObjectRecordMod.Record
import typingsJapgolly.tsToolbelt.tsToolbeltStrings.Exclamationmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0ZipObj`[LKeys /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, LFields /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, O /* <: js.Object */, I /* <: Iteration */] extends StObject {
  
  var `0`: __ZipObj[
    LKeys, 
    LFields, 
    PatchFlat[
      O, 
      Record[
        /* import warning: importer.ImportType#apply Failed type conversion: LKeys[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: LFields[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
        js.Tuple2[Exclamationmark, typingsJapgolly.tsToolbelt.tsToolbeltStrings.W]
      ], 
      BuiltIn, 
      scala.Nothing
    ], 
    Next[I]
  ]
  
  var `1`: O
}
object `0ZipObj` {
  
  inline def apply[LKeys /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, LFields /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, O /* <: js.Object */, I /* <: Iteration */](
    `0`: __ZipObj[
      LKeys, 
      LFields, 
      PatchFlat[
        O, 
        Record[
          /* import warning: importer.ImportType#apply Failed type conversion: LKeys[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: LFields[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
          js.Tuple2[Exclamationmark, typingsJapgolly.tsToolbelt.tsToolbeltStrings.W]
        ], 
        BuiltIn, 
        scala.Nothing
      ], 
      Next[I]
    ],
    `1`: O
  ): `0ZipObj`[LKeys, LFields, O, I] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0ZipObj`[LKeys, LFields, O, I]]
  }
  
  extension [Self <: `0ZipObj`[?, ?, ?, ?], LKeys /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Key] */, LFields /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */, O /* <: js.Object */, I /* <: Iteration */](x: Self & (`0ZipObj`[LKeys, LFields, O, I])) {
    
    inline def set0(
      value: __ZipObj[
          LKeys, 
          LFields, 
          PatchFlat[
            O, 
            Record[
              /* import warning: importer.ImportType#apply Failed type conversion: LKeys[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: LFields[ts-toolbelt.ts-toolbelt/out/Iteration/Pos.Pos<I>] */ js.Any, 
              js.Tuple2[Exclamationmark, typingsJapgolly.tsToolbelt.tsToolbeltStrings.W]
            ], 
            BuiltIn, 
            scala.Nothing
          ], 
          Next[I]
        ]
    ): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: O): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
