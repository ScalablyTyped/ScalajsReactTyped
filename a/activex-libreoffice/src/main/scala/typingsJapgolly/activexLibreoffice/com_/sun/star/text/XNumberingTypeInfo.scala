package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the numbering types that are supported by a component.
  *
  * To be able to store unknown numbering types in a file format the numbering types correspond to an identifier.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.style.NumberingType
  * @version 1.0
  */
trait XNumberingTypeInfo
  extends StObject
     with XInterface {
  
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  val SupportedNumberingTypes: SafeArray[Double]
  
  /** returns the corresponding identifier to a numbering type. */
  def getNumberingIdentifier(NumberingType: Double): String
  
  /** returns the corresponding numbering type to an identifier. */
  def getNumberingType(NumberingIdentifier: String): Double
  
  /**
    * returns the numbering type values that are supported by the component.
    * @see
    */
  def getSupportedNumberingTypes(): SafeArray[Double]
  
  /** determines whether an identifier is supported. */
  def hasNumberingType(NumberingIdentifier: String): Boolean
}
object XNumberingTypeInfo {
  
  inline def apply(
    SupportedNumberingTypes: SafeArray[Double],
    acquire: Callback,
    getNumberingIdentifier: Double => String,
    getNumberingType: String => Double,
    getSupportedNumberingTypes: CallbackTo[SafeArray[Double]],
    hasNumberingType: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XNumberingTypeInfo = {
    val __obj = js.Dynamic.literal(SupportedNumberingTypes = SupportedNumberingTypes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getNumberingIdentifier = js.Any.fromFunction1(getNumberingIdentifier), getNumberingType = js.Any.fromFunction1(getNumberingType), getSupportedNumberingTypes = getSupportedNumberingTypes.toJsFn, hasNumberingType = js.Any.fromFunction1(hasNumberingType), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNumberingTypeInfo]
  }
  
  extension [Self <: XNumberingTypeInfo](x: Self) {
    
    inline def setGetNumberingIdentifier(value: Double => String): Self = StObject.set(x, "getNumberingIdentifier", js.Any.fromFunction1(value))
    
    inline def setGetNumberingType(value: String => Double): Self = StObject.set(x, "getNumberingType", js.Any.fromFunction1(value))
    
    inline def setGetSupportedNumberingTypes(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getSupportedNumberingTypes", value.toJsFn)
    
    inline def setHasNumberingType(value: String => Boolean): Self = StObject.set(x, "hasNumberingType", js.Any.fromFunction1(value))
    
    inline def setSupportedNumberingTypes(value: SafeArray[Double]): Self = StObject.set(x, "SupportedNumberingTypes", value.asInstanceOf[js.Any])
  }
}
