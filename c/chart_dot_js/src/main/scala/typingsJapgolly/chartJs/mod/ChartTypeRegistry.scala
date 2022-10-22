package typingsJapgolly.chartJs.mod

import typingsJapgolly.chartJs.anon.ChartOptionsDatasetOptions
import typingsJapgolly.chartJs.anon.DatasetOptions
import typingsJapgolly.chartJs.anon.DatasetOptionsDefaultDataPoint
import typingsJapgolly.chartJs.anon.MetaExtensions
import typingsJapgolly.chartJs.anon.Scales
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartTypeRegistry extends StObject {
  
  var bar: typingsJapgolly.chartJs.anon.ChartOptions
  
  var bubble: MetaExtensions
  
  var doughnut: Scales
  
  var line: DatasetOptions
  
  var pie: typingsJapgolly.chartJs.anon.ParsedDataType
  
  var polarArea: ChartOptionsDatasetOptions
  
  var radar: DatasetOptionsDefaultDataPoint
  
  var scatter: typingsJapgolly.chartJs.anon.DefaultDataPoint
}
object ChartTypeRegistry {
  
  inline def apply(
    bar: typingsJapgolly.chartJs.anon.ChartOptions,
    bubble: MetaExtensions,
    doughnut: Scales,
    line: DatasetOptions,
    pie: typingsJapgolly.chartJs.anon.ParsedDataType,
    polarArea: ChartOptionsDatasetOptions,
    radar: DatasetOptionsDefaultDataPoint,
    scatter: typingsJapgolly.chartJs.anon.DefaultDataPoint
  ): ChartTypeRegistry = {
    val __obj = js.Dynamic.literal(bar = bar.asInstanceOf[js.Any], bubble = bubble.asInstanceOf[js.Any], doughnut = doughnut.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any], polarArea = polarArea.asInstanceOf[js.Any], radar = radar.asInstanceOf[js.Any], scatter = scatter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTypeRegistry]
  }
  
  extension [Self <: ChartTypeRegistry](x: Self) {
    
    inline def setBar(value: typingsJapgolly.chartJs.anon.ChartOptions): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBubble(value: MetaExtensions): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
    
    inline def setDoughnut(value: Scales): Self = StObject.set(x, "doughnut", value.asInstanceOf[js.Any])
    
    inline def setLine(value: DatasetOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setPie(value: typingsJapgolly.chartJs.anon.ParsedDataType): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
    
    inline def setPolarArea(value: ChartOptionsDatasetOptions): Self = StObject.set(x, "polarArea", value.asInstanceOf[js.Any])
    
    inline def setRadar(value: DatasetOptionsDefaultDataPoint): Self = StObject.set(x, "radar", value.asInstanceOf[js.Any])
    
    inline def setScatter(value: typingsJapgolly.chartJs.anon.DefaultDataPoint): Self = StObject.set(x, "scatter", value.asInstanceOf[js.Any])
  }
}
