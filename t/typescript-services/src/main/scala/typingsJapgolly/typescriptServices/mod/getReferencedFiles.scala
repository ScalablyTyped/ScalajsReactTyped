package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.IFileReference
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "getReferencedFiles")
@js.native
object getReferencedFiles extends js.Object {
  def apply(fileName: String, sourceText: IScriptSnapshot): js.Array[IFileReference] = js.native
}

