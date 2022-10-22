package typingsJapgolly.optimism

import typingsJapgolly.optimism.anon.Dirty
import typingsJapgolly.optimism.anon.Subscribe
import typingsJapgolly.optimism.libEntryMod.AnyEntry
import typingsJapgolly.optimism.libHelpersMod.Unsubscribable
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDepMod {
  
  @JSImport("optimism/lib/dep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dep[TKey](): OptimisticDependencyFunction[TKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("dep")().asInstanceOf[OptimisticDependencyFunction[TKey]]
  inline def dep[TKey](options: Subscribe[TKey]): OptimisticDependencyFunction[TKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("dep")(options.asInstanceOf[js.Any]).asInstanceOf[OptimisticDependencyFunction[TKey]]
  
  @js.native
  trait Dep_[TKey]
    extends StObject
       with Set[AnyEntry]
       with Unsubscribable {
    
    var subscribe: js.UndefOr[js.Function1[/* args */ js.Array[TKey], Unit | js.Function0[Any]]] = js.native
  }
  
  /* keyof optimism.anon.Dispose */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.optimism.optimismStrings.setDirty
    - typingsJapgolly.optimism.optimismStrings.dispose
    - typingsJapgolly.optimism.optimismStrings.forget
  */
  trait EntryMethodName extends StObject
  
  type OptimisticDependencyFunction[TKey] = (js.Function1[/* key */ TKey, Unit]) & Dirty[TKey]
}
