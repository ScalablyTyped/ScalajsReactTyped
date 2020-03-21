package typingsJapgolly.protractor.locatorsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.seleniumWebdriver.mod.WebDriver
import typingsJapgolly.seleniumWebdriver.mod.WebElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtractorLocator extends js.Object {
  var column: js.UndefOr[js.Function1[/* index */ String, Locator]] = js.undefined
  var row: js.UndefOr[js.Function1[/* index */ Double, Locator]] = js.undefined
  @JSName("toString")
  var toString_FProtractorLocator: js.UndefOr[js.Function0[String]] = js.undefined
  def findElementsOverride(driver: WebDriver, using: WebElement, rootSelector: String): js.Promise[js.Array[WebElement]]
}

object ProtractorLocator {
  @scala.inline
  def apply(
    findElementsOverride: (WebDriver, WebElement, String) => CallbackTo[js.Promise[js.Array[WebElement]]],
    column: /* index */ String => CallbackTo[Locator] = null,
    row: /* index */ Double => CallbackTo[Locator] = null,
    toString: js.UndefOr[CallbackTo[String]] = js.undefined
  ): ProtractorLocator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findElementsOverride")(js.Any.fromFunction3((t0: typingsJapgolly.seleniumWebdriver.mod.WebDriver, t1: typingsJapgolly.seleniumWebdriver.mod.WebElement, t2: java.lang.String) => findElementsOverride(t0, t1, t2).runNow()))
    if (column != null) __obj.updateDynamic("column")(js.Any.fromFunction1((t0: /* index */ java.lang.String) => column(t0).runNow()))
    if (row != null) __obj.updateDynamic("row")(js.Any.fromFunction1((t0: /* index */ scala.Double) => row(t0).runNow()))
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    __obj.asInstanceOf[ProtractorLocator]
  }
}

