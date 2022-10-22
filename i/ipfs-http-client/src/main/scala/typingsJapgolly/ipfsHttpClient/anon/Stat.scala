package typingsJapgolly.ipfsHttpClient.anon

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsHttpClient.distSrcTypesMod.HTTPClientExtraOptions
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.multiformats.cidMod.CID
import typingsJapgolly.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stat extends StObject {
  
  def stat(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Stats */ Any
  ] = js.native
  def stat(options: AbortOptions & HTTPClientExtraOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_index.Stats */ Any
  ] = js.native
  
  def unwant(cid: js.Array[CID[Any, Double, Double, Version]]): js.Promise[Unit] = js.native
  def unwant(cid: js.Array[CID[Any, Double, Double, Version]], options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
  def unwant(cid: CID[Any, Double, Double, Version]): js.Promise[Unit] = js.native
  def unwant(cid: CID[Any, Double, Double, Version], options: AbortOptions & HTTPClientExtraOptions): js.Promise[Unit] = js.native
  
  def wantlist(): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
  def wantlist(options: AbortOptions & HTTPClientExtraOptions): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
  
  def wantlistForPeer(peerId: PeerId): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
  def wantlistForPeer(peerId: PeerId, options: AbortOptions & HTTPClientExtraOptions): js.Promise[js.Array[CID[Any, Double, Double, Version]]] = js.native
}
