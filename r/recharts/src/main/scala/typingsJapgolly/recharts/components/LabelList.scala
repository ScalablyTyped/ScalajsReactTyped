package typingsJapgolly.recharts.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.recharts.mod.ContentRenderer
import typingsJapgolly.recharts.mod.LabelProps
import typingsJapgolly.recharts.mod.PositionType
import typingsJapgolly.recharts.mod.RechartsFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabelList {
  
  object dataKeystringnumberRechar {
    
    inline def apply(dataKey: String | Double | RechartsFunction): Builder = {
      val __props = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.recharts.anon.dataKeystringnumberRechar]))
    }
    
    @JSImport("recharts", "LabelList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.recharts.mod.LabelList] {
      
      inline def angle(value: Double): this.type = set("angle", value.asInstanceOf[js.Any])
      
      inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def clockWise(value: Boolean): this.type = set("clockWise", value.asInstanceOf[js.Any])
      
      inline def content(value: Element | ContentRenderer[LabelProps]): this.type = set("content", value.asInstanceOf[js.Any])
      
      inline def contentFunction1(value: LabelProps => Node): this.type = set("content", js.Any.fromFunction1(value))
      
      inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
      
      inline def data(value: Double): this.type = set("data", value.asInstanceOf[js.Any])
      
      inline def formatter(value: /* label */ String | Double => Node): this.type = set("formatter", js.Any.fromFunction1(value))
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
      
      inline def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.recharts.anon.dataKeystringnumberRechar): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object valueAccessorRechartsFunc {
    
    inline def apply(valueAccessor: RechartsFunction): Builder = {
      val __props = js.Dynamic.literal(valueAccessor = valueAccessor.asInstanceOf[js.Any])
      new Builder(js.Array(this.component, __props.asInstanceOf[typingsJapgolly.recharts.anon.valueAccessorRechartsFunc]))
    }
    
    @JSImport("recharts", "LabelList")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.recharts.mod.LabelList] {
      
      inline def angle(value: Double): this.type = set("angle", value.asInstanceOf[js.Any])
      
      inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
      
      inline def childrenNull: this.type = set("children", null)
      
      inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
      
      inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def clockWise(value: Boolean): this.type = set("clockWise", value.asInstanceOf[js.Any])
      
      inline def content(value: Element | ContentRenderer[LabelProps]): this.type = set("content", value.asInstanceOf[js.Any])
      
      inline def contentFunction1(value: LabelProps => Node): this.type = set("content", js.Any.fromFunction1(value))
      
      inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
      
      inline def data(value: Double): this.type = set("data", value.asInstanceOf[js.Any])
      
      inline def formatter(value: /* label */ String | Double => Node): this.type = set("formatter", js.Any.fromFunction1(value))
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
      
      inline def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsJapgolly.recharts.anon.valueAccessorRechartsFunc): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
