package typingsJapgolly.reactNativeSwipeout.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSwipeout.mod.SwipeoutButtonProperties
import typingsJapgolly.reactNativeSwipeout.mod.SwipeoutProperties
import typingsJapgolly.reactNativeSwipeout.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSwipeout {
  
  @JSImport("react-native-swipeout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def buttonWidth(value: Double): this.type = set("buttonWidth", value.asInstanceOf[js.Any])
    
    inline def close(value: Boolean): this.type = set("close", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def left(value: js.Array[SwipeoutButtonProperties]): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def leftVarargs(value: SwipeoutButtonProperties*): this.type = set("left", js.Array(value*))
    
    inline def onClose(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Callback): this.type = set("onClose", js.Any.fromFunction3((t0: /* sectionId */ Double, t1: /* rowId */ Double, t2: /* direction */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def onOpen(value: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Callback): this.type = set("onOpen", js.Any.fromFunction3((t0: /* sectionId */ Double, t1: /* rowId */ Double, t2: /* direction */ String) => (value(t0, t1, t2)).runNow()))
    
    inline def openLeft(value: Boolean): this.type = set("openLeft", value.asInstanceOf[js.Any])
    
    inline def openRight(value: Boolean): this.type = set("openRight", value.asInstanceOf[js.Any])
    
    inline def right(value: js.Array[SwipeoutButtonProperties]): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def rightVarargs(value: SwipeoutButtonProperties*): this.type = set("right", js.Array(value*))
    
    inline def rowId(value: Double): this.type = set("rowId", value.asInstanceOf[js.Any])
    
    inline def scroll(value: /* scrollEnabled */ Boolean => Callback): this.type = set("scroll", js.Any.fromFunction1((t0: /* scrollEnabled */ Boolean) => value(t0).runNow()))
    
    inline def sectionId(value: Double): this.type = set("sectionId", value.asInstanceOf[js.Any])
    
    inline def sensitivity(value: Double): this.type = set("sensitivity", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactNativeSwipeout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeoutProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
