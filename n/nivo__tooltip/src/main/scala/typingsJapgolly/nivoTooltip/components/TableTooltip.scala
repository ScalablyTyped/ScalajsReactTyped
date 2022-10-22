package typingsJapgolly.nivoTooltip.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoTooltip.distTypesTableTooltipMod.TableTooltipProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableTooltip {
  
  @JSImport("@nivo/tooltip", "TableTooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def renderContent(value: CallbackTo[Element]): this.type = set("renderContent", value.toJsFn)
    
    inline def rows(value: js.Array[js.Array[Node]]): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def rowsVarargs(value: js.Array[Node]*): this.type = set("rows", js.Array(value*))
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* hasTitleRowsRenderContent */ TableTooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
