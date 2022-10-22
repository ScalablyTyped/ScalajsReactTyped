package typingsJapgolly.ipfsCoreUtils

import org.scalajs.dom.URL
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcToUrlStringMod {
  
  @JSImport("ipfs-core-utils/dist/src/to-url-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toUrlString(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUrlString")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toUrlString(url: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUrlString")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toUrlString(url: Multiaddr): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUrlString")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Multiaddr = Multiaddr_
}
