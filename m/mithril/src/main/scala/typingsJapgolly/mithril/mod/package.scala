package typingsJapgolly.mithril

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CVnode[A] = typingsJapgolly.mithril.mod.Vnode[A, typingsJapgolly.mithril.mod.ClassComponent[A]]
  type CVnodeDOM[A] = typingsJapgolly.mithril.mod.VnodeDOM[A, typingsJapgolly.mithril.mod.ClassComponent[A]]
  // Vnode children types
  type Child = js.UndefOr[
    (typingsJapgolly.mithril.mod.Vnode[js.Any, js.Any]) | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  type ChildArrayOrPrimitive = typingsJapgolly.mithril.mod.ChildArray | java.lang.String | scala.Double | scala.Boolean
  type Children = typingsJapgolly.mithril.mod.Child | typingsJapgolly.mithril.mod.ChildArray
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any function that returns an object with a view method can be used as a Mithril component.
  	 * Components can be consumed via the m() utility.
  	 */
  type ClosureComponent[A] = typingsJapgolly.mithril.mod.FactoryComponent[A]
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any Javascript object that has a view method is a Mithril component. Components can be consumed via the m() utility.
  	 */
  type Comp[Attrs, State /* <: typingsJapgolly.mithril.mod.Lifecycle[Attrs, State] */] = (typingsJapgolly.mithril.mod.Component[Attrs, State]) with State
  /** Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse. Components can be consumed via the m() utility. */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mithril.mod.Component[A, S]
    - typingsJapgolly.mithril.AnonInstantiable[A]
    - typingsJapgolly.mithril.mod.FactoryComponent[A]
  */
  type ComponentTypes[A, S /* <: typingsJapgolly.mithril.mod.Lifecycle[A, S] */] = (typingsJapgolly.mithril.mod._ComponentTypes[A, S]) | typingsJapgolly.mithril.mod.FactoryComponent[A]
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any function that returns an object with a view method can be used as a Mithril component.
  	 * Components can be consumed via the m() utility.
  	 */
  type FactoryComponent[A] = js.Function1[
    /* vnode */ typingsJapgolly.mithril.mod.Vnode[A, js.Object], 
    typingsJapgolly.mithril.mod.Component[A, js.Object]
  ]
  type Params = js.Object with typingsJapgolly.mithril.mod.ParamsRec
  /** This represents a key-value mapping linking routes to components. */
  type RouteDefs = /** The key represents the route. The value represents the corresponding component. */
  org.scalablytyped.runtime.StringDictionary[
    (typingsJapgolly.mithril.mod.ComponentTypes[js.Any, js.Any]) | (typingsJapgolly.mithril.mod.RouteResolver[js.Any, js.Any])
  ]
}
