package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsKeyboardMod.KeyboardProps
import typingsJapgolly.grommet.grommetStrings.document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Keyboard {
  
  @JSImport("grommet/es6", "Keyboard")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def onBackspace(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onBackspace", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onComma(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onComma", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onDown(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onDown", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onEnter(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onEnter", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onEsc(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onEsc", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onKeyDown(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onLeft(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onLeft", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onRight(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onRight", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onShift(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onShift", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onSpace(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onSpace", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onTab(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onTab", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onUp(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): this.type = set("onUp", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def target(value: typingsJapgolly.grommet.grommetStrings.component | document): this.type = set("target", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Keyboard.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: KeyboardProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
