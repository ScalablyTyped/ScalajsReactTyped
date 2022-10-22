package typingsJapgolly.idyllDocument.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.idyllCompiler.mod.AST
import typingsJapgolly.idyllCompiler.mod.Node
import typingsJapgolly.idyllCompiler.mod.Options
import typingsJapgolly.idyllDocument.mod.IdyllDocumentProps
import typingsJapgolly.idyllDocument.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IdyllDocument {
  
  inline def apply(components: Any): Builder = {
    val __props = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IdyllDocumentProps]))
  }
  
  @JSImport("idyll-document", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def ast(value: AST): this.type = set("ast", value.asInstanceOf[js.Any])
    
    inline def astVarargs(value: Node*): this.type = set("ast", js.Array(value*))
    
    inline def compilerOptions(value: Options): this.type = set("compilerOptions", value.asInstanceOf[js.Any])
    
    inline def context(value: /* context */ Any => Callback): this.type = set("context", js.Any.fromFunction1((t0: /* context */ Any) => value(t0).runNow()))
    
    inline def datasets(value: js.Object): this.type = set("datasets", value.asInstanceOf[js.Any])
    
    inline def errorComponent(value: ElementType): this.type = set("errorComponent", value.asInstanceOf[js.Any])
    
    inline def initialState(value: Any): this.type = set("initialState", value.asInstanceOf[js.Any])
    
    inline def layout(value: String): this.type = set("layout", value.asInstanceOf[js.Any])
    
    inline def markup(value: String): this.type = set("markup", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* err */ js.Error => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
    
    inline def theme(value: String): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IdyllDocumentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
