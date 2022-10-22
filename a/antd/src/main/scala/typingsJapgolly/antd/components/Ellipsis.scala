package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libTypographyBaseEllipsisMod.EllipsisProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ellipsis {
  
  inline def apply(
    children: (js.Array[japgolly.scalajs.react.facade.React.Node], Boolean) => japgolly.scalajs.react.facade.React.Node,
    fontSize: Double,
    onEllipsis: Boolean => Callback,
    rows: Double,
    width: Double
  ): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), fontSize = fontSize.asInstanceOf[js.Any], onEllipsis = js.Any.fromFunction1((t0: Boolean) => onEllipsis(t0).runNow()), rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EllipsisProps]))
  }
  
  @JSImport("antd/lib/typography/Base/Ellipsis", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def enabledMeasure(value: Boolean): this.type = set("enabledMeasure", value.asInstanceOf[js.Any])
    
    inline def text(value: VdomNode): this.type = set("text", value.rawNode.asInstanceOf[js.Any])
    
    inline def textNull: this.type = set("text", null)
    
    inline def textVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("text", js.Array(value*))
    
    inline def textVdomElement(value: VdomElement): this.type = set("text", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: EllipsisProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
