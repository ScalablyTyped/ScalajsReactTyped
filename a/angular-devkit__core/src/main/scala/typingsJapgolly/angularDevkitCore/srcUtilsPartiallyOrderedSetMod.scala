package typingsJapgolly.angularDevkitCore

import typingsJapgolly.angularDevkitCore.srcExceptionMod.BaseException
import typingsJapgolly.std.Generator
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsPartiallyOrderedSetMod {
  
  @JSImport("@angular-devkit/core/src/utils/partially-ordered-set", "CircularDependencyFoundException")
  @js.native
  open class CircularDependencyFoundException () extends BaseException
  
  @JSImport("@angular-devkit/core/src/utils/partially-ordered-set", "DependencyNotFoundException")
  @js.native
  open class DependencyNotFoundException () extends BaseException
  
  @JSImport("@angular-devkit/core/src/utils/partially-ordered-set", "PartiallyOrderedSet")
  @js.native
  open class PartiallyOrderedSet[T] ()
    extends StObject
       with Set[T] {
    
    /* protected */ def _checkCircularDependencies(item: T, deps: Set[T]): Unit = js.native
    
    /* private */ var _items: Any = js.native
    
    def add(item: T, deps: js.Array[T]): this.type = js.native
    def add(item: T, deps: Set[T]): this.type = js.native
    
    var get: Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_PartiallyOrderedSet: js.Function0[Generator[T, Unit, Any]] = js.native
    
    @JSName("size")
    def size_MPartiallyOrderedSet: Double = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_PartiallyOrderedSet: js.Function0[typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.Set] = js.native
  }
}
