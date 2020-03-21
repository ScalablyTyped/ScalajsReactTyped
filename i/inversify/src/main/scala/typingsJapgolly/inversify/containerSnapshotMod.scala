package typingsJapgolly.inversify

import typingsJapgolly.inversify.interfacesMod.interfaces.Binding
import typingsJapgolly.inversify.interfacesMod.interfaces.Lookup
import typingsJapgolly.inversify.interfacesMod.interfaces.Next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/container/container_snapshot", JSImport.Namespace)
@js.native
object containerSnapshotMod extends js.Object {
  @js.native
  class ContainerSnapshot ()
    extends typingsJapgolly.inversify.interfacesMod.interfaces.ContainerSnapshot {
    /* CompleteClass */
    override var bindings: Lookup[Binding[_]] = js.native
    /* CompleteClass */
    override var middleware: Next | Null = js.native
  }
  
  /* static members */
  @js.native
  object ContainerSnapshot extends js.Object {
    def of(bindings: Lookup[Binding[_]]): ContainerSnapshot = js.native
    def of(bindings: Lookup[Binding[_]], middleware: Next): ContainerSnapshot = js.native
  }
  
}

