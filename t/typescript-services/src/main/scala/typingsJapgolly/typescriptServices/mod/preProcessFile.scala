package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IPreProcessedFileInfo
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "preProcessFile")
@js.native
object preProcessFile extends js.Object {
  def apply(fileName: String, sourceText: IScriptSnapshot): IPreProcessedFileInfo = js.native
  def apply(fileName: String, sourceText: IScriptSnapshot, readImportFiles: Boolean): IPreProcessedFileInfo = js.native
}

