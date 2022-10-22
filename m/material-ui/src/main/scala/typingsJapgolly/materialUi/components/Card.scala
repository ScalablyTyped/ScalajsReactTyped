package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.Card.CardProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Card {
  
  @JSImport("material-ui", "Card")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.Card] {
    
    inline def actAsExpander(value: Boolean): this.type = set("actAsExpander", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerStyle(value: CSSProperties): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    inline def expanded(value: Boolean): this.type = set("expanded", value.asInstanceOf[js.Any])
    
    inline def initiallyExpanded(value: Boolean): this.type = set("initiallyExpanded", value.asInstanceOf[js.Any])
    
    inline def onExpandChange(value: /* isExpanded */ Boolean => Callback): this.type = set("onExpandChange", js.Any.fromFunction1((t0: /* isExpanded */ Boolean) => value(t0).runNow()))
    
    inline def showExpandableButton(value: Boolean): this.type = set("showExpandableButton", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Card.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
