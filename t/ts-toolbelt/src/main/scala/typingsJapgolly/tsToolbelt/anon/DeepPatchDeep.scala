package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outObjectPatchMod.PatchDeep
import typingsJapgolly.tsToolbelt.outObjectPatchMod.PatchFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepPatchDeep[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill /* <: Any */] extends StObject {
  
  var deep: PatchDeep[O, O1, ignore, fill]
  
  var flat: PatchFlat[O, O1, ignore, fill]
}
object DeepPatchDeep {
  
  inline def apply[O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill /* <: Any */](deep: PatchDeep[O, O1, ignore, fill], flat: PatchFlat[O, O1, ignore, fill]): DeepPatchDeep[O, O1, ignore, fill] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepPatchDeep[O, O1, ignore, fill]]
  }
  
  extension [Self <: DeepPatchDeep[?, ?, ?, ?], O /* <: js.Object */, O1 /* <: js.Object */, ignore /* <: js.Object */, fill /* <: Any */](x: Self & (DeepPatchDeep[O, O1, ignore, fill])) {
    
    inline def setDeep(value: PatchDeep[O, O1, ignore, fill]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: PatchFlat[O, O1, ignore, fill]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
