package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outIterationIterationOfMod.IterationOf
import typingsJapgolly.tsToolbelt.outListUnNestMod.UnNestLoose
import typingsJapgolly.tsToolbelt.outListUnNestMod.UnNestStrict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0UnNestLoose`[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */] extends StObject {
  
  var `0`: UnNestLoose[L]
  
  var `1`: UnNestStrict[L, js.Array[Any], IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]
}
object `0UnNestLoose` {
  
  inline def apply[L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */](
    `0`: UnNestLoose[L],
    `1`: UnNestStrict[L, js.Array[Any], IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]
  ): `0UnNestLoose`[L] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0UnNestLoose`[L]]
  }
  
  extension [Self <: `0UnNestLoose`[?], L /* <: typingsJapgolly.tsToolbelt.outListListMod.List[Any] */](x: Self & `0UnNestLoose`[L]) {
    
    inline def set0(value: UnNestLoose[L]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set0Varargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: ts-toolbelt.ts-toolbelt/out/List/UnionOf.UnionOf<L> extends infer UL ? UL extends unknown ? UL extends ts-toolbelt.ts-toolbelt/out/List/List.List<any> ? ts-toolbelt.ts-toolbelt/out/List/UnionOf.UnionOf<UL> : UL : never : never */ js.Any)*
    ): Self = StObject.set(x, "0", js.Array(value*))
    
    inline def set1(value: UnNestStrict[L, js.Array[Any], IterationOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
