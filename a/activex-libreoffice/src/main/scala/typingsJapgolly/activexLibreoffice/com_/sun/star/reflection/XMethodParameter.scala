package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a method parameter.
  *
  * This type is superseded by {@link XParameter} , which supports parameters of service constructors as well as parameters of interface methods.
  * @see XInterfaceMethodTypeDescription
  */
trait XMethodParameter
  extends StObject
     with XInterface {
  
  /**
    * Returns the name of the parameter
    * @returns name of parameter
    */
  val Name: String
  
  /**
    * Returns the position of the parameter regarding the IDL method declaration.
    * @returns position of the parameter
    */
  val Position: Double
  
  /**
    * Returns the type of the parameter.
    * @returns type of parameter
    */
  val Type: XTypeDescription
  
  /**
    * Returns the name of the parameter
    * @returns name of parameter
    */
  def getName(): String
  
  /**
    * Returns the position of the parameter regarding the IDL method declaration.
    * @returns position of the parameter
    */
  def getPosition(): Double
  
  /**
    * Returns the type of the parameter.
    * @returns type of parameter
    */
  def getType(): XTypeDescription
  
  /**
    * Returns true, if the parameter is declared as [in] or [inout] in IDL.
    * @returns true, if declared [in] or [inout] parameter
    */
  def isIn(): Boolean
  
  /**
    * Returns true, if the parameter is declared as [out] or [inout] in IDL.
    * @returns true, if declared [out] or [inout] parameter
    */
  def isOut(): Boolean
}
object XMethodParameter {
  
  inline def apply(
    Name: String,
    Position: Double,
    Type: XTypeDescription,
    acquire: Callback,
    getName: CallbackTo[String],
    getPosition: CallbackTo[Double],
    getType: CallbackTo[XTypeDescription],
    isIn: CallbackTo[Boolean],
    isOut: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XMethodParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getName = getName.toJsFn, getPosition = getPosition.toJsFn, getType = getType.toJsFn, isIn = isIn.toJsFn, isOut = isOut.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMethodParameter]
  }
  
  extension [Self <: XMethodParameter](x: Self) {
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Double]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[XTypeDescription]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setIsIn(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIn", value.toJsFn)
    
    inline def setIsOut(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOut", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setType(value: XTypeDescription): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
