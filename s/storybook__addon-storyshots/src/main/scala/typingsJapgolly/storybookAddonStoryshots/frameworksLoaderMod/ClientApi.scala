package typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod

import typingsJapgolly.node.NodeModule
import typingsJapgolly.storybookAddonStoryshots.storybookAddonStoryshotsBooleans.`false`
import typingsJapgolly.storybookAddons.typesMod.ClientStoryApi
import typingsJapgolly.storybookAddons.typesMod.Loadable
import typingsJapgolly.storybookClientApi.AnonFileName
import typingsJapgolly.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApi
  extends ClientStoryApi[js.Any] {
  var clearDecorators: js.Function0[Unit] = js.native
  var getStorybook: js.Function0[js.Array[AnonFileName]] = js.native
  var raw: js.Function0[js.Array[StoreItem]] = js.native
  var setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  def configure(loader: Loadable, module: NodeModule): Unit = js.native
  @JSName("configure")
  def configure_false(loader: Loadable, module: `false`): Unit = js.native
  def forceReRender(): Unit = js.native
}

