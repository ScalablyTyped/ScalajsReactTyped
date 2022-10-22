package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.libChartsFieldMod.IFieldProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Field {
  
  @JSImport("ant-design-pro/lib/Charts", "Field")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.libChartsMod.Field] {
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def value(value: VdomNode): this.type = set("value", value.rawNode.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def valueVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("value", js.Array(value*))
    
    inline def valueVdomElement(value: VdomElement): this.type = set("value", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Field.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IFieldProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
