package typingsJapgolly.bluebirdLst.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyAllOptions extends PromisifyOptions {
  var filter: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* func */ js.Function1[/* repeated */ js.Any, _], 
      /* target */ js.UndefOr[js.Any], 
      /* passesDefaultFilter */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.undefined
  // The promisifier gets a reference to the original method and should return a function which returns a promise
  var promisifier: js.UndefOr[
    js.Function2[
      /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]], 
      js.Function0[js.Thenable[_]]
    ]
  ] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object PromisifyAllOptions {
  @scala.inline
  def apply(
    context: js.Any = null,
    filter: (/* name */ String, /* func */ js.Function1[/* repeated */ js.Any, js.Any], /* target */ js.UndefOr[js.Any], /* passesDefaultFilter */ js.UndefOr[Boolean]) => CallbackTo[Boolean] = null,
    multiArgs: js.UndefOr[Boolean] = js.undefined,
    promisifier: (/* originalMethod */ js.Function1[/* repeated */ js.Any, js.Any], /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[js.Any, Bluebird[js.Any]]]) => CallbackTo[js.Function0[js.Thenable[js.Any]]] = null,
    suffix: String = null
  ): PromisifyAllOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* name */ java.lang.String, t1: /* func */ js.Function1[/* repeated */ js.Any, js.Any], t2: /* target */ js.UndefOr[js.Any], t3: /* passesDefaultFilter */ js.UndefOr[scala.Boolean]) => filter(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs.asInstanceOf[js.Any])
    if (promisifier != null) __obj.updateDynamic("promisifier")(js.Any.fromFunction2((t0: /* originalMethod */ js.Function1[/* repeated */ js.Any, js.Any], t1: /* defaultPromisifer */ js.Function1[
  /* repeated */ js.Any, 
  js.Function1[js.Any, typingsJapgolly.bluebirdLst.mod.Bluebird[js.Any]]]) => promisifier(t0, t1).runNow()))
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisifyAllOptions]
  }
}

