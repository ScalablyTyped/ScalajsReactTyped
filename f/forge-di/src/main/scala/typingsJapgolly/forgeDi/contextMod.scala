package typingsJapgolly.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/framework/Context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    var bindings: js.Array[typingsJapgolly.forgeDi.bindingMod.default] = js.native
    def has(binding: typingsJapgolly.forgeDi.bindingMod.default): Boolean = js.native
    def pop(): typingsJapgolly.forgeDi.bindingMod.default = js.native
    def push(binding: typingsJapgolly.forgeDi.bindingMod.default): Double = js.native
    def toString(indent: Double): String = js.native
  }
  
  @js.native
  class default () extends Context
  
}

