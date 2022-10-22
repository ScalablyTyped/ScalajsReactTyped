package typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod

import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType.Anonymous
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.PublishConfigType.Signing
import typingsJapgolly.libp2pInterfaceKeys.mod.PrivateKey
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.chainsafeLibp2pGossipsub.anon.Author
  - typingsJapgolly.chainsafeLibp2pGossipsub.anon.Type
*/
trait PublishConfig extends StObject
object PublishConfig {
  
  inline def Author(author: PeerId, key: js.typedarray.Uint8Array, privateKey: PrivateKey, `type`: Signing): typingsJapgolly.chainsafeLibp2pGossipsub.anon.Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chainsafeLibp2pGossipsub.anon.Author]
  }
  
  inline def Type(`type`: Anonymous): typingsJapgolly.chainsafeLibp2pGossipsub.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.chainsafeLibp2pGossipsub.anon.Type]
  }
}
