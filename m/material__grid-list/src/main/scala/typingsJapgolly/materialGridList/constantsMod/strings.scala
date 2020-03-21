package typingsJapgolly.materialGridList.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialBase.foundationMod.MDCStrings
import typingsJapgolly.materialGridList.materialGridListStrings.`Dotmdc-grid-list__tiles`
import typingsJapgolly.materialGridList.materialGridListStrings.`Dotmdc-grid-tile`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings extends MDCStrings {
  var TILES_SELECTOR: `Dotmdc-grid-list__tiles`
  var TILE_SELECTOR: `Dotmdc-grid-tile`
}

object strings {
  @scala.inline
  def apply(
    TILES_SELECTOR: `Dotmdc-grid-list__tiles`,
    TILE_SELECTOR: `Dotmdc-grid-tile`,
    StringDictionary: StringDictionary[String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(TILES_SELECTOR = TILES_SELECTOR.asInstanceOf[js.Any], TILE_SELECTOR = TILE_SELECTOR.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

