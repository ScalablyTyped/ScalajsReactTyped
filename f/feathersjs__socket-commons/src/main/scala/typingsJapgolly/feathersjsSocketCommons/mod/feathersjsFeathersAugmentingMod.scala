package typingsJapgolly.feathersjsSocketCommons.mod

import typingsJapgolly.feathersjsFeathers.mod.HookContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@feathersjs/feathers", JSImport.Namespace)
@js.native
object feathersjsFeathersAugmentingMod extends js.Object {
  @js.native
  trait Application[ServiceTypes] extends js.Object {
    var channels: js.Array[String] = js.native
    def channel(name: js.Array[String]): Channel = js.native
    def channel(names: String*): Channel = js.native
    // tslint:disable-next-line void-return
    def publish[T](
      callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
    ): Application[ServiceTypes] = js.native
    // tslint:disable-next-line void-return
    def publish[T](
      event: String,
      callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
    ): Application[ServiceTypes] = js.native
  }
  
  @js.native
  trait ServiceAddons[T] extends js.Object {
    def publish(
      callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
    ): this.type = js.native
    def publish(
      event: String,
      callback: js.Function2[/* data */ T, /* hook */ HookContext[T], Channel | js.Array[Channel] | Unit]
    ): this.type = js.native
  }
  
}

