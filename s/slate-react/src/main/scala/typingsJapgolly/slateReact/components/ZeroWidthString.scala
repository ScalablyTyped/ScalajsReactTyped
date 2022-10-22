package typingsJapgolly.slateReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.slateReact.anon.IsLineBreak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZeroWidthString {
  
  @JSImport("slate-react/dist/components/string", "ZeroWidthString")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def isLineBreak(value: Boolean): this.type = set("isLineBreak", value.asInstanceOf[js.Any])
    
    inline def isMarkPlaceholder(value: Boolean): this.type = set("isMarkPlaceholder", value.asInstanceOf[js.Any])
    
    inline def length(value: Double): this.type = set("length", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ZeroWidthString.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IsLineBreak): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
