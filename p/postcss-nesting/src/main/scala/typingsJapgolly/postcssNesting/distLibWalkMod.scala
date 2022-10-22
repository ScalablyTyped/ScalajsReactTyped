package typingsJapgolly.postcssNesting

import typingsJapgolly.postcss.libNodeMod.ChildNode
import typingsJapgolly.postcss.mod.Container
import typingsJapgolly.postcssNesting.distLibOptionsMod.options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibWalkMod {
  
  @JSImport("postcss-nesting/dist/lib/walk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Container[ChildNode], opts: options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
