package typingsJapgolly.babelPluginMacros

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babelCore.mod.NodePath
import typingsJapgolly.babelTraverse.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  default  :std.Array<@babel/core.@babel/core.NodePath<@babel/traverse.@babel/traverse.Node>>} & babel-plugin-macros.babel-plugin-macros.References */
trait defaultArrayNodePathNodeR
  extends /* key */ StringDictionary[js.Array[NodePath[Node]]] {
  var default: js.Array[NodePath[Node]]
}

object defaultArrayNodePathNodeR {
  @scala.inline
  def apply(
    default: js.Array[NodePath[Node]],
    StringDictionary: /* key */ StringDictionary[js.Array[NodePath[Node]]] = null
  ): defaultArrayNodePathNodeR = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[defaultArrayNodePathNodeR]
  }
}

