package typingsJapgolly.powerbiVisualsTools.mod.extensibility

import typingsJapgolly.powerbiVisualsTools.mod.IPromise
import typingsJapgolly.powerbiVisualsTools.mod.visuals.ISelectionId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISelectionManager extends StObject {
  
  def applySelectionFilter(): Unit = js.native
  
  def clear(): IPromise[js.Object] = js.native
  
  def getSelectionIds(): js.Array[ISelectionId] = js.native
  
  def hasSelection(): Boolean = js.native
  
  def registerOnSelectCallback(callback: js.Function1[/* ids */ js.Array[ISelectionId], Unit]): Unit = js.native
  
  def select(selectionId: js.Array[ISelectionId]): IPromise[js.Array[ISelectionId]] = js.native
  def select(selectionId: js.Array[ISelectionId], multiSelect: Boolean): IPromise[js.Array[ISelectionId]] = js.native
  def select(selectionId: ISelectionId): IPromise[js.Array[ISelectionId]] = js.native
  def select(selectionId: ISelectionId, multiSelect: Boolean): IPromise[js.Array[ISelectionId]] = js.native
}
