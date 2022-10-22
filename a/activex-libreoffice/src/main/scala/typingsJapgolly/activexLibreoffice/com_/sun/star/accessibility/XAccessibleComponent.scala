package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link XAccessibleComponent} interface should be supported by any class that can be rendered on the screen.
  *
  * This interface provides the standard mechanism for an assistive technology to retrieve information concerning the graphical representation of an
  * object. This interface combines methods from the Java interfaces `javax.accessibility.AccessibleComponent` and
  * `javax.accessibility.AccessibleExtendedComponent` .
  *
  * Further information about the graphical appearance of an object can be expressed with the {@link XAccessibleExtendedComponent} interface.
  *
  * Coordinates used by the functions of this interface are specified in different coordinate systems. Their scale is the same and is equal to that of the
  * screen coordinate system. In other words all coordinates are measured in pixel. They differ in their respective origin: The screen coordinate system
  * has its origin in the upper left corner of the current screen. Used by the {@link getLocationOnScreen()} function.The origin of the parent coordinate
  * system is the upper left corner of the parent's bounding box. With no parent the screen coordinate system is used instead. Used by the {@link
  * getLocation()} function.The object coordinate system is relative to the upper left corner of an object's bounding box. It is relative to itself so to
  * speak. Used by the {@link containsPoint()} and {@link getAccessibleAtPoint()} functions.
  *
  * Key bindings which are associated with an accessible component can be retrieved at the component's action. The reason for this is that key bindings
  * are associated with actions and directly with a component. This distinction becomes important when there are more than one action. To get access to
  * the key bindings you have to get the {@link XAccessibleAction} interface of a component, provided that it is supported, and use the
  * XAccessibleAction::getAccessibleKeyBinding().
  * @see XAccessibleExtendedComponent
  * @since OOo 1.1.2
  */
trait XAccessibleComponent
  extends StObject
     with XInterface {
  
  /**
    * Returns the background color of this object.
    * @returns The returned color is the background color of this object or, if that is not supported, the default background color.
    */
  val Background: Color
  
  /**
    * Returns the bounding box of this object.
    *
    * The returned bounding box has the form of a rectangle. Its coordinates are relative to the object's parent coordinate system. Note that the two
    * methods {@link getLocation()} and {@link getSize()} return the same information. With method {@link getLocationOnScreen()} you can get the bound box
    * position in screen coordinates.
    * @returns The coordinates of the returned rectangle are relative to this object's parent or relative to the screen on which this object is rendered if it h
    */
  val Bounds: Rectangle
  
  /**
    * Returns the foreground color of this object.
    * @returns The returned color is the foreground color of this object or, if that is not supported, the default foreground color.
    */
  val Foreground: Color
  
  /**
    * Returns the location of the upper left corner of the object's bounding box relative to the parent.
    *
    * The coordinates of the bounding box are given relative to the parent's coordinate system.
    * @returns The coordinates of the returned position are relative to this object's parent or relative to the screen on which this object is rendered if it ha
    */
  val Location: Point
  
  /**
    * Returns the location of the upper left corner of the object's bounding box in screen coordinates.
    *
    * This method returns the same point as does the method {@link getLocation()} . The difference is that the coordinates are absolute screen coordinates
    * of the screen to which the object is rendered instead of being relative to the object's parent.
    * @returns The coordinates of the returned position are relative to the screen on which this object is rendered. If the object is not on any screen the retu
    */
  val LocationOnScreen: Point
  
  /**
    * Returns the size of this object's bounding box.
    * @returns The returned size is the size of this object or empty if it is not rendered on any screen.
    */
  val Size: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /**
    * Tests whether the specified point lies within this object's bounds.
    *
    * The test point's coordinates are defined relative to the coordinate system of the object. That means that when the object is an opaque rectangle then
    * both the points (0,0) and (with-1,height-1) would yield a `TRUE` value.
    * @param Point Coordinates of the point to test. The origin of the coordinate system is the upper left corner of the object's bounding box as returned by
    * @returns Returns `TRUE` if the point lies within or on the object's bounding box and `FALSE` otherwise.
    */
  def containsPoint(Point: Point): Boolean
  
  /**
    * Returns the {@link Accessible} child that is rendered under the given point.
    *
    * The test point's coordinates are defined relative to the coordinate system of the object. That means that when the object is an opaque rectangle then
    * both the points (0,0) and (with-1,height-1) would yield a `TRUE` value.
    * @param Point Coordinates of the test point for which to find the {@link Accessible} child. The origin of the coordinate system is the upper left corner
    * @returns If there is one child which is rendered so that its bounding box contains the test point then a reference to that object is returned. If there is
    */
  def getAccessibleAtPoint(Point: Point): XAccessible
  
  /**
    * Returns the background color of this object.
    * @returns The returned color is the background color of this object or, if that is not supported, the default background color.
    */
  def getBackground(): Color
  
  /**
    * Returns the bounding box of this object.
    *
    * The returned bounding box has the form of a rectangle. Its coordinates are relative to the object's parent coordinate system. Note that the two
    * methods {@link getLocation()} and {@link getSize()} return the same information. With method {@link getLocationOnScreen()} you can get the bound box
    * position in screen coordinates.
    * @returns The coordinates of the returned rectangle are relative to this object's parent or relative to the screen on which this object is rendered if it h
    */
  def getBounds(): Rectangle
  
  /**
    * Returns the foreground color of this object.
    * @returns The returned color is the foreground color of this object or, if that is not supported, the default foreground color.
    */
  def getForeground(): Color
  
  /**
    * Returns the location of the upper left corner of the object's bounding box relative to the parent.
    *
    * The coordinates of the bounding box are given relative to the parent's coordinate system.
    * @returns The coordinates of the returned position are relative to this object's parent or relative to the screen on which this object is rendered if it ha
    */
  def getLocation(): Point
  
  /**
    * Returns the location of the upper left corner of the object's bounding box in screen coordinates.
    *
    * This method returns the same point as does the method {@link getLocation()} . The difference is that the coordinates are absolute screen coordinates
    * of the screen to which the object is rendered instead of being relative to the object's parent.
    * @returns The coordinates of the returned position are relative to the screen on which this object is rendered. If the object is not on any screen the retu
    */
  def getLocationOnScreen(): Point
  
  /**
    * Returns the size of this object's bounding box.
    * @returns The returned size is the size of this object or empty if it is not rendered on any screen.
    */
  def getSize(): typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /**
    * Grabs the focus to this object.
    *
    * If this object can not accept the focus, i.e. isFocusTraversable() returns `FALSE` for this object then nothing happens. Otherwise the object will
    * attempt to take the focus. Nothing happens if that fails, otherwise the object has the focus. This method is called `requestFocus` in the Java
    * Accessibility API 1.4.
    */
  def grabFocus(): Unit
}
object XAccessibleComponent {
  
  inline def apply(
    Background: Color,
    Bounds: Rectangle,
    Foreground: Color,
    Location: Point,
    LocationOnScreen: Point,
    Size: Size,
    acquire: Callback,
    containsPoint: Point => Boolean,
    getAccessibleAtPoint: Point => XAccessible,
    getBackground: CallbackTo[Color],
    getBounds: CallbackTo[Rectangle],
    getForeground: CallbackTo[Color],
    getLocation: CallbackTo[Point],
    getLocationOnScreen: CallbackTo[Point],
    getSize: CallbackTo[Size],
    grabFocus: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleComponent = {
    val __obj = js.Dynamic.literal(Background = Background.asInstanceOf[js.Any], Bounds = Bounds.asInstanceOf[js.Any], Foreground = Foreground.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], LocationOnScreen = LocationOnScreen.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, containsPoint = js.Any.fromFunction1(containsPoint), getAccessibleAtPoint = js.Any.fromFunction1(getAccessibleAtPoint), getBackground = getBackground.toJsFn, getBounds = getBounds.toJsFn, getForeground = getForeground.toJsFn, getLocation = getLocation.toJsFn, getLocationOnScreen = getLocationOnScreen.toJsFn, getSize = getSize.toJsFn, grabFocus = grabFocus.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleComponent]
  }
  
  extension [Self <: XAccessibleComponent](x: Self) {
    
    inline def setBackground(value: Color): Self = StObject.set(x, "Background", value.asInstanceOf[js.Any])
    
    inline def setBounds(value: Rectangle): Self = StObject.set(x, "Bounds", value.asInstanceOf[js.Any])
    
    inline def setContainsPoint(value: Point => Boolean): Self = StObject.set(x, "containsPoint", js.Any.fromFunction1(value))
    
    inline def setForeground(value: Color): Self = StObject.set(x, "Foreground", value.asInstanceOf[js.Any])
    
    inline def setGetAccessibleAtPoint(value: Point => XAccessible): Self = StObject.set(x, "getAccessibleAtPoint", js.Any.fromFunction1(value))
    
    inline def setGetBackground(value: CallbackTo[Color]): Self = StObject.set(x, "getBackground", value.toJsFn)
    
    inline def setGetBounds(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getBounds", value.toJsFn)
    
    inline def setGetForeground(value: CallbackTo[Color]): Self = StObject.set(x, "getForeground", value.toJsFn)
    
    inline def setGetLocation(value: CallbackTo[Point]): Self = StObject.set(x, "getLocation", value.toJsFn)
    
    inline def setGetLocationOnScreen(value: CallbackTo[Point]): Self = StObject.set(x, "getLocationOnScreen", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Size]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setGrabFocus(value: Callback): Self = StObject.set(x, "grabFocus", value.toJsFn)
    
    inline def setLocation(value: Point): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationOnScreen(value: Point): Self = StObject.set(x, "LocationOnScreen", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
