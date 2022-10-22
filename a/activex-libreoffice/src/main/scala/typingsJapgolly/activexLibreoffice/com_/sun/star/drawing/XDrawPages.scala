package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to a container of {@link DrawPages} or {@link MasterPages} .
  *
  * The pages are stored in an index container. The order is determined by the index.
  *
  * You usually get this interface if you use the {@link XDrawPagesSupplier} or the {@link XMasterPagesSupplier} at a model that contains {@link
  * DrawPages} or {@link MasterPages}
  */
trait XDrawPages
  extends StObject
     with XIndexAccess {
  
  /**
    * creates and inserts a new {@link DrawPage} or {@link MasterPage} into this container
    * @param nIndex the index at which the newly created {@link DrawPage} or {@link MasterPage} will be inserted.
    * @returns the newly created and already inserted {@link DrawPage} or {@link MasterPage} .
    */
  def insertNewByIndex(nIndex: Double): XDrawPage
  
  /**
    * removes a {@link DrawPage} or {@link MasterPage} from this container.
    * @param xPage this {@link DrawPage} or {@link MasterPage} must be contained and will be removed from this container. It will also be disposed and shouldn
    */
  def remove(xPage: XDrawPage): Unit
}
object XDrawPages {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertNewByIndex: Double => XDrawPage,
    queryInterface: `type` => Any,
    release: Callback,
    remove: XDrawPage => Callback
  ): XDrawPages = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: XDrawPage) => remove(t0).runNow()))
    __obj.asInstanceOf[XDrawPages]
  }
  
  extension [Self <: XDrawPages](x: Self) {
    
    inline def setInsertNewByIndex(value: Double => XDrawPage): Self = StObject.set(x, "insertNewByIndex", js.Any.fromFunction1(value))
    
    inline def setRemove(value: XDrawPage => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: XDrawPage) => value(t0).runNow()))
  }
}
