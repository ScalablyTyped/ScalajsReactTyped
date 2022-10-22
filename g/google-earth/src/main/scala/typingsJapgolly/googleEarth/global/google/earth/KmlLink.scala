package typingsJapgolly.googleEarth.global.google.earth

import typingsJapgolly.googleEarth.google.earth.KmlRefreshModeEnum
import typingsJapgolly.googleEarth.google.earth.KmlViewRefreshModeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.earth.KmlLink")
@js.native
open class KmlLink ()
  extends StObject
     with typingsJapgolly.googleEarth.google.earth.KmlLink {
  
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
    * A URL (either an HTTP address or a local file specification).
    * When the parent of Link is a NetworkLink, href is a KML file.
    * When the parent of Link is a Model, href is a COLLADA file.
    * When the parent of Link is an Overlay, href is an image.
    */
  /* CompleteClass */
  override def getHref(): String = js.native
  
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
    * Indicates to refresh the file every n seconds.
    */
  /* CompleteClass */
  override def getRefreshInterval(): Double = js.native
  
  /**
    * Specifies to use a time-based refresh mode.
    *
    * See also:
    *
    * * GEPlugin.REFRESH_ON_CHANGE
    * * GEPlugin.REFRESH_ON_INTERVAL
    * * GEPlugin.REFRESH_ON_EXPIRE
    */
  /* CompleteClass */
  override def getRefreshMode(): KmlRefreshModeEnum = js.native
  
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
    * Scales the BBOX parameters before sending them to the server.
    * A value less than 1 specifies to use less than the full view (screen).
    * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
    */
  /* CompleteClass */
  override def getViewBoundScale(): Double = js.native
  
  /**
    * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
    * (If the href specifies a local file, this element is ignored.)
    */
  /* CompleteClass */
  override def getViewFormat(): String = js.native
  
  /**
    * Specifies how the link is refreshed when the viewport changes.
    *
    * See also:
    *
    * * GEPlugin.VIEW_REFRESH_NEVER
    * * GEPlugin.VIEW_REFRESH_ON_STOP
    * * GEPlugin.VIEW_REFRESH_ON_REGION
    */
  /* CompleteClass */
  override def getViewRefreshMode(): KmlViewRefreshModeEnum = js.native
  
  /**
    * Specifies how the link is refreshed when the camera changes.
    */
  /* CompleteClass */
  override def getViewRefreshTime(): Double = js.native
  
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
    * A URL (either an HTTP address or a local file specification).
    * When the parent of Link is a NetworkLink, href is a KML file.
    * When the parent of Link is a Model, href is a COLLADA file.
    * When the parent of Link is an Overlay, href is an image.
    */
  /* CompleteClass */
  override def setHref(href: String): Unit = js.native
  
  /**
    * Indicates to refresh the file every n seconds.
    */
  /* CompleteClass */
  override def setRefreshInterval(refreshInterval: Double): Unit = js.native
  
  /**
    * Specifies to use a time-based refresh mode.
    *
    * See also:
    *
    * * GEPlugin.REFRESH_ON_CHANGE
    * * GEPlugin.REFRESH_ON_INTERVAL
    * * GEPlugin.REFRESH_ON_EXPIRE
    */
  /* CompleteClass */
  override def setRefreshMode(refreshMode: KmlRefreshModeEnum): Unit = js.native
  
  /**
    * Scales the BBOX parameters before sending them to the server.
    * A value less than 1 specifies to use less than the full view (screen).
    * A value greater than 1 specifies to fetch an area that extends beyond the edges of the current view.
    */
  /* CompleteClass */
  override def setViewBoundScale(viewBoundScale: Double): Unit = js.native
  
  /**
    * Specifies the format of the query string that is appended to the Link's href before the file is fetched.
    * (If the href specifies a local file, this element is ignored.)
    */
  /* CompleteClass */
  override def setViewFormat(viewFormat: String): Unit = js.native
  
  /**
    * Specifies how the link is refreshed when the viewport changes.
    *
    * See also:
    *
    * * GEPlugin.VIEW_REFRESH_NEVER
    * * GEPlugin.VIEW_REFRESH_ON_STOP
    * * GEPlugin.VIEW_REFRESH_ON_REGION
    */
  /* CompleteClass */
  override def setViewRefreshMode(viewRefreshMode: KmlViewRefreshModeEnum): Unit = js.native
  
  /**
    * Specifies how the link is refreshed when the camera changes.
    */
  /* CompleteClass */
  override def setViewRefreshTime(viewRefreshTime: Double): Unit = js.native
}
