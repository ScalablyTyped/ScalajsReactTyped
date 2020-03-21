package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.IdentiferNameHashTable
import typingsJapgolly.typescriptServices.TypeScript.Services.CachedCompletionEntryDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionSession")
@js.native
class CompletionSession protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.CompletionSession {
  def this(fileName: String, position: Double, entries: IdentiferNameHashTable[CachedCompletionEntryDetails]) = this()
}

