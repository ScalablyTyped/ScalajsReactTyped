package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofsdpops extends js.Object {
  def keep_codecs_by_id(codecs: String, media: String): Double
  def keep_codecs_by_name(codecs: String, media: String): Double
  def remove_codecs_by_id(codecs: String, media: String): Double
  def remove_codecs_by_name(codecs: String, media: String): Double
  def remove_line_by_prefix(prefix: String, media: String): Double
  def remove_media(media: String): Double
  def sdp_content(): Double
  def sdp_content_flags(flags: Double): Double
  def sdp_get(avp: String): Double
  def sdp_get_line_startswith(aname: String, sline: String): Double
  def sdp_print(llevel: Double): Double
  def sdp_transport(avp: String): Double
  def sdp_with_active_media(media: String): Double
  def sdp_with_ice(): Double
  def sdp_with_media(media: String): Double
}

object Typeofsdpops {
  @scala.inline
  def apply(
    keep_codecs_by_id: (String, String) => CallbackTo[Double],
    keep_codecs_by_name: (String, String) => CallbackTo[Double],
    remove_codecs_by_id: (String, String) => CallbackTo[Double],
    remove_codecs_by_name: (String, String) => CallbackTo[Double],
    remove_line_by_prefix: (String, String) => CallbackTo[Double],
    remove_media: String => CallbackTo[Double],
    sdp_content: CallbackTo[Double],
    sdp_content_flags: Double => CallbackTo[Double],
    sdp_get: String => CallbackTo[Double],
    sdp_get_line_startswith: (String, String) => CallbackTo[Double],
    sdp_print: Double => CallbackTo[Double],
    sdp_transport: String => CallbackTo[Double],
    sdp_with_active_media: String => CallbackTo[Double],
    sdp_with_ice: CallbackTo[Double],
    sdp_with_media: String => CallbackTo[Double]
  ): Typeofsdpops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keep_codecs_by_id")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => keep_codecs_by_id(t0, t1).runNow()))
    __obj.updateDynamic("keep_codecs_by_name")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => keep_codecs_by_name(t0, t1).runNow()))
    __obj.updateDynamic("remove_codecs_by_id")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove_codecs_by_id(t0, t1).runNow()))
    __obj.updateDynamic("remove_codecs_by_name")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove_codecs_by_name(t0, t1).runNow()))
    __obj.updateDynamic("remove_line_by_prefix")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove_line_by_prefix(t0, t1).runNow()))
    __obj.updateDynamic("remove_media")(js.Any.fromFunction1((t0: java.lang.String) => remove_media(t0).runNow()))
    __obj.updateDynamic("sdp_content")(sdp_content.toJsFn)
    __obj.updateDynamic("sdp_content_flags")(js.Any.fromFunction1((t0: scala.Double) => sdp_content_flags(t0).runNow()))
    __obj.updateDynamic("sdp_get")(js.Any.fromFunction1((t0: java.lang.String) => sdp_get(t0).runNow()))
    __obj.updateDynamic("sdp_get_line_startswith")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sdp_get_line_startswith(t0, t1).runNow()))
    __obj.updateDynamic("sdp_print")(js.Any.fromFunction1((t0: scala.Double) => sdp_print(t0).runNow()))
    __obj.updateDynamic("sdp_transport")(js.Any.fromFunction1((t0: java.lang.String) => sdp_transport(t0).runNow()))
    __obj.updateDynamic("sdp_with_active_media")(js.Any.fromFunction1((t0: java.lang.String) => sdp_with_active_media(t0).runNow()))
    __obj.updateDynamic("sdp_with_ice")(sdp_with_ice.toJsFn)
    __obj.updateDynamic("sdp_with_media")(js.Any.fromFunction1((t0: java.lang.String) => sdp_with_media(t0).runNow()))
    __obj.asInstanceOf[Typeofsdpops]
  }
}

