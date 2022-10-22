package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface can be used to mirror {@link Shapes} .
  * @deprecated Deprecated
  */
trait XShapeMirror
  extends StObject
     with XInterface {
  
  /** mirrors the given {@link Shapes} at the given axis. */
  def mirror(aShapes: js.Array[XShapes], eAxis: MirrorAxis): Unit
  
  /** mirrors the given {@link Shapes} at the given axis. */
  def mirrorAtAxis(aShapes: js.Array[XShapes], aLine: XShape): Unit
}
object XShapeMirror {
  
  inline def apply(
    acquire: Callback,
    mirror: (js.Array[XShapes], MirrorAxis) => Callback,
    mirrorAtAxis: (js.Array[XShapes], XShape) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XShapeMirror = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, mirror = js.Any.fromFunction2((t0: js.Array[XShapes], t1: MirrorAxis) => (mirror(t0, t1)).runNow()), mirrorAtAxis = js.Any.fromFunction2((t0: js.Array[XShapes], t1: XShape) => (mirrorAtAxis(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XShapeMirror]
  }
  
  extension [Self <: XShapeMirror](x: Self) {
    
    inline def setMirror(value: (js.Array[XShapes], MirrorAxis) => Callback): Self = StObject.set(x, "mirror", js.Any.fromFunction2((t0: js.Array[XShapes], t1: MirrorAxis) => (value(t0, t1)).runNow()))
    
    inline def setMirrorAtAxis(value: (js.Array[XShapes], XShape) => Callback): Self = StObject.set(x, "mirrorAtAxis", js.Any.fromFunction2((t0: js.Array[XShapes], t1: XShape) => (value(t0, t1)).runNow()))
  }
}
