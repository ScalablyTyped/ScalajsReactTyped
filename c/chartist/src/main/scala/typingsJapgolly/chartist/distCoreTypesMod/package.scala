package typingsJapgolly.chartist.distCoreTypesMod

import typingsJapgolly.chartist.chartistStrings.axisX
import typingsJapgolly.chartist.chartistStrings.axisY
import typingsJapgolly.chartist.chartistStrings.classNames
import typingsJapgolly.chartist.chartistStrings.labelInterpolationFnc
import typingsJapgolly.chartist.chartistStrings.labelOffset
import typingsJapgolly.chartist.chartistStrings.offset
import typingsJapgolly.chartist.distUtilsTypesMod.RequiredKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllNormalizedSeriesTypes = NormalizedFlatSeries | js.Array[NormalizedSeries]

type AllSeriesTypes = FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])

type FlatSeries[T] = js.Array[FlatSeriesValue[T]]

type FlatSeriesPrimitiveValue = js.UndefOr[Double | String | Null]

type FlatSeriesValue[T] = SeriesValue[T] | FlatSeriesObjectValue[T]

type Label = String | Double | js.Date

type Meta = Any

type NormalizedFlatSeries = js.Array[Double]

type NormalizedSeries = js.Array[NormalizedSeriesValue]

type NormalizedSeriesPrimitiveValue = js.UndefOr[Double | NormalizedMulti]

type NormalizedSeriesValue = NormalizedSeriesPrimitiveValue

type OptionsWithDefaults = RequiredKeys[
Options[
  RequiredKeys[AxisOptions, offset | labelOffset | labelInterpolationFnc, scala.Nothing], 
  RequiredKeys[AxisOptions, offset | labelOffset | labelInterpolationFnc, scala.Nothing]
], 
axisX | axisY | classNames, 
scala.Nothing]

type Plugin = js.Function2[/* chart */ Any, /* options */ js.UndefOr[Any], Unit]

type ResponsiveOptions[T] = js.Array[js.Tuple2[String, T]]

type Series[T] = js.Array[SeriesValue[T]]

type SeriesPrimitiveValue = js.UndefOr[Double | String | Boolean | js.Date | Multi | Null]

type SeriesValue[T] = SeriesObjectValue[T] | T
