package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.Services.ILanguageService
import typingsJapgolly.typescriptServices.TypeScript.Services.ILanguageServiceShimHost
import typingsJapgolly.typescriptServices.TypeScript.Services.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.LanguageServiceShim")
@js.native
class LanguageServiceShim protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.Services.LanguageServiceShim {
  def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
}

/* static members */
@JSImport("typescript-services", "Services.LanguageServiceShim")
@js.native
object LanguageServiceShim extends js.Object {
  /* private */ def realizeDiagnostic(diagnostic: js.Any): js.Any = js.native
  /* private */ def realizeDiagnosticCategory(category: js.Any): js.Any = js.native
}

