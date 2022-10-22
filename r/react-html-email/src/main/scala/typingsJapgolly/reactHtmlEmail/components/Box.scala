package typingsJapgolly.reactHtmlEmail.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactHtmlEmail.mod.BoxProps
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.bottom
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.center
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.left
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.middle
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.right
import typingsJapgolly.reactHtmlEmail.reactHtmlEmailStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  @JSImport("react-html-email", "Box")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def align(value: left | center | right): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def bgcolor(value: String): this.type = set("bgcolor", value.asInstanceOf[js.Any])
    
    inline def border(value: String): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def cellPadding(value: Double): this.type = set("cellPadding", value.asInstanceOf[js.Any])
    
    inline def cellSpacing(value: Double): this.type = set("cellSpacing", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def valign(value: top | middle | bottom): this.type = set("valign", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Box.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BoxProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
