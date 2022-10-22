package typingsJapgolly.activexLibreoffice.com_.sun.star.geometry

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface defining an arbitrary bijective mapping from R^2 to R^2.
  *
  * This interface provides methods to define an arbitrary bijective mapping from R^2 to R^2, i.e. from the two-dimensional space of real numbers onto
  * itself, as is representable by the double floating point type. The mapping must be bijective, i.e. map a pair of real numbers to exactly one other
  * pair of real numbers an vice versa, to facilitate a working inverse. Bijectiveness also implies completeness, i.e. for every pair of real numbers
  * there must be another pair that is mapped upon them.
  * @since OOo 2.0
  */
trait XMapping2D
  extends StObject
     with XInterface {
  
  /** Forward 2D mapping function */
  def map(aPoint: RealPoint2D): RealPoint2D
  
  /**
    * Inverse 2D mapping function.
    *
    * The following invariant must hold: `map(mapInverse(p))=p` . This effectively rules out non-bijective mappings.
    */
  def mapInverse(aPoint: RealPoint2D): RealPoint2D
}
object XMapping2D {
  
  inline def apply(
    acquire: Callback,
    map: RealPoint2D => RealPoint2D,
    mapInverse: RealPoint2D => RealPoint2D,
    queryInterface: `type` => Any,
    release: Callback
  ): XMapping2D = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, map = js.Any.fromFunction1(map), mapInverse = js.Any.fromFunction1(mapInverse), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMapping2D]
  }
  
  extension [Self <: XMapping2D](x: Self) {
    
    inline def setMap(value: RealPoint2D => RealPoint2D): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setMapInverse(value: RealPoint2D => RealPoint2D): Self = StObject.set(x, "mapInverse", js.Any.fromFunction1(value))
  }
}
