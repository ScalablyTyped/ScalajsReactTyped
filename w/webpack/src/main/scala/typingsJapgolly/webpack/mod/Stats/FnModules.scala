package typingsJapgolly.webpack.mod.Stats

import typingsJapgolly.webpack.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FnModules extends js.Object {
  var assets: js.UndefOr[js.Array[String]] = js.undefined
  var built: Boolean
  var cacheable: Boolean
  var chunks: js.Array[Double | String]
  var depth: js.UndefOr[Double] = js.undefined
  var errors: Double
  var failed: Boolean
  var filteredModules: js.UndefOr[Boolean] = js.undefined
  var id: Double | String
  var identifier: String
  var index: Double
  var index2: Double
  var issuer: js.UndefOr[String] = js.undefined
  var issuerId: js.UndefOr[Double | String] = js.undefined
  var issuerName: js.UndefOr[String] = js.undefined
  var issuerPath: js.Array[AnonId]
  var modules: js.Array[FnModules]
  var name: String
  var optimizationBailout: js.UndefOr[String] = js.undefined
  var optional: Boolean
  var prefetched: Boolean
  var profile: js.Any
   // TODO
  var providedExports: js.UndefOr[js.Any] = js.undefined
   // TODO
  var reasons: js.Array[Reason]
  var size: Double
  var source: js.UndefOr[String] = js.undefined
  var usedExports: js.UndefOr[Boolean] = js.undefined
  var warnings: Double
}

object FnModules {
  @scala.inline
  def apply(
    built: Boolean,
    cacheable: Boolean,
    chunks: js.Array[Double | String],
    errors: Double,
    failed: Boolean,
    id: Double | String,
    identifier: String,
    index: Double,
    index2: Double,
    issuerPath: js.Array[AnonId],
    modules: js.Array[FnModules],
    name: String,
    optional: Boolean,
    prefetched: Boolean,
    profile: js.Any,
    reasons: js.Array[Reason],
    size: Double,
    warnings: Double,
    assets: js.Array[String] = null,
    depth: Int | Double = null,
    filteredModules: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null,
    issuerId: Double | String = null,
    issuerName: String = null,
    optimizationBailout: String = null,
    providedExports: js.Any = null,
    source: String = null,
    usedExports: js.UndefOr[Boolean] = js.undefined
  ): FnModules = {
    val __obj = js.Dynamic.literal(built = built.asInstanceOf[js.Any], cacheable = cacheable.asInstanceOf[js.Any], chunks = chunks.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], index2 = index2.asInstanceOf[js.Any], issuerPath = issuerPath.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], prefetched = prefetched.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(filteredModules)) __obj.updateDynamic("filteredModules")(filteredModules.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (issuerId != null) __obj.updateDynamic("issuerId")(issuerId.asInstanceOf[js.Any])
    if (issuerName != null) __obj.updateDynamic("issuerName")(issuerName.asInstanceOf[js.Any])
    if (optimizationBailout != null) __obj.updateDynamic("optimizationBailout")(optimizationBailout.asInstanceOf[js.Any])
    if (providedExports != null) __obj.updateDynamic("providedExports")(providedExports.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(usedExports)) __obj.updateDynamic("usedExports")(usedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[FnModules]
  }
}

