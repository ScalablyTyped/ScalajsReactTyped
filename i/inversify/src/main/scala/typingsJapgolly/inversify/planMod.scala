package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Context
import typingsJapgolly.inversify.interfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/plan", JSImport.Namespace)
@js.native
object planMod extends js.Object {
  @js.native
  class Plan protected ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.Plan {
    def this(parentContext: Context, rootRequest: Request) = this()
    /* CompleteClass */
    override var parentContext: Context = js.native
    /* CompleteClass */
    override var rootRequest: Request = js.native
  }
  
}

