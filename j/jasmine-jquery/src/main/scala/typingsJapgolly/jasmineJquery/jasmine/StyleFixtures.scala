package typingsJapgolly.jasmineJquery.jasmine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleFixtures extends js.Object {
  var fixturesPath: String
  def appendLoad(uls: String*): Unit
  def appendSet(html: String): Unit
  def cleanUp(): Unit
  def clearCache(): Unit
  def createStyle_(html: String): Unit
  def getFixtureHtml_(url: String): String
  def load(uls: String*): Unit
  def loadFixtureIntoCache_(relativeUrl: String): Unit
  def makeFixtureUrl_(relativeUrl: String): String
  def preload(uls: String*): Unit
  def proxyCallTo_(methodName: String, passedArguments: js.Any): js.Any
  def read_(uls: String*): String
  def set(html: String): String
}

object StyleFixtures {
  @scala.inline
  def apply(
    appendLoad: /* repeated */ String => Callback,
    appendSet: String => Callback,
    cleanUp: Callback,
    clearCache: Callback,
    createStyle_ : String => Callback,
    fixturesPath: String,
    getFixtureHtml_ : String => CallbackTo[String],
    load: /* repeated */ String => Callback,
    loadFixtureIntoCache_ : String => Callback,
    makeFixtureUrl_ : String => CallbackTo[String],
    preload: /* repeated */ String => Callback,
    proxyCallTo_ : (String, js.Any) => CallbackTo[js.Any],
    read_ : /* repeated */ String => CallbackTo[String],
    set: String => CallbackTo[String]
  ): StyleFixtures = {
    val __obj = js.Dynamic.literal(fixturesPath = fixturesPath.asInstanceOf[js.Any])
    __obj.updateDynamic("appendLoad")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => appendLoad(t0).runNow()))
    __obj.updateDynamic("appendSet")(js.Any.fromFunction1((t0: java.lang.String) => appendSet(t0).runNow()))
    __obj.updateDynamic("cleanUp")(cleanUp.toJsFn)
    __obj.updateDynamic("clearCache")(clearCache.toJsFn)
    __obj.updateDynamic("createStyle_")(js.Any.fromFunction1((t0: java.lang.String) => createStyle_(t0).runNow()))
    __obj.updateDynamic("getFixtureHtml_")(js.Any.fromFunction1((t0: java.lang.String) => getFixtureHtml_(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => load(t0).runNow()))
    __obj.updateDynamic("loadFixtureIntoCache_")(js.Any.fromFunction1((t0: java.lang.String) => loadFixtureIntoCache_(t0).runNow()))
    __obj.updateDynamic("makeFixtureUrl_")(js.Any.fromFunction1((t0: java.lang.String) => makeFixtureUrl_(t0).runNow()))
    __obj.updateDynamic("preload")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => preload(t0).runNow()))
    __obj.updateDynamic("proxyCallTo_")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => proxyCallTo_(t0, t1).runNow()))
    __obj.updateDynamic("read_")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => read_(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.asInstanceOf[StyleFixtures]
  }
}

