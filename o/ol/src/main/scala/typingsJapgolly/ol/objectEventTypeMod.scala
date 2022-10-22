package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectEventTypeMod {
  
  @JSImport("ol/ObjectEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ObjectEventType & String] = js.native
    
    /* "propertychange" */ val PROPERTYCHANGE: typingsJapgolly.ol.objectEventTypeMod.ObjectEventType.PROPERTYCHANGE & String = js.native
  }
  
  @js.native
  sealed trait ObjectEventType extends StObject
  @JSImport("ol/ObjectEventType", "ObjectEventType")
  @js.native
  object ObjectEventType extends StObject {
    
    @js.native
    sealed trait PROPERTYCHANGE
      extends StObject
         with ObjectEventType
  }
}
