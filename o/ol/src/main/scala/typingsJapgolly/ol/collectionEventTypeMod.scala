package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionEventTypeMod {
  
  @JSImport("ol/CollectionEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CollectionEventType & String] = js.native
    
    /* "add" */ val ADD: typingsJapgolly.ol.collectionEventTypeMod.CollectionEventType.ADD & String = js.native
    
    /* "remove" */ val REMOVE: typingsJapgolly.ol.collectionEventTypeMod.CollectionEventType.REMOVE & String = js.native
  }
  
  @js.native
  sealed trait CollectionEventType extends StObject
  @JSImport("ol/CollectionEventType", "CollectionEventType")
  @js.native
  object CollectionEventType extends StObject {
    
    @js.native
    sealed trait ADD
      extends StObject
         with CollectionEventType
    
    @js.native
    sealed trait REMOVE
      extends StObject
         with CollectionEventType
  }
}
