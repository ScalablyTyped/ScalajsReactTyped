package typingsJapgolly.googleEarth.global.google.earth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlRegion")
@js.native
open class KmlRegion ()
  extends StObject
     with typingsJapgolly.googleEarth.google.earth.KmlRegion {
  
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
    * The unique ID of the KML object.
    */
  /* CompleteClass */
  override def getId(): String = js.native
  
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  /* CompleteClass */
  override def getLatLonAltBox(): typingsJapgolly.googleEarth.google.earth.KmlLatLonAltBox = js.native
  
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  /* CompleteClass */
  override def getLod(): typingsJapgolly.googleEarth.google.earth.KmlLod = js.native
  
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
    * Sets the latLonAltBox and lod for the region.
    */
  /* CompleteClass */
  override def set(
    latLonAltBox: typingsJapgolly.googleEarth.google.earth.KmlLatLonAltBox,
    lod: typingsJapgolly.googleEarth.google.earth.KmlLod
  ): Unit = js.native
  
  /**
    * A bounding box that describes an area of interest defined by geographic coordinates and altitudes.
    */
  /* CompleteClass */
  override def setLatLonAltBox(latLonAltBox: typingsJapgolly.googleEarth.google.earth.KmlLatLonAltBox): Unit = js.native
  
  /**
    * LOD is an abbreviation for Level of Detail.
    * Lod describes the size of the projected region on the screen that is required in order for the region to be considered "active.
    * " Also specifies the size of the pixel ramp used for fading in (from transparent to opaque) and fading out (from opaque to transparent).
    */
  /* CompleteClass */
  override def setLod(lod: typingsJapgolly.googleEarth.google.earth.KmlLod): Unit = js.native
}
