package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides for access to a container of keys, typically used for a table definition object. */
trait XKeysSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of keys.
    * @returns the keys
    */
  val Keys: XIndexAccess
  
  /**
    * returns the container of keys.
    * @returns the keys
    */
  def getKeys(): XIndexAccess
}
object XKeysSupplier {
  
  inline def apply(
    Keys: XIndexAccess,
    acquire: Callback,
    getKeys: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XKeysSupplier = {
    val __obj = js.Dynamic.literal(Keys = Keys.asInstanceOf[js.Any], acquire = acquire.toJsFn, getKeys = getKeys.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XKeysSupplier]
  }
  
  extension [Self <: XKeysSupplier](x: Self) {
    
    inline def setGetKeys(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getKeys", value.toJsFn)
    
    inline def setKeys(value: XIndexAccess): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
  }
}
