package typingsJapgolly.jasmineJquery.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFixtures extends js.Object {
  var fixturesPath: String
  def clearCache(): Unit
  def getFixtureData_(url: String): js.Any
  def load(uls: String*): Unit
  def loadFixtureIntoCache_(relativeUrl: String): Unit
  def proxyCallTo_(methodName: String, passedArguments: js.Any): js.Any
  def read(uls: String*): String
}

object JSONFixtures {
  @scala.inline
  def apply(
    clearCache: Callback,
    fixturesPath: String,
    getFixtureData_ : String => CallbackTo[js.Any],
    load: /* repeated */ String => Callback,
    loadFixtureIntoCache_ : String => Callback,
    proxyCallTo_ : (String, js.Any) => CallbackTo[js.Any],
    read: /* repeated */ String => CallbackTo[String]
  ): JSONFixtures = {
    val __obj = js.Dynamic.literal(fixturesPath = fixturesPath.asInstanceOf[js.Any])
    __obj.updateDynamic("clearCache")(clearCache.toJsFn)
    __obj.updateDynamic("getFixtureData_")(js.Any.fromFunction1((t0: java.lang.String) => getFixtureData_(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => load(t0).runNow()))
    __obj.updateDynamic("loadFixtureIntoCache_")(js.Any.fromFunction1((t0: java.lang.String) => loadFixtureIntoCache_(t0).runNow()))
    __obj.updateDynamic("proxyCallTo_")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => proxyCallTo_(t0, t1).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => read(t0).runNow()))
    __obj.asInstanceOf[JSONFixtures]
  }
}

