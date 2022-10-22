package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlViewerOptions
  extends StObject
     with KmlObject {
  
  /**
    * Set the state of viewer options, including sunlight, Street View, and historical imagery.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    * * GEPlugin.OPTION_STATE_DEFAULT
    * * GEPlugin.OPTION_STATE_ENABLED
    * * GEPlugin.OPTION_STATE_DISABLED
    */
  def getOption(`type`: GEViewerOptionsValueEnum): GEViewerOptionsValueEnum
  
  /**
    * Returns the current state of the specified viewer option type.
    *
    * See also:
    *
    * * GEPlugin.OPTION_STREET_VIEW
    * * GEPlugin.OPTION_SUNLIGHT
    * * GEPlugin.OPTION_HISTORICAL_IMAGERY
    * * GEPlugin.OPTION_STATE_DEFAULT
    * * GEPlugin.OPTION_STATE_ENABLED
    * * GEPlugin.OPTION_STATE_DISABLED
    */
  def setOption(`type`: GEViewerOptionsTypeEnum, state: GEViewerOptionsValueEnum): Unit
}
object KmlViewerOptions {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getId: CallbackTo[String],
    getOption: GEViewerOptionsValueEnum => GEViewerOptionsValueEnum,
    getOwnerDocument: CallbackTo[KmlDocument],
    getParentNode: CallbackTo[KmlObject],
    getType: CallbackTo[String],
    getUrl: CallbackTo[String],
    mousedown: KmlMouseEvent => Callback,
    mousemove: KmlMouseEvent => Callback,
    mouseout: KmlMouseEvent => Callback,
    mouseover: KmlMouseEvent => Callback,
    mouseup: KmlMouseEvent => Callback,
    release: Callback,
    setOption: (GEViewerOptionsTypeEnum, GEViewerOptionsValueEnum) => Callback
  ): KmlViewerOptions = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getId = getId.toJsFn, getOption = js.Any.fromFunction1(getOption), getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setOption = js.Any.fromFunction2((t0: GEViewerOptionsTypeEnum, t1: GEViewerOptionsValueEnum) => (setOption(t0, t1)).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlViewerOptions]
  }
  
  extension [Self <: KmlViewerOptions](x: Self) {
    
    inline def setGetOption(value: GEViewerOptionsValueEnum => GEViewerOptionsValueEnum): Self = StObject.set(x, "getOption", js.Any.fromFunction1(value))
    
    inline def setSetOption(value: (GEViewerOptionsTypeEnum, GEViewerOptionsValueEnum) => Callback): Self = StObject.set(x, "setOption", js.Any.fromFunction2((t0: GEViewerOptionsTypeEnum, t1: GEViewerOptionsValueEnum) => (value(t0, t1)).runNow()))
  }
}
