package typingsJapgolly.jqueryCleditor

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains global properties and methods used to create
  * custom plugins and override built in functionality.
  */
trait JQueryCLEditorStatic extends js.Object {
  var buttons: js.Array[JQueryCLEditorButtonDefinition]
  var defaultOptions: JQueryCLEditorOptions
  def imagesPath(): String
}

object JQueryCLEditorStatic {
  @scala.inline
  def apply(
    buttons: js.Array[JQueryCLEditorButtonDefinition],
    defaultOptions: JQueryCLEditorOptions,
    imagesPath: CallbackTo[String]
  ): JQueryCLEditorStatic = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], defaultOptions = defaultOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("imagesPath")(imagesPath.toJsFn)
    __obj.asInstanceOf[JQueryCLEditorStatic]
  }
}

