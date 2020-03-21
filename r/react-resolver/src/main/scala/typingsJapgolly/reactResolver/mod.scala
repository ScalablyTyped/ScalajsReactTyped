package typingsJapgolly.reactResolver

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Factory
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-resolver", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait Resolver extends js.Object {
    def render(factory: Factory[_]): Unit = js.native
    def render(factory: Factory[_], root: Node): Unit = js.native
    def resolve[P](factory: Factory[P]): js.Promise[AnonData[P]] = js.native
  }
  
  def client(loadingComponent: ComponentType[_]): js.Function1[/* component */ ComponentType[_], StatelessComponent[_]] = js.native
  def context[K /* <: String */](prop: K): js.Function1[/* component */ ComponentType[_], StatelessComponent[js.Any with (Record[K, _])]] = js.native
  def resolve[OwnProps, ResolvableProps, MoreProps](
    resolversMap: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof ResolvableProps ]: react-resolver.react-resolver.ResolveFn<OwnProps & MoreProps, ResolvableProps[K]>}
    */ typingsJapgolly.reactResolver.reactResolverStrings.resolve with ResolvableProps
  ): js.Function1[
    /* component */ ComponentType[
      OwnProps with typingsJapgolly.reactResolver.reactResolverStrings.resolve with ResolvableProps
    ], 
    StatelessComponent[OwnProps with MoreProps]
  ] = js.native
  def resolve[OwnProps, K /* <: String */, V, MoreProps](prop: K, resolveFn: ResolveFn[OwnProps with MoreProps, V]): js.Function1[
    /* component */ ComponentType[
      OwnProps with typingsJapgolly.reactResolver.reactResolverStrings.resolve with js.Any
    ], 
    StatelessComponent[OwnProps with MoreProps]
  ] = js.native
  @js.native
  object Resolver extends TopLevel[Resolver]
  
  type ResolveFn[Props, V] = js.Function1[/* props */ Props, js.Promise[V]]
}

