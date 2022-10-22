package typingsJapgolly.styledComponents.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.styledComponents.nativeDistSheetMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyleSheetConsumer {
  
  inline def apply(children: Unit | default => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[Unit | default]]))
  }
  
  @JSImport("styled-components/native/dist", "StyleSheetConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[Unit | default]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
