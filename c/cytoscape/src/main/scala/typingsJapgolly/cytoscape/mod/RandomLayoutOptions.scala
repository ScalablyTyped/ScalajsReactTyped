package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.cytoscape.cytoscapeStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/random
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.cytoscape.mod.LayoutOptions because Already inherited */ trait RandomLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH] = js.undefined
  // whether to fit to viewport
  var fit: Boolean
  @JSName("name")
  var name_RandomLayoutOptions: random
  // fit padding
  var padding: js.UndefOr[Double] = js.undefined
}

object RandomLayoutOptions {
  @scala.inline
  def apply(
    fit: Boolean,
    name: random,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: Int | Double = null,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: Int | Double = null,
    ready: /* e */ LayoutEventObject => Callback = null,
    stop: /* e */ LayoutEventObject => Callback = null
  ): RandomLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => ready(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject) => stop(t0).runNow()))
    __obj.asInstanceOf[RandomLayoutOptions]
  }
}

