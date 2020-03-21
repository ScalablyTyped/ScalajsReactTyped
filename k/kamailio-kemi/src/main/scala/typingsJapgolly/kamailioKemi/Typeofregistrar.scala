package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofregistrar extends js.Object {
  def add_sock_hdr(hdr_name: String): Double
  def lookup(table: String): Double
  def lookup_branches(_dtable: String): Double
  def lookup_to_dset(table: String, uri: String): Double
  def lookup_uri(table: String, uri: String): Double
  def reg_fetch_contacts(dtable: String, uri: String, profile: String): Double
  def reg_free_contacts(profile: String): Double
  def registered(table: String): Double
  def registered_action(_dtable: String, _uri: String, _f: Double, _aflags: Double): Double
  def registered_flags(_dtable: String, _uri: String, _f: Double): Double
  def registered_uri(_dtable: String, _uri: String): Double
  def save(table: String, flags: Double): Double
  def save_uri(table: String, flags: Double, uri: String): Double
  def set_q_override(new_q: String): Double
  def unregister(_dtable: String, _uri: String): Double
  def unregister_ruid(_dtable: String, _uri: String, _ruid: String): Double
}

object Typeofregistrar {
  @scala.inline
  def apply(
    add_sock_hdr: String => CallbackTo[Double],
    lookup: String => CallbackTo[Double],
    lookup_branches: String => CallbackTo[Double],
    lookup_to_dset: (String, String) => CallbackTo[Double],
    lookup_uri: (String, String) => CallbackTo[Double],
    reg_fetch_contacts: (String, String, String) => CallbackTo[Double],
    reg_free_contacts: String => CallbackTo[Double],
    registered: String => CallbackTo[Double],
    registered_action: (String, String, Double, Double) => CallbackTo[Double],
    registered_flags: (String, String, Double) => CallbackTo[Double],
    registered_uri: (String, String) => CallbackTo[Double],
    save: (String, Double) => CallbackTo[Double],
    save_uri: (String, Double, String) => CallbackTo[Double],
    set_q_override: String => CallbackTo[Double],
    unregister: (String, String) => CallbackTo[Double],
    unregister_ruid: (String, String, String) => CallbackTo[Double]
  ): Typeofregistrar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add_sock_hdr")(js.Any.fromFunction1((t0: java.lang.String) => add_sock_hdr(t0).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("lookup_branches")(js.Any.fromFunction1((t0: java.lang.String) => lookup_branches(t0).runNow()))
    __obj.updateDynamic("lookup_to_dset")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => lookup_to_dset(t0, t1).runNow()))
    __obj.updateDynamic("lookup_uri")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => lookup_uri(t0, t1).runNow()))
    __obj.updateDynamic("reg_fetch_contacts")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => reg_fetch_contacts(t0, t1, t2).runNow()))
    __obj.updateDynamic("reg_free_contacts")(js.Any.fromFunction1((t0: java.lang.String) => reg_free_contacts(t0).runNow()))
    __obj.updateDynamic("registered")(js.Any.fromFunction1((t0: java.lang.String) => registered(t0).runNow()))
    __obj.updateDynamic("registered_action")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: scala.Double) => registered_action(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("registered_flags")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: scala.Double) => registered_flags(t0, t1, t2).runNow()))
    __obj.updateDynamic("registered_uri")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => registered_uri(t0, t1).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => save(t0, t1).runNow()))
    __obj.updateDynamic("save_uri")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: java.lang.String) => save_uri(t0, t1, t2).runNow()))
    __obj.updateDynamic("set_q_override")(js.Any.fromFunction1((t0: java.lang.String) => set_q_override(t0).runNow()))
    __obj.updateDynamic("unregister")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => unregister(t0, t1).runNow()))
    __obj.updateDynamic("unregister_ruid")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => unregister_ruid(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofregistrar]
  }
}

