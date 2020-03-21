package typingsJapgolly.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "OutputFile")
@js.native
class OutputFile protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.OutputFile {
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typingsJapgolly.typescriptServices.TypeScript.OutputFileType
  ) = this()
  def this(
    name: String,
    writeByteOrderMark: Boolean,
    text: String,
    fileType: typingsJapgolly.typescriptServices.TypeScript.OutputFileType,
    sourceMapEntries: js.Array[typingsJapgolly.typescriptServices.TypeScript.SourceMapEntry]
  ) = this()
}

