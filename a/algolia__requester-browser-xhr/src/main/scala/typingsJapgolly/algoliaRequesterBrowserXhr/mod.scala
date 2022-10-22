package typingsJapgolly.algoliaRequesterBrowserXhr

import typingsJapgolly.algoliaRequesterCommon.mod.Requester
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/requester-browser-xhr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBrowserXhrRequester(): Requester = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserXhrRequester")().asInstanceOf[Requester]
}
