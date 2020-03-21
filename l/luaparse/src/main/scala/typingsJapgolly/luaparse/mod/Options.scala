package typingsJapgolly.luaparse.mod

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

trait Options extends js.Object {
  /** Store comments as an array in the chunk object. */
  var comments: Boolean
  /**
    * Whether to allow code points ≥ U+0080 in identifiers, like LuaJIT does.
    * See 'Note on character encodings' below if you wish to use this option.
    * Note: setting luaVersion: 'LuaJIT' currently does not enable this option; this may change in the future.
    */
  var extendedIdentifiers: `false`
  /** Store location information on each syntax node. */
  var locations: Boolean
  /** The version of Lua the parser will target; supported values are '5.1', '5.2', '5.3' and 'LuaJIT'. */
  var luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT
  /** Store the start and end character locations on each syntax node. */
  var ranges: Boolean
  /** Track identifier scopes. */
  var scope: Boolean
  /** Explicitly tell the parser when the input ends. */
  @JSName("wait")
  var wait_FOptions: Boolean
  /**
    * A callback which will be invoked when a syntax node has been completed.
    * The node which has been created will be passed as the only parameter.
    */
  def onCreateNode(node: Node): Unit
  /** A callback which will be invoked when a new scope is created. */
  def onCreateScope(): Unit
  /** A callback which will be invoked when the current scope is destroyed. */
  def onDestroyScope(): Unit
  /**
    * A callback which will be invoked when a local variable is declared.
    * The identifier will be passed as the only parameter.
    */
  def onLocalDeclaration(identifier: Identifier): Unit
}

object Options {
  @scala.inline
  def apply(
    comments: Boolean,
    extendedIdentifiers: `false`,
    locations: Boolean,
    luaVersion: `5Dot1` | `5Dot2` | `5Dot3` | LuaJIT,
    onCreateNode: Node => Callback,
    onCreateScope: Callback,
    onDestroyScope: Callback,
    onLocalDeclaration: Identifier => Callback,
    ranges: Boolean,
    scope: Boolean,
    wait: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], extendedIdentifiers = extendedIdentifiers.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], luaVersion = luaVersion.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
    __obj.updateDynamic("onCreateNode")(js.Any.fromFunction1((t0: typingsJapgolly.luaparse.astMod.Node) => onCreateNode(t0).runNow()))
    __obj.updateDynamic("onCreateScope")(onCreateScope.toJsFn)
    __obj.updateDynamic("onDestroyScope")(onDestroyScope.toJsFn)
    __obj.updateDynamic("onLocalDeclaration")(js.Any.fromFunction1((t0: typingsJapgolly.luaparse.astMod.Identifier) => onLocalDeclaration(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

