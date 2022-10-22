package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to 3D elements of a three-dimensional chart.
  * @see Dim3DDiagram
  */
trait X3DDisplay
  extends StObject
     with XInterface {
  
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  val Floor: XPropertySet
  
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  val Wall: XPropertySet
  
  /**
    * @returns the properties of the floor.  This is only valid for three-dimensional diagrams.
    * @see ChartArea
    */
  def getFloor(): XPropertySet
  
  /**
    * @returns the properties of the diagram wall(s).  This specifies the properties of the two side walls of the chart scene.  Note that this property is also
    * @see ChartArea
    */
  def getWall(): XPropertySet
}
object X3DDisplay {
  
  inline def apply(
    Floor: XPropertySet,
    Wall: XPropertySet,
    acquire: Callback,
    getFloor: CallbackTo[XPropertySet],
    getWall: CallbackTo[XPropertySet],
    queryInterface: `type` => Any,
    release: Callback
  ): X3DDisplay = {
    val __obj = js.Dynamic.literal(Floor = Floor.asInstanceOf[js.Any], Wall = Wall.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFloor = getFloor.toJsFn, getWall = getWall.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[X3DDisplay]
  }
  
  extension [Self <: X3DDisplay](x: Self) {
    
    inline def setFloor(value: XPropertySet): Self = StObject.set(x, "Floor", value.asInstanceOf[js.Any])
    
    inline def setGetFloor(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getFloor", value.toJsFn)
    
    inline def setGetWall(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "getWall", value.toJsFn)
    
    inline def setWall(value: XPropertySet): Self = StObject.set(x, "Wall", value.asInstanceOf[js.Any])
  }
}
