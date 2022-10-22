package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Point
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XEventsSupplier
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.PointSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object image {
  
  /** This service specifies a HTML image map. */
  trait ImageMap
    extends StObject
       with XNamed
       with XIndexContainer
  object ImageMap {
    
    inline def apply(
      Count: Double,
      ElementType: `type`,
      Name: String,
      acquire: Callback,
      getByIndex: Double => Any,
      getCount: CallbackTo[Double],
      getElementType: CallbackTo[`type`],
      getName: CallbackTo[String],
      hasElements: CallbackTo[Boolean],
      insertByIndex: (Double, Any) => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      removeByIndex: Double => Callback,
      replaceByIndex: (Double, Any) => Callback,
      setName: String => Callback
    ): ImageMap = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getName = getName.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (insertByIndex(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
      __obj.asInstanceOf[ImageMap]
    }
  }
  
  /**
    * this service describes a circular-shaped region inside a HTML image map.
    * @see ImageMap
    * @see ImageMapObject
    */
  trait ImageMapCircleObject
    extends StObject
       with ImageMapObject {
    
    /** This is the center point of the circle in pixels */
    var Center: Point
    
    /** This is the radius of the circle in pixels */
    var Radius: Double
  }
  object ImageMapCircleObject {
    
    inline def apply(
      Center: Point,
      Description: String,
      Events: XNameReplace,
      IsActive: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Radius: Double,
      Target: String,
      URL: String,
      acquire: Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      getEvents: CallbackTo[XNameReplace],
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setPropertyValue: (String, Any) => Callback
    ): ImageMapCircleObject = {
      val __obj = js.Dynamic.literal(Center = Center.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getEvents = getEvents.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[ImageMapCircleObject]
    }
    
    extension [Self <: ImageMapCircleObject](x: Self) {
      
      inline def setCenter(value: Point): Self = StObject.set(x, "Center", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "Radius", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * this is a base service for objects inside a image maps.
    * @see ImageMap
    * @see ImageMapRectangleObject
    * @see ImageMapCircleObject
    * @see ImageMapPolygonObject
    */
  trait ImageMapObject
    extends StObject
       with XPropertySet
       with XEventsSupplier {
    
    /** This is an optional description text for the link. */
    var Description: String
    
    /** If an object is not active, it is ignored when the user clicks on the {@link ImageMap} . */
    var IsActive: Boolean
    
    /** Optionally, objects could be named. */
    var Name: String
    
    /** This is the target frame */
    var Target: String
    
    /** This is the URL for this object */
    var URL: String
  }
  object ImageMapObject {
    
    inline def apply(
      Description: String,
      Events: XNameReplace,
      IsActive: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Target: String,
      URL: String,
      acquire: Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      getEvents: CallbackTo[XNameReplace],
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setPropertyValue: (String, Any) => Callback
    ): ImageMapObject = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getEvents = getEvents.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[ImageMapObject]
    }
    
    extension [Self <: ImageMapObject](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "IsActive", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
      
      inline def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * this service describes a polygon-shaped region inside a HTML image map.
    * @see ImageMap
    * @see ImageMapObject
    */
  trait ImageMapPolygonObject
    extends StObject
       with ImageMapObject {
    
    /** This sequence of points outlines the click area of this image map object. */
    var Polygon: PointSequence
  }
  object ImageMapPolygonObject {
    
    inline def apply(
      Description: String,
      Events: XNameReplace,
      IsActive: Boolean,
      Name: String,
      Polygon: PointSequence,
      PropertySetInfo: XPropertySetInfo,
      Target: String,
      URL: String,
      acquire: Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      getEvents: CallbackTo[XNameReplace],
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setPropertyValue: (String, Any) => Callback
    ): ImageMapPolygonObject = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getEvents = getEvents.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[ImageMapPolygonObject]
    }
    
    extension [Self <: ImageMapPolygonObject](x: Self) {
      
      inline def setPolygon(value: PointSequence): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
      
      inline def setPolygonVarargs(value: Point*): Self = StObject.set(x, "Polygon", js.Array(value*))
    }
  }
  
  /**
    * this service describes a rectangular-shaped region inside a HTML image map.
    * @see ImageMap
    * @see ImageMapObject
    */
  trait ImageMapRectangleObject
    extends StObject
       with ImageMapObject {
    
    /** This is the boundary of this rectangle object */
    var Boundary: Rectangle
  }
  object ImageMapRectangleObject {
    
    inline def apply(
      Boundary: Rectangle,
      Description: String,
      Events: XNameReplace,
      IsActive: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Target: String,
      URL: String,
      acquire: Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      getEvents: CallbackTo[XNameReplace],
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setPropertyValue: (String, Any) => Callback
    ): ImageMapRectangleObject = {
      val __obj = js.Dynamic.literal(Boundary = Boundary.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getEvents = getEvents.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[ImageMapRectangleObject]
    }
    
    extension [Self <: ImageMapRectangleObject](x: Self) {
      
      inline def setBoundary(value: Rectangle): Self = StObject.set(x, "Boundary", value.asInstanceOf[js.Any])
    }
  }
}
