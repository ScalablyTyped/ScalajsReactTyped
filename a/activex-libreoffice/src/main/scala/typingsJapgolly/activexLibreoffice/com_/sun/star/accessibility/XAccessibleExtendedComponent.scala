package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XFont
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XAccessibleExtendedComponent} interface contains additional methods to those of the {@link XAccessibleComponent} interface. These methods
  * provide information that is used not as often. The division into two interfaces allows classes to support the more frequently used methods of the
  * {@link XAccessibleComponent} interface and only support the {@link XAccessibleExtendedComponent} interface if that makes sense for the class.
  *
  * This interface provides extended access to retrieve information concerning the graphical representation of an object. This interface combines methods
  * from the Java interfaces `javax.accessibility.AccessibleComponent` and `javax.accessibility.AccessibleExtendedComponent` .
  * @since OOo 1.1.2
  */
trait XAccessibleExtendedComponent
  extends StObject
     with XAccessibleComponent {
  
  /**
    * Returns the font of this object.
    * @returns The returned reference to a font object is empty if a font is not supported by this object.
    */
  val Font: XFont
  
  /**
    * Returns the titled border text.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns The returned value is the titled border text of the object or empty if that is not supported.
    */
  val TitledBorderText: String
  
  /**
    * Returns the tool tip text of this object.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns Returns the localized tool tip text of the object. If tool tips are not supported and empty string is returned.
    */
  val ToolTipText: String
  
  /**
    * Returns the font of this object.
    * @returns The returned reference to a font object is empty if a font is not supported by this object.
    */
  def getFont(): XFont
  
  /**
    * Returns the titled border text.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns The returned value is the titled border text of the object or empty if that is not supported.
    */
  def getTitledBorderText(): String
  
  /**
    * Returns the tool tip text of this object.
    *
    * This method stems from the Java interface `AccessibleExtendedComponent` .
    * @returns Returns the localized tool tip text of the object. If tool tips are not supported and empty string is returned.
    */
  def getToolTipText(): String
}
object XAccessibleExtendedComponent {
  
  inline def apply(
    Background: Color,
    Bounds: Rectangle,
    Font: XFont,
    Foreground: Color,
    Location: Point,
    LocationOnScreen: Point,
    Size: Size,
    TitledBorderText: String,
    ToolTipText: String,
    acquire: Callback,
    containsPoint: Point => Boolean,
    getAccessibleAtPoint: Point => XAccessible,
    getBackground: CallbackTo[Color],
    getBounds: CallbackTo[Rectangle],
    getFont: CallbackTo[XFont],
    getForeground: CallbackTo[Color],
    getLocation: CallbackTo[Point],
    getLocationOnScreen: CallbackTo[Point],
    getSize: CallbackTo[Size],
    getTitledBorderText: CallbackTo[String],
    getToolTipText: CallbackTo[String],
    grabFocus: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleExtendedComponent = {
    val __obj = js.Dynamic.literal(Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TitledBorderText = TitledBorderText.asInstanceOf[js.Any], ToolTipText = ToolTipText.asInstanceOf[js.Any], acquire = acquire.toJsFn, containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getBackground = getBackground.toJsFn, getBounds = getBounds.toJsFn, getFont = getFont.toJsFn, getForeground = getForeground.toJsFn, getLocation = getLocation.toJsFn, getLocationOnScreen = getLocationOnScreen.toJsFn, getSize = getSize.toJsFn, getTitledBorderText = getTitledBorderText.toJsFn, getToolTipText = getToolTipText.toJsFn, grabFocus = grabFocus.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleExtendedComponent]
  }
  
  extension [Self <: XAccessibleExtendedComponent](x: Self) {
    
    inline def setFont(value: XFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setGetFont(value: CallbackTo[XFont]): Self = StObject.set(x, "getFont", value.toJsFn)
    
    inline def setGetTitledBorderText(value: CallbackTo[String]): Self = StObject.set(x, "getTitledBorderText", value.toJsFn)
    
    inline def setGetToolTipText(value: CallbackTo[String]): Self = StObject.set(x, "getToolTipText", value.toJsFn)
    
    inline def setTitledBorderText(value: String): Self = StObject.set(x, "TitledBorderText", value.asInstanceOf[js.Any])
    
    inline def setToolTipText(value: String): Self = StObject.set(x, "ToolTipText", value.asInstanceOf[js.Any])
  }
}
