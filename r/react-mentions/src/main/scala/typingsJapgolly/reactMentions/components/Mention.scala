package typingsJapgolly.reactMentions.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMentions.mod.DataFunc
import typingsJapgolly.reactMentions.mod.MentionProps
import typingsJapgolly.reactMentions.mod.SuggestionDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mention {
  
  inline def apply(data: js.Array[SuggestionDataItem] | DataFunc, trigger: String | js.RegExp): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MentionProps]))
  }
  
  @JSImport("react-mentions", "Mention")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appendSpaceOnAdd(value: Boolean): this.type = set("appendSpaceOnAdd", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def displayTransform(value: (/* id */ String, /* display */ String) => String): this.type = set("displayTransform", js.Any.fromFunction2(value))
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def markup(value: String): this.type = set("markup", value.asInstanceOf[js.Any])
    
    inline def onAdd(value: (/* id */ String | Double, /* display */ String) => Callback): this.type = set("onAdd", js.Any.fromFunction2((t0: /* id */ String | Double, t1: /* display */ String) => (value(t0, t1)).runNow()))
    
    inline def regex(value: js.RegExp): this.type = set("regex", value.asInstanceOf[js.Any])
    
    inline def renderSuggestion(
      value: (/* suggestion */ SuggestionDataItem, /* search */ String, /* highlightedDisplay */ Node, /* index */ Double, /* focused */ Boolean) => Node
    ): this.type = set("renderSuggestion", js.Any.fromFunction5(value))
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MentionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
