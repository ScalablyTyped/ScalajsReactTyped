package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows locking a component
  *
  * `lock` and `unlock` calls can be nested. However, they must be in pairs. As long as there has been one more call to `lock` than to `unlock` , the
  * component is considered locked, which is reflected by {@link isLocked()} returning `TRUE` .
  */
trait XLockable extends StObject {
  
  /**
    * determines whether the component is currently locked.
    * @see lock
    * @see unlock
    */
  def isLocked(): Boolean
  
  /**
    * locks the component
    * @see unlock
    * @see isLocked
    */
  def lock(): Unit
  
  /**
    * unlocks the component
    * @see lock
    * @see isLocked
    * @throws NotLockedException if the component is not currently locked.
    */
  def unlock(): Unit
}
object XLockable {
  
  inline def apply(isLocked: CallbackTo[Boolean], lock: Callback, unlock: Callback): XLockable = {
    val __obj = js.Dynamic.literal(isLocked = isLocked.toJsFn, lock = lock.toJsFn, unlock = unlock.toJsFn)
    __obj.asInstanceOf[XLockable]
  }
  
  extension [Self <: XLockable](x: Self) {
    
    inline def setIsLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLocked", value.toJsFn)
    
    inline def setLock(value: Callback): Self = StObject.set(x, "lock", value.toJsFn)
    
    inline def setUnlock(value: Callback): Self = StObject.set(x, "unlock", value.toJsFn)
  }
}
