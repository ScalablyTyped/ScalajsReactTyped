package typingsJapgolly.plottable.drawerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.plottable.drawStepMod.AppliedDrawStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawer extends js.Object {
  /**
    * Mutate the surface to reflect the data being passed in. This method is responsible
    * for calling the animators at the right time and order.
    * @param data The data to be drawn.
    * @param drawSteps The draw steps that the data go through.
    */
  def draw(data: js.Array[_], drawSteps: js.Array[AppliedDrawStep]): Unit
  /**
    * Get the visual primitive for the given *data* index.
    */
  def getVisualPrimitiveAtIndex(index: Double): Element
  /**
    * Get the the last drawn visual primitives.
    */
  def getVisualPrimitives(): js.Array[Element]
  /**
    * Called when the Drawer is no longer needed - implementors may use this to cleanup
    * any resources they've created
    */
  def remove(): Unit
}

object IDrawer {
  @scala.inline
  def apply(
    draw: (js.Array[js.Any], js.Array[AppliedDrawStep]) => Callback,
    getVisualPrimitiveAtIndex: Double => CallbackTo[Element],
    getVisualPrimitives: CallbackTo[js.Array[Element]],
    remove: Callback
  ): IDrawer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("draw")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Array[typingsJapgolly.plottable.drawStepMod.AppliedDrawStep]) => draw(t0, t1).runNow()))
    __obj.updateDynamic("getVisualPrimitiveAtIndex")(js.Any.fromFunction1((t0: scala.Double) => getVisualPrimitiveAtIndex(t0).runNow()))
    __obj.updateDynamic("getVisualPrimitives")(getVisualPrimitives.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[IDrawer]
  }
}

