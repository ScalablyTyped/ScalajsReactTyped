package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/layout-manipulation
  * Layouts have a set of functions available to them,
  * which allow for more complex behaviour than the primary run-one-layout-at-a-time usecase.
  * A new, developer accessible layout can be made via cy.makeLayout().
  */
trait LayoutManipulation extends js.Object {
  /**
    * Start running the layout
    * http://js.cytoscape.org/#layout.run
    */
  def run(): this.type
  def start(): this.type
  /**
    * Stop running the (asynchronous/discrete) layout
    * http://js.cytoscape.org/#layout.stop
    */
  def stop(): this.type
}

object LayoutManipulation {
  @scala.inline
  def apply(
    run: CallbackTo[LayoutManipulation],
    start: CallbackTo[LayoutManipulation],
    stop: CallbackTo[LayoutManipulation]
  ): LayoutManipulation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[LayoutManipulation]
  }
}

