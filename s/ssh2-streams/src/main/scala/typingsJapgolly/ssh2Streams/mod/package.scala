package typingsJapgolly.ssh2Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.ssh2Streams.mod.PublicKeyAuthMethodData
    - typingsJapgolly.ssh2Streams.mod.HostbasedAuthMethodData
  */
  type AuthMethodData = typingsJapgolly.ssh2Streams.mod._AuthMethodData | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ssh2Streams.mod.TcpipForwardGlobalRequest
    - typingsJapgolly.ssh2Streams.mod.opensshStreamLocalForwardGlobalRequest
    - typingsJapgolly.node.Buffer
  */
  type GlobalRequest = typingsJapgolly.ssh2Streams.mod._GlobalRequest | typingsJapgolly.node.Buffer
  type HostKeys = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.ssh2Streams.mod.HostKey]
}
