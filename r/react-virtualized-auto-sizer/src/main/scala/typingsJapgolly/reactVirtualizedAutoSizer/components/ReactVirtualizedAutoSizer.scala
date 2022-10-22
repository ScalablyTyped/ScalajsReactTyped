package typingsJapgolly.reactVirtualizedAutoSizer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVirtualizedAutoSizer.mod.AutoSizerProps
import typingsJapgolly.reactVirtualizedAutoSizer.mod.Size
import typingsJapgolly.reactVirtualizedAutoSizer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactVirtualizedAutoSizer {
  
  inline def apply(children: Size => Node): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[AutoSizerProps]))
  }
  
  @JSImport("react-virtualized-auto-sizer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultHeight(value: Double): this.type = set("defaultHeight", value.asInstanceOf[js.Any])
    
    inline def defaultWidth(value: Double): this.type = set("defaultWidth", value.asInstanceOf[js.Any])
    
    inline def disableHeight(value: Boolean): this.type = set("disableHeight", value.asInstanceOf[js.Any])
    
    inline def disableWidth(value: Boolean): this.type = set("disableWidth", value.asInstanceOf[js.Any])
    
    inline def nonce(value: String): this.type = set("nonce", value.asInstanceOf[js.Any])
    
    inline def onResize(value: /* size */ Size => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: /* size */ Size) => value(t0).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AutoSizerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
