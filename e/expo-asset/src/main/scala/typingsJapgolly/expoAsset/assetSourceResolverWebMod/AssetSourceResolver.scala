package typingsJapgolly.expoAsset.assetSourceResolverWebMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetSourceResolver extends js.Object {
  var asset: PackagerAsset
  var jsbundleUrl: js.UndefOr[String | Null] = js.undefined
  var serverUrl: js.UndefOr[String | Null] = js.undefined
  def assetServerURL(): ResolvedAssetSource
  def defaultAsset(): ResolvedAssetSource
  def drawableFolderInBundle(): ResolvedAssetSource
  def fromSource(source: String): ResolvedAssetSource
  def isLoadedFromFileSystem(): Boolean
  def isLoadedFromServer(): Boolean
  def resourceIdentifierWithoutScale(): ResolvedAssetSource
  def scaledAssetPath(): ResolvedAssetSource
  def scaledAssetURLNearBundle(): ResolvedAssetSource
}

object AssetSourceResolver {
  @scala.inline
  def apply(
    asset: PackagerAsset,
    assetServerURL: CallbackTo[ResolvedAssetSource],
    defaultAsset: CallbackTo[ResolvedAssetSource],
    drawableFolderInBundle: CallbackTo[ResolvedAssetSource],
    fromSource: String => CallbackTo[ResolvedAssetSource],
    isLoadedFromFileSystem: CallbackTo[Boolean],
    isLoadedFromServer: CallbackTo[Boolean],
    resourceIdentifierWithoutScale: CallbackTo[ResolvedAssetSource],
    scaledAssetPath: CallbackTo[ResolvedAssetSource],
    scaledAssetURLNearBundle: CallbackTo[ResolvedAssetSource],
    jsbundleUrl: String = null,
    serverUrl: String = null
  ): AssetSourceResolver = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any])
    __obj.updateDynamic("assetServerURL")(assetServerURL.toJsFn)
    __obj.updateDynamic("defaultAsset")(defaultAsset.toJsFn)
    __obj.updateDynamic("drawableFolderInBundle")(drawableFolderInBundle.toJsFn)
    __obj.updateDynamic("fromSource")(js.Any.fromFunction1((t0: java.lang.String) => fromSource(t0).runNow()))
    __obj.updateDynamic("isLoadedFromFileSystem")(isLoadedFromFileSystem.toJsFn)
    __obj.updateDynamic("isLoadedFromServer")(isLoadedFromServer.toJsFn)
    __obj.updateDynamic("resourceIdentifierWithoutScale")(resourceIdentifierWithoutScale.toJsFn)
    __obj.updateDynamic("scaledAssetPath")(scaledAssetPath.toJsFn)
    __obj.updateDynamic("scaledAssetURLNearBundle")(scaledAssetURLNearBundle.toJsFn)
    if (jsbundleUrl != null) __obj.updateDynamic("jsbundleUrl")(jsbundleUrl.asInstanceOf[js.Any])
    if (serverUrl != null) __obj.updateDynamic("serverUrl")(serverUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSourceResolver]
  }
}

