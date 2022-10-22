package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link AccessibleDrawDocumentView} service is implemented by views of Draw and Impress documents.
  *
  * An object that implements the {@link AccessibleDrawDocumentView} service provides information about the view of a Draw or Impress document in one of
  * the various view modes. With its children it gives access to the current page and the shapes on that page.
  *
  * This service gives a simplified view on the underlying document. It tries both to keep the structure of the accessibility representation tree as
  * simple as possible and provide as much relevant information as possible. This has the following consequences:  1. Only the current draw page and only
  * the visible shapes are accessible. To switch to another page or to access shapes that lie outside the currently visible area, the user has to issue
  * these requests manually or programmatically through the usual channels, e.g. pressing keys or selecting menu entries. 2. The hierarchy exposed through
  * the {@link com.sun.star.accessibility.XAccessibleContext} interface does not necessarily correspond directly to the underlying draw page structure.
  * Internal nodes in this hierarchy are introduced by group shapes, 3D scenes, and OLE objects. 3. The view modes editing view, outline view, slides
  * view, notes view, handout view, and presentation view are not exposed explicitly. However, if there happens to be a view mode change which results in
  * a rearrangement of the visible shapes, the user gets notified of this.
  * @since OOo 1.1.2
  */
trait AccessibleDrawDocumentView
  extends StObject
     with XAccessible
     with XAccessibleContext
     with XAccessibleComponent
object AccessibleDrawDocumentView {
  
  inline def apply(
    AccessibleChildCount: Double,
    AccessibleContext: XAccessibleContext,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Background: Color,
    Bounds: Rectangle,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    Size: Size,
    acquire: Callback,
    containsPoint: Point => Boolean,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: CallbackTo[Double],
    getAccessibleContext: CallbackTo[XAccessibleContext],
    getAccessibleDescription: CallbackTo[String],
    getAccessibleIndexInParent: CallbackTo[Double],
    getAccessibleName: CallbackTo[String],
    getAccessibleParent: CallbackTo[XAccessible],
    getAccessibleRelationSet: CallbackTo[XAccessibleRelationSet],
    getAccessibleRole: CallbackTo[Double],
    getAccessibleStateSet: CallbackTo[XAccessibleStateSet],
    getBackground: CallbackTo[Color],
    getBounds: CallbackTo[Rectangle],
    getForeground: CallbackTo[Color],
    getLocale: CallbackTo[Locale],
    getLocation: CallbackTo[Point],
    getLocationOnScreen: CallbackTo[Point],
    getSize: CallbackTo[Size],
    grabFocus: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): AccessibleDrawDocumentView = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleContext = AccessibleContext.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = getAccessibleChildCount.toJsFn, getAccessibleContext = getAccessibleContext.toJsFn, getAccessibleDescription = getAccessibleDescription.toJsFn, getAccessibleIndexInParent = getAccessibleIndexInParent.toJsFn, getAccessibleName = getAccessibleName.toJsFn, getAccessibleParent = getAccessibleParent.toJsFn, getAccessibleRelationSet = getAccessibleRelationSet.toJsFn, getAccessibleRole = getAccessibleRole.toJsFn, getAccessibleStateSet = getAccessibleStateSet.toJsFn, getBackground = getBackground.toJsFn, getBounds = getBounds.toJsFn, getForeground = getForeground.toJsFn, getLocale = getLocale.toJsFn, getLocation = getLocation.toJsFn, getLocationOnScreen = getLocationOnScreen.toJsFn, getSize = getSize.toJsFn, grabFocus = grabFocus.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[AccessibleDrawDocumentView]
  }
}
