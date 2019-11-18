package typingsJapgolly.rcDashMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esMentionsMod {
  import typingsJapgolly.rcDashMentions.esUtilMod.Omit
  import typingsJapgolly.rcDashMentions.rcDashMentionsStrings.onChange
  import typingsJapgolly.rcDashMentions.rcDashMentionsStrings.onSelect
  import typingsJapgolly.rcDashMentions.rcDashMentionsStrings.prefix
  import typingsJapgolly.react.reactMod.TextareaHTMLAttributes
  import typingsJapgolly.std.HTMLTextAreaElement

  type BaseTextareaAttrs = Omit[TextareaHTMLAttributes[HTMLTextAreaElement], prefix | onChange | onSelect]
}
