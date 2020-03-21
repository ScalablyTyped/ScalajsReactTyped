package typingsJapgolly.traverson.mod.Traverson

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends js.Object {
  def delete(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def follow(first_pattern: String, rest_patterns: String*): Builder
  def get(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def getResource(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def getUrl(
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def json(): Builder
  def jsonHal(): Builder
  def newRequest(): Builder
  def patch(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def post(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def put(
    data: js.Any,
    callback: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]
  ): InAction
  def setMediaType(type_name: String): Builder
  def withRequestOptions(options: js.Any): Builder
  def withTemplateParameters(parameters: js.Any): Builder
}

object Builder {
  @scala.inline
  def apply(
    delete: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => CallbackTo[InAction],
    follow: (String, /* repeated */ String) => CallbackTo[Builder],
    get: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => CallbackTo[InAction],
    getResource: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => CallbackTo[InAction],
    getUrl: js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit] => CallbackTo[InAction],
    json: CallbackTo[Builder],
    jsonHal: CallbackTo[Builder],
    newRequest: CallbackTo[Builder],
    patch: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => CallbackTo[InAction],
    post: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => CallbackTo[InAction],
    put: (js.Any, js.Function3[/* err */ js.Any, /* document */ js.Any, /* traversal */ js.UndefOr[Traversal], Unit]) => CallbackTo[InAction],
    setMediaType: String => CallbackTo[Builder],
    withRequestOptions: js.Any => CallbackTo[Builder],
    withTemplateParameters: js.Any => CallbackTo[Builder]
  ): Builder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: js.Function3[
  /* err */ js.Any, 
  /* document */ js.Any, 
  /* traversal */ js.UndefOr[typingsJapgolly.traverson.mod.Traverson.Traversal], 
  scala.Unit]) => delete(t0).runNow()))
    __obj.updateDynamic("follow")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ java.lang.String) => follow(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Function3[
  /* err */ js.Any, 
  /* document */ js.Any, 
  /* traversal */ js.UndefOr[typingsJapgolly.traverson.mod.Traverson.Traversal], 
  scala.Unit]) => get(t0).runNow()))
    __obj.updateDynamic("getResource")(js.Any.fromFunction1((t0: js.Function3[
  /* err */ js.Any, 
  /* document */ js.Any, 
  /* traversal */ js.UndefOr[typingsJapgolly.traverson.mod.Traverson.Traversal], 
  scala.Unit]) => getResource(t0).runNow()))
    __obj.updateDynamic("getUrl")(js.Any.fromFunction1((t0: js.Function3[
  /* err */ js.Any, 
  /* document */ js.Any, 
  /* traversal */ js.UndefOr[typingsJapgolly.traverson.mod.Traverson.Traversal], 
  scala.Unit]) => getUrl(t0).runNow()))
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("jsonHal")(jsonHal.toJsFn)
    __obj.updateDynamic("newRequest")(newRequest.toJsFn)
    __obj.updateDynamic("patch")(js.Any.fromFunction2((t0: js.Any, t1: js.Function3[
  /* err */ js.Any, 
  /* document */ js.Any, 
  /* traversal */ js.UndefOr[typingsJapgolly.traverson.mod.Traverson.Traversal], 
  scala.Unit]) => patch(t0, t1).runNow()))
    __obj.updateDynamic("post")(js.Any.fromFunction2((t0: js.Any, t1: js.Function3[
  /* err */ js.Any, 
  /* document */ js.Any, 
  /* traversal */ js.UndefOr[typingsJapgolly.traverson.mod.Traverson.Traversal], 
  scala.Unit]) => post(t0, t1).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: js.Any, t1: js.Function3[
  /* err */ js.Any, 
  /* document */ js.Any, 
  /* traversal */ js.UndefOr[typingsJapgolly.traverson.mod.Traverson.Traversal], 
  scala.Unit]) => put(t0, t1).runNow()))
    __obj.updateDynamic("setMediaType")(js.Any.fromFunction1((t0: java.lang.String) => setMediaType(t0).runNow()))
    __obj.updateDynamic("withRequestOptions")(js.Any.fromFunction1((t0: js.Any) => withRequestOptions(t0).runNow()))
    __obj.updateDynamic("withTemplateParameters")(js.Any.fromFunction1((t0: js.Any) => withTemplateParameters(t0).runNow()))
    __obj.asInstanceOf[Builder]
  }
}

