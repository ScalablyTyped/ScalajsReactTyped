package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.search
import typingsJapgolly.baseui.baseuiStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClearable extends js.Object {
  @JSName("$clearable")
  var $clearable: Boolean = js.native
  @JSName("$creatable")
  var $creatable: Boolean = js.native
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  @JSName("$error")
  var $error: Boolean = js.native
  @JSName("$isFocused")
  var $isFocused: Boolean = js.native
  @JSName("$isLoading")
  var $isLoading: Boolean = js.native
  @JSName("$isOpen")
  var $isOpen: Boolean = js.native
  @JSName("$isPseudoFocused")
  var $isPseudoFocused: Boolean = js.native
  @JSName("$multi")
  var $multi: Boolean = js.native
  @JSName("$positive")
  var $positive: Boolean = js.native
  @JSName("$required")
  var $required: Boolean = js.native
  @JSName("$searchable")
  var $searchable: Boolean = js.native
  @JSName("$size")
  var $size: default_ | compact | large_ = js.native
  @JSName("$type")
  var $type: select | search = js.native
}

