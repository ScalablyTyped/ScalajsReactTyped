package typingsJapgolly.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigmaConfigs extends js.Object {
  var container: js.UndefOr[Element] = js.undefined
  var graph: js.UndefOr[GraphData] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var renderers: js.UndefOr[js.Array[Renderer]] = js.undefined
  var settings: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object SigmaConfigs {
  @scala.inline
  def apply(
    container: Element = null,
    graph: GraphData = null,
    id: String = null,
    renderers: js.Array[Renderer] = null,
    settings: StringDictionary[js.Any] = null
  ): SigmaConfigs = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (renderers != null) __obj.updateDynamic("renderers")(renderers.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigmaConfigs]
  }
}

