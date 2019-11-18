package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpsMod {
  import typingsJapgolly.node.Anon_RejectUnauthorized
  import typingsJapgolly.node.tlsMod.SecureContextOptions
  import typingsJapgolly.node.tlsMod.TlsOptions

  type RequestOptions = typingsJapgolly.node.httpMod.RequestOptions with SecureContextOptions with Anon_RejectUnauthorized
  type ServerOptions = SecureContextOptions with TlsOptions with typingsJapgolly.node.httpMod.ServerOptions
}
