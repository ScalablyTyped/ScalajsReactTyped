package typingsJapgolly.markdownItContainer.mod.markdownItContainer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.markdownIt.tokenMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOpts extends js.Object {
  var marker: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[
    js.Function5[
      /* tokens */ js.Array[^], 
      /* index */ Double, 
      /* options */ js.Any, 
      /* env */ js.Any, 
      /* self */ typingsJapgolly.markdownIt.rendererMod.^, 
      Unit
    ]
  ] = js.undefined
  var validate: js.UndefOr[js.Function1[/* params */ String, Boolean]] = js.undefined
}

object ContainerOpts {
  @scala.inline
  def apply(
    marker: String = null,
    render: (/* tokens */ js.Array[^], /* index */ Double, /* options */ js.Any, /* env */ js.Any, /* self */ typingsJapgolly.markdownIt.rendererMod.^) => Callback = null,
    validate: /* params */ String => CallbackTo[Boolean] = null
  ): ContainerOpts = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction5((t0: /* tokens */ js.Array[typingsJapgolly.markdownIt.tokenMod.^], t1: /* index */ scala.Double, t2: /* options */ js.Any, t3: /* env */ js.Any, t4: /* self */ typingsJapgolly.markdownIt.rendererMod.^) => render(t0, t1, t2, t3, t4).runNow()))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1((t0: /* params */ java.lang.String) => validate(t0).runNow()))
    __obj.asInstanceOf[ContainerOpts]
  }
}

