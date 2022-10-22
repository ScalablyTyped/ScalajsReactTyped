package typingsJapgolly.ink

import typingsJapgolly.ink.anon.NodeName
import typingsJapgolly.ink.buildDomMod.DOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRenderBorderMod {
  
  @JSImport("ink/build/render-border", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: Double, y: Double, node: DOMNode[NodeName], output: typingsJapgolly.ink.buildOutputMod.default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], node.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
