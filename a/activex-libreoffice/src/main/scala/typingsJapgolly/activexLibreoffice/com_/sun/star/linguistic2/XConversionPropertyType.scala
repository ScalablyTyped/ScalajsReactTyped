package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows set and retrieve the property type of an entry in a conversion dictionary
  *
  * The property type must be one of {@link com.sun.star.linguistic2.ConversionPropertyType}
  * @see com.sun.star.linguistic2.XConversionDictionary
  * @see com.sun.star.linguistic2.ConversionPropertyType
  * @since OOo 2.0
  */
trait XConversionPropertyType
  extends StObject
     with XInterface {
  
  /**
    * returns the property type for the specified entry.
    *
    * The conversion entry is specified by the pair ( aLeftText, aRightText ).
    * @param aLeftText the left text of the dictionary entry.
    * @param aRightText the right text of the dictionary entry.
    * @returns returns the property type for the entry with the specified left text.
    */
  def getPropertyType(aLeftText: String, aRightText: String): Double
  
  /**
    * sets the property type for the specified entry.
    *
    * The conversion entry is specified by the pair ( aLeftText, aRightText ).
    * @param aLeftText the left text of the dictionary entry.
    * @param aRightText the right text of the dictionary entry.
    * @param nPropertyType the property type to be set for the entry
    */
  def setPropertyType(aLeftText: String, aRightText: String, nPropertyType: Double): Unit
}
object XConversionPropertyType {
  
  inline def apply(
    acquire: Callback,
    getPropertyType: (String, String) => Double,
    queryInterface: `type` => Any,
    release: Callback,
    setPropertyType: (String, String, Double) => Callback
  ): XConversionPropertyType = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getPropertyType = js.Any.fromFunction2(getPropertyType), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setPropertyType = js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (setPropertyType(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XConversionPropertyType]
  }
  
  extension [Self <: XConversionPropertyType](x: Self) {
    
    inline def setGetPropertyType(value: (String, String) => Double): Self = StObject.set(x, "getPropertyType", js.Any.fromFunction2(value))
    
    inline def setSetPropertyType(value: (String, String, Double) => Callback): Self = StObject.set(x, "setPropertyType", js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
