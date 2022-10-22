package typingsJapgolly.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStroke extends StObject {
  
  var cap: String
  
  var chart: IChart
  
  var dash: js.Array[Double]
  
  var fill: String
  
  var gradient: IGradient
  
  var join: String
  
  var size: Double
}
object IStroke {
  
  inline def apply(
    cap: String,
    chart: IChart,
    dash: js.Array[Double],
    fill: String,
    gradient: IGradient,
    join: String,
    size: Double
  ): IStroke = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStroke]
  }
  
  extension [Self <: IStroke](x: Self) {
    
    inline def setCap(value: String): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setDash(value: js.Array[Double]): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashVarargs(value: Double*): Self = StObject.set(x, "dash", js.Array(value*))
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setGradient(value: IGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    inline def setJoin(value: String): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
