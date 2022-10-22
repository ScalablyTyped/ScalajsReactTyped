package typingsJapgolly.reactFocusOn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactFocusOn.distEs5TypesMod.ReactFocusOnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FocusOn {
  
  @JSImport("react-focus-on", "FocusOn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLElement] {
    
    inline def allowPinchZoom(value: Boolean): this.type = set("allowPinchZoom", value.asInstanceOf[js.Any])
    
    inline def as(value: String | ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def focusLock(value: Boolean): this.type = set("focusLock", value.asInstanceOf[js.Any])
    
    inline def inert(value: Boolean): this.type = set("inert", value.asInstanceOf[js.Any])
    
    inline def noIsolation(value: Boolean): this.type = set("noIsolation", value.asInstanceOf[js.Any])
    
    inline def onActivation(value: /* node */ HTMLElement => Callback): this.type = set("onActivation", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onClickOutside(value: /* event */ MouseEvent | TouchEvent => Callback): this.type = set("onClickOutside", js.Any.fromFunction1((t0: /* event */ MouseEvent | TouchEvent) => value(t0).runNow()))
    
    inline def onDeactivation(value: Callback): this.type = set("onDeactivation", value.toJsFn)
    
    inline def onEscapeKey(value: /* event */ Event => Callback): this.type = set("onEscapeKey", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def returnFocus(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactFocusLock * / any>['returnFocus'] */ js.Any
    ): this.type = set("returnFocus", value.asInstanceOf[js.Any])
    
    inline def scrollLock(value: Boolean): this.type = set("scrollLock", value.asInstanceOf[js.Any])
    
    inline def shards(value: js.Array[RefHandle[Any] | HTMLElement]): this.type = set("shards", value.asInstanceOf[js.Any])
    
    inline def shardsVarargs(value: (RefHandle[Any] | HTMLElement)*): this.type = set("shards", js.Array(value*))
    
    inline def shouldIgnore(value: /* candidate */ HTMLElement => Boolean): this.type = set("shouldIgnore", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FocusOn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactFocusOnProps & RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
