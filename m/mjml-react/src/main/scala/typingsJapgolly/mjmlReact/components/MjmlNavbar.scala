package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.csstype.mod.Property.Color
import typingsJapgolly.mjmlReact.mod.MjmlNavbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlNavbar {
  
  @JSImport("mjml-react", "MjmlNavbar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.mjmlReact.mod.MjmlNavbar] {
    
    inline def align(value: String): this.type = set("align", value.asInstanceOf[js.Any])
    
    inline def baseUrl(value: String): this.type = set("baseUrl", value.asInstanceOf[js.Any])
    
    inline def hamburger(value: typingsJapgolly.mjmlReact.mjmlReactStrings.hamburger): this.type = set("hamburger", value.asInstanceOf[js.Any])
    
    inline def icoAlign(value: String): this.type = set("icoAlign", value.asInstanceOf[js.Any])
    
    inline def icoClose(value: String): this.type = set("icoClose", value.asInstanceOf[js.Any])
    
    inline def icoColor(value: Color): this.type = set("icoColor", value.asInstanceOf[js.Any])
    
    inline def icoFontSize(value: String): this.type = set("icoFontSize", value.asInstanceOf[js.Any])
    
    inline def icoLineHeight(value: String): this.type = set("icoLineHeight", value.asInstanceOf[js.Any])
    
    inline def icoOpen(value: String): this.type = set("icoOpen", value.asInstanceOf[js.Any])
    
    inline def icoPadding(value: String): this.type = set("icoPadding", value.asInstanceOf[js.Any])
    
    inline def icoPaddingBottom(value: String): this.type = set("icoPaddingBottom", value.asInstanceOf[js.Any])
    
    inline def icoPaddingLeft(value: String): this.type = set("icoPaddingLeft", value.asInstanceOf[js.Any])
    
    inline def icoPaddingRight(value: String): this.type = set("icoPaddingRight", value.asInstanceOf[js.Any])
    
    inline def icoPaddingTop(value: String): this.type = set("icoPaddingTop", value.asInstanceOf[js.Any])
    
    inline def icoTextDecoration(value: String): this.type = set("icoTextDecoration", value.asInstanceOf[js.Any])
    
    inline def icoTextTransform(value: String): this.type = set("icoTextTransform", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MjmlNavbar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MjmlNavbarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
