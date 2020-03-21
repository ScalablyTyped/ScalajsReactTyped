package typingsJapgolly.mobx

import typingsJapgolly.mobx.modifiersMod.IEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/api/observabledecorator", JSImport.Namespace)
@js.native
object observabledecoratorMod extends js.Object {
  @js.native
  trait IObservableDecorator extends js.Object {
    @JSName("enhancer")
    var enhancer_Original: IEnhancer[_] = js.native
    def apply(target: js.Object, property: String): Unit = js.native
    def apply(target: js.Object, property: String, descriptor: js.PropertyDescriptor): Unit = js.native
    def apply(target: js.Object, property: js.Symbol): Unit = js.native
    def apply(target: js.Object, property: js.Symbol, descriptor: js.PropertyDescriptor): Unit = js.native
    def enhancer(newValue: js.Any, oldValue: js.UndefOr[scala.Nothing], name: String): js.Any = js.native
    def enhancer(newValue: js.Any, oldValue: js.Any, name: String): js.Any = js.native
  }
  
  def createDecoratorForEnhancer(enhancer: IEnhancer[_]): IObservableDecorator = js.native
}

