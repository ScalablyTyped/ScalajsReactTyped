package typingsJapgolly.rbacA

import typingsJapgolly.rbacA.anon.Attributes
import typingsJapgolly.rbacA.mod.AttributesManager
import typingsJapgolly.rbacA.mod.Provider
import typingsJapgolly.rbacA.mod.RBAC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRbacMod {
  
  @JSImport("rbac-a/lib/rbac", JSImport.Namespace)
  @js.native
  open class ^[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends RBAC[P, AM] {
    def this(opts: Attributes[P, AM]) = this()
  }
}
