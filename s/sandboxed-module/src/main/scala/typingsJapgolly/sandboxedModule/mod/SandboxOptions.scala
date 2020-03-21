package typingsJapgolly.sandboxedModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SandboxOptions extends js.Object {
  /**
    * An object of global variables to inject into the sandboxed module.
    */
  var globals: js.UndefOr[js.Object] = js.undefined
  /**
    * An object of local variables to inject into the sandboxed module.
    */
  var locals: js.UndefOr[js.Object] = js.undefined
  /**
    * An object containing moduleIds and the values to inject for them when required by the sandboxed module.
    * This does not affect children of the sandboxed module.
    */
  var requires: js.UndefOr[js.Object] = js.undefined
  /**
    * If false, modules that are required by the sandboxed module will not be sandboxed. By default all modules
    * required by the sandboxedModule will be sandboxed using the same options that were used for the original
    * sandboxed module.
    */
  var singleOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * An object of named functions which will transform the source code required with SandboxedModule.require.
    * For example, CoffeeScript & istanbul support is implemented with built-in sourceTransformer functions
    * (see #registerBuiltInSourceTransformer).
    *
    * A source transformer receives the source (as it's been transformed thus far) and must return the transformed
    * source (whether it's changed or unchanged).
    *
    * An example source transformer to change all instances of the number "3" to "5" would look like this:
    *
    * SandboxedModule.require('../fixture/baz', {
    *   sourceTransformers: {
    *     turn3sInto5s: function(source) {
    *       return source.replace(/3/g,'5');
    *     }
    *   }
    * })
    */
  var sourceTransformers: js.UndefOr[js.Object] = js.undefined
  /**
    * If false, the source transformers will not be run against modules required by the sandboxed module.
    * By default it will take the same value as {@link SandboxOptions.singleOnly}.
    */
  var sourceTransformersSingleOnly: js.UndefOr[Boolean] = js.undefined
}

object SandboxOptions {
  @scala.inline
  def apply(
    globals: js.Object = null,
    locals: js.Object = null,
    requires: js.Object = null,
    singleOnly: js.UndefOr[Boolean] = js.undefined,
    sourceTransformers: js.Object = null,
    sourceTransformersSingleOnly: js.UndefOr[Boolean] = js.undefined
  ): SandboxOptions = {
    val __obj = js.Dynamic.literal()
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (!js.isUndefined(singleOnly)) __obj.updateDynamic("singleOnly")(singleOnly.asInstanceOf[js.Any])
    if (sourceTransformers != null) __obj.updateDynamic("sourceTransformers")(sourceTransformers.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceTransformersSingleOnly)) __obj.updateDynamic("sourceTransformersSingleOnly")(sourceTransformersSingleOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[SandboxOptions]
  }
}

