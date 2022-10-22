package typingsJapgolly.next

import org.scalajs.dom.Response
import typingsJapgolly.next.anon.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebSandboxFetchInlineAssetsMod {
  
  @JSImport("next/dist/server/web/sandbox/fetch-inline-assets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchInlineAsset(options: Input): js.Promise[js.UndefOr[Response]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchInlineAsset")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Response]]]
}
