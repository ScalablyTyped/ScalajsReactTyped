package typingsJapgolly.semanticDashUiDashReact.distCommonjsElementsPlaceholderPlaceholderLineMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very long`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.`very short`
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.full
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.long
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.medium
import typingsJapgolly.semanticDashUiDashReact.semanticDashUiDashReactStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceholderLineProps
  extends StrictPlaceholderLineProps
     with /* key */ StringDictionary[js.Any]

object PlaceholderLineProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    className: String = null,
    length: full | (`very long`) | long | medium | short | (`very short`) = null
  ): PlaceholderLineProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceholderLineProps]
  }
}

