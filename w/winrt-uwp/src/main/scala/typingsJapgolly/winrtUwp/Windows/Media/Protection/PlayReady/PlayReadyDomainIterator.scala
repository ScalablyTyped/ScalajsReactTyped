package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.anon.ItemsIPlayReadyDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides for iteration of the PlayReadyDomain class. */
trait PlayReadyDomainIterator extends StObject {
  
  /** Gets the current item in the PlayReady domain collection. */
  var current: IPlayReadyDomain
  
  /**
    * Retrieves all items in the PlayReady domain collection.
    */
  def getMany(): ItemsIPlayReadyDomain
  
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady domain collection. */
  var hasCurrent: Boolean
  
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  def moveNext(): Boolean
}
object PlayReadyDomainIterator {
  
  inline def apply(
    current: IPlayReadyDomain,
    getMany: CallbackTo[ItemsIPlayReadyDomain],
    hasCurrent: Boolean,
    moveNext: CallbackTo[Boolean]
  ): PlayReadyDomainIterator = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], getMany = getMany.toJsFn, hasCurrent = hasCurrent.asInstanceOf[js.Any], moveNext = moveNext.toJsFn)
    __obj.asInstanceOf[PlayReadyDomainIterator]
  }
  
  extension [Self <: PlayReadyDomainIterator](x: Self) {
    
    inline def setCurrent(value: IPlayReadyDomain): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setGetMany(value: CallbackTo[ItemsIPlayReadyDomain]): Self = StObject.set(x, "getMany", value.toJsFn)
    
    inline def setHasCurrent(value: Boolean): Self = StObject.set(x, "hasCurrent", value.asInstanceOf[js.Any])
    
    inline def setMoveNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "moveNext", value.toJsFn)
  }
}
