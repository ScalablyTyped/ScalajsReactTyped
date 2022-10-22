package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.baseui.helperTypesMod.HelperStepsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableHelperSteps {
  
  inline def apply(
    index: Double,
    length: Double,
    onFinish: CallbackTo[Any],
    onNext: CallbackTo[Any],
    onPrev: CallbackTo[Any]
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], onFinish = onFinish.toJsFn, onNext = onNext.toJsFn, onPrev = onPrev.toJsFn)
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[HelperStepsProps]))
  }
  
  @JSImport("baseui/helper", "UnstableHelperSteps")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: HelperStepsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
