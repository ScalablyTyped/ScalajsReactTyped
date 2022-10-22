package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework.XResourceId
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A slide sorter shows previews for a set of slides, typically all slides in a document, and allows the selection, reordering, creation, and deletion of
  * slides.
  *
  * In the drawing framework a slide sorter is regarded as a view.
  */
trait SlideSorter
  extends StObject
     with XSlideSorterBase {
  
  /**
    * Create a new slide sorter object.
    * @param xViewId The resource id of the new slide sorter.
    * @param xController The access point to an impress document.
    * @param xParentWindow The parent window which will be completely covered by the new slide sorter.
    */
  def create(xViewId: XResourceId, xController: XController, xParentWindow: XWindow): Unit
}
object SlideSorter {
  
  inline def apply(
    BackgroundColor: Color,
    CurrentPage: XDrawPage,
    DocumentSlides: XIndexAccess,
    HighlightColor: Color,
    IsCenterSelection: Boolean,
    IsHighlightCurrentSlide: Boolean,
    IsOrientationVertical: Boolean,
    IsShowFocus: Boolean,
    IsShowSelection: Boolean,
    IsSmoothScrolling: Boolean,
    IsSuspendPreviewUpdatesDuringFullScreenPresentation: Boolean,
    IsUIReadOnly: Boolean,
    ResourceId: XResourceId,
    SelectionColor: Color,
    TextColor: Color,
    acquire: Callback,
    create: (XResourceId, XController, XWindow) => Callback,
    getCurrentPage: CallbackTo[XDrawPage],
    getResourceId: CallbackTo[XResourceId],
    isAnchorOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setCurrentPage: XDrawPage => Callback
  ): SlideSorter = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], CurrentPage = CurrentPage.asInstanceOf[js.Any], DocumentSlides = DocumentSlides.asInstanceOf[js.Any], HighlightColor = HighlightColor.asInstanceOf[js.Any], IsCenterSelection = IsCenterSelection.asInstanceOf[js.Any], IsHighlightCurrentSlide = IsHighlightCurrentSlide.asInstanceOf[js.Any], IsOrientationVertical = IsOrientationVertical.asInstanceOf[js.Any], IsShowFocus = IsShowFocus.asInstanceOf[js.Any], IsShowSelection = IsShowSelection.asInstanceOf[js.Any], IsSmoothScrolling = IsSmoothScrolling.asInstanceOf[js.Any], IsSuspendPreviewUpdatesDuringFullScreenPresentation = IsSuspendPreviewUpdatesDuringFullScreenPresentation.asInstanceOf[js.Any], IsUIReadOnly = IsUIReadOnly.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], SelectionColor = SelectionColor.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], acquire = acquire.toJsFn, create = js.Any.fromFunction3((t0: XResourceId, t1: XController, t2: XWindow) => (create(t0, t1, t2)).runNow()), getCurrentPage = getCurrentPage.toJsFn, getResourceId = getResourceId.toJsFn, isAnchorOnly = isAnchorOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCurrentPage = js.Any.fromFunction1((t0: XDrawPage) => setCurrentPage(t0).runNow()))
    __obj.asInstanceOf[SlideSorter]
  }
  
  extension [Self <: SlideSorter](x: Self) {
    
    inline def setCreate(value: (XResourceId, XController, XWindow) => Callback): Self = StObject.set(x, "create", js.Any.fromFunction3((t0: XResourceId, t1: XController, t2: XWindow) => (value(t0, t1, t2)).runNow()))
  }
}
