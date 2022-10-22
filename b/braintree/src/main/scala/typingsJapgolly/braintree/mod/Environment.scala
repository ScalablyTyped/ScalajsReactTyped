package typingsJapgolly.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Environment extends StObject
@JSImport("braintree", "Environment")
@js.native
object Environment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Environment & String] = js.native
  
  @js.native
  sealed trait Development
    extends StObject
       with Environment
  /* "Development" */ val Development: typingsJapgolly.braintree.mod.Environment.Development & String = js.native
  
  @js.native
  sealed trait Production
    extends StObject
       with Environment
  /* "Production" */ val Production: typingsJapgolly.braintree.mod.Environment.Production & String = js.native
  
  @js.native
  sealed trait Qa
    extends StObject
       with Environment
  /* "Qa" */ val Qa: typingsJapgolly.braintree.mod.Environment.Qa & String = js.native
  
  @js.native
  sealed trait Sandbox
    extends StObject
       with Environment
  /* "Sandbox" */ val Sandbox: typingsJapgolly.braintree.mod.Environment.Sandbox & String = js.native
}
