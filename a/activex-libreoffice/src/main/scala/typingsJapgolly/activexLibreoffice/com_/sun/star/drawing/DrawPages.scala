package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a container of {@link DrawPages} and makes it possible for you to manipulate them.
  * @see XDrawPagesSupplier
  * @see DrawingDocument
  */
trait DrawPages
  extends StObject
     with XDrawPages
     with XDrawPageSummarizer
     with XDrawPageExpander
object DrawPages {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    expand: XDrawPage => XDrawPages,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertNewByIndex: Double => XDrawPage,
    queryInterface: `type` => Any,
    release: Callback,
    remove: XDrawPage => Callback,
    summarize: XDrawPages => XDrawPage
  ): DrawPages = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, expand = js.Any.fromFunction1(expand), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertNewByIndex = js.Any.fromFunction1(insertNewByIndex), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: XDrawPage) => remove(t0).runNow()), summarize = js.Any.fromFunction1(summarize))
    __obj.asInstanceOf[DrawPages]
  }
}
