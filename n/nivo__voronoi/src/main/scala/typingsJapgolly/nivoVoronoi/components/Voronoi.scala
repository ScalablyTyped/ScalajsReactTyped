package typingsJapgolly.nivoVoronoi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Dimensions
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoVoronoi.mod.VoronoiCustomLayer
import typingsJapgolly.nivoVoronoi.mod.VoronoiDatum
import typingsJapgolly.nivoVoronoi.mod.VoronoiDomain
import typingsJapgolly.nivoVoronoi.mod.VoronoiProps
import typingsJapgolly.nivoVoronoi.nivoVoronoiStrings.bounds
import typingsJapgolly.nivoVoronoi.nivoVoronoiStrings.cells
import typingsJapgolly.nivoVoronoi.nivoVoronoiStrings.links
import typingsJapgolly.nivoVoronoi.nivoVoronoiStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Voronoi {
  def apply(
    data: js.Array[VoronoiDatum],
    height: Double,
    width: Double,
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
    yDomain: VoronoiDomain = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    VoronoiProps with Dimensions, 
    typingsJapgolly.nivoVoronoi.mod.Voronoi, 
    Unit, 
    VoronoiProps with Dimensions
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoVoronoi.mod.VoronoiProps with typingsJapgolly.nivoCore.mod.Dimensions, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoVoronoi.mod.Voronoi](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoVoronoi.mod.VoronoiProps with typingsJapgolly.nivoCore.mod.Dimensions])(children: _*)
  }
  @JSImport("@nivo/voronoi", "Voronoi")
  @js.native
  object componentImport extends js.Object
  
}

