package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceVectorEventTypeMod {
  
  @JSImport("ol/source/VectorEventType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorEventType & String] = js.native
    
    /* "addfeature" */ val ADDFEATURE: typingsJapgolly.ol.sourceVectorEventTypeMod.VectorEventType.ADDFEATURE & String = js.native
    
    /* "changefeature" */ val CHANGEFEATURE: typingsJapgolly.ol.sourceVectorEventTypeMod.VectorEventType.CHANGEFEATURE & String = js.native
    
    /* "clear" */ val CLEAR: typingsJapgolly.ol.sourceVectorEventTypeMod.VectorEventType.CLEAR & String = js.native
    
    /* "featuresloadend" */ val FEATURESLOADEND: typingsJapgolly.ol.sourceVectorEventTypeMod.VectorEventType.FEATURESLOADEND & String = js.native
    
    /* "featuresloaderror" */ val FEATURESLOADERROR: typingsJapgolly.ol.sourceVectorEventTypeMod.VectorEventType.FEATURESLOADERROR & String = js.native
    
    /* "featuresloadstart" */ val FEATURESLOADSTART: typingsJapgolly.ol.sourceVectorEventTypeMod.VectorEventType.FEATURESLOADSTART & String = js.native
    
    /* "removefeature" */ val REMOVEFEATURE: typingsJapgolly.ol.sourceVectorEventTypeMod.VectorEventType.REMOVEFEATURE & String = js.native
  }
  
  @js.native
  sealed trait VectorEventType extends StObject
  @JSImport("ol/source/VectorEventType", "VectorEventType")
  @js.native
  object VectorEventType extends StObject {
    
    @js.native
    sealed trait ADDFEATURE
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait CHANGEFEATURE
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait CLEAR
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait FEATURESLOADEND
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait FEATURESLOADERROR
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait FEATURESLOADSTART
      extends StObject
         with VectorEventType
    
    @js.native
    sealed trait REMOVEFEATURE
      extends StObject
         with VectorEventType
  }
}
