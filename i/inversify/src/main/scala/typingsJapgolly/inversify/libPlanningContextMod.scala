package typingsJapgolly.inversify

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Container
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Plan
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningContextMod {
  
  @JSImport("inversify/lib/planning/context", "Context")
  @js.native
  open class Context protected ()
    extends StObject
       with typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Context {
    def this(container: Container) = this()
    
    /* CompleteClass */
    override def addPlan(plan: Plan): Unit = js.native
    
    /* CompleteClass */
    var container: Container = js.native
    
    /* CompleteClass */
    var currentRequest: Request = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var plan: Plan = js.native
    
    /* CompleteClass */
    override def setCurrentRequest(request: Request): Unit = js.native
  }
}
