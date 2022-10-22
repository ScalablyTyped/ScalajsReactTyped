package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleContext
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleImage
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleRelationSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessibleStateSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XFont
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link AccessibleGraphicShape} service is implemented by the graphic object shapes shapes {@link com.sun.star.drawing.GraphicObjectShape} and
  * {@link com.sun.star.presentation.GraphicObjectShape} .
  *
  * It differs from the included {@link AccessibleShape} "base" service by the additional support of the {@link
  * com.sun.star.accessibility.XAccessibleImage} interface.
  * @since OOo 1.1.2
  */
trait AccessibleGraphicShape
  extends StObject
     with AccessibleShape
     with XAccessibleImage
object AccessibleGraphicShape {
  
  inline def apply(
    AccessibleChildCount: Double,
    AccessibleContext: XAccessibleContext,
    AccessibleDescription: String,
    AccessibleImageDescription: String,
    AccessibleImageHeight: Double,
    AccessibleImageWidth: Double,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Background: Color,
    Bounds: Rectangle,
    Font: XFont,
    Foreground: Color,
    Locale: Locale,
    Location: Point,
    LocationOnScreen: Point,
    Size: Size,
    TitledBorderText: String,
    ToolTipText: String,
    acquire: Callback,
    containsPoint: Point => Boolean,
    getAccessibleAtPoint: Point => XAccessible,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: CallbackTo[Double],
    getAccessibleContext: CallbackTo[XAccessibleContext],
    getAccessibleDescription: CallbackTo[String],
    getAccessibleImageDescription: CallbackTo[String],
    getAccessibleImageHeight: CallbackTo[Double],
    getAccessibleImageWidth: CallbackTo[Double],
    getAccessibleIndexInParent: CallbackTo[Double],
    getAccessibleName: CallbackTo[String],
    getAccessibleParent: CallbackTo[XAccessible],
    getAccessibleRelationSet: CallbackTo[XAccessibleRelationSet],
    getAccessibleRole: CallbackTo[Double],
    getAccessibleStateSet: CallbackTo[XAccessibleStateSet],
    getBackground: CallbackTo[Color],
    getBounds: CallbackTo[Rectangle],
    getFont: CallbackTo[XFont],
    getForeground: CallbackTo[Color],
    getLocale: CallbackTo[Locale],
    getLocation: CallbackTo[Point],
    getLocationOnScreen: CallbackTo[Point],
    getSize: CallbackTo[Size],
    getTitledBorderText: CallbackTo[String],
    getToolTipText: CallbackTo[String],
    grabFocus: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): AccessibleGraphicShape = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleContext = AccessibleContext.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleImageDescription = AccessibleImageDescription.asInstanceOf[js.Any], AccessibleImageHeight = AccessibleImageHeight.asInstanceOf[js.Any], AccessibleImageWidth = AccessibleImageWidth.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TitledBorderText = TitledBorderText.asInstanceOf[js.Any], ToolTipText = ToolTipText.asInstanceOf[js.Any], acquire = acquire.toJsFn, containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = getAccessibleChildCount.toJsFn, getAccessibleContext = getAccessibleContext.toJsFn, getAccessibleDescription = getAccessibleDescription.toJsFn, getAccessibleImageDescription = getAccessibleImageDescription.toJsFn, getAccessibleImageHeight = getAccessibleImageHeight.toJsFn, getAccessibleImageWidth = getAccessibleImageWidth.toJsFn, getAccessibleIndexInParent = getAccessibleIndexInParent.toJsFn, getAccessibleName = getAccessibleName.toJsFn, getAccessibleParent = getAccessibleParent.toJsFn, getAccessibleRelationSet = getAccessibleRelationSet.toJsFn, getAccessibleRole = getAccessibleRole.toJsFn, getAccessibleStateSet = getAccessibleStateSet.toJsFn, getBackground = getBackground.toJsFn, getBounds = getBounds.toJsFn, getFont = getFont.toJsFn, getForeground = getForeground.toJsFn, getLocale = getLocale.toJsFn, getLocation = getLocation.toJsFn, getLocationOnScreen = getLocationOnScreen.toJsFn, getSize = getSize.toJsFn, getTitledBorderText = getTitledBorderText.toJsFn, getToolTipText = getToolTipText.toJsFn, grabFocus = grabFocus.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[AccessibleGraphicShape]
  }
}
