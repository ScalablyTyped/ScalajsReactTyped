package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlAbstractView
  extends StObject
     with KmlObject {
  
  /**
    * Creates a new KmlCamera object that matches this KmlAbstractView.
    *
    * If this view is already a KmlCamera, this function returns a new KmlCamera representing the same view.
    */
  def copyAsCamera(): KmlCamera
  
  /**
    * Creates a new KmlLookAt object that matches as closely as possible this KmlAbstractView. 
    * KmlLookAt is unable to represent roll, so roll values in the current view will not be passed to the new KmlLookAt object.
    *
    * If this view is already a KmlLookAt, this function returns a new KmlLookAt representing the same view.
    */
  def copyAsLookAt(): KmlLookAt
  
  /**
    * Returns the KmlTimeStamp or KmlTimeSpan object associated with this view.
    */
  def getTimePrimitive(): KmlTimePrimitive
  
  /**
    * Returns the viewer options on the current view.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    */
  def getViewerOptions(): KmlViewerOptions
  
  /**
    * Associate a KmlTimeStamp or KmlTimeSpan object with this view.
    */
  def setTimePrimitive(timePrimitive: KmlTimePrimitive): Unit
  
  /**
    * Sets the viewer options on the current view.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    */
  def setViewerOptions(viewerOptions: KmlViewerOptions): Unit
}
object KmlAbstractView {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    copyAsCamera: CallbackTo[KmlCamera],
    copyAsLookAt: CallbackTo[KmlLookAt],
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getId: CallbackTo[String],
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getTimePrimitive: CallbackTo[KmlTimePrimitive],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    getViewerOptions: CallbackTo[KmlViewerOptions],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setTimePrimitive: KmlTimePrimitive => Callback,
    setViewerOptions: KmlViewerOptions => Callback
  ): KmlAbstractView = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), copyAsCamera = copyAsCamera.toJsFn, copyAsLookAt = copyAsLookAt.toJsFn, dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getId = getId.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getTimePrimitive = getTimePrimitive.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, getViewerOptions = getViewerOptions.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setTimePrimitive = js.Any.fromFunction1((t0: KmlTimePrimitive) => setTimePrimitive(t0).runNow()), setViewerOptions = js.Any.fromFunction1((t0: KmlViewerOptions) => setViewerOptions(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlAbstractView]
  }
  
  extension [Self <: KmlAbstractView](x: Self) {
    
    inline def setCopyAsCamera(value: CallbackTo[KmlCamera]): Self = StObject.set(x, "copyAsCamera", value.toJsFn)
    
    inline def setCopyAsLookAt(value: CallbackTo[KmlLookAt]): Self = StObject.set(x, "copyAsLookAt", value.toJsFn)
    
    inline def setGetTimePrimitive(value: CallbackTo[KmlTimePrimitive]): Self = StObject.set(x, "getTimePrimitive", value.toJsFn)
    
    inline def setGetViewerOptions(value: CallbackTo[KmlViewerOptions]): Self = StObject.set(x, "getViewerOptions", value.toJsFn)
    
    inline def setSetTimePrimitive(value: KmlTimePrimitive => Callback): Self = StObject.set(x, "setTimePrimitive", js.Any.fromFunction1((t0: KmlTimePrimitive) => value(t0).runNow()))
    
    inline def setSetViewerOptions(value: KmlViewerOptions => Callback): Self = StObject.set(x, "setViewerOptions", js.Any.fromFunction1((t0: KmlViewerOptions) => value(t0).runNow()))
  }
}
