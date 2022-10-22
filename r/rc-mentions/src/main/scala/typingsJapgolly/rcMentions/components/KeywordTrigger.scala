package typingsJapgolly.rcMentions.components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcMentions.esKeywordTriggerMod.KeywordTriggerProps
import typingsJapgolly.rcMentions.esKeywordTriggerMod.default
import typingsJapgolly.rcMentions.esMentionsMod.Direction
import typingsJapgolly.rcMentions.esMentionsMod.Placement
import typingsJapgolly.rcMentions.esOptionMod.OptionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeywordTrigger {
  
  inline def apply(options: js.Array[OptionProps]): Builder = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[KeywordTriggerProps]))
  }
  
  @JSImport("rc-mentions/es/KeywordTrigger", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def direction(value: Direction): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def dropdownClassName(value: String): this.type = set("dropdownClassName", value.asInstanceOf[js.Any])
    
    inline def getPopupContainer(value: CallbackTo[HTMLElement]): this.type = set("getPopupContainer", value.toJsFn)
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: KeywordTriggerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
