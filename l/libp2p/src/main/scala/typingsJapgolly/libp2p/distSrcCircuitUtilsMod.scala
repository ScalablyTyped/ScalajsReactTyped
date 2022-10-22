package typingsJapgolly.libp2p

import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitUtilsMod {
  
  @JSImport("libp2p/dist/src/circuit/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def namespaceToCid(namespace: String): js.Promise[CID[Any, Double, Double, Version]] = ^.asInstanceOf[js.Dynamic].applyDynamic("namespaceToCid")(namespace.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CID[Any, Double, Double, Version]]]
}
