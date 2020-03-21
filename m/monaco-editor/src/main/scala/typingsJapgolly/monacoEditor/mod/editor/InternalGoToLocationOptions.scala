package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.monacoEditorStrings.goto
import typingsJapgolly.monacoEditor.monacoEditorStrings.gotoAndPeek
import typingsJapgolly.monacoEditor.monacoEditorStrings.peek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalGoToLocationOptions extends js.Object {
  val multiple: peek | gotoAndPeek | goto
}

object InternalGoToLocationOptions {
  @scala.inline
  def apply(multiple: peek | gotoAndPeek | goto): InternalGoToLocationOptions = {
    val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalGoToLocationOptions]
  }
}

