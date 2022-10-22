package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.componentsContrastCheckerMod.ContrastChecker.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContrastChecker {
  
  @JSImport("@wordpress/editor", "ContrastChecker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def fallbackBackgroundColor(value: String): this.type = set("fallbackBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def fallbackTextColor(value: String): this.type = set("fallbackTextColor", value.asInstanceOf[js.Any])
    
    inline def fontSize(value: Double): this.type = set("fontSize", value.asInstanceOf[js.Any])
    
    inline def isLargeText(value: Boolean): this.type = set("isLargeText", value.asInstanceOf[js.Any])
    
    inline def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ContrastChecker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
