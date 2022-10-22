package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to control notification behavior of a broadcaster.
  * @since OOo 3.0
  */
trait XBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * suspends broadcasts to the registered listeners.
    *
    * The calls to {@link XBroadcaster.lockBroadcasts()} and {@link XBroadcaster.unlockBroadcasts()} may be nested and even overlapping, but they must be in
    * pairs. While there is at least one lock remaining, no broadcasts are sent to registered listeners.
    */
  def lockBroadcasts(): Unit
  
  /**
    * resumes the broadcasts which were suspended by {@link XBroadcaster.lockBroadcasts()} .
    *
    * The calls to {@link XBroadcaster.lockBroadcasts()} and {@link XBroadcaster.unlockBroadcasts()} may be nested and even overlapping, but they must be in
    * pairs. While there is at least one lock remaining, no broadcasts are sent to registered listeners.
    *
    * Pending broadcasts will be sent immediately after the last call to {@link XBroadcaster.lockBroadcasts()} is matched by a call to {@link
    * XBroadcaster.unlockBroadcasts()} . An implementation can decide to broadcast all pending notification in order or batch them in single broadcasts.
    */
  def unlockBroadcasts(): Unit
}
object XBroadcaster {
  
  inline def apply(
    acquire: Callback,
    lockBroadcasts: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    unlockBroadcasts: Callback
  ): XBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, lockBroadcasts = lockBroadcasts.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, unlockBroadcasts = unlockBroadcasts.toJsFn)
    __obj.asInstanceOf[XBroadcaster]
  }
  
  extension [Self <: XBroadcaster](x: Self) {
    
    inline def setLockBroadcasts(value: Callback): Self = StObject.set(x, "lockBroadcasts", value.toJsFn)
    
    inline def setUnlockBroadcasts(value: Callback): Self = StObject.set(x, "unlockBroadcasts", value.toJsFn)
  }
}
