package typingsJapgolly.novaEditorNode

import typingsJapgolly.novaEditorNode.anon.AllowDirectories
import typingsJapgolly.novaEditorNode.anon.Buttons
import typingsJapgolly.novaEditorNode.anon.Content
import typingsJapgolly.novaEditorNode.anon.Label
import typingsJapgolly.novaEditorNode.anon.Placeholder
import typingsJapgolly.novaEditorNode.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Workspace extends StObject {
  
  val activeTextEditor: TextEditor = js.native
  
  val config: Configuration = js.native
  
  def contains(path: String): Boolean = js.native
  
  def onDidAddTextEditor(callback: js.Function1[/* editor */ TextEditor, Unit]): Disposable = js.native
  
  def onDidChangePath(callback: js.Function1[/* newPath */ TextEditor, Unit]): Disposable = js.native
  
  def onDidOpenTextDocument(callback: js.Function1[/* textDocument */ TextDocument, Unit]): Disposable = js.native
  
  def openConfig(): Unit = js.native
  def openConfig(identifier: String): Unit = js.native
  
  def openFile(uri: String): js.Promise[TextEditor | Null] = js.native
  def openFile(uri: String, options: FileLocation): js.Promise[TextEditor | Null] = js.native
  
  def openNewTextDocument(): js.Promise[TextEditor | Null] = js.native
  def openNewTextDocument(options: Content & FileLocation): js.Promise[TextEditor | Null] = js.native
  
  val path: String | Null = js.native
  
  def relativizePath(path: String): String = js.native
  
  def reloadTasks(identifier: String): Unit = js.native
  
  def showActionPanel(message: String): Unit = js.native
  def showActionPanel(message: String, options: Unit, callback: js.Function1[/* buttonIndex */ Double | Null, Unit]): Unit = js.native
  def showActionPanel(message: String, options: Buttons): Unit = js.native
  def showActionPanel(message: String, options: Buttons, callback: js.Function1[/* buttonIndex */ Double | Null, Unit]): Unit = js.native
  
  def showChoicePalette(choices: js.Array[String]): Unit = js.native
  def showChoicePalette(
    choices: js.Array[String],
    options: Unit,
    callback: js.Function2[/* choice */ String | Null, /* choiceIndex */ Double | Null, Unit]
  ): Unit = js.native
  def showChoicePalette(choices: js.Array[String], options: `0`): Unit = js.native
  def showChoicePalette(
    choices: js.Array[String],
    options: `0`,
    callback: js.Function2[/* choice */ String | Null, /* choiceIndex */ Double | Null, Unit]
  ): Unit = js.native
  
  def showErrorMessage(message: String): Unit = js.native
  
  def showFileChooser(message: String): Unit = js.native
  def showFileChooser(message: String, options: Unit, callback: js.Function1[/* paths */ js.Array[String] | Null, Unit]): Unit = js.native
  def showFileChooser(message: String, options: AllowDirectories): Unit = js.native
  def showFileChooser(
    message: String,
    options: AllowDirectories,
    callback: js.Function1[/* paths */ js.Array[String] | Null, Unit]
  ): Unit = js.native
  
  def showInformativeMessage(message: String): Unit = js.native
  
  def showInputPalette(message: String): Unit = js.native
  def showInputPalette(message: String, options: Unit, callback: js.Function1[/* value */ String | Null, Unit]): Unit = js.native
  def showInputPalette(message: String, options: Placeholder): Unit = js.native
  def showInputPalette(message: String, options: Placeholder, callback: js.Function1[/* value */ String | Null, Unit]): Unit = js.native
  
  def showInputPanel(message: String): Unit = js.native
  def showInputPanel(message: String, options: Unit, callback: js.Function1[/* value */ String | Null, Unit]): Unit = js.native
  def showInputPanel(message: String, options: Label): Unit = js.native
  def showInputPanel(message: String, options: Label, callback: js.Function1[/* value */ String | Null, Unit]): Unit = js.native
  
  def showWarningMessage(message: String): Unit = js.native
  
  val textDocuments: js.Array[TextDocument] = js.native
  
  val textEditors: js.Array[TextEditor] = js.native
}
