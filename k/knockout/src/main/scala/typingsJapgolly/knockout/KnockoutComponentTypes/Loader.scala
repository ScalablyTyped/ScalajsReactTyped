package typingsJapgolly.knockout.KnockoutComponentTypes

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Loader extends js.Object {
  /**
    * Define this if: you want to supply configurations programmatically based on names, e.g., to implement a naming convention.
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var getConfig: js.UndefOr[
    js.Function2[
      /* componentName */ String, 
      /* callback */ js.Function1[/* result */ ComponentConfig[ViewModel] | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to take control over how component configurations are interpreted, e.g., if you do not want to use the standard 'viewModel/template' pair format.
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadComponent: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* config */ ComponentConfig[ViewModel], 
      /* callback */ js.Function1[/* result */ Definition | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to use custom logic to supply DOM nodes for a given template configuration (e.g., using an ajax request to fetch a template by URL).
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
  var loadTemplate: js.UndefOr[
    js.Function3[
      /* componentName */ String, 
      /* templateConfig */ js.Any, 
      /* callback */ js.Function1[/* result */ js.Array[Node] | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * Define this if: you want to use custom logic to supply a viewmodel factory for a given viewmodel configuration (e.g., integrating with a third-party module loader or dependency injection system).
    * @see {@link https://knockoutjs.com/documentation/component-loaders.html}
    */
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
    getConfig: (/* componentName */ String, /* callback */ js.Function1[/* result */ ComponentConfig[ViewModel] | Null, Unit]) => Callback = null,
    loadComponent: (/* componentName */ String, /* config */ ComponentConfig[ViewModel], /* callback */ js.Function1[/* result */ Definition | Null, Unit]) => Callback = null,
    loadTemplate: (/* componentName */ String, /* templateConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Array[Node] | Null, Unit]) => Callback = null,
    loadViewModel: (/* componentName */ String, /* viewModelConfig */ js.Any, /* callback */ js.Function1[/* result */ js.Any, Unit]) => Callback = null,
    suppressLoaderExceptions: js.UndefOr[Boolean] = js.undefined
  ): Loader = {
    val __obj = js.Dynamic.literal()
    if (getConfig != null) __obj.updateDynamic("getConfig")(js.Any.fromFunction2((t0: /* componentName */ java.lang.String, t1: /* callback */ js.Function1[
  /* result */ typingsJapgolly.knockout.KnockoutComponentTypes.ComponentConfig[typingsJapgolly.knockout.KnockoutComponentTypes.ViewModel] | scala.Null, 
  scala.Unit]) => getConfig(t0, t1).runNow()))
    if (loadComponent != null) __obj.updateDynamic("loadComponent")(js.Any.fromFunction3((t0: /* componentName */ java.lang.String, t1: /* config */ typingsJapgolly.knockout.KnockoutComponentTypes.ComponentConfig[typingsJapgolly.knockout.KnockoutComponentTypes.ViewModel], t2: /* callback */ js.Function1[
  /* result */ typingsJapgolly.knockout.KnockoutComponentTypes.Definition | scala.Null, 
  scala.Unit]) => loadComponent(t0, t1, t2).runNow()))
    if (loadTemplate != null) __obj.updateDynamic("loadTemplate")(js.Any.fromFunction3((t0: /* componentName */ java.lang.String, t1: /* templateConfig */ js.Any, t2: /* callback */ js.Function1[/* result */ js.Array[org.scalajs.dom.raw.Node] | scala.Null, scala.Unit]) => loadTemplate(t0, t1, t2).runNow()))
    if (loadViewModel != null) __obj.updateDynamic("loadViewModel")(js.Any.fromFunction3((t0: /* componentName */ java.lang.String, t1: /* viewModelConfig */ js.Any, t2: /* callback */ js.Function1[/* result */ js.Any, scala.Unit]) => loadViewModel(t0, t1, t2).runNow()))
    if (!js.isUndefined(suppressLoaderExceptions)) __obj.updateDynamic("suppressLoaderExceptions")(suppressLoaderExceptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader]
  }
}

