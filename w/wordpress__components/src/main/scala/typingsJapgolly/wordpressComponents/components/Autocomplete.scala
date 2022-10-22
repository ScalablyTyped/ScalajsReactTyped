package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Props
import typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.RenderProps
import typingsJapgolly.wordpressRichText.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Autocomplete {
  
  inline def apply[T](children: RenderProps => Element | Null, completers: js.Array[Completer[T]]): Builder[T] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), completers = completers.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("@wordpress/components", "Autocomplete")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def isSelected(value: Boolean): this.type = set("isSelected", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* value */ Value => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ Value) => value(t0).runNow()))
    
    inline def onReplace(value: /* value */ Value => Callback): this.type = set("onReplace", js.Any.fromFunction1((t0: /* value */ Value) => value(t0).runNow()))
    
    inline def record(value: Value): this.type = set("record", value.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
