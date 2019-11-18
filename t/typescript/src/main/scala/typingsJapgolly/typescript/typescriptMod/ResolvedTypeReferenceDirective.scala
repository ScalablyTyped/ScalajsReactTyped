package typingsJapgolly.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedTypeReferenceDirective extends js.Object {
  /** True if `resolvedFileName` comes from `node_modules`. */
  var isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined
  var packageId: js.UndefOr[PackageId] = js.undefined
  var primary: Boolean
  var resolvedFileName: js.UndefOr[String] = js.undefined
}

object ResolvedTypeReferenceDirective {
  @scala.inline
  def apply(
    primary: Boolean,
    isExternalLibraryImport: js.UndefOr[Boolean] = js.undefined,
    packageId: PackageId = null,
    resolvedFileName: String = null
  ): ResolvedTypeReferenceDirective = {
    val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any])
    if (!js.isUndefined(isExternalLibraryImport)) __obj.updateDynamic("isExternalLibraryImport")(isExternalLibraryImport.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    if (resolvedFileName != null) __obj.updateDynamic("resolvedFileName")(resolvedFileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedTypeReferenceDirective]
  }
}

