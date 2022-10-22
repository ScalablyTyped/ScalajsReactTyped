package typingsJapgolly.reactFocusLock.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFocusLock.interfacesMod.ReactFocusLockProps
import typingsJapgolly.reactFocusLock.reactFocusLockStrings.tail
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFocusLock {
  
  @JSImport("react-focus-lock", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[HTMLElement] {
    
    inline def allowTextSelection(value: Boolean): this.type = set("allowTextSelection", value.asInstanceOf[js.Any])
    
    inline def as(value: String | ElementType): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def crossFrame(value: Boolean): this.type = set("crossFrame", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focusOptions(value: FocusOptions): this.type = set("focusOptions", value.asInstanceOf[js.Any])
    
    inline def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    inline def hasPositiveIndices(value: Boolean): this.type = set("hasPositiveIndices", value.asInstanceOf[js.Any])
    
    inline def lockProps(value: Record[String, Any]): this.type = set("lockProps", value.asInstanceOf[js.Any])
    
    inline def noFocusGuards(value: Boolean | tail): this.type = set("noFocusGuards", value.asInstanceOf[js.Any])
    
    inline def onActivation(value: /* node */ HTMLElement => Callback): this.type = set("onActivation", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def onDeactivation(value: /* node */ HTMLElement => Callback): this.type = set("onDeactivation", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
    
    inline def persistentFocus(value: Boolean): this.type = set("persistentFocus", value.asInstanceOf[js.Any])
    
    inline def returnFocus(value: Boolean | FocusOptions | (js.Function1[/* returnTo */ Element, Boolean | FocusOptions])): this.type = set("returnFocus", value.asInstanceOf[js.Any])
    
    inline def returnFocusFunction1(value: /* returnTo */ Element => Boolean | FocusOptions): this.type = set("returnFocus", js.Any.fromFunction1(value))
    
    inline def shards(value: js.Array[RefHandle[Any] | HTMLElement]): this.type = set("shards", value.asInstanceOf[js.Any])
    
    inline def shardsVarargs(value: (RefHandle[Any] | HTMLElement)*): this.type = set("shards", js.Array(value*))
    
    inline def whiteList(value: /* activeElement */ HTMLElement => Boolean): this.type = set("whiteList", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: ReactFocusLock.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactFocusLockProps[Node, Record[String, Any]]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
