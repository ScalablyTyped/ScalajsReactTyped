package typingsJapgolly.bootstrapFileinput.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileTypeSettings extends js.Object {
  def audio(vType: String, vName: String): Boolean
  def flash(vType: String, vName: String): Boolean
  def html(vType: String, vName: String): Boolean
  def image(vType: String, vName: String): Boolean
  def `object`(vType: String, vName: String): Boolean
  def other(vType: String, vName: String): Boolean
  def text(vType: String, vName: String): Boolean
  def video(vType: String, vName: String): Boolean
}

object FileTypeSettings {
  @scala.inline
  def apply(
    audio: (String, String) => CallbackTo[Boolean],
    flash: (String, String) => CallbackTo[Boolean],
    html: (String, String) => CallbackTo[Boolean],
    image: (String, String) => CallbackTo[Boolean],
    `object`: (String, String) => CallbackTo[Boolean],
    other: (String, String) => CallbackTo[Boolean],
    text: (String, String) => CallbackTo[Boolean],
    video: (String, String) => CallbackTo[Boolean]
  ): FileTypeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audio")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => audio(t0, t1).runNow()))
    __obj.updateDynamic("flash")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => flash(t0, t1).runNow()))
    __obj.updateDynamic("html")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => html(t0, t1).runNow()))
    __obj.updateDynamic("image")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => image(t0, t1).runNow()))
    __obj.updateDynamic("object")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => `object`(t0, t1).runNow()))
    __obj.updateDynamic("other")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => other(t0, t1).runNow()))
    __obj.updateDynamic("text")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => text(t0, t1).runNow()))
    __obj.updateDynamic("video")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => video(t0, t1).runNow()))
    __obj.asInstanceOf[FileTypeSettings]
  }
}

