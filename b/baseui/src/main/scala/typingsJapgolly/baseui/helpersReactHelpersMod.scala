package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersReactHelpersMod {
  
  @JSImport("baseui/helpers/react-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flattenFragments(): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")().asInstanceOf[js.Array[Node]]
  inline def flattenFragments(children: Node): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
  inline def flattenFragments(children: Node, ChildWrapper: Unit, depth: Double): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def flattenFragments(children: Node, ChildWrapper: ComponentType[js.Object]): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def flattenFragments(children: Node, ChildWrapper: ComponentType[js.Object], depth: Double): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def flattenFragments(children: Unit, ChildWrapper: Unit, depth: Double): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def flattenFragments(children: Unit, ChildWrapper: ComponentType[js.Object]): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
  inline def flattenFragments(children: Unit, ChildWrapper: ComponentType[js.Object], depth: Double): js.Array[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenFragments")(children.asInstanceOf[js.Any], ChildWrapper.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Node]]
}
