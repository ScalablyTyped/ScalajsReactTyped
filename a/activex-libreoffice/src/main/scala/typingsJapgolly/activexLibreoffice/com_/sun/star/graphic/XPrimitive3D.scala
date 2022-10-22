package typingsJapgolly.activexLibreoffice.com_.sun.star.graphic

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealRectangle3D
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link XPrimitive3D} interface
  *
  * This is the basic interface for graphic 3D primitives. They need to be able to provide a decomposition consisting of simpler graphic primitivesto
  * provide a 3D bound rectangle as a 3D range
  */
trait XPrimitive3D
  extends StObject
     with XInterface {
  
  /**
    * Retrieve decomposed list of simpler primitives
    * @param aViewParameters 3D View-specific parameter set. The defined but not mandatory parameters include: double Time  Defines the point in time for whic
    */
  def getDecomposition(aViewParameters: SeqEquiv[PropertyValue]): SafeArray[XPrimitive3D]
  
  /**
    * Retrieve bound rect of primitive
    *
    * This method calculates the actual bound rect of the area in **world coordinates** . Note that for view-dependent primitives, the necessary pixel
    * adjustments are taken into account. For that reason the ViewParameters need to be given.
    * @param aViewParameters 3D View-specific parameter set, same as in getDecomposition.
    */
  def getRange(aViewParameters: SeqEquiv[PropertyValue]): RealRectangle3D
}
object XPrimitive3D {
  
  inline def apply(
    acquire: Callback,
    getDecomposition: SeqEquiv[PropertyValue] => SafeArray[XPrimitive3D],
    getRange: SeqEquiv[PropertyValue] => RealRectangle3D,
    queryInterface: `type` => Any,
    release: Callback
  ): XPrimitive3D = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getDecomposition = js.Any.fromFunction1(getDecomposition), getRange = js.Any.fromFunction1(getRange), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPrimitive3D]
  }
  
  extension [Self <: XPrimitive3D](x: Self) {
    
    inline def setGetDecomposition(value: SeqEquiv[PropertyValue] => SafeArray[XPrimitive3D]): Self = StObject.set(x, "getDecomposition", js.Any.fromFunction1(value))
    
    inline def setGetRange(value: SeqEquiv[PropertyValue] => RealRectangle3D): Self = StObject.set(x, "getRange", js.Any.fromFunction1(value))
  }
}
