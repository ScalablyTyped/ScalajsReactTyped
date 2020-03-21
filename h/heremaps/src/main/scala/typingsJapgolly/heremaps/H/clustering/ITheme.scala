package typingsJapgolly.heremaps.H.clustering

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.heremaps.H.map.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface which specifies the methods a theme must implement.
  */
trait ITheme extends js.Object {
  /**
    * Function returns a cluster presentation as a map object.
    * @param cluster {H.clustering.ICluster}
    * @returns {H.map.Object}
    */
  def getClusterPresentation(cluster: ICluster): Object
  /**
    * Function returns noise point presentation as a map object
    * @param noisePoint {H.clustering.INoisePoint}
    * @returns {H.map.Object}
    */
  def getNoisePresentation(noisePoint: INoisePoint): Object
}

object ITheme {
  @scala.inline
  def apply(
    getClusterPresentation: ICluster => CallbackTo[Object],
    getNoisePresentation: INoisePoint => CallbackTo[Object]
  ): ITheme = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClusterPresentation")(js.Any.fromFunction1((t0: typingsJapgolly.heremaps.H.clustering.ICluster) => getClusterPresentation(t0).runNow()))
    __obj.updateDynamic("getNoisePresentation")(js.Any.fromFunction1((t0: typingsJapgolly.heremaps.H.clustering.INoisePoint) => getNoisePresentation(t0).runNow()))
    __obj.asInstanceOf[ITheme]
  }
}

