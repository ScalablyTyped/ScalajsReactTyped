package typingsJapgolly.reactMdIcon.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdIcon.typesTextIconSpacingMod.TextIconSpacingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextIconSpacing {
  
  @JSImport("@react-md/icon", "TextIconSpacing")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def aboveClassName(value: String): this.type = set("aboveClassName", value.asInstanceOf[js.Any])
    
    inline def afterClassName(value: String): this.type = set("afterClassName", value.asInstanceOf[js.Any])
    
    inline def beforeClassName(value: String): this.type = set("beforeClassName", value.asInstanceOf[js.Any])
    
    inline def belowClassName(value: String): this.type = set("belowClassName", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def flexReverse(value: Boolean): this.type = set("flexReverse", value.asInstanceOf[js.Any])
    
    inline def forceIconWrap(value: Boolean): this.type = set("forceIconWrap", value.asInstanceOf[js.Any])
    
    inline def icon(value: Element | Node): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconAfter(value: Boolean): this.type = set("iconAfter", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def stacked(value: Boolean): this.type = set("stacked", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TextIconSpacing.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TextIconSpacingProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
