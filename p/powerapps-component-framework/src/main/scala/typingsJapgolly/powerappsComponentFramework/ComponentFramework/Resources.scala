package typingsJapgolly.powerappsComponentFramework.ComponentFramework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The resource interface of context.resources
  */
trait Resources extends StObject {
  
  /**
    * Gets a resource referenced by the control manifest.
    * @param id The resource string identifier.
    * @param success The success callback. Resource data is returned in base 64 encoded format.
    * @param failure The failure callback.
    */
  def getResource(id: String, success: js.Function1[/* data */ String, Unit], failure: js.Function0[Unit]): Unit
  
  /**
    * Get the localized string for the given identifier.
    * @param id name of resource in the control manifest.
    */
  def getString(id: String): String
}
object Resources {
  
  inline def apply(
    getResource: (String, js.Function1[/* data */ String, Unit], js.Function0[Unit]) => Callback,
    getString: String => String
  ): Resources = {
    val __obj = js.Dynamic.literal(getResource = js.Any.fromFunction3((t0: String, t1: js.Function1[/* data */ String, Unit], t2: js.Function0[Unit]) => (getResource(t0, t1, t2)).runNow()), getString = js.Any.fromFunction1(getString))
    __obj.asInstanceOf[Resources]
  }
  
  extension [Self <: Resources](x: Self) {
    
    inline def setGetResource(value: (String, js.Function1[/* data */ String, Unit], js.Function0[Unit]) => Callback): Self = StObject.set(x, "getResource", js.Any.fromFunction3((t0: String, t1: js.Function1[/* data */ String, Unit], t2: js.Function0[Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetString(value: String => String): Self = StObject.set(x, "getString", js.Any.fromFunction1(value))
  }
}
