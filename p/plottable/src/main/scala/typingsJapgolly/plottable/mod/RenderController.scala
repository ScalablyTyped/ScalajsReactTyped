package typingsJapgolly.plottable.mod

import typingsJapgolly.plottable.renderControllerMod.Policy
import typingsJapgolly.plottable.renderPolicyMod.IRenderPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "RenderController")
@js.native
object RenderController extends js.Object {
  def flush(): Unit = js.native
  def registerToComputeLayout(component: typingsJapgolly.plottable.componentMod.Component): Unit = js.native
  def registerToComputeLayoutAndRender(component: typingsJapgolly.plottable.componentMod.Component): Unit = js.native
  def registerToRender(component: typingsJapgolly.plottable.componentMod.Component): Unit = js.native
  def renderPolicy(): IRenderPolicy = js.native
  def renderPolicy(renderPolicy: Policy): Unit = js.native
  @js.native
  object Policy extends js.Object {
    var animationFrame: typingsJapgolly.plottable.plottableStrings.animationFrame = js.native
    var immediate: typingsJapgolly.plottable.plottableStrings.immediate = js.native
    var timeout: typingsJapgolly.plottable.plottableStrings.timeout = js.native
  }
  
}

