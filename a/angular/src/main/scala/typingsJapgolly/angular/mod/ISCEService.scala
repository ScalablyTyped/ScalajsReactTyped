package typingsJapgolly.angular.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEService
// see http://docs.angularjs.org/api/ng.$sce
///////////////////////////////////////////////////////////////////////////
trait ISCEService extends js.Object {
  def getTrusted(`type`: String, mayBeTrusted: js.Any): js.Any
  def getTrustedCss(value: js.Any): js.Any
  def getTrustedHtml(value: js.Any): js.Any
  def getTrustedJs(value: js.Any): js.Any
  def getTrustedResourceUrl(value: js.Any): js.Any
  def getTrustedUrl(value: js.Any): js.Any
  def isEnabled(): Boolean
  def parse(`type`: String, expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsCss(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsHtml(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsJs(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsResourceUrl(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def parseAsUrl(expression: String): js.Function2[/* context */ js.Any, /* locals */ js.Any, _]
  def trustAs(`type`: String, value: js.Any): js.Any
  def trustAsHtml(value: js.Any): js.Any
  def trustAsJs(value: js.Any): js.Any
  def trustAsResourceUrl(value: js.Any): js.Any
  def trustAsUrl(value: js.Any): js.Any
}

object ISCEService {
  @scala.inline
  def apply(
    getTrusted: (String, js.Any) => CallbackTo[js.Any],
    getTrustedCss: js.Any => CallbackTo[js.Any],
    getTrustedHtml: js.Any => CallbackTo[js.Any],
    getTrustedJs: js.Any => CallbackTo[js.Any],
    getTrustedResourceUrl: js.Any => CallbackTo[js.Any],
    getTrustedUrl: js.Any => CallbackTo[js.Any],
    isEnabled: CallbackTo[Boolean],
    parse: (String, String) => CallbackTo[js.Function2[/* context */ js.Any, /* locals */ js.Any, js.Any]],
    parseAsCss: String => CallbackTo[js.Function2[/* context */ js.Any, /* locals */ js.Any, js.Any]],
    parseAsHtml: String => CallbackTo[js.Function2[/* context */ js.Any, /* locals */ js.Any, js.Any]],
    parseAsJs: String => CallbackTo[js.Function2[/* context */ js.Any, /* locals */ js.Any, js.Any]],
    parseAsResourceUrl: String => CallbackTo[js.Function2[/* context */ js.Any, /* locals */ js.Any, js.Any]],
    parseAsUrl: String => CallbackTo[js.Function2[/* context */ js.Any, /* locals */ js.Any, js.Any]],
    trustAs: (String, js.Any) => CallbackTo[js.Any],
    trustAsHtml: js.Any => CallbackTo[js.Any],
    trustAsJs: js.Any => CallbackTo[js.Any],
    trustAsResourceUrl: js.Any => CallbackTo[js.Any],
    trustAsUrl: js.Any => CallbackTo[js.Any]
  ): ISCEService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTrusted")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => getTrusted(t0, t1).runNow()))
    __obj.updateDynamic("getTrustedCss")(js.Any.fromFunction1((t0: js.Any) => getTrustedCss(t0).runNow()))
    __obj.updateDynamic("getTrustedHtml")(js.Any.fromFunction1((t0: js.Any) => getTrustedHtml(t0).runNow()))
    __obj.updateDynamic("getTrustedJs")(js.Any.fromFunction1((t0: js.Any) => getTrustedJs(t0).runNow()))
    __obj.updateDynamic("getTrustedResourceUrl")(js.Any.fromFunction1((t0: js.Any) => getTrustedResourceUrl(t0).runNow()))
    __obj.updateDynamic("getTrustedUrl")(js.Any.fromFunction1((t0: js.Any) => getTrustedUrl(t0).runNow()))
    __obj.updateDynamic("isEnabled")(isEnabled.toJsFn)
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => parse(t0, t1).runNow()))
    __obj.updateDynamic("parseAsCss")(js.Any.fromFunction1((t0: java.lang.String) => parseAsCss(t0).runNow()))
    __obj.updateDynamic("parseAsHtml")(js.Any.fromFunction1((t0: java.lang.String) => parseAsHtml(t0).runNow()))
    __obj.updateDynamic("parseAsJs")(js.Any.fromFunction1((t0: java.lang.String) => parseAsJs(t0).runNow()))
    __obj.updateDynamic("parseAsResourceUrl")(js.Any.fromFunction1((t0: java.lang.String) => parseAsResourceUrl(t0).runNow()))
    __obj.updateDynamic("parseAsUrl")(js.Any.fromFunction1((t0: java.lang.String) => parseAsUrl(t0).runNow()))
    __obj.updateDynamic("trustAs")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => trustAs(t0, t1).runNow()))
    __obj.updateDynamic("trustAsHtml")(js.Any.fromFunction1((t0: js.Any) => trustAsHtml(t0).runNow()))
    __obj.updateDynamic("trustAsJs")(js.Any.fromFunction1((t0: js.Any) => trustAsJs(t0).runNow()))
    __obj.updateDynamic("trustAsResourceUrl")(js.Any.fromFunction1((t0: js.Any) => trustAsResourceUrl(t0).runNow()))
    __obj.updateDynamic("trustAsUrl")(js.Any.fromFunction1((t0: js.Any) => trustAsUrl(t0).runNow()))
    __obj.asInstanceOf[ISCEService]
  }
}

