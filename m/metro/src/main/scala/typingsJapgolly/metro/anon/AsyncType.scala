package typingsJapgolly.metro.anon

import typingsJapgolly.babelCodeFrame.mod.SourceLocation
import typingsJapgolly.metro.deltaBundlerTypesMod.AsyncDependencyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncType extends StObject {
  
  /**
    * If not null, this dependency is due to a dynamic `import()` or `__prefetchImport()` call.
    */
  val asyncType: AsyncDependencyType | Null
  
  /**
    * The dependency is enclosed in a try/catch block.
    */
  val isOptional: js.UndefOr[Boolean] = js.undefined
  
  val locs: js.Array[SourceLocation]
  
  /**
    * The condition for splitting on this dependency edge.
    */
  val splitCondition: js.UndefOr[MobileConfigName] = js.undefined
}
object AsyncType {
  
  inline def apply(locs: js.Array[SourceLocation]): AsyncType = {
    val __obj = js.Dynamic.literal(locs = locs.asInstanceOf[js.Any], asyncType = null)
    __obj.asInstanceOf[AsyncType]
  }
  
  extension [Self <: AsyncType](x: Self) {
    
    inline def setAsyncType(value: AsyncDependencyType): Self = StObject.set(x, "asyncType", value.asInstanceOf[js.Any])
    
    inline def setAsyncTypeNull: Self = StObject.set(x, "asyncType", null)
    
    inline def setIsOptional(value: Boolean): Self = StObject.set(x, "isOptional", value.asInstanceOf[js.Any])
    
    inline def setIsOptionalUndefined: Self = StObject.set(x, "isOptional", js.undefined)
    
    inline def setLocs(value: js.Array[SourceLocation]): Self = StObject.set(x, "locs", value.asInstanceOf[js.Any])
    
    inline def setLocsVarargs(value: SourceLocation*): Self = StObject.set(x, "locs", js.Array(value*))
    
    inline def setSplitCondition(value: MobileConfigName): Self = StObject.set(x, "splitCondition", value.asInstanceOf[js.Any])
    
    inline def setSplitConditionUndefined: Self = StObject.set(x, "splitCondition", js.undefined)
  }
}
