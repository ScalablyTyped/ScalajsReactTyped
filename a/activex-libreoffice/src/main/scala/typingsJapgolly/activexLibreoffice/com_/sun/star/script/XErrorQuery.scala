package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XErrorQuery
  extends StObject
     with XInterface {
  
  /**
    * Returns whether this object has an error
    * @returns `boolean` indicating an error or not
    */
  def hasError(): Boolean
}
object XErrorQuery {
  
  inline def apply(acquire: Callback, hasError: CallbackTo[Boolean], queryInterface: `type` => Any, release: Callback): XErrorQuery = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, hasError = hasError.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XErrorQuery]
  }
  
  extension [Self <: XErrorQuery](x: Self) {
    
    inline def setHasError(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasError", value.toJsFn)
  }
}
