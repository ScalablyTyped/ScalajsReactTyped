package typingsJapgolly.devextremeRuntime

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsReactCollectNestedMod {
  
  @JSImport("@devextreme/runtime/cjs/react/collect-nested", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectChildren(children: Node): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("__collectChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
}
