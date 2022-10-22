package typingsJapgolly.openseadragon.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLoadedEvent
  extends StObject
     with TileEvent {
  
  def getCompletionCallback(): js.Function0[Unit]
  
  var image: HTMLImageElement
  
  var tileRequest: XMLHttpRequest
}
object TileLoadedEvent {
  
  inline def apply(
    eventSource: Viewer,
    getCompletionCallback: CallbackTo[js.Function0[Unit]],
    image: HTMLImageElement,
    tile: Tile,
    tileRequest: XMLHttpRequest,
    tiledImage: TiledImage,
    userData: Any
  ): TileLoadedEvent = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], getCompletionCallback = getCompletionCallback.toJsFn, image = image.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tileRequest = tileRequest.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileLoadedEvent]
  }
  
  extension [Self <: TileLoadedEvent](x: Self) {
    
    inline def setGetCompletionCallback(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "getCompletionCallback", value.toJsFn)
    
    inline def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setTileRequest(value: XMLHttpRequest): Self = StObject.set(x, "tileRequest", value.asInstanceOf[js.Any])
  }
}
