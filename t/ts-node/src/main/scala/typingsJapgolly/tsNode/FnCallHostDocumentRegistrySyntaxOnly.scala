package typingsJapgolly.tsNode

import typingsJapgolly.typescript.mod.DocumentRegistry
import typingsJapgolly.typescript.mod.LanguageService
import typingsJapgolly.typescript.mod.LanguageServiceHost
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallHostDocumentRegistrySyntaxOnly extends js.Object {
  def apply(host: LanguageServiceHost): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry, syntaxOnly: Boolean): LanguageService = js.native
}

