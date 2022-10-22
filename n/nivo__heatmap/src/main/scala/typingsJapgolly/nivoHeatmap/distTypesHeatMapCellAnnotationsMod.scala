package typingsJapgolly.nivoHeatmap

import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.ComputedCell
import typingsJapgolly.nivoHeatmap.distTypesTypesMod.HeatMapDatum
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeatMapCellAnnotationsMod {
  
  @JSImport("@nivo/heatmap/dist/types/HeatMapCellAnnotations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HeatMapCellAnnotations[Datum /* <: HeatMapDatum */](hasCellsAnnotations: HeatMapCellAnnotationsProps[Datum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeatMapCellAnnotations")(hasCellsAnnotations.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait HeatMapCellAnnotationsProps[Datum /* <: HeatMapDatum */] extends StObject {
    
    var annotations: NonNullable[js.Array[AnnotationMatcher[ComputedCell[Datum]]]]
    
    var cells: js.Array[ComputedCell[Datum]]
  }
  object HeatMapCellAnnotationsProps {
    
    inline def apply[Datum /* <: HeatMapDatum */](
      annotations: NonNullable[js.Array[AnnotationMatcher[ComputedCell[Datum]]]],
      cells: js.Array[ComputedCell[Datum]]
    ): HeatMapCellAnnotationsProps[Datum] = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatMapCellAnnotationsProps[Datum]]
    }
    
    extension [Self <: HeatMapCellAnnotationsProps[?], Datum /* <: HeatMapDatum */](x: Self & HeatMapCellAnnotationsProps[Datum]) {
      
      inline def setAnnotations(value: NonNullable[js.Array[AnnotationMatcher[ComputedCell[Datum]]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setCells(value: js.Array[ComputedCell[Datum]]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsVarargs(value: ComputedCell[Datum]*): Self = StObject.set(x, "cells", js.Array(value*))
    }
  }
}
