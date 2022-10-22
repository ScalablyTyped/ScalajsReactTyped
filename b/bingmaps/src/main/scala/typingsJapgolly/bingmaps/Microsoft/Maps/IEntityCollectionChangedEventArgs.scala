package typingsJapgolly.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEntityCollectionChangedEventArgs extends StObject {
  
  /** The entity collection the event was triggered from. */
  var collection: EntityCollection
  
  /** The IPrimitive object that the event occurred for. */
  var data: IPrimitive
}
object IEntityCollectionChangedEventArgs {
  
  inline def apply(collection: EntityCollection, data: IPrimitive): IEntityCollectionChangedEventArgs = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCollectionChangedEventArgs]
  }
  
  extension [Self <: IEntityCollectionChangedEventArgs](x: Self) {
    
    inline def setCollection(value: EntityCollection): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setData(value: IPrimitive): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
