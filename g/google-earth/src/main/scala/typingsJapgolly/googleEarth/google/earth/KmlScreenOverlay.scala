package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlScreenOverlay
  extends StObject
     with KmlOverlay {
  
  /**
    * Specifies a point relative to the screen origin that the overlay image is mapped to.
    * The x and y values can be specified in three different ways: as pixels ("pixels"), as fractions of the screen ("fraction"), or as inset pixels ("insetPixels"), which is an offset in pixels from the upper right corner of the screen.
    * The x and y positions can be specified in different ways - for example, x can be in pixels and y can be a fraction.
    * The origin of the coordinate system is in the lower left corner of the screen.
    *
    * Note: 
    *
    *  screenXY and overlayXY behave opposite to their corresponding behaviors in KML.
    *  This is due to a bug in the Earth API that will intentionally remain unfixed until a major version change.
    */
  def getOverlayXY(): KmlVec2
  
  /**
    * Adjusts how the image is placed inside the field of view.
    * This element is useful if your image has been rotated and deviates slightly from a desired horizontal view.
    */
  def getRotation(): Double
  
  /**
    * Point relative to the screen about which the screen overlay is rotated.
    */
  def getRotationXY(): KmlVec2
  
  /**
    * Specifies a point on (or outside of) the overlay image that is mapped to the screen coordinate.
    * It requires x and y values, and the units for those values.
    *
    * Note: 
    *
    *  screenXY and overlayXY behave opposite to their corresponding behaviors in KML.
    *  This is due to a bug in the Earth API that will intentionally remain unfixed until a major version change.
    */
  def getScreenXY(): KmlVec2
  
  /**
    * Specifies the size of the image for the screen overlay, as follows:
    *
    * * A value of -1 indicates to use the native dimension
    * * A value of 0 indicates to maintain the aspect ratio
    * * A value of n sets the value of the dimension
    */
  def getSize(): KmlVec2
  
  /**
    * Adjusts how the image is placed inside the field of view.
    * This element is useful if your image has been rotated and deviates slightly from a desired horizontal view.
    */
  def setRotation(rotation: Double): Unit
}
object KmlScreenOverlay {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAbstractView: CallbackTo[KmlAbstractView],
    getAddress: CallbackTo[String],
    getBalloonHtml: CallbackTo[String],
    getBalloonHtmlUnsafe: CallbackTo[String],
    getColor: CallbackTo[KmlColor],
    getComputedStyle: CallbackTo[KmlStyle],
    getDescription: CallbackTo[String],
    getDrawOrder: CallbackTo[Double],
    getIcon: CallbackTo[KmlIcon],
    getId: CallbackTo[String],
    getKml: CallbackTo[String],
    getName: CallbackTo[String],
    getNextSibling: CallbackTo[KmlFeature],
    getOpacity: CallbackTo[Double],
    getOpen: CallbackTo[Boolean],
    getOverlayXY: CallbackTo[KmlVec2],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getPreviousSibling: CallbackTo[KmlFeature],
    getRegion: CallbackTo[KmlRegion],
    getRotation: CallbackTo[Double],
    getRotationXY: CallbackTo[KmlVec2],
    getScreenXY: CallbackTo[KmlVec2],
    getSize: CallbackTo[KmlVec2],
    getSnippet: CallbackTo[String],
    getStyleSelector: CallbackTo[KmlStyleSelector],
    getStyleUrl: CallbackTo[String],
    getTimePrimitive: CallbackTo[KmlTimePrimitive],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    getVisibility: CallbackTo[Boolean],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setAbstractView: KmlAbstractView => Callback,
    setAddress: String => Callback,
    setDescription: String => Callback,
    setDrawOrder: Double => Callback,
    setIcon: KmlIcon => Callback,
    setName: String => Callback,
    setOpacity: Double => Callback,
    setOpen: Boolean => Callback,
    setRegion: KmlRegion => Callback,
    setRotation: Double => Callback,
    setSnippet: String => Callback,
    setStyleSelector: KmlStyleSelector => Callback,
    setStyleUrl: String => Callback,
    setTimePrimitive: KmlTimePrimitive => Callback,
    setVisibility: Boolean => Callback
  ): KmlScreenOverlay = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAbstractView = getAbstractView.toJsFn, getAddress = getAddress.toJsFn, getBalloonHtml = getBalloonHtml.toJsFn, getBalloonHtmlUnsafe = getBalloonHtmlUnsafe.toJsFn, getColor = getColor.toJsFn, getComputedStyle = getComputedStyle.toJsFn, getDescription = getDescription.toJsFn, getDrawOrder = getDrawOrder.toJsFn, getIcon = getIcon.toJsFn, getId = getId.toJsFn, getKml = getKml.toJsFn, getName = getName.toJsFn, getNextSibling = getNextSibling.toJsFn, getOpacity = getOpacity.toJsFn, getOpen = getOpen.toJsFn, getOverlayXY = getOverlayXY.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getRegion = getRegion.toJsFn, getRotation = getRotation.toJsFn, getRotationXY = getRotationXY.toJsFn, getScreenXY = getScreenXY.toJsFn, getSize = getSize.toJsFn, getSnippet = getSnippet.toJsFn, getStyleSelector = getStyleSelector.toJsFn, getStyleUrl = getStyleUrl.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getVisibility = getVisibility.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAbstractView = js.Any.fromFunction1((t0: KmlAbstractView) => setAbstractView(t0).runNow()), setAddress = js.Any.fromFunction1((t0: String) => setAddress(t0).runNow()), setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setDrawOrder = js.Any.fromFunction1((t0: Double) => setDrawOrder(t0).runNow()), setIcon = js.Any.fromFunction1((t0: KmlIcon) => setIcon(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setOpen = js.Any.fromFunction1((t0: Boolean) => setOpen(t0).runNow()), setRegion = js.Any.fromFunction1((t0: KmlRegion) => setRegion(t0).runNow()), setRotation = js.Any.fromFunction1((t0: Double) => setRotation(t0).runNow()), setSnippet = js.Any.fromFunction1((t0: String) => setSnippet(t0).runNow()), setStyleSelector = js.Any.fromFunction1((t0: KmlStyleSelector) => setStyleSelector(t0).runNow()), setStyleUrl = js.Any.fromFunction1((t0: String) => setStyleUrl(t0).runNow()), setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()), setVisibility = js.Any.fromFunction1((t0: Boolean) => setVisibility(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlScreenOverlay]
  }
  
  extension [Self <: KmlScreenOverlay](x: Self) {
    
    inline def setGetOverlayXY(value: CallbackTo[KmlVec2]): Self = StObject.set(x, "getOverlayXY", value.toJsFn)
    
    inline def setGetRotation(value: CallbackTo[Double]): Self = StObject.set(x, "getRotation", value.toJsFn)
    
    inline def setGetRotationXY(value: CallbackTo[KmlVec2]): Self = StObject.set(x, "getRotationXY", value.toJsFn)
    
    inline def setGetScreenXY(value: CallbackTo[KmlVec2]): Self = StObject.set(x, "getScreenXY", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[KmlVec2]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setSetRotation(value: Double => Callback): Self = StObject.set(x, "setRotation", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
