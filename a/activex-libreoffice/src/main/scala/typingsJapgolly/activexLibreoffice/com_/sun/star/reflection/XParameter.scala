package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reflects a parameter of an interface method or a service constructor.
  *
  * This type supersedes {@link XMethodParameter} , which only supports parameters of interface methods (which cannot have rest parameters).
  * @since OOo 2.0
  */
trait XParameter
  extends StObject
     with XMethodParameter {
  
  /**
    * Returns whether this is a rest parameter.
    *
    * A rest parameter must always come last in a parameter list.
    *
    * Currently, only service constructors can have rest parameters, and those rest parameters must be in parameters of type `any` .
    * @returns `TRUE` if and only if this parameter is a rest parameter
    */
  def isRestParameter(): Boolean
}
object XParameter {
  
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
    isRestParameter: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XParameter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getName = getName.toJsFn, getPosition = getPosition.toJsFn, getType = getType.toJsFn, isIn = isIn.toJsFn, isOut = isOut.toJsFn, isRestParameter = isRestParameter.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XParameter]
  }
  
  extension [Self <: XParameter](x: Self) {
    
    inline def setIsRestParameter(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRestParameter", value.toJsFn)
  }
}
