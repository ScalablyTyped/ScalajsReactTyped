package typingsJapgolly.vegaTypings.runtimeMod

import typingsJapgolly.vegaTypings.sceneMod.Scene
import typingsJapgolly.vegaTypings.sceneMod.SceneGroup
import typingsJapgolly.vegaTypings.sceneMod.SceneItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-typings/types/runtime", "sceneVisit")
@js.native
object sceneVisit extends js.Object {
  def apply(scene: SceneGroup, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
  def apply(scene: Scene, itemCallback: js.Function1[/* item */ Scene | SceneGroup | SceneItem, Unit]): Unit = js.native
}

