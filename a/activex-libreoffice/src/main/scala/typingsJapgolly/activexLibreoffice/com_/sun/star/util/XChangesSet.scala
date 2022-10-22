package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XElementAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * this interface enables inspecting a set of changes forming one batch transaction.
  *
  * An object implementing this interface should implement more container interfaces to access individual changes as well.
  * @see XChangesBatch
  * @see ChangesEvent
  * @see XChangesListener
  * @see XChangesNotifier
  */
trait XChangesSet
  extends StObject
     with XElementAccess {
  
  /**
    * queries for all contained changes at once.
    * @returns an array of {@link ElementChange} holding information about each changes that is part of this object.
    */
  val AllChanges: SafeArray[ElementChange]
  
  /**
    * queries for all contained changes at once.
    * @returns an array of {@link ElementChange} holding information about each changes that is part of this object.
    */
  def getAllChanges(): SafeArray[ElementChange]
}
object XChangesSet {
  
  inline def apply(
    AllChanges: SafeArray[ElementChange],
    ElementType: `type`,
    acquire: Callback,
    getAllChanges: CallbackTo[SafeArray[ElementChange]],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XChangesSet = {
    val __obj = js.Dynamic.literal(AllChanges = AllChanges.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAllChanges = getAllChanges.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XChangesSet]
  }
  
  extension [Self <: XChangesSet](x: Self) {
    
    inline def setAllChanges(value: SafeArray[ElementChange]): Self = StObject.set(x, "AllChanges", value.asInstanceOf[js.Any])
    
    inline def setGetAllChanges(value: CallbackTo[SafeArray[ElementChange]]): Self = StObject.set(x, "getAllChanges", value.toJsFn)
  }
}
