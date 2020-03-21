package typingsJapgolly.bluebird.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyAllOptions[T] extends PromisifyOptions {
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
    js.ThisFunction2[
      /* this */ T, 
      /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]], 
      js.Function0[js.Thenable[_]]
    ]
  ] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object PromisifyAllOptions {
  @scala.inline
  def apply[T](
    context: js.Any = null,
    filter: (/* name */ String, /* func */ js.Function1[/* repeated */ js.Any, js.Any], /* target */ js.UndefOr[js.Any], /* passesDefaultFilter */ js.UndefOr[Boolean]) => CallbackTo[Boolean] = null,
    multiArgs: js.UndefOr[Boolean] = js.undefined,
    promisifier: js.ThisFunction2[
      /* this */ T, 
      /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultPromisifer */ js.Function1[/* repeated */ js.Any, js.Function1[/* repeated */ _, Bluebird[_]]], 
      js.Function0[js.Thenable[_]]
    ] = null,
    suffix: String = null
  ): PromisifyAllOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4((t0: /* name */ java.lang.String, t1: /* func */ js.Function1[/* repeated */ js.Any, js.Any], t2: /* target */ js.UndefOr[js.Any], t3: /* passesDefaultFilter */ js.UndefOr[scala.Boolean]) => filter(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs.asInstanceOf[js.Any])
    if (promisifier != null) __obj.updateDynamic("promisifier")(promisifier.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisifyAllOptions[T]]
  }
}

