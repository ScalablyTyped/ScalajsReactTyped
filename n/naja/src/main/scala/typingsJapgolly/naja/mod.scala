package typingsJapgolly.naja

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Response
import typingsJapgolly.naja.anon.Instantiable
import typingsJapgolly.naja.anon.InstantiableFormsHandler
import typingsJapgolly.naja.anon.InstantiableHistoryHandler
import typingsJapgolly.naja.anon.InstantiableRedirectHandler
import typingsJapgolly.naja.anon.InstantiableScriptLoader
import typingsJapgolly.naja.anon.InstantiableSnippetCache
import typingsJapgolly.naja.anon.InstantiableSnippetHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("naja", JSImport.Default)
  @js.native
  val default: typingsJapgolly.naja.distNajaMod.Naja = js.native
  
  @JSImport("naja", "HttpError")
  @js.native
  open class HttpError protected ()
    extends typingsJapgolly.naja.distNajaMod.HttpError {
    def this(response: Response) = this()
  }
  
  @JSImport("naja", "Naja")
  @js.native
  open class Naja protected ()
    extends typingsJapgolly.naja.distNajaMod.Naja {
    def this(
      uiHandler: js.UndefOr[Instantiable],
      redirectHandler: js.UndefOr[InstantiableRedirectHandler],
      snippetHandler: js.UndefOr[InstantiableSnippetHandler],
      formsHandler: js.UndefOr[InstantiableFormsHandler],
      historyHandler: js.UndefOr[InstantiableHistoryHandler],
      snippetCache: js.UndefOr[InstantiableSnippetCache],
      scriptLoader: js.UndefOr[InstantiableScriptLoader]
    ) = this()
  }
  
  type _To = typingsJapgolly.naja.distNajaMod.Naja
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: typingsJapgolly.naja.distNajaMod.Naja = default
}
