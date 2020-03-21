package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Binding
import typingsJapgolly.inversify.interfacesMod.interfaces.Context
import typingsJapgolly.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsJapgolly.inversify.interfacesMod.interfaces.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/request", JSImport.Namespace)
@js.native
object requestMod extends js.Object {
  @js.native
  class Request protected ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.Request {
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: Null,
      bindings: js.Array[Binding[_]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: Null,
      bindings: Binding[_],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: typingsJapgolly.inversify.interfacesMod.interfaces.Request,
      bindings: js.Array[Binding[_]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: typingsJapgolly.inversify.interfacesMod.interfaces.Request,
      bindings: Binding[_],
      target: Target
    ) = this()
  }
  
}

