package typingsJapgolly.luaparse

import japgolly.scalajs.react.Callback
import typingsJapgolly.luaparse.astMod.Identifier
import typingsJapgolly.luaparse.astMod.Node
import typingsJapgolly.luaparse.luaparseBooleans.`false`
import typingsJapgolly.luaparse.luaparseStrings.LuaJIT
import typingsJapgolly.luaparse.luaparseStrings.`5Dot1`
import typingsJapgolly.luaparse.luaparseStrings.`5Dot2`
import typingsJapgolly.luaparse.luaparseStrings.`5Dot3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<luaparse.luaparse.Options> */
trait PartialOptions extends js.Object {
  var comments: js.UndefOr[Boolean] = js.undefined
  var extendedIdentifiers: js.UndefOr[`false`] = js.undefined
  var locations: js.UndefOr[Boolean] = js.undefined
  var luaVersion: js.UndefOr[`5Dot1` | `5Dot2` | `5Dot3` | LuaJIT] = js.undefined
  var onCreateNode: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  var onCreateScope: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDestroyScope: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLocalDeclaration: js.UndefOr[js.Function1[/* identifier */ Identifier, Unit]] = js.undefined
  var ranges: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[Boolean] = js.undefined
  @JSName("wait")
  var wait_FPartialOptions: js.UndefOr[Boolean] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    comments: js.UndefOr[Boolean] = js.undefined,
    extendedIdentifiers: `false` = null,
    locations: js.UndefOr[Boolean] = js.undefined,
    luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT = null,
    onCreateNode: /* node */ Node => Callback = null,
    onCreateScope: js.UndefOr[Callback] = js.undefined,
    onDestroyScope: js.UndefOr[Callback] = js.undefined,
    onLocalDeclaration: /* identifier */ Identifier => Callback = null,
    ranges: js.UndefOr[Boolean] = js.undefined,
    scope: js.UndefOr[Boolean] = js.undefined,
    wait: js.UndefOr[Boolean] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (extendedIdentifiers != null) __obj.updateDynamic("extendedIdentifiers")(extendedIdentifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(locations)) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (luaVersion != null) __obj.updateDynamic("luaVersion")(luaVersion.asInstanceOf[js.Any])
    if (onCreateNode != null) __obj.updateDynamic("onCreateNode")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.luaparse.astMod.Node) => onCreateNode(t0).runNow()))
    onCreateScope.foreach(p => __obj.updateDynamic("onCreateScope")(p.toJsFn))
    onDestroyScope.foreach(p => __obj.updateDynamic("onDestroyScope")(p.toJsFn))
    if (onLocalDeclaration != null) __obj.updateDynamic("onLocalDeclaration")(js.Any.fromFunction1((t0: /* identifier */ typingsJapgolly.luaparse.astMod.Identifier) => onLocalDeclaration(t0).runNow()))
    if (!js.isUndefined(ranges)) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (!js.isUndefined(scope)) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

