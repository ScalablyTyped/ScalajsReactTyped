package typingsJapgolly.mobxReact

import typingsJapgolly.mobxReact.ireactcomponentMod.IReactComponent
import typingsJapgolly.mobxReact.istorestopropsMod.IStoresToProps
import typingsJapgolly.mobxReact.iwrappedcomponentMod.IWrappedComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react/dist/inject", JSImport.Namespace)
@js.native
object injectMod extends js.Object {
  def inject(stores: String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
}

