package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Newable
import typingsJapgolly.inversify.interfacesMod.interfaces.Request
import typingsJapgolly.inversify.interfacesMod.interfaces.ResolveRequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/resolution/instantiation", JSImport.Namespace)
@js.native
object instantiationMod extends js.Object {
  def resolveInstance(constr: Newable[_], childRequests: js.Array[Request], resolveRequest: ResolveRequestHandler): js.Any = js.native
}

