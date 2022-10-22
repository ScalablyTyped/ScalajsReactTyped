package typingsJapgolly.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatSyncOptions
  extends StObject
     with StatOptions {
  
  var throwIfNoEntry: js.UndefOr[Boolean] = js.undefined
}
object StatSyncOptions {
  
  inline def apply(): StatSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatSyncOptions]
  }
  
  extension [Self <: StatSyncOptions](x: Self) {
    
    inline def setThrowIfNoEntry(value: Boolean): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    
    inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
  }
}
