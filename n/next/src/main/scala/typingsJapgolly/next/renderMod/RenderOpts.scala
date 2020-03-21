package typingsJapgolly.next.renderMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.next.AnonError
import typingsJapgolly.next.AnonParams
import typingsJapgolly.next.AnonProps
import typingsJapgolly.next.getPageFilesMod.BuildManifest
import typingsJapgolly.next.utilsMod.AppType
import typingsJapgolly.next.utilsMod.DocumentType
import typingsJapgolly.next.utilsMod.NextPageContext
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOpts extends js.Object {
  var App: AppType
  var Component: ComponentType[js.Object]
  var Document: DocumentType
  var ErrorDebug: js.UndefOr[ComponentType[AnonError]] = js.undefined
  var ampMode: js.UndefOr[js.Any] = js.undefined
  var ampPath: js.UndefOr[String] = js.undefined
  var ampValidator: js.UndefOr[js.Function2[/* html */ String, /* pathname */ String, js.Promise[Unit]]] = js.undefined
  var assetPrefix: js.UndefOr[String] = js.undefined
  var autoExport: js.UndefOr[Boolean] = js.undefined
  var buildId: String
  var buildManifest: BuildManifest
  var canonicalBase: String
  var dangerousAsPath: String
  var dev: js.UndefOr[Boolean] = js.undefined
  var documentMiddlewareEnabled: Boolean
  var err: js.UndefOr[js.Error | Null] = js.undefined
  var hasCssMode: Boolean
  var hybridAmp: js.UndefOr[Boolean] = js.undefined
  var inAmpMode: js.UndefOr[Boolean] = js.undefined
  var nextExport: js.UndefOr[Boolean] = js.undefined
  var pageConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageConfig */ js.Any
  var reactLoadableManifest: ReactLoadableManifest
  var runtimeConfig: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var staticMarkup: Boolean
  var unstable_getStaticPaths: js.UndefOr[js.Function0[Unit]] = js.undefined
  var unstable_getStaticProps: js.UndefOr[js.Function1[/* params */ AnonParams, AnonProps]] = js.undefined
  def DocumentMiddleware(ctx: NextPageContext): Unit
}

object RenderOpts {
  @scala.inline
  def apply(
    App: AppType,
    Component: ComponentType[js.Object],
    Document: DocumentType,
    DocumentMiddleware: NextPageContext => Callback,
    buildId: String,
    buildManifest: BuildManifest,
    canonicalBase: String,
    dangerousAsPath: String,
    documentMiddlewareEnabled: Boolean,
    hasCssMode: Boolean,
    pageConfig: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageConfig */ js.Any,
    reactLoadableManifest: ReactLoadableManifest,
    staticMarkup: Boolean,
    ErrorDebug: ComponentType[AnonError] = null,
    ampMode: js.Any = null,
    ampPath: String = null,
    ampValidator: (/* html */ String, /* pathname */ String) => CallbackTo[js.Promise[Unit]] = null,
    assetPrefix: String = null,
    autoExport: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    err: js.Error = null,
    hybridAmp: js.UndefOr[Boolean] = js.undefined,
    inAmpMode: js.UndefOr[Boolean] = js.undefined,
    nextExport: js.UndefOr[Boolean] = js.undefined,
    runtimeConfig: StringDictionary[js.Any] = null,
    unstable_getStaticPaths: js.UndefOr[Callback] = js.undefined,
    unstable_getStaticProps: /* params */ AnonParams => CallbackTo[AnonProps] = null
  ): RenderOpts = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], Document = Document.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], buildManifest = buildManifest.asInstanceOf[js.Any], canonicalBase = canonicalBase.asInstanceOf[js.Any], dangerousAsPath = dangerousAsPath.asInstanceOf[js.Any], documentMiddlewareEnabled = documentMiddlewareEnabled.asInstanceOf[js.Any], hasCssMode = hasCssMode.asInstanceOf[js.Any], pageConfig = pageConfig.asInstanceOf[js.Any], reactLoadableManifest = reactLoadableManifest.asInstanceOf[js.Any], staticMarkup = staticMarkup.asInstanceOf[js.Any])
    __obj.updateDynamic("DocumentMiddleware")(js.Any.fromFunction1((t0: typingsJapgolly.next.utilsMod.NextPageContext) => DocumentMiddleware(t0).runNow()))
    if (ErrorDebug != null) __obj.updateDynamic("ErrorDebug")(ErrorDebug.asInstanceOf[js.Any])
    if (ampMode != null) __obj.updateDynamic("ampMode")(ampMode.asInstanceOf[js.Any])
    if (ampPath != null) __obj.updateDynamic("ampPath")(ampPath.asInstanceOf[js.Any])
    if (ampValidator != null) __obj.updateDynamic("ampValidator")(js.Any.fromFunction2((t0: /* html */ java.lang.String, t1: /* pathname */ java.lang.String) => ampValidator(t0, t1).runNow()))
    if (assetPrefix != null) __obj.updateDynamic("assetPrefix")(assetPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExport)) __obj.updateDynamic("autoExport")(autoExport.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    if (!js.isUndefined(hybridAmp)) __obj.updateDynamic("hybridAmp")(hybridAmp.asInstanceOf[js.Any])
    if (!js.isUndefined(inAmpMode)) __obj.updateDynamic("inAmpMode")(inAmpMode.asInstanceOf[js.Any])
    if (!js.isUndefined(nextExport)) __obj.updateDynamic("nextExport")(nextExport.asInstanceOf[js.Any])
    if (runtimeConfig != null) __obj.updateDynamic("runtimeConfig")(runtimeConfig.asInstanceOf[js.Any])
    unstable_getStaticPaths.foreach(p => __obj.updateDynamic("unstable_getStaticPaths")(p.toJsFn))
    if (unstable_getStaticProps != null) __obj.updateDynamic("unstable_getStaticProps")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.next.AnonParams) => unstable_getStaticProps(t0).runNow()))
    __obj.asInstanceOf[RenderOpts]
  }
}

