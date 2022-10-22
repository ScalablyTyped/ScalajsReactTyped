package typingsJapgolly.tinySliderReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.tinySliderReact.mod.TinySliderInfo
import typingsJapgolly.tinySliderReact.mod.TinySliderProps
import typingsJapgolly.tinySliderReact.mod.TinySliderSettings
import typingsJapgolly.tinySliderReact.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TinySliderReact {
  
  @JSImport("tiny-slider-react", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def onClick(value: (/* slideClicked */ Double, /* info */ String, /* event */ Event) => Callback): this.type = set("onClick", js.Any.fromFunction3((t0: /* slideClicked */ Double, t1: /* info */ String, t2: /* event */ Event) => (value(t0, t1, t2)).runNow()))
    
    inline def onIndexChanged(value: /* info */ TinySliderInfo => Callback): this.type = set("onIndexChanged", js.Any.fromFunction1((t0: /* info */ TinySliderInfo) => value(t0).runNow()))
    
    inline def onTouchEnd(value: /* info */ TinySliderInfo => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: /* info */ TinySliderInfo) => value(t0).runNow()))
    
    inline def onTouchMove(value: /* info */ TinySliderInfo => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: /* info */ TinySliderInfo) => value(t0).runNow()))
    
    inline def onTouchStart(value: /* info */ TinySliderInfo => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: /* info */ TinySliderInfo) => value(t0).runNow()))
    
    inline def onTransitionEnd(value: /* info */ TinySliderInfo => Callback): this.type = set("onTransitionEnd", js.Any.fromFunction1((t0: /* info */ TinySliderInfo) => value(t0).runNow()))
    
    inline def onTransitionStart(value: /* info */ TinySliderInfo => Callback): this.type = set("onTransitionStart", js.Any.fromFunction1((t0: /* info */ TinySliderInfo) => value(t0).runNow()))
    
    inline def settings(value: TinySliderSettings): this.type = set("settings", value.asInstanceOf[js.Any])
    
    inline def startIndex(value: Double): this.type = set("startIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TinySliderReact.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TinySliderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
