package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlNetworkLink
  extends StObject
     with KmlFeature {
  
  /**
    * A value of 1 causes Google Earth to fly to the view of the LookAt or Camera in the NetworkLinkControl (if it exists).
    */
  def getFlyToView(): Boolean
  
  /**
    * Specifies the location of any of the following:
    *
    * * KML files fetched by network links
    * * Image files used by icons in icon styles, ground overlays, and screen overlays
    * * Model files used in the Model object
    */
  def getLink(): KmlLink
  
  /**
    * A value of 0 leaves the visibility of features within the control of the Google Earth user.
    * Set the value to 1 to reset the visibility of features each time the NetworkLink is refreshed.
    * For example, suppose a Placemark within the linked KML file has visibility set to 1 and the NetworkLink has refreshVisibility set to 1.
    * When the file is first loaded into Google Earth, the user can clear the check box next to the item to turn off display in the 3D viewer.
    * However, when the NetworkLink is refreshed, the Placemark will be made visible again, since its original visibility state was TRUE.
    */
  def getRefreshVisibility(): Boolean
  
  /**
    * Sets the link, refreshVisibility, and flyToView for the network link.
    */
  def set(link: KmlLink, refreshVisibility: Boolean, flyToView: Boolean): Unit
  
  /**
    * A value of 1 causes Google Earth to fly to the view of the LookAt or Camera in the NetworkLinkControl (if it exists).
    */
  def setFlyToView(flyToView: Boolean): Unit
  
  /**
    * Specifies the location of any of the following:
    *
    * * KML files fetched by network links
    * * Image files used by icons in icon styles, ground overlays, and screen overlays
    * * Model files used in the Model object
    */
  def setLink(link: KmlLink): Unit
  
  /**
    * A value of 0 leaves the visibility of features within the control of the Google Earth user.
    * Set the value to 1 to reset the visibility of features each time the NetworkLink is refreshed.
    * For example, suppose a Placemark within the linked KML file has visibility set to 1 and the NetworkLink has refreshVisibility set to 1.
    * When the file is first loaded into Google Earth, the user can clear the check box next to the item to turn off display in the 3D viewer.
    * However, when the NetworkLink is refreshed, the Placemark will be made visible again, since its original visibility state was TRUE.
    */
  def setRefreshVisibility(refreshVisibility: Boolean): Unit
}
object KmlNetworkLink {
  
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
    getFlyToView: CallbackTo[Boolean],
    getId: CallbackTo[String],
    getKml: CallbackTo[String],
    getLink: CallbackTo[KmlLink],
    getName: CallbackTo[String],
    getNextSibling: CallbackTo[KmlFeature],
    getOpacity: CallbackTo[Double],
    getOpen: CallbackTo[Boolean],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getPreviousSibling: CallbackTo[KmlFeature],
    getRefreshVisibility: CallbackTo[Boolean],
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
    set: (KmlLink, Boolean, Boolean) => Callback,
    setAbstractView: KmlAbstractView => Callback,
    setAddress: String => Callback,
    setDescription: String => Callback,
    setFlyToView: Boolean => Callback,
    setLink: KmlLink => Callback,
    setName: String => Callback,
    setOpacity: Double => Callback,
    setOpen: Boolean => Callback,
    setRefreshVisibility: Boolean => Callback,
    setRegion: KmlRegion => Callback,
    setSnippet: String => Callback,
    setStyleSelector: KmlStyleSelector => Callback,
    setStyleUrl: String => Callback,
    setTimePrimitive: KmlTimePrimitive => Callback,
    setVisibility: Boolean => Callback
  ): KmlNetworkLink = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAbstractView = getAbstractView.toJsFn, getAddress = getAddress.toJsFn, getBalloonHtml = getBalloonHtml.toJsFn, getBalloonHtmlUnsafe = getBalloonHtmlUnsafe.toJsFn, getComputedStyle = getComputedStyle.toJsFn, getDescription = getDescription.toJsFn, getFlyToView = getFlyToView.toJsFn, getId = getId.toJsFn, getKml = getKml.toJsFn, getLink = getLink.toJsFn, getName = getName.toJsFn, getNextSibling = getNextSibling.toJsFn, getOpacity = getOpacity.toJsFn, getOpen = getOpen.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getRefreshVisibility = getRefreshVisibility.toJsFn, getRegion = getRegion.toJsFn, getSnippet = getSnippet.toJsFn, getStyleSelector = getStyleSelector.toJsFn, getStyleUrl = getStyleUrl.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getVisibility = getVisibility.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, set = js.Any.fromFunction3((t0: KmlLink, t1: Boolean, t2: Boolean) => (set(t0, t1, t2)).runNow()), setAbstractView = js.Any.fromFunction1((t0: KmlAbstractView) => setAbstractView(t0).runNow()), setAddress = js.Any.fromFunction1((t0: String) => setAddress(t0).runNow()), setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setFlyToView = js.Any.fromFunction1((t0: Boolean) => setFlyToView(t0).runNow()), setLink = js.Any.fromFunction1((t0: KmlLink) => setLink(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setOpen = js.Any.fromFunction1((t0: Boolean) => setOpen(t0).runNow()), setRefreshVisibility = js.Any.fromFunction1((t0: Boolean) => setRefreshVisibility(t0).runNow()), setRegion = js.Any.fromFunction1((t0: KmlRegion) => setRegion(t0).runNow()), setSnippet = js.Any.fromFunction1((t0: String) => setSnippet(t0).runNow()), setStyleSelector = js.Any.fromFunction1((t0: KmlStyleSelector) => setStyleSelector(t0).runNow()), setStyleUrl = js.Any.fromFunction1((t0: String) => setStyleUrl(t0).runNow()), setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()), setVisibility = js.Any.fromFunction1((t0: Boolean) => setVisibility(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlNetworkLink]
  }
  
  extension [Self <: KmlNetworkLink](x: Self) {
    
    inline def setGetFlyToView(value: CallbackTo[Boolean]): Self = StObject.set(x, "getFlyToView", value.toJsFn)
    
    inline def setGetLink(value: CallbackTo[KmlLink]): Self = StObject.set(x, "getLink", value.toJsFn)
    
    inline def setGetRefreshVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getRefreshVisibility", value.toJsFn)
    
    inline def setSet(value: (KmlLink, Boolean, Boolean) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction3((t0: KmlLink, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetFlyToView(value: Boolean => Callback): Self = StObject.set(x, "setFlyToView", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetLink(value: KmlLink => Callback): Self = StObject.set(x, "setLink", js.Any.fromFunction1((t0: KmlLink) => value(t0).runNow()))
    
    inline def setSetRefreshVisibility(value: Boolean => Callback): Self = StObject.set(x, "setRefreshVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
