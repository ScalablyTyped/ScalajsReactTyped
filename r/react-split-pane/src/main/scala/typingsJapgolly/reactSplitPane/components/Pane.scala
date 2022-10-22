package typingsJapgolly.reactSplitPane.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactSplitPane.mod.PaneProps
import typingsJapgolly.reactSplitPane.mod.Size
import typingsJapgolly.reactSplitPane.mod.Split
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pane {
  
  @JSImport("react-split-pane", "Pane")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSplitPane.mod.Pane] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def eleRef(value: /* el */ HTMLDivElement => Callback): this.type = set("eleRef", js.Any.fromFunction1((t0: /* el */ HTMLDivElement) => value(t0).runNow()))
    
    inline def size(value: Size): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def split(value: Split): this.type = set("split", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Pane.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PaneProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
