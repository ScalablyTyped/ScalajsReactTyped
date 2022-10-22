package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated, UNOIDL does not have an array concept.
  * @deprecated Deprecated
  */
trait XArrayTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  val Dimensions: SafeArray[Double]
  
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  val NumberOfDimensions: Double
  
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  val Type: XTypeDescription
  
  /**
    * Returns dimensions of array (same length as {@link getNumberOfDimensions()} ).
    * @returns dimensions of array
    */
  def getDimensions(): SafeArray[Double]
  
  /**
    * Returns the number of dimensions of the array.
    * @returns dimension of the array
    */
  def getNumberOfDimensions(): Double
  
  /**
    * Returns the element type of the array.
    * @returns element type of the array
    */
  def getType(): XTypeDescription
}
object XArrayTypeDescription {
  
  inline def apply(
    Dimensions: SafeArray[Double],
    Name: String,
    NumberOfDimensions: Double,
    Type: XTypeDescription,
    TypeClass: TypeClass,
    acquire: Callback,
    getDimensions: CallbackTo[SafeArray[Double]],
    getName: CallbackTo[String],
    getNumberOfDimensions: CallbackTo[Double],
    getType: CallbackTo[XTypeDescription],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XArrayTypeDescription = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberOfDimensions = NumberOfDimensions.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDimensions = getDimensions.toJsFn, getName = getName.toJsFn, getNumberOfDimensions = getNumberOfDimensions.toJsFn, getType = getType.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XArrayTypeDescription]
  }
  
  extension [Self <: XArrayTypeDescription](x: Self) {
    
    inline def setDimensions(value: SafeArray[Double]): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setGetDimensions(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getDimensions", value.toJsFn)
    
    inline def setGetNumberOfDimensions(value: CallbackTo[Double]): Self = StObject.set(x, "getNumberOfDimensions", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setNumberOfDimensions(value: Double): Self = StObject.set(x, "NumberOfDimensions", value.asInstanceOf[js.Any])
    
    inline def setType(value: XTypeDescription): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
