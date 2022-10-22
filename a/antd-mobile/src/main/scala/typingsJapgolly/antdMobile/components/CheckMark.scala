package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Ref
import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckMark {
  
  inline def apply(ref: CallbackTo[Ref | Null]): Default[js.Object] = {
    val __props = js.Dynamic.literal(ref = ref.toJsFn)
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Element]))
  }
  
  @JSImport("antd-mobile/es/components/selector/check-mark", "CheckMark")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Element): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
