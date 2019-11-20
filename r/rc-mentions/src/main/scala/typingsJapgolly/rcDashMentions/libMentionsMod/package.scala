package typingsJapgolly.rcDashMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMentionsMod {
  import org.scalajs.dom.raw.HTMLTextAreaElement
  import typingsJapgolly.rcDashMentions.libUtilMod.Omit
  import typingsJapgolly.rcDashMentions.rcDashMentionsStrings.onChange
  import typingsJapgolly.rcDashMentions.rcDashMentionsStrings.onSelect
  import typingsJapgolly.rcDashMentions.rcDashMentionsStrings.prefix
  import typingsJapgolly.react.reactMod.TextareaHTMLAttributes

  type BaseTextareaAttrs = Omit[TextareaHTMLAttributes[HTMLTextAreaElement], prefix | onChange | onSelect]
}
