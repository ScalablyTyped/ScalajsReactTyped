package typingsJapgolly.mithrilGlobal

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.mithrilGlobal.anon.FnCall
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mithril-global", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  type Attributes = typingsJapgolly.mithril.mod.Attributes
  
  type CVnode[A] = typingsJapgolly.mithril.mod.CVnode[A]
  
  type CVnodeDOM[A] = typingsJapgolly.mithril.mod.CVnodeDOM[A]
  
  type Child = typingsJapgolly.mithril.mod.Child
  
  type ChildArray = typingsJapgolly.mithril.mod.ChildArray
  
  type ChildArrayOrPrimitive = typingsJapgolly.mithril.mod.ChildArrayOrPrimitive
  
  type Children = typingsJapgolly.mithril.mod.Children
  
  type ClassComponent[A] = typingsJapgolly.mithril.mod.ClassComponent[A]
  
  type CommonAttributes[A, S] = typingsJapgolly.mithril.mod.CommonAttributes[A, S]
  
  type Comp[A, S /* <: Partial[typingsJapgolly.mithril.mod.Component[A, S]] */] = typingsJapgolly.mithril.mod.Comp[A, S]
  
  type Component[A, S] = typingsJapgolly.mithril.mod.Component[A, S]
  
  type ComponentTypes[A, S /* <: Partial[typingsJapgolly.mithril.mod.Component[A, S]] */] = typingsJapgolly.mithril.mod.ComponentTypes[A, S]
  
  type FactoryComponent[A] = typingsJapgolly.mithril.mod.FactoryComponent[A]
  
  type Hyperscript = typingsJapgolly.mithril.mod.Hyperscript
  
  type JsonpOptions = typingsJapgolly.mithril.mod.JsonpOptions
  
  type RequestOptions[T] = typingsJapgolly.mithril.mod.RequestOptions[T]
  
  type Route = typingsJapgolly.mithril.mod.Route
  
  type RouteDefs = typingsJapgolly.mithril.mod.RouteDefs
  
  type RouteOptions = typingsJapgolly.mithril.mod.RouteOptions
  
  type RouteResolver[A, S] = typingsJapgolly.mithril.mod.RouteResolver[A, S]
  
  @js.native
  trait Static
    extends StObject
       with typingsJapgolly.mithril.mod.Static {
    
    def stream[T](): typingsJapgolly.mithril.streamMod.Stream[T] = js.native
    def stream[T](value: T): typingsJapgolly.mithril.streamMod.Stream[T] = js.native
    @JSName("stream")
    var stream_Original: FnCall = js.native
  }
  
  type Stream[T] = typingsJapgolly.mithril.streamMod.Stream[T]
  
  type Vnode[A, S] = typingsJapgolly.mithril.mod.Vnode[A, S]
  
  type VnodeDOM[A, S] = typingsJapgolly.mithril.mod.VnodeDOM[A, S]
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
