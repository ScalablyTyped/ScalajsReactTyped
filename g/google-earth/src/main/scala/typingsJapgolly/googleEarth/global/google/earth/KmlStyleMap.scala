package typingsJapgolly.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlStyleMap")
@js.native
open class KmlStyleMap ()
  extends StObject
     with typingsJapgolly.googleEarth.google.earth.KmlStyleMap {
  
  /**
    * Triggers an event when the user clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def click(event: typingsJapgolly.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user double clicks a location in Google Earth with the mouse.
    */
  /* CompleteClass */
  override def dblclick(event: typingsJapgolly.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Test whether this object is the same as another object.
    * Useful for Chrome and Safari, where the comparison a==b sometimes fails for plugin objects.
    */
  /* CompleteClass */
  override def equals(compareTo: typingsJapgolly.googleEarth.google.earth.KmlObject): Boolean = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  /* CompleteClass */
  override def getHighlightStyle(): typingsJapgolly.googleEarth.google.earth.KmlStyle = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  /* CompleteClass */
  override def getHighlightStyleUrl(): String = js.native
  
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  /* CompleteClass */
  override def getNormalStyle(): typingsJapgolly.googleEarth.google.earth.KmlStyle = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  /* CompleteClass */
  override def getNormalStyleUrl(): String = js.native
  
  /**
    * The document that owns the KML object.
    */
  /* CompleteClass */
  override def getOwnerDocument(): typingsJapgolly.googleEarth.google.earth.KmlDocument = js.native
  
  /**
    * The parent node of the KML object.
    */
  /* CompleteClass */
  override def getParentNode(): typingsJapgolly.googleEarth.google.earth.KmlObject = js.native
  
  /**
    * The interface name (i.e. 'KmlPlacemark') of the object.
    */
  /* CompleteClass */
  override def getType(): String = js.native
  
  /**
    * The unique URL of the KML object.
    * This is the base address joined with the ID using the # character.
    *
    * For example: http://www.google.com/bar.kml#atlantis
    */
  /* CompleteClass */
  override def getUrl(): String = js.native
  
  /**
    * Triggers an event when the user presses the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mousedown(event: typingsJapgolly.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse inside Google Earth.
    */
  /* CompleteClass */
  override def mousemove(event: typingsJapgolly.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse off of the object in Google Earth.
    */
  /* CompleteClass */
  override def mouseout(event: typingsJapgolly.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user moves the mouse pointer over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseover(event: typingsJapgolly.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Triggers an event when the user releases the mouse button over a location in Google Earth.
    */
  /* CompleteClass */
  override def mouseup(event: typingsJapgolly.googleEarth.google.earth.KmlMouseEvent): Unit = js.native
  
  /**
    * Permanently deletes an object, allowing its ID to be reused.
    * Attempting to access the object once it is released will result in an error.
    */
  /* CompleteClass */
  override def release(): Unit = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  /* CompleteClass */
  override def setHighlightStyle(highlightStyle: typingsJapgolly.googleEarth.google.earth.KmlStyle): Unit = js.native
  
  /**
    * Defines highlighted styles for a placemark, so that the highlighted version appears when the user mouses over the icon in Google Earth.
    */
  /* CompleteClass */
  override def setHighlightStyleUrl(highlightStyleUrl: String): Unit = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  /* CompleteClass */
  override def setNormalStyle(normalStyle: typingsJapgolly.googleEarth.google.earth.KmlStyle): Unit = js.native
  
  /**
    * Defines a normal style for a placemark.
    */
  /* CompleteClass */
  override def setNormalStyleUrl(normalStyleUrl: String): Unit = js.native
  
  /**
    * Sets both placemark styles.
    */
  /* CompleteClass */
  override def setStyle(
    normalStyle: typingsJapgolly.googleEarth.google.earth.KmlStyle,
    highlightStyle: typingsJapgolly.googleEarth.google.earth.KmlStyle
  ): Unit = js.native
  
  /**
    * Sets both URLs for the placemark style.
    */
  /* CompleteClass */
  override def setUrl(normalStyleUrl: String, highlightStyleUrl: String): Unit = js.native
}
