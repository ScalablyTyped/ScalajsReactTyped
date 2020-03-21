package typingsJapgolly.bingmaps.Microsoft.Maps

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataBinningOptions extends js.Object {
  /* The name of a property in the Pushpin.metadata object on which to perform calculations (average, count, sum) against the pushpins in each data bin. */
  var aggregationProperty: js.UndefOr[String] = js.undefined
  /*
    * A callback function which defines the color a data bin polygon should be. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a color value.
    */
  var colorCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      String | Color
    ]
  ] = js.undefined
  /* The shape of the data bin to generate. Default: hexagon */
  var dataBinType: js.UndefOr[DataBinType] = js.undefined
  /* The distance units of the radius option. Default: meters */
  var distanceUnits: js.UndefOr[DistanceUnits] = js.undefined
  /* The default options used for rendering the data bin polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.undefined
  /*
    * A spatial distance which will be converted into a pixel distance at the equater and used to generate symetrically sized data bins
    * that have the apprimate spatial distance radius. Default: 1000
    */
  var radius: js.UndefOr[Double] = js.undefined
  /*
    * A callback function which defines how much to scale a data bins size. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a number between 0 and 1.
    */
  var scaleCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      Double
    ]
  ] = js.undefined
}

object IDataBinningOptions {
  @scala.inline
  def apply(
    aggregationProperty: String = null,
    colorCallback: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => CallbackTo[String | Color] = null,
    dataBinType: DataBinType = null,
    distanceUnits: DistanceUnits = null,
    polygonOptions: IPolygonOptions = null,
    radius: Int | Double = null,
    scaleCallback: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => CallbackTo[Double] = null
  ): IDataBinningOptions = {
    val __obj = js.Dynamic.literal()
    if (aggregationProperty != null) __obj.updateDynamic("aggregationProperty")(aggregationProperty.asInstanceOf[js.Any])
    if (colorCallback != null) __obj.updateDynamic("colorCallback")(js.Any.fromFunction3((t0: /* binInfo */ typingsJapgolly.bingmaps.Microsoft.Maps.IDataBinInfo, t1: /* min */ typingsJapgolly.bingmaps.Microsoft.Maps.IDataBinMetrics, t2: /* max */ typingsJapgolly.bingmaps.Microsoft.Maps.IDataBinMetrics) => colorCallback(t0, t1, t2).runNow()))
    if (dataBinType != null) __obj.updateDynamic("dataBinType")(dataBinType.asInstanceOf[js.Any])
    if (distanceUnits != null) __obj.updateDynamic("distanceUnits")(distanceUnits.asInstanceOf[js.Any])
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (scaleCallback != null) __obj.updateDynamic("scaleCallback")(js.Any.fromFunction3((t0: /* binInfo */ typingsJapgolly.bingmaps.Microsoft.Maps.IDataBinInfo, t1: /* min */ typingsJapgolly.bingmaps.Microsoft.Maps.IDataBinMetrics, t2: /* max */ typingsJapgolly.bingmaps.Microsoft.Maps.IDataBinMetrics) => scaleCallback(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IDataBinningOptions]
  }
}

