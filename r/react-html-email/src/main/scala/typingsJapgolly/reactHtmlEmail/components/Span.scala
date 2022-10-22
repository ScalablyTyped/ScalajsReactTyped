package typingsJapgolly.reactHtmlEmail.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactHtmlEmail.mod.SpanProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Span {
  
  @JSImport("react-html-email", "Span")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def fontFamily(value: String): this.type = set("fontFamily", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def fontWeight(value: String): this.type = set("fontWeight", value.asInstanceOf[js.Any])
    
    inline def lineHeight(value: Double): this.type = set("lineHeight", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Span.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SpanProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
