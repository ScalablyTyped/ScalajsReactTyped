package typingsJapgolly.natsHemera.mod

import typingsJapgolly.natsHemera.natsHemeraStrings.depth
import typingsJapgolly.natsHemera.natsHemeraStrings.insertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BloomrunConfig extends StObject {
  
  var indexing: insertion | depth
  
  var lookupBeforeAdd: Boolean
}
object BloomrunConfig {
  
  inline def apply(indexing: insertion | depth, lookupBeforeAdd: Boolean): BloomrunConfig = {
    val __obj = js.Dynamic.literal(indexing = indexing.asInstanceOf[js.Any], lookupBeforeAdd = lookupBeforeAdd.asInstanceOf[js.Any])
    __obj.asInstanceOf[BloomrunConfig]
  }
  
  extension [Self <: BloomrunConfig](x: Self) {
    
    inline def setIndexing(value: insertion | depth): Self = StObject.set(x, "indexing", value.asInstanceOf[js.Any])
    
    inline def setLookupBeforeAdd(value: Boolean): Self = StObject.set(x, "lookupBeforeAdd", value.asInstanceOf[js.Any])
  }
}
