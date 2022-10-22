package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlObject
  extends StObject
     with GEEventEmitter {
  
  /**
    * Test whether this object is the same as another object.
    * Useful for Chrome and Safari, where the comparison a==b sometimes fails for plugin objects.
    */
  def equals(compareTo: KmlObject): Boolean
  
  /**
    * The unique ID of the KML object.
    */
  def getId(): String
  
  /**
    * The document that owns the KML object.
    */
  def getOwnerDocument(): KmlDocument
  
  /**
    * The parent node of the KML object.
    */
  def getParentNode(): KmlObject
  
  /**
    * The interface name (i.e. 'KmlPlacemark') of the object.
    */
  def getType(): String
  
  /**
    * The unique URL of the KML object.
    * This is the base address joined with the ID using the # character.
    *
    * For example: http://www.google.com/bar.kml#atlantis
    */
  def getUrl(): String
  
  /**
    * Permanently deletes an object, allowing its ID to be reused.
    * Attempting to access the object once it is released will result in an error.
    */
  def release(): Unit
}
object KmlObject {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getId: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback
  ): KmlObject = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn)
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlObject]
  }
  
  extension [Self <: KmlObject](x: Self) {
    
    inline def setEquals_(value: KmlObject => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetOwnerDocument(value: CallbackTo[KmlDocument]): Self = StObject.set(x, "getOwnerDocument", value.toJsFn)
    
    inline def setGetParentNode(value: CallbackTo[KmlObject]): Self = StObject.set(x, "getParentNode", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setRelease(value: Callback): Self = StObject.set(x, "release", value.toJsFn)
  }
}
