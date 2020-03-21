package typingsJapgolly.enhancedResolve.mod.ResolverFactory

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typingsJapgolly.enhancedResolve.commonTypesMod.ResolverRequest
import typingsJapgolly.enhancedResolve.concordMod.Dictionary
import typingsJapgolly.enhancedResolve.resolverMod.^
import typingsJapgolly.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverOption extends js.Object {
  var alias: js.UndefOr[js.Array[AliasItem] | Dictionary[String]] = js.undefined
  var aliasFields: js.UndefOr[js.Array[String]] = js.undefined
  var cachePredicate: js.UndefOr[js.Function1[/* val */ ResolverRequest, Boolean]] = js.undefined
  var descriptionFiles: js.UndefOr[js.Array[String]] = js.undefined
  var enforceExtension: js.UndefOr[Boolean] = js.undefined
  var enforceModuleExtension: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  var fileSystem: js.UndefOr[AbstractInputFileSystem] = js.undefined
  var mainFields: js.UndefOr[js.Array[String]] = js.undefined
  var mainFiles: js.UndefOr[js.Array[String]] = js.undefined
  var moduleExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var modules: js.UndefOr[js.Array[String]] = js.undefined
  var plugins: js.UndefOr[js.Array[Plugin]] = js.undefined
  var resolveToContext: js.UndefOr[Boolean] = js.undefined
  var resolver: js.UndefOr[^] = js.undefined
  var symlinks: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var unsafeCache: js.UndefOr[Boolean | Dictionary[_]] = js.undefined
  var useSyncFileSystemCalls: js.UndefOr[Boolean] = js.undefined
}

object ResolverOption {
  @scala.inline
  def apply(
    alias: js.Array[AliasItem] | Dictionary[String] = null,
    aliasFields: js.Array[String] = null,
    cachePredicate: /* val */ ResolverRequest => CallbackTo[Boolean] = null,
    descriptionFiles: js.Array[String] = null,
    enforceExtension: js.UndefOr[Boolean] = js.undefined,
    enforceModuleExtension: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] = null,
    fileSystem: AbstractInputFileSystem = null,
    mainFields: js.Array[String] = null,
    mainFiles: js.Array[String] = null,
    moduleExtensions: js.Array[String] = null,
    modules: js.Array[String] = null,
    plugins: js.Array[Plugin] = null,
    resolveToContext: js.UndefOr[Boolean] = js.undefined,
    resolver: ^ = null,
    symlinks: js.Array[String] | Boolean = null,
    unsafeCache: Boolean | Dictionary[_] = null,
    useSyncFileSystemCalls: js.UndefOr[Boolean] = js.undefined
  ): ResolverOption = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (aliasFields != null) __obj.updateDynamic("aliasFields")(aliasFields.asInstanceOf[js.Any])
    if (cachePredicate != null) __obj.updateDynamic("cachePredicate")(js.Any.fromFunction1((t0: /* val */ typingsJapgolly.enhancedResolve.commonTypesMod.ResolverRequest) => cachePredicate(t0).runNow()))
    if (descriptionFiles != null) __obj.updateDynamic("descriptionFiles")(descriptionFiles.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceExtension)) __obj.updateDynamic("enforceExtension")(enforceExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceModuleExtension)) __obj.updateDynamic("enforceModuleExtension")(enforceModuleExtension.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (fileSystem != null) __obj.updateDynamic("fileSystem")(fileSystem.asInstanceOf[js.Any])
    if (mainFields != null) __obj.updateDynamic("mainFields")(mainFields.asInstanceOf[js.Any])
    if (mainFiles != null) __obj.updateDynamic("mainFiles")(mainFiles.asInstanceOf[js.Any])
    if (moduleExtensions != null) __obj.updateDynamic("moduleExtensions")(moduleExtensions.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveToContext)) __obj.updateDynamic("resolveToContext")(resolveToContext.asInstanceOf[js.Any])
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    if (symlinks != null) __obj.updateDynamic("symlinks")(symlinks.asInstanceOf[js.Any])
    if (unsafeCache != null) __obj.updateDynamic("unsafeCache")(unsafeCache.asInstanceOf[js.Any])
    if (!js.isUndefined(useSyncFileSystemCalls)) __obj.updateDynamic("useSyncFileSystemCalls")(useSyncFileSystemCalls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverOption]
  }
}

