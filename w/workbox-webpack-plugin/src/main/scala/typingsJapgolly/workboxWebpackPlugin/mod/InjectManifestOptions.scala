package typingsJapgolly.workboxWebpackPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.workboxWebpackPlugin.AnonManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectManifestOptions extends CommonOptions {
  /**
  	 * The path to the source service worker file that can contain your own customized code, in addition to containing a match for `injectionPointRegexp`.
  	 *
  	 * Your service worker file should reference the `self.__precacheManifest` variable to obtain a list of
  	 * [`ManifestEntrys`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-build#.ManifestEntry) obtained as part of the compilation:
  	 * `workbox.precaching.precacheAndRoute(self.__precacheManifest)`.
  	 *
  	 * @example swSrc: path.join('src', 'sw.js')
  	 */
  var swSrc: String
}

object InjectManifestOptions {
  @scala.inline
  def apply(
    swSrc: String,
    chunks: js.Array[String] = null,
    dontCacheBustUrlsMatching: js.RegExp = null,
    exclude: js.Array[String | js.RegExp] = null,
    excludeChunks: js.Array[String] = null,
    globDirectory: String = null,
    globFollow: js.UndefOr[Boolean] = js.undefined,
    globIgnores: js.Array[String] = null,
    globPatterns: js.Array[String] = null,
    globStrict: js.UndefOr[Boolean] = js.undefined,
    importsDirectory: String = null,
    include: js.Array[String | js.RegExp] = null,
    manifestTransforms: js.Array[js.Function1[/* originalManifest */ js.Array[ManifestEntry], AnonManifest]] = null,
    maximumFileSizeToCacheInBytes: Int | Double = null,
    modifyUrlPrefix: StringDictionary[String] = null,
    precacheManifestFilename: String = null,
    swDest: String = null,
    templatedUrls: StringDictionary[String | js.Array[String]] = null,
    test: js.Array[String | js.RegExp] = null
  ): InjectManifestOptions = {
    val __obj = js.Dynamic.literal(swSrc = swSrc.asInstanceOf[js.Any])
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (dontCacheBustUrlsMatching != null) __obj.updateDynamic("dontCacheBustUrlsMatching")(dontCacheBustUrlsMatching.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (excludeChunks != null) __obj.updateDynamic("excludeChunks")(excludeChunks.asInstanceOf[js.Any])
    if (globDirectory != null) __obj.updateDynamic("globDirectory")(globDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(globFollow)) __obj.updateDynamic("globFollow")(globFollow.asInstanceOf[js.Any])
    if (globIgnores != null) __obj.updateDynamic("globIgnores")(globIgnores.asInstanceOf[js.Any])
    if (globPatterns != null) __obj.updateDynamic("globPatterns")(globPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(globStrict)) __obj.updateDynamic("globStrict")(globStrict.asInstanceOf[js.Any])
    if (importsDirectory != null) __obj.updateDynamic("importsDirectory")(importsDirectory.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (manifestTransforms != null) __obj.updateDynamic("manifestTransforms")(manifestTransforms.asInstanceOf[js.Any])
    if (maximumFileSizeToCacheInBytes != null) __obj.updateDynamic("maximumFileSizeToCacheInBytes")(maximumFileSizeToCacheInBytes.asInstanceOf[js.Any])
    if (modifyUrlPrefix != null) __obj.updateDynamic("modifyUrlPrefix")(modifyUrlPrefix.asInstanceOf[js.Any])
    if (precacheManifestFilename != null) __obj.updateDynamic("precacheManifestFilename")(precacheManifestFilename.asInstanceOf[js.Any])
    if (swDest != null) __obj.updateDynamic("swDest")(swDest.asInstanceOf[js.Any])
    if (templatedUrls != null) __obj.updateDynamic("templatedUrls")(templatedUrls.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectManifestOptions]
  }
}

