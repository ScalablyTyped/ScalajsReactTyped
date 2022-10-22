package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.anon.Text
import typingsJapgolly.reactLazylog.buildLinePartMod.LinePartProps
import typingsJapgolly.reactLazylog.buildLinePartMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinePart {
  
  inline def apply(part: Text): Builder = {
    val __props = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LinePartProps]))
  }
  
  @JSImport("react-lazylog/build/LinePart", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def format(value: /* text */ String => Node): this.type = set("format", js.Any.fromFunction1(value))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinePartProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
