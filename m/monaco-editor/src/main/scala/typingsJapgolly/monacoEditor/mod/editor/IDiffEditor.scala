package typingsJapgolly.monacoEditor.mod.editor

import org.scalajs.dom.HTMLElement
import typingsJapgolly.monacoEditor.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDiffEditor
  extends StObject
     with IEditor {
  
  /**
    * @see {@link ICodeEditor.getContainerDomNode}
    */
  def getContainerDomNode(): HTMLElement = js.native
  
  /**
    * Get information based on computed diff about a line number from the modified model.
    * If the diff computation is not finished or the model is missing, will return null.
    */
  def getDiffLineInformationForModified(lineNumber: Double): IDiffLineInformation | Null = js.native
  
  /**
    * Get information based on computed diff about a line number from the original model.
    * If the diff computation is not finished or the model is missing, will return null.
    */
  def getDiffLineInformationForOriginal(lineNumber: Double): IDiffLineInformation | Null = js.native
  
  /**
    * Get the computed diff information.
    */
  def getLineChanges(): js.Array[ILineChange] | Null = js.native
  
  /**
    * Get the `modified` editor.
    */
  def getModifiedEditor(): ICodeEditor = js.native
  
  /**
    * Get the `original` editor.
    */
  def getOriginalEditor(): ICodeEditor = js.native
  
  /**
    * An event emitted when the diff information computed by this diff editor has been updated.
    * @event
    */
  def onDidUpdateDiff(listener: js.Function1[/* e */ Unit, Any]): IDisposable = js.native
  def onDidUpdateDiff(listener: js.Function1[/* e */ Unit, Any], thisArg: Any): IDisposable = js.native
  
  def restoreViewState(state: IDiffEditorViewState): Unit = js.native
  
  def setModel(model: IDiffEditorModel): Unit = js.native
  
  /**
    * Update the editor's options after the editor has been created.
    */
  def updateOptions(newOptions: IDiffEditorOptions): Unit = js.native
}
