package typingsJapgolly.tsNode.anon

import typingsJapgolly.typescript.mod.DocumentRegistry
import typingsJapgolly.typescript.mod.LanguageService
import typingsJapgolly.typescript.mod.LanguageServiceHost
import typingsJapgolly.typescript.mod.LanguageServiceMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallHostDocumentRegistrySyntaxOnlyOrLanguageServiceMode extends StObject {
  
  def apply(host: LanguageServiceHost): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: Unit, syntaxOnlyOrLanguageServiceMode: Boolean): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: Unit,
    syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
  ): LanguageService = js.native
  def apply(host: LanguageServiceHost, documentRegistry: DocumentRegistry): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: DocumentRegistry,
    syntaxOnlyOrLanguageServiceMode: Boolean
  ): LanguageService = js.native
  def apply(
    host: LanguageServiceHost,
    documentRegistry: DocumentRegistry,
    syntaxOnlyOrLanguageServiceMode: LanguageServiceMode
  ): LanguageService = js.native
}
