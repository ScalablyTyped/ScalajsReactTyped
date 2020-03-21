package typingsJapgolly.rbacA.rbacMod

import typingsJapgolly.rbacA.AnonAttributes
import typingsJapgolly.rbacA.mod.AttributesManager
import typingsJapgolly.rbacA.mod.Provider
import typingsJapgolly.rbacA.mod.RBAC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbac-a/lib/rbac", JSImport.Namespace)
@js.native
class ^[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends RBAC[P, AM] {
  def this(opts: AnonAttributes[P, AM]) = this()
}

