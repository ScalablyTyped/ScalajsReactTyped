package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to access, add, and remove the {@link Shapes} in a collection.
  * @see DrawPage
  * @see MasterPage
  * @see DrawingDocumentDrawView
  */
trait XShapes
  extends StObject
     with XIndexAccess {
  
  /**
    * inserts a {@link Shape} into this collection.
    * @param xShape a {@link Shape} that will be inserted.
    */
  def add(xShape: XShape): Unit
  
  /**
    * removes a {@link Shape} from this collection.
    * @param xShape the {@link Shape} will be removed from the collection and disposed.
    */
  def remove(xShape: XShape): Unit
}
object XShapes {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    add: XShape => Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    remove: XShape => Callback
  ): XShapes = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, add = js.Any.fromFunction1((t0: XShape) => add(t0).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: XShape) => remove(t0).runNow()))
    __obj.asInstanceOf[XShapes]
  }
  
  extension [Self <: XShapes](x: Self) {
    
    inline def setAdd(value: XShape => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: XShape) => value(t0).runNow()))
    
    inline def setRemove(value: XShape => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: XShape) => value(t0).runNow()))
  }
}
