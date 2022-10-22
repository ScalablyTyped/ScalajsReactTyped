package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactWidgets.esmSlideTransitionGroupMod.SlideTransitionGroupProps
import typingsJapgolly.reactWidgets.reactWidgetsStrings.bottom
import typingsJapgolly.reactWidgets.reactWidgetsStrings.left_
import typingsJapgolly.reactWidgets.reactWidgetsStrings.right_
import typingsJapgolly.reactWidgets.reactWidgetsStrings.top
import typingsJapgolly.std.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlideTransitionGroup {
  
  inline def apply(
    direction: left_ | right_ | top | bottom,
    onTransitionEnd: (ChildNode, js.UndefOr[Boolean]) => Callback
  ): SharedBuilder_SlideTransitionGroupProps_359447152[typingsJapgolly.reactWidgets.esmMod.SlideTransitionGroup] = {
    val __props = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], onTransitionEnd = js.Any.fromFunction2((t0: ChildNode, t1: js.UndefOr[Boolean]) => (onTransitionEnd(t0, t1)).runNow()))
    new SharedBuilder_SlideTransitionGroupProps_359447152[typingsJapgolly.reactWidgets.esmMod.SlideTransitionGroup](js.Array(this.component, __props.asInstanceOf[SlideTransitionGroupProps]))
  }
  
  @JSImport("react-widgets/esm", "SlideTransitionGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SlideTransitionGroupProps): SharedBuilder_SlideTransitionGroupProps_359447152[typingsJapgolly.reactWidgets.esmMod.SlideTransitionGroup] = new SharedBuilder_SlideTransitionGroupProps_359447152[typingsJapgolly.reactWidgets.esmMod.SlideTransitionGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
}
