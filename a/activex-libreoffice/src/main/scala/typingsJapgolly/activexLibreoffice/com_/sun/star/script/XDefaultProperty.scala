package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object supporting this interface indicates to interested parties or clients the name of the default propery for this object.
  *
  * For example where ExampleObject is an instance of an Object that supports this interface which returns the default property name "Value".A scripting
  * engine could use this information to support syntax like
  *
  * ExampleObject = "foo"
  *
  * which would be equivalent to writing
  *
  * ExampleObject.Value = "foo"
  *
  * or
  *
  * bar = ExampleObject
  *
  * which would be equivalent to writing
  *
  * bar = ExampleObject.Value
  */
trait XDefaultProperty
  extends StObject
     with XInterface {
  
  /**
    * Returns the name of the default property
    * @returns The `string` name of default property
    */
  val DefaultPropertyName: String
  
  /**
    * Returns the name of the default property
    * @returns The `string` name of default property
    */
  def getDefaultPropertyName(): String
}
object XDefaultProperty {
  
  inline def apply(
    DefaultPropertyName: String,
    acquire: Callback,
    getDefaultPropertyName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback
  ): XDefaultProperty = {
    val __obj = js.Dynamic.literal(DefaultPropertyName = DefaultPropertyName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDefaultPropertyName = getDefaultPropertyName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDefaultProperty]
  }
  
  extension [Self <: XDefaultProperty](x: Self) {
    
    inline def setDefaultPropertyName(value: String): Self = StObject.set(x, "DefaultPropertyName", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultPropertyName(value: CallbackTo[String]): Self = StObject.set(x, "getDefaultPropertyName", value.toJsFn)
  }
}
