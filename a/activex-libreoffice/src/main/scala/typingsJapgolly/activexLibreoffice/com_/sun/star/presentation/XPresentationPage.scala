package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShapes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a page from a presentation.
  * @see com.sun.star.drawing.DrawPage
  */
trait XPresentationPage
  extends StObject
     with XShapes {
  
  /**
    * return the note page from the current page in the presentation, the name for the note page in the user interface note view, and one of the views from
    * a presentation page.
    */
  val NotesPage: XDrawPage
  
  /**
    * return the note page from the current page in the presentation, the name for the note page in the user interface note view, and one of the views from
    * a presentation page.
    */
  def getNotesPage(): XDrawPage
}
object XPresentationPage {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    NotesPage: XDrawPage,
    acquire: Callback,
    add: XShape => Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getNotesPage: CallbackTo[XDrawPage],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    remove: XShape => Callback
  ): XPresentationPage = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], NotesPage = NotesPage.asInstanceOf[js.Any], acquire = acquire.toJsFn, add = js.Any.fromFunction1((t0: XShape) => add(t0).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getNotesPage = getNotesPage.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, remove = js.Any.fromFunction1((t0: XShape) => remove(t0).runNow()))
    __obj.asInstanceOf[XPresentationPage]
  }
  
  extension [Self <: XPresentationPage](x: Self) {
    
    inline def setGetNotesPage(value: CallbackTo[XDrawPage]): Self = StObject.set(x, "getNotesPage", value.toJsFn)
    
    inline def setNotesPage(value: XDrawPage): Self = StObject.set(x, "NotesPage", value.asInstanceOf[js.Any])
  }
}
