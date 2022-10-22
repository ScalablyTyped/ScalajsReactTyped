package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XConnectableShape
  extends StObject
     with XInterface {
  
  def canConnect(nPos: Point, bCreateGluePoint: Boolean, nMaxDist: Double): Boolean
  
  def doConnect(nPos: Point, bCreateGluePoint: Boolean, nMaxDist: Double): Boolean
}
object XConnectableShape {
  
  inline def apply(
    acquire: Callback,
    canConnect: (Point, Boolean, Double) => Boolean,
    doConnect: (Point, Boolean, Double) => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XConnectableShape = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, canConnect = js.Any.fromFunction3(canConnect), doConnect = js.Any.fromFunction3(doConnect), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XConnectableShape]
  }
  
  extension [Self <: XConnectableShape](x: Self) {
    
    inline def setCanConnect(value: (Point, Boolean, Double) => Boolean): Self = StObject.set(x, "canConnect", js.Any.fromFunction3(value))
    
    inline def setDoConnect(value: (Point, Boolean, Double) => Boolean): Self = StObject.set(x, "doConnect", js.Any.fromFunction3(value))
  }
}
