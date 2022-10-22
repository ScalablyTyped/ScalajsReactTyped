package typingsJapgolly.nivoHeatmap.anon

import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.borderColor
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.color
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.formattedValue
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.label
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.labelTextColor
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.opacity
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBand
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cells[Datum /* <: HeatMapDatum */] extends StObject {
  
  var cells: js.Array[
    Omit[
      ComputedCell[Datum], 
      borderColor | formattedValue | color | opacity | label | labelTextColor
    ]
  ]
  
  var height: Double
  
  var maxValue: Double
  
  var minValue: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var width: Double
  
  var xScale: ScaleBand[
    /* import warning: importer.ImportType#apply Failed type conversion: Datum['x'] */ js.Any
  ]
  
  var yScale: ScaleBand[String]
}
object Cells {
  
  inline def apply[Datum /* <: HeatMapDatum */](
    cells: js.Array[
      Omit[
        ComputedCell[Datum], 
        borderColor | formattedValue | color | opacity | label | labelTextColor
      ]
    ],
    height: Double,
    maxValue: Double,
    minValue: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double,
    xScale: ScaleBand[
      /* import warning: importer.ImportType#apply Failed type conversion: Datum['x'] */ js.Any
    ],
    yScale: ScaleBand[String]
  ): Cells[Datum] = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xScale = xScale.asInstanceOf[js.Any], yScale = yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cells[Datum]]
  }
  
  extension [Self <: Cells[?], Datum /* <: HeatMapDatum */](x: Self & Cells[Datum]) {
    
    inline def setCells(
      value: js.Array[
          Omit[
            ComputedCell[Datum], 
            borderColor | formattedValue | color | opacity | label | labelTextColor
          ]
        ]
    ): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(
      value: (Omit[
          ComputedCell[Datum], 
          borderColor | formattedValue | color | opacity | label | labelTextColor
        ])*
    ): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setXScale(
      value: ScaleBand[
          /* import warning: importer.ImportType#apply Failed type conversion: Datum['x'] */ js.Any
        ]
    ): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setYScale(value: ScaleBand[String]): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
  }
}
