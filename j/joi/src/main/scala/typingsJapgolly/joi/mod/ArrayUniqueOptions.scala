package typingsJapgolly.joi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayUniqueOptions
  extends StObject
     with HierarchySeparatorOptions {
  
  /**
    * if true, undefined values for the dot notation string comparator will not cause the array to fail on uniqueness.
    *
    * @default false
    */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
}
object ArrayUniqueOptions {
  
  inline def apply(): ArrayUniqueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayUniqueOptions]
  }
  
  extension [Self <: ArrayUniqueOptions](x: Self) {
    
    inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
  }
}
