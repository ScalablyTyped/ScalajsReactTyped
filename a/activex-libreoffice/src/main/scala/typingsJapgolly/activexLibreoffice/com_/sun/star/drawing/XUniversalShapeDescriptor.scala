package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XUniversalShapeDescriptor
  extends StObject
     with XShapeDescriptor {
  
  def setShapeType(aShapeTypeName: String): Unit
}
object XUniversalShapeDescriptor {
  
  inline def apply(
    ShapeType: String,
    acquire: Callback,
    getShapeType: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setShapeType: String => Callback
  ): XUniversalShapeDescriptor = {
    val __obj = js.Dynamic.literal(ShapeType = ShapeType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getShapeType = getShapeType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setShapeType = js.Any.fromFunction1((t0: String) => setShapeType(t0).runNow()))
    __obj.asInstanceOf[XUniversalShapeDescriptor]
  }
  
  extension [Self <: XUniversalShapeDescriptor](x: Self) {
    
    inline def setSetShapeType(value: String => Callback): Self = StObject.set(x, "setShapeType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
