package typingsJapgolly.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachRouter.mod.WindowLocation
import typingsJapgolly.storybookApi.storybookApiStrings.info
import typingsJapgolly.storybookApi.storybookApiStrings.settings
import typingsJapgolly.storybookApi.storybookApiStrings.story
import typingsJapgolly.storybookApi.urlMod.Additions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var customQueryParams: StringDictionary[js.Any]
  var layout: Additions
  var location: WindowLocation
  var path: String
  var selectedPanel: js.Any
  var storyId: String
  var viewMode: story | info | settings
}

object AnonLocation {
  @scala.inline
  def apply(
    customQueryParams: StringDictionary[js.Any],
    layout: Additions,
    location: WindowLocation,
    path: String,
    selectedPanel: js.Any,
    storyId: String,
    viewMode: story | info | settings
  ): AnonLocation = {
    val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], selectedPanel = selectedPanel.asInstanceOf[js.Any], storyId = storyId.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLocation]
  }
}

