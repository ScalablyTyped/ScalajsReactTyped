package typingsJapgolly.inversify

import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Binding
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Context
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningRequestMod {
  
  @JSImport("inversify/lib/planning/request", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Request {
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: Null,
      bindings: js.Array[Binding[Any]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: Null,
      bindings: Binding[Any],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Request,
      bindings: js.Array[Binding[Any]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[Any],
      parentContext: Context,
      parentRequest: typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Request,
      bindings: Binding[Any],
      target: Target
    ) = this()
  }
}
