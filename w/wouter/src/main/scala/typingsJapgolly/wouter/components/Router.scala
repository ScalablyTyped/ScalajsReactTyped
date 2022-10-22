package typingsJapgolly.wouter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wouter.anon.PartialRouterPropschildre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Router {
  
  @JSImport("wouter", "Router")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def base(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Path */ Any
    ): this.type = set("base", value.asInstanceOf[js.Any])
    
    inline def hook(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BaseLocationHook */ Any
    ): this.type = set("hook", value.asInstanceOf[js.Any])
    
    inline def matcher(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MatcherFn */ Any
    ): this.type = set("matcher", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Router.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialRouterPropschildre): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
