package typingsJapgolly.rax.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rax.anon.ReadonlychildrenRaxNodeun
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base component for plain JS classes
@JSImport("rax", "Component")
@js.native
open class Component[P, S, SS] protected ()
  extends StObject
     with ComponentLifecycle[P, S, SS] {
  def this(props: P) = this()
  
  var context: Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  
  val props: P & ReadonlychildrenRaxNodeun = js.native
  
  var refs: StringDictionary[RaxInstance] = js.native
  
  def render(): RaxNode = js.native
  
  def setState[K /* <: /* keyof S */ String */](): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: (Pick[S, K]) | S): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: (Pick[S, K]) | S, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](
    state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  
  var state: S = js.native
}
