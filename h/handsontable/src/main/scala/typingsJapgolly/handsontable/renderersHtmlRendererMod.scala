package typingsJapgolly.handsontable

import org.scalajs.dom.HTMLTableCellElement
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.handsontableStrings.html
import typingsJapgolly.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderersHtmlRendererMod {
  
  @JSImport("handsontable/renderers/htmlRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/renderers/htmlRenderer", "RENDERER_TYPE")
  @js.native
  val RENDERER_TYPE: html = js.native
  
  inline def htmlRenderer(
    instance: default,
    TD: HTMLTableCellElement,
    row: Double,
    col: Double,
    prop: String,
    value: Any,
    cellProperties: CellProperties
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlRenderer")(instance.asInstanceOf[js.Any], TD.asInstanceOf[js.Any], row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cellProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def htmlRenderer(
    instance: default,
    TD: HTMLTableCellElement,
    row: Double,
    col: Double,
    prop: Double,
    value: Any,
    cellProperties: CellProperties
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlRenderer")(instance.asInstanceOf[js.Any], TD.asInstanceOf[js.Any], row.asInstanceOf[js.Any], col.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any], cellProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
