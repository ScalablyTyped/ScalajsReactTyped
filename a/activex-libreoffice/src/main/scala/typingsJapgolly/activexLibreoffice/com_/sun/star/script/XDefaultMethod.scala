package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object supporting this interface indicates to interested parties or clients the name of the default method for this object.
  *
  * For example where ExampleObject is an instance of an Object that supports this interface which returns the default method name "defaultMethod".A
  * scripting engine could use this information to support syntax like
  *
  * "ExampleObject( Param1 .... ParamN )"
  *
  * which would be equivalent to writing
  *
  * "ExampleObject.defaultMethod( Param1 ... ParamN )"
  */
trait XDefaultMethod
  extends StObject
     with XInterface {
  
  /**
    * Returns the name of the default method
    * @returns The `string` name of default method
    */
  val DefaultMethodName: String
  
  /**
    * Returns the name of the default method
    * @returns The `string` name of default method
    */
  def getDefaultMethodName(): String
}
object XDefaultMethod {
  
  inline def apply(
    DefaultMethodName: String,
    acquire: Callback,
    getDefaultMethodName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XDefaultMethod = {
    val __obj = js.Dynamic.literal(DefaultMethodName = DefaultMethodName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDefaultMethodName = getDefaultMethodName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDefaultMethod]
  }
  
  extension [Self <: XDefaultMethod](x: Self) {
    
    inline def setDefaultMethodName(value: String): Self = StObject.set(x, "DefaultMethodName", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultMethodName(value: CallbackTo[String]): Self = StObject.set(x, "getDefaultMethodName", value.toJsFn)
  }
}
