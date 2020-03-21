package typingsJapgolly.plottable

import typingsJapgolly.plottable.componentMod.Component
import typingsJapgolly.plottable.renderPolicyMod.IRenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/core/renderController", JSImport.Namespace)
@js.native
object renderControllerMod extends js.Object {
  def flush(): Unit = js.native
  def registerToComputeLayout(component: Component): Unit = js.native
  def registerToComputeLayoutAndRender(component: Component): Unit = js.native
  def registerToRender(component: Component): Unit = js.native
  def renderPolicy(): IRenderPolicy = js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
  @js.native
  object Policy extends js.Object {
    var animationFrame: typingsJapgolly.plottable.plottableStrings.animationFrame = js.native
    var immediate: typingsJapgolly.plottable.plottableStrings.immediate = js.native
    var timeout: typingsJapgolly.plottable.plottableStrings.timeout = js.native
  }
  
  type Policy = String
}

