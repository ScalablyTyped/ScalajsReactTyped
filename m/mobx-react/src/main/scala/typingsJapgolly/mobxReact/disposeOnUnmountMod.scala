package typingsJapgolly.mobxReact

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react/dist/disposeOnUnmount", JSImport.Namespace)
@js.native
object disposeOnUnmountMod extends js.Object {
  def disposeOnUnmount(target: Component[js.Object, js.Object], propertyKey: PropertyKey): Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: Component[js.Object, js.Object], fn: TF): TF = js.native
  type Disposer = js.Function0[Unit]
}

