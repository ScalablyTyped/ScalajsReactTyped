package typingsJapgolly.antDesignProUtils.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProUtils.anon.Ellipsis
import typingsJapgolly.antDesignProUtils.anon.ShowTitle
import typingsJapgolly.antd.libFormFormItemLabelMod.LabelTooltipType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LabelIconTip {
  
  @JSImport("@ant-design/pro-utils", "LabelIconTip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ellipsis(value: Boolean | ShowTitle): this.type = set("ellipsis", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def subTitle(value: VdomNode): this.type = set("subTitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subTitleNull: this.type = set("subTitle", null)
    
    inline def subTitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subTitle", js.Array(value*))
    
    inline def subTitleVdomElement(value: VdomElement): this.type = set("subTitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def tooltip(value: String | LabelTooltipType): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipNull: this.type = set("tooltip", null)
    
    inline def tooltipVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("tooltip", js.Array(value*))
    
    inline def tooltipVdomElement(value: VdomElement): this.type = set("tooltip", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: LabelIconTip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Ellipsis): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
