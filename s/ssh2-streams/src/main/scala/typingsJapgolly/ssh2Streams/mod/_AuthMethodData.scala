package typingsJapgolly.ssh2Streams.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _AuthMethodData extends StObject
object _AuthMethodData {
  
  inline def HostbasedAuthMethodData(key: Buffer, keyAlgo: String, localHostname: String, localUsername: String): typingsJapgolly.ssh2Streams.mod.HostbasedAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any], localHostname = localHostname.asInstanceOf[js.Any], localUsername = localUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.HostbasedAuthMethodData]
  }
  
  inline def PublicKeyAuthMethodData(key: Buffer, keyAlgo: String): typingsJapgolly.ssh2Streams.mod.PublicKeyAuthMethodData = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyAlgo = keyAlgo.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.ssh2Streams.mod.PublicKeyAuthMethodData]
  }
}
