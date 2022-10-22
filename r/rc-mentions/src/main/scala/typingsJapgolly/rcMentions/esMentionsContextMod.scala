package typingsJapgolly.rcMentions

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcMentions.esOptionMod.OptionProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FocusEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMentionsContextMod extends Shortcut {
  
  @JSImport("rc-mentions/es/MentionsContext", JSImport.Default)
  @js.native
  val default: Context[MentionsContextProps] = js.native
  
  trait MentionsContextProps extends StObject {
    
    var activeIndex: Double
    
    var notFoundContent: Node
    
    var onBlur: FocusEventHandler[HTMLElement]
    
    var onFocus: FocusEventHandler[HTMLElement]
    
    def selectOption(option: OptionProps): Unit
    
    def setActiveIndex(index: Double): Unit
  }
  object MentionsContextProps {
    
    inline def apply(
      activeIndex: Double,
      onBlur: ReactFocusEventFrom[HTMLElement & Element] => Callback,
      onFocus: ReactFocusEventFrom[HTMLElement & Element] => Callback,
      selectOption: OptionProps => Callback,
      setActiveIndex: Double => Callback
    ): MentionsContextProps = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & Element]) => onBlur(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & Element]) => onFocus(t0).runNow()), selectOption = js.Any.fromFunction1((t0: OptionProps) => selectOption(t0).runNow()), setActiveIndex = js.Any.fromFunction1((t0: Double) => setActiveIndex(t0).runNow()), notFoundContent = null)
      __obj.asInstanceOf[MentionsContextProps]
    }
    
    extension [Self <: MentionsContextProps](x: Self) {
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setNotFoundContent(value: VdomNode): Self = StObject.set(x, "notFoundContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setNotFoundContentNull: Self = StObject.set(x, "notFoundContent", null)
      
      inline def setNotFoundContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "notFoundContent", js.Array(value*))
      
      inline def setNotFoundContentVdomElement(value: VdomElement): Self = StObject.set(x, "notFoundContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLElement & Element]) => value(t0).runNow()))
      
      inline def setSelectOption(value: OptionProps => Callback): Self = StObject.set(x, "selectOption", js.Any.fromFunction1((t0: OptionProps) => value(t0).runNow()))
      
      inline def setSetActiveIndex(value: Double => Callback): Self = StObject.set(x, "setActiveIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  type _To = Context[MentionsContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esMentionsContextMod.foo` */
  override def _to: Context[MentionsContextProps] = default
}
