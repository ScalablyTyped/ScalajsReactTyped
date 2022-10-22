package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPushpin
  extends StObject
     with Pushpin {
  
  /** An array of all the pushpins that are in the cluster. */
  var containedPushpins: js.Array[Pushpin]
  
  /**
    * The grid cell key that can be used retrieve the clustered pushpin(s) from the clustering layer. This is useful when creating a clickable list that
    * link items in the list to clusters or pushpins on the map. Your list just needs to store the gridKey value.
    */
  var gridKey: Double
}
object ClusterPushpin {
  
  inline def apply(
    containedPushpins: js.Array[Pushpin],
    getAnchor: CallbackTo[Point],
    getClickedStyleEnabled: CallbackTo[Boolean],
    getColor: CallbackTo[String | Color],
    getCursor: CallbackTo[String],
    getDraggable: CallbackTo[Boolean],
    getHoverStyleEnabled: CallbackTo[Boolean],
    getIcon: CallbackTo[String],
    getLocation: CallbackTo[Location],
    getRoundClickableArea: CallbackTo[Boolean],
    getSubTitle: CallbackTo[String],
    getText: CallbackTo[String],
    getTextOffset: CallbackTo[Point],
    getTitle: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    gridKey: Double,
    setLocation: Location => Callback,
    setOptions: IPushpinOptions => Callback
  ): ClusterPushpin = {
    val __obj = js.Dynamic.literal(containedPushpins = containedPushpins.asInstanceOf[js.Any], getAnchor = getAnchor.toJsFn, getClickedStyleEnabled = getClickedStyleEnabled.toJsFn, getColor = getColor.toJsFn, getCursor = getCursor.toJsFn, getDraggable = getDraggable.toJsFn, getHoverStyleEnabled = getHoverStyleEnabled.toJsFn, getIcon = getIcon.toJsFn, getLocation = getLocation.toJsFn, getRoundClickableArea = getRoundClickableArea.toJsFn, getSubTitle = getSubTitle.toJsFn, getText = getText.toJsFn, getTextOffset = getTextOffset.toJsFn, getTitle = getTitle.toJsFn, getVisible = getVisible.toJsFn, gridKey = gridKey.asInstanceOf[js.Any], setLocation = js.Any.fromFunction1((t0: Location) => setLocation(t0).runNow()), setOptions = js.Any.fromFunction1((t0: IPushpinOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[ClusterPushpin]
  }
  
  extension [Self <: ClusterPushpin](x: Self) {
    
    inline def setContainedPushpins(value: js.Array[Pushpin]): Self = StObject.set(x, "containedPushpins", value.asInstanceOf[js.Any])
    
    inline def setContainedPushpinsVarargs(value: Pushpin*): Self = StObject.set(x, "containedPushpins", js.Array(value*))
    
    inline def setGridKey(value: Double): Self = StObject.set(x, "gridKey", value.asInstanceOf[js.Any])
  }
}
