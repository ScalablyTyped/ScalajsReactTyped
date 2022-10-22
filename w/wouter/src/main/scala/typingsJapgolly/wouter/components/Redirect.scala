package typingsJapgolly.wouter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.wouter.mod.RedirectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.react.mod.PropsWithChildren[typingsJapgolly.wouter.mod.RedirectProps[H]] because: IArray(Couldn't find props for typingsJapgolly.wouter.anon.Href & (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HookNavigationOptions<H> * / scala.Any) because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HookNavigationOptions<H> * / scala.Any because couldn't resolve ClassTree.), Couldn't find props for typingsJapgolly.wouter.anon.To & (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HookNavigationOptions<H> * / scala.Any) because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HookNavigationOptions<H> * / scala.Any because couldn't resolve ClassTree.)) */
object Redirect {
  
  def apply[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */](p: PropsWithChildren[RedirectProps[H]]): Builder[H] = new Builder[H](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("wouter", "Redirect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[H /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any */](companion: Redirect.type): Builder[H] = new Builder[H](js.Array(this.component, js.Dictionary.empty))()
}
