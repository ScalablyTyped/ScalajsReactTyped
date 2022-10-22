package typingsJapgolly.reactMeasure.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactMeasure.mod.ContentRect
import typingsJapgolly.reactMeasure.mod.MeasureProps
import typingsJapgolly.reactMeasure.mod.MeasuredComponentProps
import typingsJapgolly.reactMeasure.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMeasure {
  
  @JSImport("react-measure", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def bounds(value: Boolean): this.type = set("bounds", value.asInstanceOf[js.Any])
    
    inline def children(value: FC[MeasuredComponentProps]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def client(value: Boolean): this.type = set("client", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[Element]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: Element | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: Element | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
    
    inline def margin(value: Boolean): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def offset(value: Boolean): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onResize(value: /* contentRect */ ContentRect => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: /* contentRect */ ContentRect) => value(t0).runNow()))
    
    inline def scroll(value: Boolean): this.type = set("scroll", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactMeasure.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MeasureProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
