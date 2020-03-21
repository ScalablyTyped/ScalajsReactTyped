package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftextops extends js.Object {
  def append_body_part(txt: String, ct: String): Double
  def append_body_part_cd(txt: String, ct: String, cd: String): Double
  def append_body_part_hex(txt: String, ct: String): Double
  def append_body_part_hex_cd(htxt: String, ct: String, cd: String): Double
  def cmp_istr(s1: String, s2: String): Double
  def cmp_str(s1: String, s2: String): Double
  def filter_body(content_type: String): Double
  def get_body_part(ctype: String, pvname: String): Double
  def get_body_part_raw(ctype: String, pvname: String): Double
  def has_body(): Double
  def has_body_type(ctype: String): Double
  def in_list(subject: String, list: String, vsep: String): Double
  def in_list_prefix(subject: String, list: String, vsep: String): Double
  def is_audio_on_hold(): Double
  def is_present_hf(hname: String): Double
  def is_present_hf_re(ematch: String): Double
  def is_privacy(privacy: String): Double
  def remove_body_part(content_type: String): Double
  def remove_hf_exp(ematch: String, eskip: String): Double
  def remove_hf_re(ematch: String): Double
  def replace(sre: String, sval: String): Double
  def replace_all(sre: String, sval: String): Double
  def replace_body(sre: String, sval: String): Double
  def replace_body_all(sre: String, sval: String): Double
  def replace_body_atonce(sre: String, sval: String): Double
  def replace_body_str(mkey: String, rval: String, rmode: String): Double
  def replace_hdrs(sre: String, sval: String): Double
  def replace_hdrs_str(mkey: String, rval: String, rmode: String): Double
  def replace_str(mkey: String, rval: String, rmode: String): Double
  def search(sre: String): Double
  def search_append(ematch: String, `val`: String): Double
  def search_append_body(ematch: String, `val`: String): Double
  def search_body(sre: String): Double
  def search_hf(hname: String, sre: String, flags: String): Double
  def set_body(nb: String, nc: String): Double
  def set_body_multipart(nbody: String, ctype: String, boundary: String): Double
  def set_body_multipart_boundary(boundary: String): Double
  def set_body_multipart_content(nbody: String, ctype: String): Double
  def set_body_multipart_mode(): Double
  def set_reply_body(nb: String, nc: String): Double
  def starts_with(s1: String, s2: String): Double
  def subst(subst: String): Double
  def subst_body(subst: String): Double
  def subst_hf(hname: String, subst: String, flags: String): Double
  def subst_uri(subst: String): Double
  def subst_user(subst: String): Double
}

object Typeoftextops {
  @scala.inline
  def apply(
    append_body_part: (String, String) => CallbackTo[Double],
    append_body_part_cd: (String, String, String) => CallbackTo[Double],
    append_body_part_hex: (String, String) => CallbackTo[Double],
    append_body_part_hex_cd: (String, String, String) => CallbackTo[Double],
    cmp_istr: (String, String) => CallbackTo[Double],
    cmp_str: (String, String) => CallbackTo[Double],
    filter_body: String => CallbackTo[Double],
    get_body_part: (String, String) => CallbackTo[Double],
    get_body_part_raw: (String, String) => CallbackTo[Double],
    has_body: CallbackTo[Double],
    has_body_type: String => CallbackTo[Double],
    in_list: (String, String, String) => CallbackTo[Double],
    in_list_prefix: (String, String, String) => CallbackTo[Double],
    is_audio_on_hold: CallbackTo[Double],
    is_present_hf: String => CallbackTo[Double],
    is_present_hf_re: String => CallbackTo[Double],
    is_privacy: String => CallbackTo[Double],
    remove_body_part: String => CallbackTo[Double],
    remove_hf_exp: (String, String) => CallbackTo[Double],
    remove_hf_re: String => CallbackTo[Double],
    replace: (String, String) => CallbackTo[Double],
    replace_all: (String, String) => CallbackTo[Double],
    replace_body: (String, String) => CallbackTo[Double],
    replace_body_all: (String, String) => CallbackTo[Double],
    replace_body_atonce: (String, String) => CallbackTo[Double],
    replace_body_str: (String, String, String) => CallbackTo[Double],
    replace_hdrs: (String, String) => CallbackTo[Double],
    replace_hdrs_str: (String, String, String) => CallbackTo[Double],
    replace_str: (String, String, String) => CallbackTo[Double],
    search: String => CallbackTo[Double],
    search_append: (String, String) => CallbackTo[Double],
    search_append_body: (String, String) => CallbackTo[Double],
    search_body: String => CallbackTo[Double],
    search_hf: (String, String, String) => CallbackTo[Double],
    set_body: (String, String) => CallbackTo[Double],
    set_body_multipart: (String, String, String) => CallbackTo[Double],
    set_body_multipart_boundary: String => CallbackTo[Double],
    set_body_multipart_content: (String, String) => CallbackTo[Double],
    set_body_multipart_mode: CallbackTo[Double],
    set_reply_body: (String, String) => CallbackTo[Double],
    starts_with: (String, String) => CallbackTo[Double],
    subst: String => CallbackTo[Double],
    subst_body: String => CallbackTo[Double],
    subst_hf: (String, String, String) => CallbackTo[Double],
    subst_uri: String => CallbackTo[Double],
    subst_user: String => CallbackTo[Double]
  ): Typeoftextops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("append_body_part")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => append_body_part(t0, t1).runNow()))
    __obj.updateDynamic("append_body_part_cd")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => append_body_part_cd(t0, t1, t2).runNow()))
    __obj.updateDynamic("append_body_part_hex")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => append_body_part_hex(t0, t1).runNow()))
    __obj.updateDynamic("append_body_part_hex_cd")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => append_body_part_hex_cd(t0, t1, t2).runNow()))
    __obj.updateDynamic("cmp_istr")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => cmp_istr(t0, t1).runNow()))
    __obj.updateDynamic("cmp_str")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => cmp_str(t0, t1).runNow()))
    __obj.updateDynamic("filter_body")(js.Any.fromFunction1((t0: java.lang.String) => filter_body(t0).runNow()))
    __obj.updateDynamic("get_body_part")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get_body_part(t0, t1).runNow()))
    __obj.updateDynamic("get_body_part_raw")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => get_body_part_raw(t0, t1).runNow()))
    __obj.updateDynamic("has_body")(has_body.toJsFn)
    __obj.updateDynamic("has_body_type")(js.Any.fromFunction1((t0: java.lang.String) => has_body_type(t0).runNow()))
    __obj.updateDynamic("in_list")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => in_list(t0, t1, t2).runNow()))
    __obj.updateDynamic("in_list_prefix")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => in_list_prefix(t0, t1, t2).runNow()))
    __obj.updateDynamic("is_audio_on_hold")(is_audio_on_hold.toJsFn)
    __obj.updateDynamic("is_present_hf")(js.Any.fromFunction1((t0: java.lang.String) => is_present_hf(t0).runNow()))
    __obj.updateDynamic("is_present_hf_re")(js.Any.fromFunction1((t0: java.lang.String) => is_present_hf_re(t0).runNow()))
    __obj.updateDynamic("is_privacy")(js.Any.fromFunction1((t0: java.lang.String) => is_privacy(t0).runNow()))
    __obj.updateDynamic("remove_body_part")(js.Any.fromFunction1((t0: java.lang.String) => remove_body_part(t0).runNow()))
    __obj.updateDynamic("remove_hf_exp")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => remove_hf_exp(t0, t1).runNow()))
    __obj.updateDynamic("remove_hf_re")(js.Any.fromFunction1((t0: java.lang.String) => remove_hf_re(t0).runNow()))
    __obj.updateDynamic("replace")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => replace(t0, t1).runNow()))
    __obj.updateDynamic("replace_all")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => replace_all(t0, t1).runNow()))
    __obj.updateDynamic("replace_body")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => replace_body(t0, t1).runNow()))
    __obj.updateDynamic("replace_body_all")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => replace_body_all(t0, t1).runNow()))
    __obj.updateDynamic("replace_body_atonce")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => replace_body_atonce(t0, t1).runNow()))
    __obj.updateDynamic("replace_body_str")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => replace_body_str(t0, t1, t2).runNow()))
    __obj.updateDynamic("replace_hdrs")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => replace_hdrs(t0, t1).runNow()))
    __obj.updateDynamic("replace_hdrs_str")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => replace_hdrs_str(t0, t1, t2).runNow()))
    __obj.updateDynamic("replace_str")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => replace_str(t0, t1, t2).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: java.lang.String) => search(t0).runNow()))
    __obj.updateDynamic("search_append")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => search_append(t0, t1).runNow()))
    __obj.updateDynamic("search_append_body")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => search_append_body(t0, t1).runNow()))
    __obj.updateDynamic("search_body")(js.Any.fromFunction1((t0: java.lang.String) => search_body(t0).runNow()))
    __obj.updateDynamic("search_hf")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => search_hf(t0, t1, t2).runNow()))
    __obj.updateDynamic("set_body")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set_body(t0, t1).runNow()))
    __obj.updateDynamic("set_body_multipart")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => set_body_multipart(t0, t1, t2).runNow()))
    __obj.updateDynamic("set_body_multipart_boundary")(js.Any.fromFunction1((t0: java.lang.String) => set_body_multipart_boundary(t0).runNow()))
    __obj.updateDynamic("set_body_multipart_content")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set_body_multipart_content(t0, t1).runNow()))
    __obj.updateDynamic("set_body_multipart_mode")(set_body_multipart_mode.toJsFn)
    __obj.updateDynamic("set_reply_body")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set_reply_body(t0, t1).runNow()))
    __obj.updateDynamic("starts_with")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => starts_with(t0, t1).runNow()))
    __obj.updateDynamic("subst")(js.Any.fromFunction1((t0: java.lang.String) => subst(t0).runNow()))
    __obj.updateDynamic("subst_body")(js.Any.fromFunction1((t0: java.lang.String) => subst_body(t0).runNow()))
    __obj.updateDynamic("subst_hf")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => subst_hf(t0, t1, t2).runNow()))
    __obj.updateDynamic("subst_uri")(js.Any.fromFunction1((t0: java.lang.String) => subst_uri(t0).runNow()))
    __obj.updateDynamic("subst_user")(js.Any.fromFunction1((t0: java.lang.String) => subst_user(t0).runNow()))
    __obj.asInstanceOf[Typeoftextops]
  }
}

