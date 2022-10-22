package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework.XResource
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework.XResourceId
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface exists only because services do not directly support multiple inheritance and attributes.
  *
  * It provides the interfaces and attributes that every object that implements the {@link SlideSorter} service.
  */
trait XSlideSorterBase
  extends StObject
     with XResource
     with XDrawView {
  
  var BackgroundColor: Color
  
  /**
    * The set of slides that are displayed by the implementing object.
    *
    * The default value is the set of all slides of the document for which a slide sorter is created.
    */
  var DocumentSlides: XIndexAccess
  
  var HighlightColor: Color
  
  /**
    * When this flag has the value `TRUE` then every time the current slide is changed the visual area is shifted so that the new current slide is display
    * in the center of the slide sorter window.
    *
    * It is not always possible to move the current slide into the exact center of the window, for example when slides are located near the start or end of
    * a document.
    *
    * The default value is `FALSE` .
    */
  var IsCenterSelection: Boolean
  
  /**
    * Set this flag to `TRUE` in order to have the current slide highlighted.
    *
    * The default value is `FALSE` .
    */
  var IsHighlightCurrentSlide: Boolean
  
  /** The orientation of a slide sorter can be either vertical ( `TRUE` ) or horizontal ( `FALSE` ). */
  var IsOrientationVertical: Boolean
  
  /**
    * Set this flag to `TRUE` to visualize to where the focus is by showing a dotted rectangle around the focused slide.
    *
    * The default value is `TRUE` .
    */
  var IsShowFocus: Boolean
  
  /**
    * Set this flag to `TRUE` in order to visualize the selection of slides (typically a bold frame around the selected slides).
    *
    * The default value is `TRUE` .
    */
  var IsShowSelection: Boolean
  
  /** This flag is a hint to make scrolling look smooth. */
  var IsSmoothScrolling: Boolean
  
  /**
    * This flag controls whether updates of previews are created during full screen presentations ( `FALSE` ) or not ( `TRUE` ). The suspension of preview
    * creations is an optimization for not slowing down a running presentation.
    *
    * The default value is `TRUE` .
    */
  var IsSuspendPreviewUpdatesDuringFullScreenPresentation: Boolean
  
  /**
    * This flag controls whether the model can be modified by using keyboard or mouse.
    *
    * The default value is `TRUE` .
    */
  var IsUIReadOnly: Boolean
  
  var SelectionColor: Color
  
  var TextColor: Color
}
object XSlideSorterBase {
  
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
    getCurrentPage: CallbackTo[XDrawPage],
    getResourceId: CallbackTo[XResourceId],
    isAnchorOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    setCurrentPage: XDrawPage => Callback
  ): XSlideSorterBase = {
    val __obj = js.Dynamic.literal(BackgroundColor = BackgroundColor.asInstanceOf[js.Any], CurrentPage = CurrentPage.asInstanceOf[js.Any], DocumentSlides = DocumentSlides.asInstanceOf[js.Any], HighlightColor = HighlightColor.asInstanceOf[js.Any], IsCenterSelection = IsCenterSelection.asInstanceOf[js.Any], IsHighlightCurrentSlide = IsHighlightCurrentSlide.asInstanceOf[js.Any], IsOrientationVertical = IsOrientationVertical.asInstanceOf[js.Any], IsShowFocus = IsShowFocus.asInstanceOf[js.Any], IsShowSelection = IsShowSelection.asInstanceOf[js.Any], IsSmoothScrolling = IsSmoothScrolling.asInstanceOf[js.Any], IsSuspendPreviewUpdatesDuringFullScreenPresentation = IsSuspendPreviewUpdatesDuringFullScreenPresentation.asInstanceOf[js.Any], IsUIReadOnly = IsUIReadOnly.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], SelectionColor = SelectionColor.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCurrentPage = getCurrentPage.toJsFn, getResourceId = getResourceId.toJsFn, isAnchorOnly = isAnchorOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setCurrentPage = js.Any.fromFunction1((t0: XDrawPage) => setCurrentPage(t0).runNow()))
    __obj.asInstanceOf[XSlideSorterBase]
  }
  
  extension [Self <: XSlideSorterBase](x: Self) {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "BackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setDocumentSlides(value: XIndexAccess): Self = StObject.set(x, "DocumentSlides", value.asInstanceOf[js.Any])
    
    inline def setHighlightColor(value: Color): Self = StObject.set(x, "HighlightColor", value.asInstanceOf[js.Any])
    
    inline def setIsCenterSelection(value: Boolean): Self = StObject.set(x, "IsCenterSelection", value.asInstanceOf[js.Any])
    
    inline def setIsHighlightCurrentSlide(value: Boolean): Self = StObject.set(x, "IsHighlightCurrentSlide", value.asInstanceOf[js.Any])
    
    inline def setIsOrientationVertical(value: Boolean): Self = StObject.set(x, "IsOrientationVertical", value.asInstanceOf[js.Any])
    
    inline def setIsShowFocus(value: Boolean): Self = StObject.set(x, "IsShowFocus", value.asInstanceOf[js.Any])
    
    inline def setIsShowSelection(value: Boolean): Self = StObject.set(x, "IsShowSelection", value.asInstanceOf[js.Any])
    
    inline def setIsSmoothScrolling(value: Boolean): Self = StObject.set(x, "IsSmoothScrolling", value.asInstanceOf[js.Any])
    
    inline def setIsSuspendPreviewUpdatesDuringFullScreenPresentation(value: Boolean): Self = StObject.set(x, "IsSuspendPreviewUpdatesDuringFullScreenPresentation", value.asInstanceOf[js.Any])
    
    inline def setIsUIReadOnly(value: Boolean): Self = StObject.set(x, "IsUIReadOnly", value.asInstanceOf[js.Any])
    
    inline def setSelectionColor(value: Color): Self = StObject.set(x, "SelectionColor", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: Color): Self = StObject.set(x, "TextColor", value.asInstanceOf[js.Any])
  }
}
