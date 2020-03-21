package typingsJapgolly.mobxReact

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.mobxReact.disposeOnUnmountMod.Disposer
import typingsJapgolly.mobxReact.ireactcomponentMod.IReactComponent
import typingsJapgolly.mobxReact.istorestopropsMod.IStoresToProps
import typingsJapgolly.mobxReact.iwrappedcomponentMod.IWrappedComponent
import typingsJapgolly.mobxReact.providerMod.ProviderProps
import typingsJapgolly.mobxReactLite.useObserverMod.IUseObserverOptions
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Requireable
import typingsJapgolly.react.mod.Validator
import typingsJapgolly.std.PropertyKey
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val MobXProviderContext: Context[Record[String, js.Any]] = js.native
  def disposeOnUnmount(target: Component[js.Object, js.Object], propertyKey: PropertyKey): Unit = js.native
  def disposeOnUnmount[TF /* <: Disposer | js.Array[Disposer] */](target: Component[js.Object, js.Object], fn: TF): TF = js.native
  def inject(stores: String*): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[_]] = js.native
  def inject[S, P, I, C](fn: IStoresToProps[S, P, I, C]): js.Function1[/* target */ IReactComponent[_], IReactComponent[_] with IWrappedComponent[P]] = js.native
  def isUsingStaticRendering(): Boolean = js.native
  def observer[T /* <: IReactComponent[_] */](component: T): T = js.native
  def useAsObservableSource[TSource](current: TSource): TSource = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore]): TStore = js.native
  def useLocalStore[TStore /* <: Record[String, _] */, TSource /* <: js.Object */](initializer: js.Function1[/* source */ TSource, TStore], current: TSource): TStore = js.native
  def useObserver[T](fn: js.Function0[T]): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String): T = js.native
  def useObserver[T](fn: js.Function0[T], baseComponentName: String, options: IUseObserverOptions): T = js.native
  def useStaticRendering(enable: Boolean): Unit = js.native
  @js.native
  object PropTypes extends js.Object {
    var arrayOrObservableArray: Requireable[_] = js.native
    var objectOrObservableObject: Requireable[_] = js.native
    var observableArray: Requireable[_] = js.native
    var observableMap: Requireable[_] = js.native
    var observableObject: Requireable[_] = js.native
    def arrayOrObservableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
    def observableArrayOf(typeChecker: Validator[_]): Requireable[_] = js.native
  }
  
  @js.native
  object Provider extends js.Object {
    var displayName: String = js.native
    def apply(props: ProviderProps): Element = js.native
  }
  
}

