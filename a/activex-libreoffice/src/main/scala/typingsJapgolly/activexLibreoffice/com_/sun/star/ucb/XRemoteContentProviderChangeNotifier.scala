package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notify about changes to a {@link XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
trait XRemoteContentProviderChangeNotifier
  extends StObject
     with XInterface {
  
  /**
    * Add a listener.
    * @param Listener Some listener.
    */
  def addRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): Unit
  
  /**
    * Remove a listener.
    * @param Listener Some listener previously added via {@link XRemoteContentProviderChangeNotifier.addRemoteContentProviderChangeListener()} .
    */
  def removeRemoteContentProviderChangeListener(Listener: XRemoteContentProviderChangeListener): Unit
}
object XRemoteContentProviderChangeNotifier {
  
  inline def apply(
    acquire: Callback,
    addRemoteContentProviderChangeListener: XRemoteContentProviderChangeListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeRemoteContentProviderChangeListener: XRemoteContentProviderChangeListener => Callback
  ): XRemoteContentProviderChangeNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addRemoteContentProviderChangeListener = js.Any.fromFunction1((t0: XRemoteContentProviderChangeListener) => addRemoteContentProviderChangeListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeRemoteContentProviderChangeListener = js.Any.fromFunction1((t0: XRemoteContentProviderChangeListener) => removeRemoteContentProviderChangeListener(t0).runNow()))
    __obj.asInstanceOf[XRemoteContentProviderChangeNotifier]
  }
  
  extension [Self <: XRemoteContentProviderChangeNotifier](x: Self) {
    
    inline def setAddRemoteContentProviderChangeListener(value: XRemoteContentProviderChangeListener => Callback): Self = StObject.set(x, "addRemoteContentProviderChangeListener", js.Any.fromFunction1((t0: XRemoteContentProviderChangeListener) => value(t0).runNow()))
    
    inline def setRemoveRemoteContentProviderChangeListener(value: XRemoteContentProviderChangeListener => Callback): Self = StObject.set(x, "removeRemoteContentProviderChangeListener", js.Any.fromFunction1((t0: XRemoteContentProviderChangeListener) => value(t0).runNow()))
  }
}
