package typingsJapgolly.gulpTypescript.inputMod

import typingsJapgolly.gulpTypescript.typesMod.VinylFile
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var content: String
  var fileNameNormalized: String
  var fileNameOriginal: String
  var gulp: js.UndefOr[VinylFile] = js.undefined
  var kind: FileKind
  var ts: js.UndefOr[SourceFile] = js.undefined
}

@JSImport("gulp-typescript/release/input", "File")
@js.native
object File extends js.Object {
  def equal(a: File, b: File): Boolean = js.native
  def fromContent(fileName: String, content: String): File = js.native
  def fromGulp(file: VinylFile): File = js.native
  def getChangeState(previous: File, current: File): FileChangeState = js.native
}

