package typingsJapgolly.nextServer.renderMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nextServer.AnonErrorError
import typingsJapgolly.nextServer.getPageFilesMod.BuildManifest
import typingsJapgolly.nextServer.libUtilsMod.AppType
import typingsJapgolly.nextServer.libUtilsMod.DocumentType
import typingsJapgolly.nextServer.libUtilsMod.NextPageContext
import typingsJapgolly.nextServer.typesMod.PageConfig
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOpts extends js.Object {
  var App: AppType
  var Component: ComponentType[js.Object]
  var Document: DocumentType
  var ErrorDebug: js.UndefOr[ComponentType[AnonErrorError]] = js.undefined
  var ampBindInitData: Boolean
  var ampMode: js.UndefOr[js.Any] = js.undefined
  var ampPath: js.UndefOr[String] = js.undefined
  var ampValidator: js.UndefOr[js.Function2[/* html */ String, /* pathname */ String, js.Promise[Unit]]] = js.undefined
  var assetPrefix: js.UndefOr[String] = js.undefined
  var buildId: String
  var buildManifest: BuildManifest
  var canonicalBase: String
  var dangerousAsPath: String
  var dataOnly: js.UndefOr[Boolean] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
  var documentMiddlewareEnabled: Boolean
  var err: js.UndefOr[js.Error | Null] = js.undefined
  var hybridAmp: js.UndefOr[Boolean] = js.undefined
  var inAmpMode: js.UndefOr[Boolean] = js.undefined
  var nextExport: js.UndefOr[Boolean] = js.undefined
  var pageConfig: PageConfig
  var reactLoadableManifest: ReactLoadableManifest
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var skeleton: js.UndefOr[Boolean] = js.undefined
  var staticMarkup: Boolean
  def DocumentMiddleware(ctx: NextPageContext): Unit
}

object RenderOpts {
  @scala.inline
  def apply(
    App: AppType,
    Component: ComponentType[js.Object],
    Document: DocumentType,
    DocumentMiddleware: NextPageContext => Callback,
    ampBindInitData: Boolean,
    buildId: String,
    buildManifest: BuildManifest,
    canonicalBase: String,
    dangerousAsPath: String,
    documentMiddlewareEnabled: Boolean,
    pageConfig: PageConfig,
    reactLoadableManifest: ReactLoadableManifest,
    staticMarkup: Boolean,
    ErrorDebug: ComponentType[AnonErrorError] = null,
    ampMode: js.Any = null,
    ampPath: String = null,
    ampValidator: (/* html */ String, /* pathname */ String) => CallbackTo[js.Promise[Unit]] = null,
    assetPrefix: String = null,
    dataOnly: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    err: js.Error = null,
    hybridAmp: js.UndefOr[Boolean] = js.undefined,
    inAmpMode: js.UndefOr[Boolean] = js.undefined,
    nextExport: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null,
    skeleton: js.UndefOr[Boolean] = js.undefined
  ): RenderOpts = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], ampBindInitData = ampBindInitData.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    __obj.updateDynamic("DocumentMiddleware")(js.Any.fromFunction1((t0: typingsJapgolly.nextServer.libUtilsMod.NextPageContext) => DocumentMiddleware(t0).runNow()))
    if (ErrorDebug != null) __obj.updateDynamic("ErrorDebug")(ErrorDebug.asInstanceOf[js.Any])
    if (ampMode != null) __obj.updateDynamic("ampMode")(ampMode.asInstanceOf[js.Any])
    if (ampPath != null) __obj.updateDynamic("ampPath")(ampPath.asInstanceOf[js.Any])
    if (ampValidator != null) __obj.updateDynamic("ampValidator")(js.Any.fromFunction2((t0: /* html */ java.lang.String, t1: /* pathname */ java.lang.String) => ampValidator(t0, t1).runNow()))
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(dataOnly)) __obj.updateDynamic("dataOnly")(dataOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (!js.isUndefined(hybridAmp)) __obj.updateDynamic("hybridAmp")(hybridAmp.asInstanceOf[js.Any])
    if (!js.isUndefined(inAmpMode)) __obj.updateDynamic("inAmpMode")(inAmpMode.asInstanceOf[js.Any])
    if (!js.isUndefined(nextExport)) __obj.updateDynamic("nextExport")(nextExport.asInstanceOf[js.Any])
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(skeleton)) __obj.updateDynamic("skeleton")(skeleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOpts]
  }
}

