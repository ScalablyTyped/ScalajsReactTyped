package typingsJapgolly.aureliaDependencyInjection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-dependency-injection", "All")
@js.native
open class All_[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */] protected () extends StObject {
  def this(key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]) = this()
  
  def get(container: Container): js.Array[TImpl] = js.native
}
/* static members */
object All_ {
  
  @JSImport("aurelia-dependency-injection", "All")
  @js.native
  val ^ : js.Any = js.native
  
  inline def of[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](key: PrimitiveOrDependencyCtor[TBase, TImpl, TArgs]): All_[TBase, TImpl, TArgs] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(key.asInstanceOf[js.Any]).asInstanceOf[All_[TBase, TImpl, TArgs]]
}
