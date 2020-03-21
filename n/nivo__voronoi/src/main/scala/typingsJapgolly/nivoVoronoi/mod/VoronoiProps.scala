package typingsJapgolly.nivoVoronoi.mod

import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoVoronoi.nivoVoronoiStrings.bounds
import typingsJapgolly.nivoVoronoi.nivoVoronoiStrings.cells
import typingsJapgolly.nivoVoronoi.nivoVoronoiStrings.links
import typingsJapgolly.nivoVoronoi.nivoVoronoiStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiProps extends js.Object {
  var cellLineColor: js.UndefOr[String] = js.undefined
  var cellLineWidth: js.UndefOr[Double] = js.undefined
  var data: js.Array[VoronoiDatum]
  var enableCells: js.UndefOr[Boolean] = js.undefined
  var enableLinks: js.UndefOr[Boolean] = js.undefined
  var enablePoints: js.UndefOr[Boolean] = js.undefined
  var layers: js.UndefOr[js.Array[links | cells | points | bounds | VoronoiCustomLayer]] = js.undefined
  var linkLineColor: js.UndefOr[String] = js.undefined
  var linkLineWidth: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var pointColor: js.UndefOr[String] = js.undefined
  var pointSize: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var xDomain: js.UndefOr[VoronoiDomain] = js.undefined
  var yDomain: js.UndefOr[VoronoiDomain] = js.undefined
}

object VoronoiProps {
  @scala.inline
  def apply(
    data: js.Array[VoronoiDatum],
    cellLineColor: String = null,
    cellLineWidth: Int | Double = null,
    enableCells: js.UndefOr[Boolean] = js.undefined,
    enableLinks: js.UndefOr[Boolean] = js.undefined,
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[links | cells | points | bounds | VoronoiCustomLayer] = null,
    linkLineColor: String = null,
    linkLineWidth: Int | Double = null,
    margin: Box = null,
    pointColor: String = null,
    pointSize: Int | Double = null,
    theme: Theme = null,
    xDomain: VoronoiDomain = null,
    yDomain: VoronoiDomain = null
  ): VoronoiProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (cellLineColor != null) __obj.updateDynamic("cellLineColor")(cellLineColor.asInstanceOf[js.Any])
    if (cellLineWidth != null) __obj.updateDynamic("cellLineWidth")(cellLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCells)) __obj.updateDynamic("enableCells")(enableCells.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLinks)) __obj.updateDynamic("enableLinks")(enableLinks.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (linkLineColor != null) __obj.updateDynamic("linkLineColor")(linkLineColor.asInstanceOf[js.Any])
    if (linkLineWidth != null) __obj.updateDynamic("linkLineWidth")(linkLineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (xDomain != null) __obj.updateDynamic("xDomain")(xDomain.asInstanceOf[js.Any])
    if (yDomain != null) __obj.updateDynamic("yDomain")(yDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiProps]
  }
}

