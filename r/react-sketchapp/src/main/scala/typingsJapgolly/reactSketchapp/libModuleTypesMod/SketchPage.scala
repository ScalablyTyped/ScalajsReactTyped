package typingsJapgolly.reactSketchapp.libModuleTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchPage extends StObject {
  
  def children(): js.Array[SketchLayer]
  
  def layers(): js.Array[SketchLayer]
  
  def name(): NSString
  
  def setName(name: String): Unit
}
object SketchPage {
  
  inline def apply(
    children: CallbackTo[js.Array[SketchLayer]],
    layers: CallbackTo[js.Array[SketchLayer]],
    name: CallbackTo[NSString],
    setName: String => Callback
  ): SketchPage = {
    val __obj = js.Dynamic.literal(children = children.toJsFn, layers = layers.toJsFn, name = name.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[SketchPage]
  }
  
  extension [Self <: SketchPage](x: Self) {
    
    inline def setChildren(value: CallbackTo[js.Array[SketchLayer]]): Self = StObject.set(x, "children", value.toJsFn)
    
    inline def setLayers(value: CallbackTo[js.Array[SketchLayer]]): Self = StObject.set(x, "layers", value.toJsFn)
    
    inline def setName(value: CallbackTo[NSString]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
