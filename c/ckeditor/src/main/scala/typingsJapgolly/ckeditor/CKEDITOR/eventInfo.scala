package typingsJapgolly.ckeditor.CKEDITOR

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait eventInfo extends js.Object {
  var data: js.Any
  var editor: typingsJapgolly.ckeditor.CKEDITOR.editor
  var listenerData: js.Any
  var name: String
  var sender: StringDictionary[js.Any]
  def cancel(): Unit
  def removeListener(): Unit
  def stop(): Unit
}

object eventInfo {
  @scala.inline
  def apply(
    cancel: Callback,
    data: js.Any,
    editor: editor,
    listenerData: js.Any,
    name: String,
    removeListener: Callback,
    sender: StringDictionary[js.Any],
    stop: Callback
  ): eventInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], listenerData = listenerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("removeListener")(removeListener.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[eventInfo]
  }
}

