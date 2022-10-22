package typingsJapgolly.fundamentalReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.libMessageStripMessageStripMod.MessageStripProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageStrip {
  
  @JSImport("fundamental-react", "MessageStrip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def buttonProps(value: Any): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    inline def dismissible(value: Boolean): this.type = set("dismissible", value.asInstanceOf[js.Any])
    
    inline def link(value: String): this.type = set("link", value.asInstanceOf[js.Any])
    
    inline def linkProps(value: Any): this.type = set("linkProps", value.asInstanceOf[js.Any])
    
    inline def linkText(value: String): this.type = set("linkText", value.asInstanceOf[js.Any])
    
    inline def localizedText(value: Any): this.type = set("localizedText", value.asInstanceOf[js.Any])
    
    inline def noGlyph(value: Boolean): this.type = set("noGlyph", value.asInstanceOf[js.Any])
    
    inline def onCloseClicked(value: /* repeated */ Any => Any): this.type = set("onCloseClicked", js.Any.fromFunction1(value))
    
    inline def `type`(value: Any): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: MessageStrip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MessageStripProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
