package typingsJapgolly.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopySyncOptions
  extends StObject
     with CopyOptionsBase {
  
  /**
    * Function to filter copied files/directories. Return
    * `true` to copy the item, `false` to ignore it.
    */
  var filter: js.UndefOr[js.Function2[/* source */ String, /* destination */ String, Boolean]] = js.undefined
}
object CopySyncOptions {
  
  inline def apply(): CopySyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySyncOptions]
  }
  
  extension [Self <: CopySyncOptions](x: Self) {
    
    inline def setFilter(value: (/* source */ String, /* destination */ String) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
