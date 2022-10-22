package typingsJapgolly.nivoTooltip.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoTooltip.distTypesBasicTooltipMod.BasicTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BasicTooltip {
  
  @JSImport("@nivo/tooltip", "BasicTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def enableChip(value: Boolean): this.type = set("enableChip", value.asInstanceOf[js.Any])
    
    inline def format(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueFormat<number | string | Date> */ Any
    ): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def id(value: VdomNode): this.type = set("id", value.rawNode.asInstanceOf[js.Any])
    
    inline def idNull: this.type = set("id", null)
    
    inline def idVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("id", js.Array(value*))
    
    inline def idVdomElement(value: VdomElement): this.type = set("id", value.rawElement.asInstanceOf[js.Any])
    
    inline def renderContent(value: CallbackTo[typingsJapgolly.react.mod.global.JSX.Element]): this.type = set("renderContent", value.toJsFn)
    
    inline def value(value: Double | String | js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BasicTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BasicTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
