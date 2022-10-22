package typingsJapgolly.cannon.CANNON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pool extends StObject {
  
  def constructObject(): Any
  
  def get(): Any
  
  var objects: js.Array[Any]
  
  def release(): Any
  
  var `type`: js.Array[Any]
}
object Pool {
  
  inline def apply(
    constructObject: CallbackTo[Any],
    get: CallbackTo[Any],
    objects: js.Array[Any],
    release: CallbackTo[Any],
    `type`: js.Array[Any]
  ): Pool = {
    val __obj = js.Dynamic.literal(constructObject = constructObject.toJsFn, get = get.toJsFn, objects = objects.asInstanceOf[js.Any], release = release.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pool]
  }
  
  extension [Self <: Pool](x: Self) {
    
    inline def setConstructObject(value: CallbackTo[Any]): Self = StObject.set(x, "constructObject", value.toJsFn)
    
    inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setObjects(value: js.Array[Any]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsVarargs(value: Any*): Self = StObject.set(x, "objects", js.Array(value*))
    
    inline def setRelease(value: CallbackTo[Any]): Self = StObject.set(x, "release", value.toJsFn)
    
    inline def setType(value: js.Array[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: Any*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
