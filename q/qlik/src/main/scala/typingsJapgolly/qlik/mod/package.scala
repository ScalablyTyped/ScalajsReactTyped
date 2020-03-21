package typingsJapgolly.qlik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomPropertyOptions = js.Array[typingsJapgolly.qlik.mod.CustomPropertyOption] | js.Function0[js.Array[typingsJapgolly.qlik.mod.CustomPropertyOption]]
  type Global = js.Any
  type NxCellRows = js.Array[typingsJapgolly.qlik.mod.NxCell]
  type NxMeasureInfo = typingsJapgolly.qlik.mod.ColumnInfo
  type Paint = js.ThisFunction10[
    /* this */ typingsJapgolly.qlik.mod.ExtensionContext, 
    /* $element */ js.UndefOr[typingsJapgolly.jquery.JQuery_[org.scalajs.dom.raw.HTMLElement]], 
    /* layout */ js.UndefOr[typingsJapgolly.qlik.mod.Layout], 
    /* qDimensionInfo */ js.UndefOr[typingsJapgolly.qlik.mod.NxDimensionInfo], 
    /* qMeasureInfo */ js.UndefOr[typingsJapgolly.qlik.mod.NxDimensionInfo], 
    /* qMatrix */ js.UndefOr[js.Array[typingsJapgolly.qlik.mod.NxCellRows]], 
    /* dimensions */ js.UndefOr[js.Array[typingsJapgolly.qlik.mod.NxCell]], 
    /* measures */ js.UndefOr[js.Array[typingsJapgolly.qlik.mod.NxCell]], 
    /* qSize */ js.UndefOr[typingsJapgolly.qlik.mod.Size], 
    /* qId */ js.UndefOr[java.lang.String], 
    /* qSelectionInfo */ js.UndefOr[typingsJapgolly.qlik.mod.Selectionobject], 
    scala.Unit
  ]
  type ShowFunction = js.Function3[
    /* layout */ typingsJapgolly.qlik.mod.Layout, 
    /* cls */ js.Any, 
    /* obj */ js.Any, 
    scala.Boolean | (js.Function1[/* measure */ typingsJapgolly.qlik.mod.NxMeasure, scala.Boolean])
  ]
  type SupportFunction = js.Function1[/* layout */ typingsJapgolly.qlik.mod.Layout, scala.Boolean]
  type SupportItem = scala.Boolean | typingsJapgolly.qlik.mod.SupportFunction
  type VisualizationOptions = typingsJapgolly.qlik.mod.VisualizationCommon
}
