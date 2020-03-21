package typingsJapgolly.storybookAddonStoryshots.frameworksLoaderMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookAddonStoryshots.AnonFramework
import typingsJapgolly.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  def load(options: StoryshotsOptions): AnonFramework
  def test(options: StoryshotsOptions): Boolean
}

object Loader {
  @scala.inline
  def apply(
    load: StoryshotsOptions => CallbackTo[AnonFramework],
    test: StoryshotsOptions => CallbackTo[Boolean]
  ): Loader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsOptions) => load(t0).runNow()))
    __obj.updateDynamic("test")(js.Any.fromFunction1((t0: typingsJapgolly.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsOptions) => test(t0).runNow()))
    __obj.asInstanceOf[Loader]
  }
}

