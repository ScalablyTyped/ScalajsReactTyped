package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Container
import typingsJapgolly.inversify.interfacesMod.interfaces.Plan
import typingsJapgolly.inversify.interfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  @js.native
  class Context protected ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.Context {
    def this(container: Container) = this()
    /* CompleteClass */
    override var container: Container = js.native
    /* CompleteClass */
    override var currentRequest: Request = js.native
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var plan: Plan = js.native
    /* CompleteClass */
    override def addPlan(plan: Plan): Unit = js.native
    /* CompleteClass */
    override def setCurrentRequest(request: Request): Unit = js.native
  }
  
}

