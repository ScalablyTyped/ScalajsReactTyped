package typingsJapgolly.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionIndex extends StObject {
  
  var collectionIndex: js.UndefOr[Double] = js.undefined
  
  var delimited: js.UndefOr[Boolean] = js.undefined
  
  var delimiter: js.UndefOr[String] = js.undefined
}
object CollectionIndex {
  
  inline def apply(): CollectionIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionIndex]
  }
  
  extension [Self <: CollectionIndex](x: Self) {
    
    inline def setCollectionIndex(value: Double): Self = StObject.set(x, "collectionIndex", value.asInstanceOf[js.Any])
    
    inline def setCollectionIndexUndefined: Self = StObject.set(x, "collectionIndex", js.undefined)
    
    inline def setDelimited(value: Boolean): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
    
    inline def setDelimitedUndefined: Self = StObject.set(x, "delimited", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
  }
}
