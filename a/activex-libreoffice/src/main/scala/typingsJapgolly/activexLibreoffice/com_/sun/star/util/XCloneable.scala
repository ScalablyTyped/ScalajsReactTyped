package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to create a copy of the object which supports this interface. */
trait XCloneable
  extends StObject
     with XInterface {
  
  /** creates a copy of the object. */
  def createClone(): XCloneable
}
object XCloneable {
  
  inline def apply(
    acquire: Callback,
    createClone: CallbackTo[XCloneable],
    queryInterface: `type` => Any,
    release: Callback
  ): XCloneable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createClone = createClone.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCloneable]
  }
  
  extension [Self <: XCloneable](x: Self) {
    
    inline def setCreateClone(value: CallbackTo[XCloneable]): Self = StObject.set(x, "createClone", value.toJsFn)
  }
}
