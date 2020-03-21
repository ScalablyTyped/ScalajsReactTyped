package typingsJapgolly.jqueryAjaxfile.KnockoutComponentTypes

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  var getConfig: js.UndefOr[
    js.Function2[
      /* componentName */ String, 
      /* callback */ js.Function1[/* result */ ComponentConfig, Unit], 
      Unit
    ]
  ] = js.undefined
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* config */ ComponentConfig, 
      /* callback */ js.Function1[/* result */ Definition, Unit], 
      Unit
    ]
  ] = js.undefined
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[Node], Unit], 
      Unit
    ]
  ] = js.undefined
  var loadViewModel: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* viewModelConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Any, Unit], 
      Unit
    ]
  ] = js.undefined
  var suppressLoaderExceptions: js.UndefOr[Boolean] = js.undefined
}

object Loader {
  @scala.inline
  def apply(
    getConfig: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig, Unit]) => Callback = null,
    loadComponent: (/* componentName */ String, /* config */ ComponentConfig, /* callback */ js.Function1[/* result */ Definition, Unit]) => Callback = null,
    loadTemplate: (/* componentName */ String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[Node], Unit]) => Callback = null,
    loadViewModel: (/* componentName */ String, /* viewModelConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Any, Unit]) => Callback = null,
    suppressLoaderExceptions: js.UndefOr[Boolean] = js.undefined
  ): Loader = {
    val __obj = js.Dynamic.literal()
    if (getConfig != null) __obj.updateDynamic("getConfig")(js.Any.fromFunction2((t0: /* componentName */ java.lang.String, t1: /* callback */ js.Function1[
  /* result */ typingsJapgolly.jqueryAjaxfile.KnockoutComponentTypes.ComponentConfig, 
  scala.Unit]) => getConfig(t0, t1).runNow()))
    if (loadComponent != null) __obj.updateDynamic("loadComponent")(js.Any.fromFunction3((t0: /* componentName */ java.lang.String, t1: /* config */ typingsJapgolly.jqueryAjaxfile.KnockoutComponentTypes.ComponentConfig, t2: /* callback */ js.Function1[
  /* result */ typingsJapgolly.jqueryAjaxfile.KnockoutComponentTypes.Definition, 
  scala.Unit]) => loadComponent(t0, t1, t2).runNow()))
    if (loadTemplate != null) __obj.updateDynamic("loadTemplate")(js.Any.fromFunction3((t0: /* componentName */ java.lang.String, t1: /* templateConfig */ js.Any, t2: /* callback */ js.Function1[/* result */ js.Array[org.scalajs.dom.raw.Node], scala.Unit]) => loadTemplate(t0, t1, t2).runNow()))
    if (loadViewModel != null) __obj.updateDynamic("loadViewModel")(js.Any.fromFunction3((t0: /* componentName */ java.lang.String, t1: /* viewModelConfig */ js.Any, t2: /* callback */ js.Function1[/* result */ js.Any, scala.Unit]) => loadViewModel(t0, t1, t2).runNow()))
    if (!js.isUndefined(suppressLoaderExceptions)) __obj.updateDynamic("suppressLoaderExceptions")(suppressLoaderExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
}

