package typingsJapgolly.libp2pUtils

import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMultiaddrIsLoopbackMod {
  
  @JSImport("@libp2p/utils/dist/src/multiaddr/is-loopback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLoopback(ma: Multiaddr_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLoopback")(ma.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
