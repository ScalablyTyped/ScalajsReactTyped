package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlListStyle
  extends StObject
     with KmlObject {
  
  /**
    * Background color for the Snippet.
    */
  def getBgColor(): KmlColor
  
  /**
    * Specifies how a feature should be displayed in a list view.
    */
  def getListItemType(): KmlListItemTypeEnum
  
  /**
    * Maximum number of lines of text for the Snippet.
    */
  def getMaxSnippetLines(): Double
  
  /**
    * Maximum number of lines of text for the Snippet.
    */
  def setMaxSnippetLines(maxSnippetLines: Double): Unit
}
object KmlListStyle {
  
  inline def apply(
    click: KmlMouseEvent => Callback,
    dblclick: KmlMouseEvent => Callback,
    equals_ : KmlObject => Boolean,
    getBgColor: CallbackTo[KmlColor],
    getId: CallbackTo[String],
    getListItemType: CallbackTo[KmlListItemTypeEnum],
    getMaxSnippetLines: CallbackTo[Double],
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
    setMaxSnippetLines: Double => Callback
  ): KmlListStyle = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1((t0: KmlMouseEvent) => click(t0).runNow()), dblclick = js.Any.fromFunction1((t0: KmlMouseEvent) => dblclick(t0).runNow()), getBgColor = getBgColor.toJsFn, getId = getId.toJsFn, getListItemType = getListItemType.toJsFn, getMaxSnippetLines = getMaxSnippetLines.toJsFn, getOwnerDocument = getOwnerDocument.toJsFn, getParentNode = getParentNode.toJsFn, getType = getType.toJsFn, getUrl = getUrl.toJsFn, mousedown = js.Any.fromFunction1((t0: KmlMouseEvent) => mousedown(t0).runNow()), mousemove = js.Any.fromFunction1((t0: KmlMouseEvent) => mousemove(t0).runNow()), mouseout = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseout(t0).runNow()), mouseover = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseover(t0).runNow()), mouseup = js.Any.fromFunction1((t0: KmlMouseEvent) => mouseup(t0).runNow()), release = release.toJsFn, setMaxSnippetLines = js.Any.fromFunction1((t0: Double) => setMaxSnippetLines(t0).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[KmlListStyle]
  }
  
  extension [Self <: KmlListStyle](x: Self) {
    
    inline def setGetBgColor(value: CallbackTo[KmlColor]): Self = StObject.set(x, "getBgColor", value.toJsFn)
    
    inline def setGetListItemType(value: CallbackTo[KmlListItemTypeEnum]): Self = StObject.set(x, "getListItemType", value.toJsFn)
    
    inline def setGetMaxSnippetLines(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxSnippetLines", value.toJsFn)
    
    inline def setSetMaxSnippetLines(value: Double => Callback): Self = StObject.set(x, "setMaxSnippetLines", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
