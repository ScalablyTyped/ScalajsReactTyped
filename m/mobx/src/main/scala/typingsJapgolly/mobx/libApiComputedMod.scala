package typingsJapgolly.mobx

import typingsJapgolly.mobx.libApiComputedMod.IComputed
import typingsJapgolly.mobx.libCoreComputedvalueMod.IComputedValue
import typingsJapgolly.mobx.libCoreComputedvalueMod.IComputedValueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/computed", JSImport.Namespace)
@js.native
object libApiComputedMod extends js.Object {
  @js.native
  trait IComputed extends js.Object {
    def apply(target: js.Object, key: String): Unit = js.native
    def apply(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): Unit = js.native
    def apply(target: js.Object, key: js.Symbol): Unit = js.native
    def apply(target: js.Object, key: js.Symbol, baseDescriptor: js.PropertyDescriptor): Unit = js.native
    def apply[T](func: js.Function0[T]): IComputedValue[T] = js.native
    def apply[T](func: js.Function0[T], options: IComputedValueOptions[T]): IComputedValue[T] = js.native
    def apply[T](func: js.Function0[T], setter: js.Function1[/* v */ T, Unit]): IComputedValue[T] = js.native
    def apply[T](options: IComputedValueOptions[T]): js.Any = js.native
    def struct(target: js.Object, key: String): Unit = js.native
    def struct(target: js.Object, key: String, baseDescriptor: js.PropertyDescriptor): Unit = js.native
    def struct(target: js.Object, key: js.Symbol): Unit = js.native
    def struct(target: js.Object, key: js.Symbol, baseDescriptor: js.PropertyDescriptor): Unit = js.native
  }
  
  val computed: IComputed = js.native
  val computedDecorator: js.Function = js.native
}

