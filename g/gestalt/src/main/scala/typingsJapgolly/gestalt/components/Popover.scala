package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.gestaltStrings.blue
import typingsJapgolly.gestalt.gestaltStrings.darkGray
import typingsJapgolly.gestalt.gestaltStrings.flexible
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.orange
import typingsJapgolly.gestalt.gestaltStrings.red
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.gestaltStrings.white
import typingsJapgolly.gestalt.gestaltStrings.xl
import typingsJapgolly.gestalt.gestaltStrings.xs
import typingsJapgolly.gestalt.mod.FourDirections
import typingsJapgolly.gestalt.mod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  inline def apply(onDismiss: Callback): Builder = {
    val __props = js.Dynamic.literal(onDismiss = onDismiss.toJsFn)
    new Builder(js.Array(this.component, __props.asInstanceOf[PopoverProps]))
  }
  
  @JSImport("gestalt", "Popover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def anchor(value: HTMLElement): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    inline def anchorNull: this.type = set("anchor", null)
    
    inline def color(value: blue | orange | red | white | darkGray): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idealDirection(value: FourDirections): this.type = set("idealDirection", value.asInstanceOf[js.Any])
    
    inline def onKeyDown(value: /* arg */ js.Object & Event[ReactKeyboardEventFrom[HTMLElement]] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactKeyboardEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def positionRelativeToAnchor(value: Boolean): this.type = set("positionRelativeToAnchor", value.asInstanceOf[js.Any])
    
    inline def shouldFocus(value: Boolean): this.type = set("shouldFocus", value.asInstanceOf[js.Any])
    
    inline def showCaret(value: Boolean): this.type = set("showCaret", value.asInstanceOf[js.Any])
    
    inline def size(value: xs | sm | md | lg | xl | flexible | Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
