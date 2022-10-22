package typingsJapgolly.reactSketchapp.libTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchSharedStyleContainer extends StObject {
  
  def addSharedObject(ins: Any): Any
  
  def addSharedStyleWithName_firstInstance(name: String, ins: SketchStyle): Any
  
  def objects(): js.Array[Any]
  
  def setObjects(objects: js.Array[SketchStyle]): Unit
}
object SketchSharedStyleContainer {
  
  inline def apply(
    addSharedObject: Any => Any,
    addSharedStyleWithName_firstInstance: (String, SketchStyle) => Any,
    objects: CallbackTo[js.Array[Any]],
    setObjects: js.Array[SketchStyle] => Callback
  ): SketchSharedStyleContainer = {
    val __obj = js.Dynamic.literal(addSharedObject = js.Any.fromFunction1(addSharedObject), addSharedStyleWithName_firstInstance = js.Any.fromFunction2(addSharedStyleWithName_firstInstance), objects = objects.toJsFn, setObjects = js.Any.fromFunction1((t0: js.Array[SketchStyle]) => setObjects(t0).runNow()))
    __obj.asInstanceOf[SketchSharedStyleContainer]
  }
  
  extension [Self <: SketchSharedStyleContainer](x: Self) {
    
    inline def setAddSharedObject(value: Any => Any): Self = StObject.set(x, "addSharedObject", js.Any.fromFunction1(value))
    
    inline def setAddSharedStyleWithName_firstInstance(value: (String, SketchStyle) => Any): Self = StObject.set(x, "addSharedStyleWithName_firstInstance", js.Any.fromFunction2(value))
    
    inline def setObjects(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "objects", value.toJsFn)
    
    inline def setSetObjects(value: js.Array[SketchStyle] => Callback): Self = StObject.set(x, "setObjects", js.Any.fromFunction1((t0: js.Array[SketchStyle]) => value(t0).runNow()))
  }
}
