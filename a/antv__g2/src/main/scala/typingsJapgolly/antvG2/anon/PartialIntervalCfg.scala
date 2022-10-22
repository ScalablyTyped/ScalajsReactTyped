package typingsJapgolly.antvG2.anon

import typingsJapgolly.antvG2.libDependentsMod.Coordinate
import typingsJapgolly.antvG2.libInterfaceMod.Datum
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.antvG2.libInterfaceMod.ScaleOption
import typingsJapgolly.antvGBase.libInterfacesMod.IGroup
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g2.@antv/g2/lib/geometry/interval.IntervalCfg> */
trait PartialIntervalCfg extends StObject {
  
  var background: js.UndefOr[Style] = js.undefined
  
  var columnWidthRatio: js.UndefOr[Double] = js.undefined
  
  var container: js.UndefOr[IGroup] = js.undefined
  
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  
  var data: js.UndefOr[typingsJapgolly.antvG2.libInterfaceMod.Data] = js.undefined
  
  var dodgePadding: js.UndefOr[Double] = js.undefined
  
  var intervalPadding: js.UndefOr[Double] = js.undefined
  
  var labelsContainer: js.UndefOr[IGroup] = js.undefined
  
  var maxColumnWidth: js.UndefOr[Double] = js.undefined
  
  var minColumnWidth: js.UndefOr[Double] = js.undefined
  
  var multiplePieWidthRatio: js.UndefOr[Double] = js.undefined
  
  var roseWidthRatio: js.UndefOr[Double] = js.undefined
  
  var scaleDefs: js.UndefOr[Record[String, ScaleOption]] = js.undefined
  
  var scales: js.UndefOr[
    Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
    ]
  ] = js.undefined
  
  var sortZIndex: js.UndefOr[Boolean] = js.undefined
  
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[LooseObject] = js.undefined
  
  var useDeferredLabel: js.UndefOr[Boolean | Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zIndexReversed: js.UndefOr[Boolean] = js.undefined
}
object PartialIntervalCfg {
  
  inline def apply(): PartialIntervalCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIntervalCfg]
  }
  
  extension [Self <: PartialIntervalCfg](x: Self) {
    
    inline def setBackground(value: Style): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColumnWidthRatio(value: Double): Self = StObject.set(x, "columnWidthRatio", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthRatioUndefined: Self = StObject.set(x, "columnWidthRatio", js.undefined)
    
    inline def setContainer(value: IGroup): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCoordinate(value: Coordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setData(value: typingsJapgolly.antvG2.libInterfaceMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDodgePadding(value: Double): Self = StObject.set(x, "dodgePadding", value.asInstanceOf[js.Any])
    
    inline def setDodgePaddingUndefined: Self = StObject.set(x, "dodgePadding", js.undefined)
    
    inline def setIntervalPadding(value: Double): Self = StObject.set(x, "intervalPadding", value.asInstanceOf[js.Any])
    
    inline def setIntervalPaddingUndefined: Self = StObject.set(x, "intervalPadding", js.undefined)
    
    inline def setLabelsContainer(value: IGroup): Self = StObject.set(x, "labelsContainer", value.asInstanceOf[js.Any])
    
    inline def setLabelsContainerUndefined: Self = StObject.set(x, "labelsContainer", js.undefined)
    
    inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
    
    inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
    
    inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
    
    inline def setMultiplePieWidthRatio(value: Double): Self = StObject.set(x, "multiplePieWidthRatio", value.asInstanceOf[js.Any])
    
    inline def setMultiplePieWidthRatioUndefined: Self = StObject.set(x, "multiplePieWidthRatio", js.undefined)
    
    inline def setRoseWidthRatio(value: Double): Self = StObject.set(x, "roseWidthRatio", value.asInstanceOf[js.Any])
    
    inline def setRoseWidthRatioUndefined: Self = StObject.set(x, "roseWidthRatio", js.undefined)
    
    inline def setScaleDefs(value: Record[String, ScaleOption]): Self = StObject.set(x, "scaleDefs", value.asInstanceOf[js.Any])
    
    inline def setScaleDefsUndefined: Self = StObject.set(x, "scaleDefs", js.undefined)
    
    inline def setScales(
      value: Record[
          String, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
        ]
    ): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    
    inline def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
    
    inline def setSortZIndex(value: Boolean): Self = StObject.set(x, "sortZIndex", value.asInstanceOf[js.Any])
    
    inline def setSortZIndexUndefined: Self = StObject.set(x, "sortZIndex", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setTheme(value: LooseObject): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUseDeferredLabel(value: Boolean | Double): Self = StObject.set(x, "useDeferredLabel", value.asInstanceOf[js.Any])
    
    inline def setUseDeferredLabelUndefined: Self = StObject.set(x, "useDeferredLabel", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZIndexReversed(value: Boolean): Self = StObject.set(x, "zIndexReversed", value.asInstanceOf[js.Any])
    
    inline def setZIndexReversedUndefined: Self = StObject.set(x, "zIndexReversed", js.undefined)
  }
}
