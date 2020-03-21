package typingsJapgolly.redisScripto.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scripto extends js.Object {
  def eval(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  ): Unit
  def evalSha(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  ): Unit
  def load(scripts: Scripts): Unit
  def loadFromDir(scriptsDir: String): Unit
  def loadFromFile(name: String, filepath: String): Unit
  def run(
    scriptName: String,
    keys: js.Array[String],
    args: js.Array[_],
    callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
  ): Unit
}

object Scripto {
  @scala.inline
  def apply(
    eval: (String, js.Array[String], js.Array[js.Any], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Callback,
    evalSha: (String, js.Array[String], js.Array[js.Any], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Callback,
    load: Scripts => Callback,
    loadFromDir: String => Callback,
    loadFromFile: (String, String) => Callback,
    run: (String, js.Array[String], js.Array[js.Any], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Callback
  ): Scripto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eval")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Array[java.lang.String], t2: js.Array[js.Any], t3: js.Function2[/* err */ js.Error, /* result */ js.Any, scala.Unit]) => eval(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("evalSha")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Array[java.lang.String], t2: js.Array[js.Any], t3: js.Function2[/* err */ js.Error, /* result */ js.Any, scala.Unit]) => evalSha(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: typingsJapgolly.redisScripto.mod.Scripts) => load(t0).runNow()))
    __obj.updateDynamic("loadFromDir")(js.Any.fromFunction1((t0: java.lang.String) => loadFromDir(t0).runNow()))
    __obj.updateDynamic("loadFromFile")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => loadFromFile(t0, t1).runNow()))
    __obj.updateDynamic("run")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Array[java.lang.String], t2: js.Array[js.Any], t3: js.Function2[/* err */ js.Error, /* result */ js.Any, scala.Unit]) => run(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Scripto]
  }
}

