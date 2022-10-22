package typingsJapgolly.unifiedDiff

import typingsJapgolly.unified.mod.Transformer
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unified-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[Node[Data], Node[Data]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[Node[Data], Node[Data]])]
}
