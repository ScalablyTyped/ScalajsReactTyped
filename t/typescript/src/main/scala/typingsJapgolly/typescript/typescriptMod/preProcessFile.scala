package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "preProcessFile")
@js.native
object preProcessFile extends js.Object {
  def apply(sourceText: String): PreProcessedFileInfo = js.native
  def apply(sourceText: String, readImportFiles: Boolean): PreProcessedFileInfo = js.native
  def apply(sourceText: String, readImportFiles: Boolean, detectJavaScriptImports: Boolean): PreProcessedFileInfo = js.native
}

