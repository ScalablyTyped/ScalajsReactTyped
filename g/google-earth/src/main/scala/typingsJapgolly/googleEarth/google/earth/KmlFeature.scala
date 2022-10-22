package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlFeature
  extends StObject
     with KmlObject {
  
  /**
    * Stores either the lookAt or camera view.
    */
  def getAbstractView(): KmlAbstractView
  
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  def getAddress(): String
  
  /**
    * Retrieves the contents of the feature's <ExtendedData> element.
    * The retrieved contents are scrubbed to remove JavaScript; CSS; and iframe, embed, and object tags. 
    * 
    * It should be safe to insert the resulting HTML into your page without concern for malicious content embedded in the feature data;
    * however any feature depending on CSS or Javascript will not work.
    */
  def getBalloonHtml(): String
  
  /**
    * Retrieves the contents of the feature's <ExtendedData> element. The contents are not scrubbed.
    * Use this method only if you trust the source of the feature data.
    */
  def getBalloonHtmlUnsafe(): String
  
  /**
    * Returns the computed style of a feature, merging any inline styles with styles imported from setHref() or a StyleUrl.
    *
    * Note: Modifying the returned KmlStyle object is undefined and not recommended.
    */
  def getComputedStyle(): KmlStyle
  
  /**
    * User-supplied text that appears in the description balloon.
    */
  def getDescription(): String
  
  /**
    * Returns the KML for a feature.
    */
  def getKml(): String
  
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  def getName(): String
  
  /**
    * Returns the next sibling node within the container.
    */
  def getNextSibling(): KmlFeature
  
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  def getOpacity(): Double
  
  /**
    * Default state of left panel.
    */
  def getOpen(): Boolean
  
  /**
    * Returns previous sibling node within the container.
    */
  def getPreviousSibling(): KmlFeature
  
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def getRegion(): KmlRegion
  
  /**
    * Specifies a short description of the feature.
    */
  def getSnippet(): String
  
  /**
    * The style based on the current mode of the Placemark.
    */
  def getStyleSelector(): KmlStyleSelector
  
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  def getStyleUrl(): String
  
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this feature.
    */
  def getTimePrimitive(): KmlTimePrimitive
  
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  def getVisibility(): Boolean
  
  /**
    * Stores either the lookAt or camera view.
    */
  def setAbstractView(abstractView: KmlAbstractView): Unit
  
  /**
    * Specifies a value representing an unstructured address written as a standard street, city, state address, and/or as a postal code.
    */
  def setAddress(address: String): Unit
  
  /**
    * User-supplied text that appears in the description balloon.
    */
  def setDescription(description: String): Unit
  
  /**
    * User-defined text displayed in the plugin as the label for the object (for example, for a Placemark).
    */
  def setName(name: String): Unit
  
  /**
    * Experimental Feature — this is an experimental feature and can change (or even be removed) at any time.  
    * The opacity of a feature, ranging from 0 (completely transparent) to 1 (complete opaque).
    * The opacity of a folder or document will influence the opacity of child features.
    * Thus, if a folder has an opacity of 0.5 and a child ground overlay in the folder also has an opacity of 0.5, the overlay will be drawn with an opacity of 0.25.
    */
  def setOpacity(opacity: Double): Unit
  
  /**
    * Default state of left panel.
    */
  def setOpen(open: Boolean): Unit
  
  /**
    * Specifies region objects and their properties.
    * A region contains a bounding box (LatLonAltBox) that describes an area of interest defined by geographic coordinates and altitudes.
    */
  def setRegion(region: KmlRegion): Unit
  
  /**
    * Specifies a short description of the feature.
    */
  def setSnippet(snippet: String): Unit
  
  /**
    * The style based on the current mode of the Placemark.
    */
  def setStyleSelector(styleSelector: KmlStyleSelector): Unit
  
  /**
    * URI of a Style or StyleMap defined in a Document.
    * It refers to a Plug-in intitiated object.
    */
  def setStyleUrl(styleUrl: String): Unit
  
  /**
    * Attach a KmlTimeStamp or KmlTimeSpan object to this feature.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit
  
  /**
    * Specifies whether the feature is drawn in the plugin.
    * In order for a feature to be visible, the visibility of all its ancestors must also be set to true.
    * In the Google Earth List View, each feature has a checkbox that allows the user to control visibility of the feature.
    */
  def setVisibility(visibility: Boolean): Unit
}
object KmlFeature {
  
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
  ): KmlFeature = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getAbstractView = getAbstractView.toJsFn, getAddress = getAddress.toJsFn, getBalloonHtml = getBalloonHtml.toJsFn, getBalloonHtmlUnsafe = getBalloonHtmlUnsafe.toJsFn, getComputedStyle = getComputedStyle.toJsFn, getDescription = getDescription.toJsFn, getId = getId.toJsFn, getKml = getKml.toJsFn, getName = getName.toJsFn, getNextSibling = getNextSibling.toJsFn, getOpacity = getOpacity.toJsFn, getOpen = getOpen.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getPreviousSibling = getPreviousSibling.toJsFn, getRegion = getRegion.toJsFn, getSnippet = getSnippet.toJsFn, getStyleSelector = getStyleSelector.toJsFn, getStyleUrl = getStyleUrl.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getVisibility = getVisibility.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setAbstractView = js.Any.fromFunction1((t0: KmlAbstractView) => setAbstractView(t0).runNow()), setAddress = js.Any.fromFunction1((t0: String) => setAddress(t0).runNow()), setDescription = js.Any.fromFunction1((t0: String) => setDescription(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setOpacity = js.Any.fromFunction1((t0: Double) => setOpacity(t0).runNow()), setOpen = js.Any.fromFunction1((t0: Boolean) => setOpen(t0).runNow()), setRegion = js.Any.fromFunction1((t0: KmlRegion) => setRegion(t0).runNow()), setSnippet = js.Any.fromFunction1((t0: String) => setSnippet(t0).runNow()), setStyleSelector = js.Any.fromFunction1((t0: KmlStyleSelector) => setStyleSelector(t0).runNow()), setStyleUrl = js.Any.fromFunction1((t0: String) => setStyleUrl(t0).runNow()), setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()), setVisibility = js.Any.fromFunction1((t0: Boolean) => setVisibility(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlFeature]
  }
  
  extension [Self <: KmlFeature](x: Self) {
    
    inline def setGetAbstractView(value: CallbackTo[KmlAbstractView]): Self = StObject.set(x, "getAbstractView", value.toJsFn)
    
    inline def setGetAddress(value: CallbackTo[String]): Self = StObject.set(x, "getAddress", value.toJsFn)
    
    inline def setGetBalloonHtml(value: CallbackTo[String]): Self = StObject.set(x, "getBalloonHtml", value.toJsFn)
    
    inline def setGetBalloonHtmlUnsafe(value: CallbackTo[String]): Self = StObject.set(x, "getBalloonHtmlUnsafe", value.toJsFn)
    
    inline def setGetComputedStyle(value: CallbackTo[KmlStyle]): Self = StObject.set(x, "getComputedStyle", value.toJsFn)
    
    inline def setGetDescription(value: CallbackTo[String]): Self = StObject.set(x, "getDescription", value.toJsFn)
    
    inline def setGetKml(value: CallbackTo[String]): Self = StObject.set(x, "getKml", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetNextSibling(value: CallbackTo[KmlFeature]): Self = StObject.set(x, "getNextSibling", value.toJsFn)
    
    inline def setGetOpacity(value: CallbackTo[Double]): Self = StObject.set(x, "getOpacity", value.toJsFn)
    
    inline def setGetOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "getOpen", value.toJsFn)
    
    inline def setGetPreviousSibling(value: CallbackTo[KmlFeature]): Self = StObject.set(x, "getPreviousSibling", value.toJsFn)
    
    inline def setGetRegion(value: CallbackTo[KmlRegion]): Self = StObject.set(x, "getRegion", value.toJsFn)
    
    inline def setGetSnippet(value: CallbackTo[String]): Self = StObject.set(x, "getSnippet", value.toJsFn)
    
    inline def setGetStyleSelector(value: CallbackTo[KmlStyleSelector]): Self = StObject.set(x, "getStyleSelector", value.toJsFn)
    
    inline def setGetStyleUrl(value: CallbackTo[String]): Self = StObject.set(x, "getStyleUrl", value.toJsFn)
    
    inline def setGetTimePrimitive(value: CallbackTo[KmlTimePrimitive]): Self = StObject.set(x, "getTimePrimitive", value.toJsFn)
    
    inline def setGetVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getVisibility", value.toJsFn)
    
    inline def setSetAbstractView(value: KmlAbstractView => Callback): Self = StObject.set(x, "setAbstractView", js.Any.fromFunction1((t0: KmlAbstractView) => value(t0).runNow()))
    
    inline def setSetAddress(value: String => Callback): Self = StObject.set(x, "setAddress", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDescription(value: String => Callback): Self = StObject.set(x, "setDescription", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetName(value: String => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetOpacity(value: Double => Callback): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetOpen(value: Boolean => Callback): Self = StObject.set(x, "setOpen", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetRegion(value: KmlRegion => Callback): Self = StObject.set(x, "setRegion", js.Any.fromFunction1((t0: KmlRegion) => value(t0).runNow()))
    
    inline def setSetSnippet(value: String => Callback): Self = StObject.set(x, "setSnippet", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetStyleSelector(value: KmlStyleSelector => Callback): Self = StObject.set(x, "setStyleSelector", js.Any.fromFunction1((t0: KmlStyleSelector) => value(t0).runNow()))
    
    inline def setSetStyleUrl(value: String => Callback): Self = StObject.set(x, "setStyleUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetTimePrimitive(value: KmlTimePrimitive => Callback): Self = StObject.set(x, "setTimePrimitive", js.Any.fromFunction1((t0: KmlTimePrimitive) => value(t0).runNow()))
    
    inline def setSetVisibility(value: Boolean => Callback): Self = StObject.set(x, "setVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
