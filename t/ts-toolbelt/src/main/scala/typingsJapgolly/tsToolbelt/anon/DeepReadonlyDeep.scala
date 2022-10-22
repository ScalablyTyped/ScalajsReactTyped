package typingsJapgolly.tsToolbelt.anon

import typingsJapgolly.tsToolbelt.outObjectReadonlyMod.ReadonlyDeep
import typingsJapgolly.tsToolbelt.outObjectReadonlyMod.ReadonlyFlat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeepReadonlyDeep[O /* <: js.Object */] extends StObject {
  
  var deep: ReadonlyDeep[O]
  
  var flat: ReadonlyFlat[O]
}
object DeepReadonlyDeep {
  
  inline def apply[O /* <: js.Object */](deep: ReadonlyDeep[O], flat: ReadonlyFlat[O]): DeepReadonlyDeep[O] = {
    val __obj = js.Dynamic.literal(deep = deep.asInstanceOf[js.Any], flat = flat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepReadonlyDeep[O]]
  }
  
  extension [Self <: DeepReadonlyDeep[?], O /* <: js.Object */](x: Self & DeepReadonlyDeep[O]) {
    
    inline def setDeep(value: ReadonlyDeep[O]): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    inline def setFlat(value: ReadonlyFlat[O]): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
  }
}
