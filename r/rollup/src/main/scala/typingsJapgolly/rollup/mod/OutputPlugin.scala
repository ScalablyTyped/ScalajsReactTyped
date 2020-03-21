package typingsJapgolly.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<rollup.rollup.OutputPluginHooks> */
/* Inlined parent std.Partial<rollup.rollup.OutputPluginValueHooks> */
trait OutputPlugin extends js.Object {
  var augmentChunkHash: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit]
  ] = js.undefined
  var banner: js.UndefOr[AddonHook] = js.undefined
  var cacheKey: js.UndefOr[String] = js.undefined
  var footer: js.UndefOr[AddonHook] = js.undefined
  var generateBundle: js.UndefOr[
    js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ Boolean, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
  var intro: js.UndefOr[AddonHook] = js.undefined
  var name: String
  var ongenerate: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnGenerateOptions, 
      /* chunk */ OutputChunk, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
  var onwrite: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnWriteOptions, 
      /* chunk */ OutputChunk, 
      Unit | js.Promise[Unit]
    ]
  ] = js.undefined
  var outputOptions: js.UndefOr[
    js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      js.UndefOr[OutputOptions | Null]
    ]
  ] = js.undefined
  var outro: js.UndefOr[AddonHook] = js.undefined
  var renderChunk: js.UndefOr[RenderChunkHook] = js.undefined
  var renderError: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit]
  ] = js.undefined
  var renderStart: js.UndefOr[
    js.ThisFunction2[
      /* this */ PluginContext, 
      /* outputOptions */ OutputOptions, 
      /* inputOptions */ InputOptions, 
      js.Promise[Unit] | Unit
    ]
  ] = js.undefined
  var resolveAssetUrl: js.UndefOr[ResolveAssetUrlHook] = js.undefined
  var resolveDynamicImport: js.UndefOr[ResolveDynamicImportHook] = js.undefined
  var resolveFileUrl: js.UndefOr[ResolveFileUrlHook] = js.undefined
  var transformBundle: js.UndefOr[TransformChunkHook] = js.undefined
  var transformChunk: js.UndefOr[TransformChunkHook] = js.undefined
  var writeBundle: js.UndefOr[
    js.ThisFunction1[/* this */ PluginContext, /* bundle */ OutputBundle, Unit | js.Promise[Unit]]
  ] = js.undefined
}

object OutputPlugin {
  @scala.inline
  def apply(
    name: String,
    augmentChunkHash: js.ThisFunction1[/* this */ PluginContext, /* chunk */ PreRenderedChunk, String | Unit] = null,
    banner: AddonHook = null,
    cacheKey: String = null,
    footer: AddonHook = null,
    generateBundle: js.ThisFunction3[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      /* bundle */ OutputBundle, 
      /* isWrite */ Boolean, 
      Unit | js.Promise[Unit]
    ] = null,
    intro: AddonHook = null,
    ongenerate: js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnGenerateOptions, 
      /* chunk */ OutputChunk, 
      Unit | js.Promise[Unit]
    ] = null,
    onwrite: js.ThisFunction2[
      /* this */ PluginContext, 
      /* options */ OnWriteOptions, 
      /* chunk */ OutputChunk, 
      Unit | js.Promise[Unit]
    ] = null,
    outputOptions: js.ThisFunction1[
      /* this */ PluginContext, 
      /* options */ OutputOptions, 
      js.UndefOr[OutputOptions | Null]
    ] = null,
    outro: AddonHook = null,
    renderChunk: RenderChunkHook = null,
    renderError: js.ThisFunction1[/* this */ PluginContext, /* err */ js.UndefOr[js.Error], js.Promise[Unit] | Unit] = null,
    renderStart: js.ThisFunction2[
      /* this */ PluginContext, 
      /* outputOptions */ OutputOptions, 
      /* inputOptions */ InputOptions, 
      js.Promise[Unit] | Unit
    ] = null,
    resolveAssetUrl: ResolveAssetUrlHook = null,
    resolveDynamicImport: ResolveDynamicImportHook = null,
    resolveFileUrl: ResolveFileUrlHook = null,
    transformBundle: TransformChunkHook = null,
    transformChunk: TransformChunkHook = null,
    writeBundle: js.ThisFunction1[/* this */ PluginContext, /* bundle */ OutputBundle, Unit | js.Promise[Unit]] = null
  ): OutputPlugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (augmentChunkHash != null) __obj.updateDynamic("augmentChunkHash")(augmentChunkHash.asInstanceOf[js.Any])
    if (banner != null) __obj.updateDynamic("banner")(banner.asInstanceOf[js.Any])
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (generateBundle != null) __obj.updateDynamic("generateBundle")(generateBundle.asInstanceOf[js.Any])
    if (intro != null) __obj.updateDynamic("intro")(intro.asInstanceOf[js.Any])
    if (ongenerate != null) __obj.updateDynamic("ongenerate")(ongenerate.asInstanceOf[js.Any])
    if (onwrite != null) __obj.updateDynamic("onwrite")(onwrite.asInstanceOf[js.Any])
    if (outputOptions != null) __obj.updateDynamic("outputOptions")(outputOptions.asInstanceOf[js.Any])
    if (outro != null) __obj.updateDynamic("outro")(outro.asInstanceOf[js.Any])
    if (renderChunk != null) __obj.updateDynamic("renderChunk")(renderChunk.asInstanceOf[js.Any])
    if (renderError != null) __obj.updateDynamic("renderError")(renderError.asInstanceOf[js.Any])
    if (renderStart != null) __obj.updateDynamic("renderStart")(renderStart.asInstanceOf[js.Any])
    if (resolveAssetUrl != null) __obj.updateDynamic("resolveAssetUrl")(resolveAssetUrl.asInstanceOf[js.Any])
    if (resolveDynamicImport != null) __obj.updateDynamic("resolveDynamicImport")(resolveDynamicImport.asInstanceOf[js.Any])
    if (resolveFileUrl != null) __obj.updateDynamic("resolveFileUrl")(resolveFileUrl.asInstanceOf[js.Any])
    if (transformBundle != null) __obj.updateDynamic("transformBundle")(transformBundle.asInstanceOf[js.Any])
    if (transformChunk != null) __obj.updateDynamic("transformChunk")(transformChunk.asInstanceOf[js.Any])
    if (writeBundle != null) __obj.updateDynamic("writeBundle")(writeBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputPlugin]
  }
}

