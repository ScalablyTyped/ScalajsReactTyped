package typingsJapgolly.meteor.serverRenderMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sink extends js.Object {
  var appendToBody: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.undefined
  var appendToElementById: js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]] = js.undefined
  var appendToHead: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.undefined
  var arch: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var head: js.UndefOr[String] = js.undefined
  var htmlById: js.UndefOr[StringDictionary[String]] = js.undefined
  var maybeMadeChanges: js.UndefOr[Boolean] = js.undefined
  var renderIntoElementById: js.UndefOr[
    (js.Function2[/* id */ String, /* html */ String, Unit]) with (js.Function2[/* id */ String, /* html */ ReadableStream, Unit])
  ] = js.undefined
  var request: js.UndefOr[IncomingMessage] = js.undefined
}

object Sink {
  @scala.inline
  def apply(
    appendToBody: /* html */ String => japgolly.scalajs.react.Callback = null,
    appendToElementById: (/* id */ String, /* html */ String) => japgolly.scalajs.react.Callback = null,
    appendToHead: /* html */ String => japgolly.scalajs.react.Callback = null,
    arch: String = null,
    body: String = null,
    head: String = null,
    htmlById: StringDictionary[String] = null,
    maybeMadeChanges: js.UndefOr[Boolean] = js.undefined,
    renderIntoElementById: (js.Function2[/* id */ String, /* html */ String, Unit]) with (js.Function2[/* id */ String, /* html */ ReadableStream, Unit]) = null,
    request: IncomingMessage = null
  ): Sink = {
    val __obj = js.Dynamic.literal()
    if (appendToBody != null) __obj.updateDynamic("appendToBody")(js.Any.fromFunction1((t0: /* html */ java.lang.String) => appendToBody(t0).runNow()))
    if (appendToElementById != null) __obj.updateDynamic("appendToElementById")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* html */ java.lang.String) => appendToElementById(t0, t1).runNow()))
    if (appendToHead != null) __obj.updateDynamic("appendToHead")(js.Any.fromFunction1((t0: /* html */ java.lang.String) => appendToHead(t0).runNow()))
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (htmlById != null) __obj.updateDynamic("htmlById")(htmlById.asInstanceOf[js.Any])
    if (!js.isUndefined(maybeMadeChanges)) __obj.updateDynamic("maybeMadeChanges")(maybeMadeChanges.asInstanceOf[js.Any])
    if (renderIntoElementById != null) __obj.updateDynamic("renderIntoElementById")(renderIntoElementById.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sink]
  }
}

