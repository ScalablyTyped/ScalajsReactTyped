package typingsJapgolly.googleEarth.global.google.earth

import typingsJapgolly.googleEarth.google.earth.KmlColorModeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlLineStyle")
@js.native
open class KmlLineStyle ()
  extends StObject
     with typingsJapgolly.googleEarth.google.earth.KmlLineStyle {
  
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
    * Color and opacity (alpha) values.
    */
  /* CompleteClass */
  override def getColor(): typingsJapgolly.googleEarth.google.earth.KmlColor = js.native
  
  /**
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  /* CompleteClass */
  override def getColorMode(): KmlColorModeEnum = js.native
  
  /**
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
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
    * Width of the line, in pixels.
    */
  /* CompleteClass */
  override def getWidth(): Double = js.native
  
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
    * Specifies which color mode effect to apply to the base color.
    * 
    * See also:
    *
    * * GEPlugin.COLOR_NORMAL
    * * GEPlugin.COLOR_INHERIT
    * * GEPlugin.COLOR_RANDOM
    */
  /* CompleteClass */
  override def setColorMode(colorMode: KmlColorModeEnum): Unit = js.native
  
  /**
    * Width of the line, in pixels.
    */
  /* CompleteClass */
  override def setWidth(width: Double): Unit = js.native
}
