package typingsJapgolly.gatsby.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyBrowser extends js.Object {
  var disableCorePrefetching: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var onClientEntry: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var onInitialClientRender: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var onPostPrefetchPathname: js.UndefOr[js.Function2[/* args */ PrefetchPathnameArgs, /* options */ PluginOptions, _]] = js.undefined
  var onPreRouteUpdate: js.UndefOr[js.Function2[/* args */ RouteUpdateArgs, /* options */ PluginOptions, _]] = js.undefined
  var onPrefetchPathname: js.UndefOr[js.Function2[/* args */ PrefetchPathnameArgs, /* options */ PluginOptions, _]] = js.undefined
  var onRouteUpdate: js.UndefOr[js.Function2[/* args */ RouteUpdateArgs, /* options */ PluginOptions, _]] = js.undefined
  var onRouteUpdateDelayed: js.UndefOr[js.Function2[/* args */ RouteUpdateDelayedArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerActive: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerInstalled: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerRedundant: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerUpdateFound: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var registerServiceWorker: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var replaceComponentRenderer: js.UndefOr[
    js.Function2[/* args */ ReplaceComponentRendererArgs, /* options */ PluginOptions, _]
  ] = js.undefined
  var replaceHydrateFunction: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var shouldUpdateScroll: js.UndefOr[js.Function2[/* args */ ShouldUpdateScrollArgs, /* options */ PluginOptions, _]] = js.undefined
  var wrapPageElement: js.UndefOr[
    js.Function2[/* args */ WrapPageElementBrowserArgs, /* options */ PluginOptions, _]
  ] = js.undefined
  var wrapRootElement: js.UndefOr[
    js.Function2[/* args */ WrapRootElementBrowserArgs, /* options */ PluginOptions, _]
  ] = js.undefined
}

object GatsbyBrowser {
  @scala.inline
  def apply(
    disableCorePrefetching: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onClientEntry: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onInitialClientRender: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onPostPrefetchPathname: (/* args */ PrefetchPathnameArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onPreRouteUpdate: (/* args */ RouteUpdateArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onPrefetchPathname: (/* args */ PrefetchPathnameArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onRouteUpdate: (/* args */ RouteUpdateArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onRouteUpdateDelayed: (/* args */ RouteUpdateDelayedArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onServiceWorkerActive: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onServiceWorkerInstalled: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onServiceWorkerRedundant: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    onServiceWorkerUpdateFound: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    registerServiceWorker: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    replaceComponentRenderer: (/* args */ ReplaceComponentRendererArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    replaceHydrateFunction: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    shouldUpdateScroll: (/* args */ ShouldUpdateScrollArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    wrapPageElement: (/* args */ WrapPageElementBrowserArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null,
    wrapRootElement: (/* args */ WrapRootElementBrowserArgs, /* options */ PluginOptions) => CallbackTo[js.Any] = null
  ): GatsbyBrowser = {
    val __obj = js.Dynamic.literal()
    if (disableCorePrefetching != null) __obj.updateDynamic("disableCorePrefetching")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.BrowserPluginArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => disableCorePrefetching(t0, t1).runNow()))
    if (onClientEntry != null) __obj.updateDynamic("onClientEntry")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.BrowserPluginArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onClientEntry(t0, t1).runNow()))
    if (onInitialClientRender != null) __obj.updateDynamic("onInitialClientRender")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.BrowserPluginArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onInitialClientRender(t0, t1).runNow()))
    if (onPostPrefetchPathname != null) __obj.updateDynamic("onPostPrefetchPathname")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.PrefetchPathnameArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onPostPrefetchPathname(t0, t1).runNow()))
    if (onPreRouteUpdate != null) __obj.updateDynamic("onPreRouteUpdate")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.RouteUpdateArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onPreRouteUpdate(t0, t1).runNow()))
    if (onPrefetchPathname != null) __obj.updateDynamic("onPrefetchPathname")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.PrefetchPathnameArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onPrefetchPathname(t0, t1).runNow()))
    if (onRouteUpdate != null) __obj.updateDynamic("onRouteUpdate")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.RouteUpdateArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onRouteUpdate(t0, t1).runNow()))
    if (onRouteUpdateDelayed != null) __obj.updateDynamic("onRouteUpdateDelayed")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.RouteUpdateDelayedArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onRouteUpdateDelayed(t0, t1).runNow()))
    if (onServiceWorkerActive != null) __obj.updateDynamic("onServiceWorkerActive")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.ServiceWorkerArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onServiceWorkerActive(t0, t1).runNow()))
    if (onServiceWorkerInstalled != null) __obj.updateDynamic("onServiceWorkerInstalled")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.ServiceWorkerArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onServiceWorkerInstalled(t0, t1).runNow()))
    if (onServiceWorkerRedundant != null) __obj.updateDynamic("onServiceWorkerRedundant")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.ServiceWorkerArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onServiceWorkerRedundant(t0, t1).runNow()))
    if (onServiceWorkerUpdateFound != null) __obj.updateDynamic("onServiceWorkerUpdateFound")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.ServiceWorkerArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => onServiceWorkerUpdateFound(t0, t1).runNow()))
    if (registerServiceWorker != null) __obj.updateDynamic("registerServiceWorker")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.BrowserPluginArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => registerServiceWorker(t0, t1).runNow()))
    if (replaceComponentRenderer != null) __obj.updateDynamic("replaceComponentRenderer")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.ReplaceComponentRendererArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => replaceComponentRenderer(t0, t1).runNow()))
    if (replaceHydrateFunction != null) __obj.updateDynamic("replaceHydrateFunction")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.BrowserPluginArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => replaceHydrateFunction(t0, t1).runNow()))
    if (shouldUpdateScroll != null) __obj.updateDynamic("shouldUpdateScroll")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.ShouldUpdateScrollArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => shouldUpdateScroll(t0, t1).runNow()))
    if (wrapPageElement != null) __obj.updateDynamic("wrapPageElement")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.WrapPageElementBrowserArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => wrapPageElement(t0, t1).runNow()))
    if (wrapRootElement != null) __obj.updateDynamic("wrapRootElement")(js.Any.fromFunction2((t0: /* args */ typingsJapgolly.gatsby.mod.WrapRootElementBrowserArgs, t1: /* options */ typingsJapgolly.gatsby.mod.PluginOptions) => wrapRootElement(t0, t1).runNow()))
    __obj.asInstanceOf[GatsbyBrowser]
  }
}

