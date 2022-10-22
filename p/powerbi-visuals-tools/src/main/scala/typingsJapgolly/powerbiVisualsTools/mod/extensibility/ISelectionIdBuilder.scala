package typingsJapgolly.powerbiVisualsTools.mod.extensibility

import typingsJapgolly.powerbiVisualsTools.mod.DataViewCategoryColumn
import typingsJapgolly.powerbiVisualsTools.mod.DataViewValueColumn
import typingsJapgolly.powerbiVisualsTools.mod.DataViewValueColumnGroup
import typingsJapgolly.powerbiVisualsTools.mod.DataViewValueColumns
import typingsJapgolly.powerbiVisualsTools.mod.visuals.ISelectionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectionIdBuilder extends StObject {
  
  def createSelectionId(): ISelectionId = js.native
  
  def withCategory(categoryColumn: DataViewCategoryColumn, index: Double): this.type = js.native
  
  def withMeasure(measureId: String): this.type = js.native
  
  def withSeries(seriesColumn: DataViewValueColumns, valueColumn: DataViewValueColumn): this.type = js.native
  def withSeries(seriesColumn: DataViewValueColumns, valueColumn: DataViewValueColumnGroup): this.type = js.native
}
