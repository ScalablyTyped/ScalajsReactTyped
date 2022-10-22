package typingsJapgolly.chartist

import typingsJapgolly.chartist.chartistBooleans.`false`
import typingsJapgolly.chartist.chartistBooleans.`true`
import typingsJapgolly.chartist.distCoreTypesMod.AxisName
import typingsJapgolly.chartist.distCoreTypesMod.Data
import typingsJapgolly.chartist.distCoreTypesMod.FlatSeries
import typingsJapgolly.chartist.distCoreTypesMod.FlatSeriesPrimitiveValue
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedData
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedFlatSeries
import typingsJapgolly.chartist.distCoreTypesMod.NormalizedSeries
import typingsJapgolly.chartist.distCoreTypesMod.Series
import typingsJapgolly.chartist.distCoreTypesMod.SeriesObject
import typingsJapgolly.chartist.distCoreTypesMod.SeriesPrimitiveValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDataNormalizeMod {
  
  @JSImport("chartist/dist/core/data/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ]
  ): NormalizedData[NormalizedFlatSeries] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any]).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Boolean
  ): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: Boolean
  ): NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Boolean,
    multi: AxisName
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: Boolean
  ): NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries | js.Array[NormalizedSeries]]]
  inline def normalizeData(
    data: Data[
      (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]) | FlatSeries[FlatSeriesPrimitiveValue]
    ],
    reverse: Unit,
    multi: AxisName
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  
  inline def normalizeData_false(data: Data[FlatSeries[FlatSeriesPrimitiveValue]], reverse: Boolean, multi: `false`): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  inline def normalizeData_false(data: Data[FlatSeries[FlatSeriesPrimitiveValue]], reverse: Unit, multi: `false`): NormalizedData[NormalizedFlatSeries] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[NormalizedFlatSeries]]
  
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: Boolean,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]],
    reverse: Boolean,
    multi: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Boolean,
    multi: AxisName,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: Boolean,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]]],
    reverse: Unit,
    multi: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
  inline def normalizeData_true(
    data: Data[
      FlatSeries[FlatSeriesPrimitiveValue] | (js.Array[Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]])
    ],
    reverse: Unit,
    multi: AxisName,
    distributed: `true`
  ): NormalizedData[js.Array[NormalizedSeries]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeData")(data.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any], multi.asInstanceOf[js.Any], distributed.asInstanceOf[js.Any])).asInstanceOf[NormalizedData[js.Array[NormalizedSeries]]]
}
