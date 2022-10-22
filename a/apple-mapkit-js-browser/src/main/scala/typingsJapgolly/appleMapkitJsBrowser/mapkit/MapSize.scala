package typingsJapgolly.appleMapkitJsBrowser.mapkit

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pair of values in map units that define the width and height of a
  * projected coordinate span.
  */
trait MapSize extends StObject {
  
  /**
    * Returns a copy of a map size.
    */
  def copy(): MapSize
  
  /**
    * Indicates whether two map sizes are equal.
    *
    * @param anotherSize The map size to equate to.
    */
  def equals(anotherSize: MapSize): Boolean
  
  /**
    * The height value, in map point units.
    */
  var height: Double
  
  /**
    * The width value, in map point units.
    */
  var width: Double
}
object MapSize {
  
  inline def apply(copy: CallbackTo[MapSize], equals_ : MapSize => Boolean, height: Double, width: Double): MapSize = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[MapSize]
  }
  
  extension [Self <: MapSize](x: Self) {
    
    inline def setCopy(value: CallbackTo[MapSize]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setEquals_(value: MapSize => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
