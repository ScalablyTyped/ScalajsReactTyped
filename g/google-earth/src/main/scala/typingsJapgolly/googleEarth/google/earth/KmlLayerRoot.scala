package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlLayerRoot
  extends StObject
     with KmlContainer {
  
  /**
    * Enables a layer based on its ID.
    */
  def enableLayerById(id: String, visibility: Boolean): Unit
  
  /**
    * Returns the drawing order for this database.
    */
  def getDrawOrder(): Double
  
  /**
    * Returns the layer based on the layer's ID.
    */
  def getLayerById(id: String): KmlLayer
  
  /**
    * Defines the drawing order for databases.
    * Drawing order is lowest to highest.
    * Google Earth Enterprise customers can add a side database and set the drawOrder to be either before or after that of the main database.
    * Side databases default to a drawing order of 0.
    */
  def setDrawOrder(drawOrder: Double): Unit
}
object KmlLayerRoot {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    enableLayerById: (String, Boolean) => Callback,
    equals_ : KmlObject => Boolean,
    getAbstractView: CallbackTo[KmlAbstractView],
    getAddress: CallbackTo[String],
    getBalloonHtml: CallbackTo[String],
    getBalloonHtmlUnsafe: CallbackTo[String],
    getComputedStyle: CallbackTo[KmlStyle],
    getDescription: CallbackTo[String],
    getDrawOrder: CallbackTo[Double],
    getElementById: String => KmlObject,
    getElementByUrl: String => KmlObject,
    getElementsByType: String => KmlObjectList[KmlObject],
    getFeatures: CallbackTo[GEFeatureContainer],
    getId: CallbackTo[String],
    getKml: CallbackTo[String],
    getLayerById: String => KmlLayer,
    getName: CallbackTo[String],
    getNextSibling: CallbackTo[KmlFeature],
    getOpacity: CallbackTo[Double],
    getOpen: CallbackTo[Boolean],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getPreviousSibling: CallbackTo[KmlFeature],
    getRegion: CallbackTo[KmlRegion],
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
    setName: String => Callback,
    setOpacity: Double => Callback,
    setOpen: Boolean => Callback,
    setRegion: KmlRegion => Callback,
    setSnippet: String => Callback,
    setStyleSelector: KmlStyleSelector => Callback,
    setStyleUrl: String => Callback,
    setTimePrimitive: KmlTimePrimitive => Callback,
    setVisibility: Boolean => Callback
  ): KmlLayerRoot = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), enableLayerById = js.Any.fromFunction2((t0: String, t1: Boolean) => (enableLayerById(t0, t1)).runNow()), getAbstractView = getAbstractView.toJsFn, getAddress = getAddress.toJsFn, getBalloonHtml = getBalloonHtml.toJsFn, getBalloonHtmlUnsafe = getBalloonHtmlUnsafe.toJsFn, getComputedStyle = getComputedStyle.toJsFn, getDescription = getDescription.toJsFn, getDrawOrder = getDrawOrder.toJsFn, getElementById = js.Any.fromFunction1(getElementById), getElementByUrl = js.Any.fromFunction1(getElementByUrl), getElementsByType = js.Any.fromFunction1(getElementsByType), getFeatures = getFeatures.toJsFn, getId = getId.toJsFn, getKml = getKml.toJsFn, getLayerById = js.Any.fromFunction1(getLayerById), getName = getName.toJsFn, getNextSibling = getNextSibling.toJsFn, getOpacity = getOpacity.toJsFn, getOpen = getOpen.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getRegion = getRegion.toJsFn, getSnippet = getSnippet.toJsFn, getStyleSelector = getStyleSelector.toJsFn, getStyleUrl = getStyleUrl.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getVisibility = getVisibility.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAbstractView = js.Any.fromFunction1((t0: KmlAbstractView) => setAbstractView(t0).runNow()), setAddress = js.Any.fromFunction1((t0: String) => setAddress(t0).runNow()), setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setDrawOrder = js.Any.fromFunction1((t0: Double) => setDrawOrder(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setOpen = js.Any.fromFunction1((t0: Boolean) => setOpen(t0).runNow()), setRegion = js.Any.fromFunction1((t0: KmlRegion) => setRegion(t0).runNow()), setSnippet = js.Any.fromFunction1((t0: String) => setSnippet(t0).runNow()), setStyleSelector = js.Any.fromFunction1((t0: KmlStyleSelector) => setStyleSelector(t0).runNow()), setStyleUrl = js.Any.fromFunction1((t0: String) => setStyleUrl(t0).runNow()), setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()), setVisibility = js.Any.fromFunction1((t0: Boolean) => setVisibility(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlLayerRoot]
  }
  
  extension [Self <: KmlLayerRoot](x: Self) {
    
    inline def setEnableLayerById(value: (String, Boolean) => Callback): Self = StObject.set(x, "enableLayerById", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setGetDrawOrder(value: CallbackTo[Double]): Self = StObject.set(x, "getDrawOrder", value.toJsFn)
    
    inline def setGetLayerById(value: String => KmlLayer): Self = StObject.set(x, "getLayerById", js.Any.fromFunction1(value))
    
    inline def setSetDrawOrder(value: Double => Callback): Self = StObject.set(x, "setDrawOrder", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
