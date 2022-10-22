package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to register a listener for LinguServiceEvents.
  *
  * This interface may be used by spell checker or hyphenator implementations to allow clients to be registered and informed about
  * com::sun::star::linguistic2::LinguServiceEvents.
  *
  * Note: The {@link LinguServiceManager} forwards the com::sun::star::linguistic2::LinguServiceEvents it receives (from spell checkers or hyphenators) to
  * its own listeners. Thus, there should be no need to register as a listener for a specific implementation./P>
  * @see com.sun.star.linguistic2.XLinguServiceManager
  * @see com.sun.star.linguistic2.XLinguServiceEventListener
  */
trait XLinguServiceEventBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * @param xLstnr the listener to be added.
    * @returns `TRUE` if the listener was successfully added, `FALSE` otherwise.
    */
  def addLinguServiceEventListener(xLstnr: XLinguServiceEventListener): Boolean
  
  /**
    * @param xLstnr the listener to be removed.
    * @returns `TRUE` if the listener was successfully removed, `FALSE` otherwise.
    */
  def removeLinguServiceEventListener(xLstnr: XLinguServiceEventListener): Boolean
}
object XLinguServiceEventBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addLinguServiceEventListener: XLinguServiceEventListener => Boolean,
    queryInterface: `type` => Any,
    release: Callback,
    removeLinguServiceEventListener: XLinguServiceEventListener => Boolean
  ): XLinguServiceEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addLinguServiceEventListener = js.Any.fromFunction1(addLinguServiceEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeLinguServiceEventListener = js.Any.fromFunction1(removeLinguServiceEventListener))
    __obj.asInstanceOf[XLinguServiceEventBroadcaster]
  }
  
  extension [Self <: XLinguServiceEventBroadcaster](x: Self) {
    
    inline def setAddLinguServiceEventListener(value: XLinguServiceEventListener => Boolean): Self = StObject.set(x, "addLinguServiceEventListener", js.Any.fromFunction1(value))
    
    inline def setRemoveLinguServiceEventListener(value: XLinguServiceEventListener => Boolean): Self = StObject.set(x, "removeLinguServiceEventListener", js.Any.fromFunction1(value))
  }
}
