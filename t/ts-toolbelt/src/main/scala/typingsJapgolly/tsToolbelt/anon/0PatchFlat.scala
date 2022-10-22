package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outAnyKeyMod.Key
import typingsJapgolly.tsToolbelt.outMiscBuiltInMod.BuiltIn
import typingsJapgolly.tsToolbelt.outObjectInternalMod.Depth
import typingsJapgolly.tsToolbelt.outObjectOptionalMod.OptionalPart
import typingsJapgolly.tsToolbelt.outObjectPatchMod.PatchFlat
import typingsJapgolly.tsToolbelt.outObjectPickMod.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0PatchFlat`[O /* <: js.Object */, depth /* <: Depth */, K /* <: Key */] extends StObject {
  
  var `0`: PatchFlat[OptionalPart[Pick[O, K], depth], O, BuiltIn, scala.Nothing]
  
  var `1`: OptionalPart[O, depth]
}
object `0PatchFlat` {
  
  inline def apply[O /* <: js.Object */, depth /* <: Depth */, K /* <: Key */](
    `0`: PatchFlat[OptionalPart[Pick[O, K], depth], O, BuiltIn, scala.Nothing],
    `1`: OptionalPart[O, depth]
  ): `0PatchFlat`[O, depth, K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0PatchFlat`[O, depth, K]]
  }
  
  extension [Self <: `0PatchFlat`[?, ?, ?], O /* <: js.Object */, depth /* <: Depth */, K /* <: Key */](x: Self & (`0PatchFlat`[O, depth, K])) {
    
    inline def set0(value: PatchFlat[OptionalPart[Pick[O, K], depth], O, BuiltIn, scala.Nothing]): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set1(value: OptionalPart[O, depth]): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
  }
}
