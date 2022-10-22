package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.TypeClass
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reflects an enum type. */
trait XEnumTypeDescription
  extends StObject
     with XTypeDescription {
  
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  val DefaultEnumValue: Double
  
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  val EnumNames: SafeArray[String]
  
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  val EnumValues: SafeArray[Double]
  
  /**
    * Returns the default enum value.
    * @returns default enum value
    */
  def getDefaultEnumValue(): Double
  
  /**
    * Returns the enum member values.
    * @returns enum member values
    */
  def getEnumNames(): SafeArray[String]
  
  /**
    * Returns the enum member names.
    * @returns enum member names
    */
  def getEnumValues(): SafeArray[Double]
}
object XEnumTypeDescription {
  
  inline def apply(
    DefaultEnumValue: Double,
    EnumNames: SafeArray[String],
    EnumValues: SafeArray[Double],
    Name: String,
    TypeClass: TypeClass,
    acquire: Callback,
    getDefaultEnumValue: CallbackTo[Double],
    getEnumNames: CallbackTo[SafeArray[String]],
    getEnumValues: CallbackTo[SafeArray[Double]],
    getName: CallbackTo[String],
    getTypeClass: CallbackTo[TypeClass],
    queryInterface: `type` => Any,
    release: Callback
  ): XEnumTypeDescription = {
    val __obj = js.Dynamic.literal(DefaultEnumValue = DefaultEnumValue.asInstanceOf[js.Any], EnumNames = EnumNames.asInstanceOf[js.Any], EnumValues = EnumValues.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDefaultEnumValue = getDefaultEnumValue.toJsFn, getEnumNames = getEnumNames.toJsFn, getEnumValues = getEnumValues.toJsFn, getName = getName.toJsFn, getTypeClass = getTypeClass.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEnumTypeDescription]
  }
  
  extension [Self <: XEnumTypeDescription](x: Self) {
    
    inline def setDefaultEnumValue(value: Double): Self = StObject.set(x, "DefaultEnumValue", value.asInstanceOf[js.Any])
    
    inline def setEnumNames(value: SafeArray[String]): Self = StObject.set(x, "EnumNames", value.asInstanceOf[js.Any])
    
    inline def setEnumValues(value: SafeArray[Double]): Self = StObject.set(x, "EnumValues", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultEnumValue(value: CallbackTo[Double]): Self = StObject.set(x, "getDefaultEnumValue", value.toJsFn)
    
    inline def setGetEnumNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getEnumNames", value.toJsFn)
    
    inline def setGetEnumValues(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getEnumValues", value.toJsFn)
  }
}
