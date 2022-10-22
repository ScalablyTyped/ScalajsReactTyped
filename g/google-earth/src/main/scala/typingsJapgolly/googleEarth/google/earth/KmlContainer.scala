package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlContainer
  extends StObject
     with KmlFeature {
  
  /**
    * Get an element by ID.
    * This is functionally equivalent to getElementByUrl with an unspecified base URL.
    *
    * For example: getElementByUrl('#foo').
    *
    * Usage is when finding objects created with JavaScript, which have unspecified base URLs.
    * The object must be a descendant of the container before it can be found.
    */
  def getElementById(id: String): KmlObject
  
  /**
    * Get an element by URL. A URL consists of the base address and ID, joined with the # character. 
    *
    * For example: http://www.google.com/bar.kml#here_be_monsters 
    *
    * This applies to objects that are fetched.
    * In the case of plugin created objects, the URL is simply #foo.
    * The object must be a descendant of the container before it can be found.
    */
  def getElementByUrl(url: String): KmlObject
  
  /**
    * Get an element by type.
    */
  def getElementsByType(`type`: String): KmlObjectList[KmlObject]
  
  /**
    * A collection of features, such as name, description, and so on.
    */
  def getFeatures(): GEFeatureContainer
}
object KmlContainer {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getAbstractView: CallbackTo[KmlAbstractView],
    getAddress: CallbackTo[String],
    getBalloonHtml: CallbackTo[String],
    getBalloonHtmlUnsafe: CallbackTo[String],
    getComputedStyle: CallbackTo[KmlStyle],
    getDescription: CallbackTo[String],
    getElementById: String => KmlObject,
    getElementByUrl: String => KmlObject,
    getElementsByType: String => KmlObjectList[KmlObject],
    getFeatures: CallbackTo[GEFeatureContainer],
    getId: CallbackTo[String],
    getKml: CallbackTo[String],
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
    setName: String => Callback,
    setOpacity: Double => Callback,
    setOpen: Boolean => Callback,
    setRegion: KmlRegion => Callback,
    setSnippet: String => Callback,
    setStyleSelector: KmlStyleSelector => Callback,
    setStyleUrl: String => Callback,
    setTimePrimitive: KmlTimePrimitive => Callback,
    setVisibility: Boolean => Callback
  ): KmlContainer = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAbstractView = getAbstractView.toJsFn, getAddress = getAddress.toJsFn, getBalloonHtml = getBalloonHtml.toJsFn, getBalloonHtmlUnsafe = getBalloonHtmlUnsafe.toJsFn, getComputedStyle = getComputedStyle.toJsFn, getDescription = getDescription.toJsFn, getElementById = js.Any.fromFunction1(getElementById), getElementByUrl = js.Any.fromFunction1(getElementByUrl), getElementsByType = js.Any.fromFunction1(getElementsByType), getFeatures = getFeatures.toJsFn, getId = getId.toJsFn, getKml = getKml.toJsFn, getName = getName.toJsFn, getNextSibling = getNextSibling.toJsFn, getOpacity = getOpacity.toJsFn, getOpen = getOpen.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getRegion = getRegion.toJsFn, getSnippet = getSnippet.toJsFn, getStyleSelector = getStyleSelector.toJsFn, getStyleUrl = getStyleUrl.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getVisibility = getVisibility.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAbstractView = js.Any.fromFunction1((t0: KmlAbstractView) => setAbstractView(t0).runNow()), setAddress = js.Any.fromFunction1((t0: String) => setAddress(t0).runNow()), setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setOpen = js.Any.fromFunction1((t0: Boolean) => setOpen(t0).runNow()), setRegion = js.Any.fromFunction1((t0: KmlRegion) => setRegion(t0).runNow()), setSnippet = js.Any.fromFunction1((t0: String) => setSnippet(t0).runNow()), setStyleSelector = js.Any.fromFunction1((t0: KmlStyleSelector) => setStyleSelector(t0).runNow()), setStyleUrl = js.Any.fromFunction1((t0: String) => setStyleUrl(t0).runNow()), setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()), setVisibility = js.Any.fromFunction1((t0: Boolean) => setVisibility(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlContainer]
  }
  
  extension [Self <: KmlContainer](x: Self) {
    
    inline def setGetElementById(value: String => KmlObject): Self = StObject.set(x, "getElementById", js.Any.fromFunction1(value))
    
    inline def setGetElementByUrl(value: String => KmlObject): Self = StObject.set(x, "getElementByUrl", js.Any.fromFunction1(value))
    
    inline def setGetElementsByType(value: String => KmlObjectList[KmlObject]): Self = StObject.set(x, "getElementsByType", js.Any.fromFunction1(value))
    
    inline def setGetFeatures(value: CallbackTo[GEFeatureContainer]): Self = StObject.set(x, "getFeatures", value.toJsFn)
  }
}
