package typingsJapgolly.storybookUi.sidebarSidebarStoriesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoriesProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var loading: Boolean
  var stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any
  var storyId: js.UndefOr[String] = js.undefined
}

object StoriesProps {
  @scala.inline
  def apply(
    loading: Boolean,
    stories: /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['StoriesHash'] */ js.Any,
    className: String = null,
    storyId: String = null
  ): StoriesProps = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], stories = stories.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoriesProps]
  }
}

