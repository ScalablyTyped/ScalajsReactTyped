package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is supported by objects with data that can be updated from a data source. */
trait XUpdatable
  extends StObject
     with XInterface {
  
  /** refreshes the data of the object from the connected data source. */
  def update(): Unit
}
object XUpdatable {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, update: Callback): XUpdatable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, update = update.toJsFn)
    __obj.asInstanceOf[XUpdatable]
  }
  
  extension [Self <: XUpdatable](x: Self) {
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
