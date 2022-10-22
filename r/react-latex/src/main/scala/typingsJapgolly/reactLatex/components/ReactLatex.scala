package typingsJapgolly.reactLatex.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLatex.mod.LatexProps
import typingsJapgolly.reactLatex.mod.^
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactLatex {
  
  @JSImport("react-latex", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def colorIsTextColor(value: Boolean): this.type = set("colorIsTextColor", value.asInstanceOf[js.Any])
    
    inline def displayMode(value: Boolean): this.type = set("displayMode", value.asInstanceOf[js.Any])
    
    inline def errorColor(value: String): this.type = set("errorColor", value.asInstanceOf[js.Any])
    
    inline def fleqn(value: Boolean): this.type = set("fleqn", value.asInstanceOf[js.Any])
    
    inline def leqno(value: Boolean): this.type = set("leqno", value.asInstanceOf[js.Any])
    
    inline def macros(value: Record[Any, Any]): this.type = set("macros", value.asInstanceOf[js.Any])
    
    inline def maxExpand(value: Double): this.type = set("maxExpand", value.asInstanceOf[js.Any])
    
    inline def maxSize(value: Double): this.type = set("maxSize", value.asInstanceOf[js.Any])
    
    inline def minRuleThickness(value: Double): this.type = set("minRuleThickness", value.asInstanceOf[js.Any])
    
    inline def strict(value: Boolean | String | (js.Function1[/* repeated */ Any, Any])): this.type = set("strict", value.asInstanceOf[js.Any])
    
    inline def strictFunction1(value: /* repeated */ Any => Any): this.type = set("strict", js.Any.fromFunction1(value))
    
    inline def throwOnError(value: Boolean): this.type = set("throwOnError", value.asInstanceOf[js.Any])
    
    inline def trust(value: Boolean | (js.Function1[/* repeated */ Any, Any])): this.type = set("trust", value.asInstanceOf[js.Any])
    
    inline def trustFunction1(value: /* repeated */ Any => Any): this.type = set("trust", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: ReactLatex.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LatexProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
