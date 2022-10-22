package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedSrcResolveChildrenMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/resolveChildren", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveChildren(children: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def resolveChildren(children: Node, renderProps: Record[String, Any]): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveChildren")(children.asInstanceOf[js.Any], renderProps.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def resolveFragment(children: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveFragment")(children.asInstanceOf[js.Any]).asInstanceOf[Node]
}
