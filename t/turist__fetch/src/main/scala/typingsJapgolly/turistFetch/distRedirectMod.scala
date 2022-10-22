package typingsJapgolly.turistFetch

import typingsJapgolly.nodeFetch.mod.Response
import typingsJapgolly.turistFetch.distAgentWrapperMod.default
import typingsJapgolly.turistFetch.distTypesMod.FetchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRedirectMod {
  
  @JSImport("@turist/fetch/dist/redirect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRedirect(v: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(v.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeRedirectOpts(res: Response, opts: FetchOptions, agentWrapper: default): js.Tuple2[String, FetchOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRedirectOpts")(res.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], agentWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, FetchOptions]]
}
