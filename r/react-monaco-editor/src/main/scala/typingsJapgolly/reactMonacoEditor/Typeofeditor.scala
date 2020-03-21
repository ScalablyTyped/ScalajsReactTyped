package typingsJapgolly.reactMonacoEditor

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.monacoEditor.AnonModel
import typingsJapgolly.monacoEditor.AnonOwner
import typingsJapgolly.monacoEditor.mod.IDisposable
import typingsJapgolly.monacoEditor.mod.Token
import typingsJapgolly.monacoEditor.mod.Uri
import typingsJapgolly.monacoEditor.mod.editor.ICodeEditor
import typingsJapgolly.monacoEditor.mod.editor.IColorizerElementOptions
import typingsJapgolly.monacoEditor.mod.editor.IColorizerOptions
import typingsJapgolly.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typingsJapgolly.monacoEditor.mod.editor.IDiffNavigator
import typingsJapgolly.monacoEditor.mod.editor.IDiffNavigatorOptions
import typingsJapgolly.monacoEditor.mod.editor.IEditorConstructionOptions
import typingsJapgolly.monacoEditor.mod.editor.IEditorOverrideServices
import typingsJapgolly.monacoEditor.mod.editor.IMarker
import typingsJapgolly.monacoEditor.mod.editor.IMarkerData
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneCodeEditor
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneDiffEditor
import typingsJapgolly.monacoEditor.mod.editor.IStandaloneThemeData
import typingsJapgolly.monacoEditor.mod.editor.ITextModel
import typingsJapgolly.monacoEditor.mod.editor.IWebWorkerOptions
import typingsJapgolly.monacoEditor.mod.editor.MonacoWebWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofeditor extends js.Object {
  var BareFontInfo: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.BareFontInfo] = js.native
  val EditorType: AnonICodeEditor = js.native
  var FindMatch: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.FindMatch] = js.native
  var FontInfo: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.FontInfo] = js.native
  var InternalEditorOptions: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.InternalEditorOptions] = js.native
  var TextModelResolvedOptions: Instantiable0[typingsJapgolly.monacoEditor.mod.editor.TextModelResolvedOptions] = js.native
  def colorize(text: String, languageId: String, options: IColorizerOptions): js.Promise[String] = js.native
  def colorizeElement(domNode: HTMLElement, options: IColorizerElementOptions): js.Promise[Unit] = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double): String = js.native
  def colorizeModelLine(model: ITextModel, lineNumber: Double, tabSize: Double): String = js.native
  def create(domElement: HTMLElement): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IEditorConstructionOptions): IStandaloneCodeEditor = js.native
  def create(domElement: HTMLElement, options: IEditorConstructionOptions, `override`: IEditorOverrideServices): IStandaloneCodeEditor = js.native
  def createDiffEditor(domElement: HTMLElement): IStandaloneDiffEditor = js.native
  def createDiffEditor(domElement: HTMLElement, options: IDiffEditorConstructionOptions): IStandaloneDiffEditor = js.native
  def createDiffEditor(
    domElement: HTMLElement,
    options: IDiffEditorConstructionOptions,
    `override`: IEditorOverrideServices
  ): IStandaloneDiffEditor = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor): IDiffNavigator = js.native
  def createDiffNavigator(diffEditor: IStandaloneDiffEditor, opts: IDiffNavigatorOptions): IDiffNavigator = js.native
  def createModel(value: String): ITextModel = js.native
  def createModel(value: String, language: String): ITextModel = js.native
  def createModel(value: String, language: String, uri: Uri): ITextModel = js.native
  def createWebWorker[T](opts: IWebWorkerOptions): MonacoWebWorker[T] = js.native
  def defineTheme(themeName: String, themeData: IStandaloneThemeData): Unit = js.native
  def getModel(uri: Uri): ITextModel | Null = js.native
  def getModelMarkers(filter: AnonOwner): js.Array[IMarker] = js.native
  def getModels(): js.Array[ITextModel] = js.native
  def onDidChangeModelLanguage(listener: js.Function1[/* e */ AnonModel, Unit]): IDisposable = js.native
  def onDidCreateEditor(listener: js.Function1[/* codeEditor */ ICodeEditor, Unit]): IDisposable = js.native
  def onDidCreateModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def onWillDisposeModel(listener: js.Function1[/* model */ ITextModel, Unit]): IDisposable = js.native
  def remeasureFonts(): Unit = js.native
  def setModelLanguage(model: ITextModel, languageId: String): Unit = js.native
  def setModelMarkers(model: ITextModel, owner: String, markers: js.Array[IMarkerData]): Unit = js.native
  def setTheme(themeName: String): Unit = js.native
  def tokenize(text: String, languageId: String): js.Array[js.Array[Token]] = js.native
}

