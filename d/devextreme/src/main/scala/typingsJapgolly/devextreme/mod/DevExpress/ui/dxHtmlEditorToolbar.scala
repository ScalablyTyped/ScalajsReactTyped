package typingsJapgolly.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.devextremeStrings.alignCenter
import typingsJapgolly.devextreme.devextremeStrings.alignJustify
import typingsJapgolly.devextreme.devextremeStrings.alignLeft
import typingsJapgolly.devextreme.devextremeStrings.alignRight
import typingsJapgolly.devextreme.devextremeStrings.background
import typingsJapgolly.devextreme.devextremeStrings.blockquote
import typingsJapgolly.devextreme.devextremeStrings.bold
import typingsJapgolly.devextreme.devextremeStrings.bulletList
import typingsJapgolly.devextreme.devextremeStrings.clear
import typingsJapgolly.devextreme.devextremeStrings.codeBlock
import typingsJapgolly.devextreme.devextremeStrings.color
import typingsJapgolly.devextreme.devextremeStrings.decreaseIndent
import typingsJapgolly.devextreme.devextremeStrings.header
import typingsJapgolly.devextreme.devextremeStrings.image
import typingsJapgolly.devextreme.devextremeStrings.increaseIndent
import typingsJapgolly.devextreme.devextremeStrings.italic
import typingsJapgolly.devextreme.devextremeStrings.link
import typingsJapgolly.devextreme.devextremeStrings.orderedList
import typingsJapgolly.devextreme.devextremeStrings.redo
import typingsJapgolly.devextreme.devextremeStrings.separator
import typingsJapgolly.devextreme.devextremeStrings.strike
import typingsJapgolly.devextreme.devextremeStrings.subscript
import typingsJapgolly.devextreme.devextremeStrings.superscript
import typingsJapgolly.devextreme.devextremeStrings.underline
import typingsJapgolly.devextreme.devextremeStrings.undo
import typingsJapgolly.devextreme.devextremeStrings.variable
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxHtmlEditorToolbar extends js.Object {
  /** Specifies the container in which to place the toolbar. */
  var container: js.UndefOr[String | Element | JQuery] = js.undefined
  /** Configures toolbar items. These items allow users to format text and execute commands. */
  var items: js.UndefOr[
    js.Array[
      dxHtmlEditorToolbarItem | background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear
    ]
  ] = js.undefined
}

object dxHtmlEditorToolbar {
  @scala.inline
  def apply(
    container: String | Element | JQuery = null,
    items: js.Array[
      dxHtmlEditorToolbarItem | background | bold | color | italic | link | image | strike | subscript | superscript | underline | blockquote | header | increaseIndent | decreaseIndent | orderedList | bulletList | alignLeft | alignCenter | alignRight | alignJustify | codeBlock | variable | separator | undo | redo | clear
    ] = null
  ): dxHtmlEditorToolbar = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxHtmlEditorToolbar]
  }
}

