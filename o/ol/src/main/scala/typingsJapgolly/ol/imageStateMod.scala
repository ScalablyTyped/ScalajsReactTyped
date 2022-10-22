package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageStateMod {
  
  @JSImport("ol/ImageState", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageState & Double] = js.native
    
    /* 4 */ val EMPTY: typingsJapgolly.ol.imageStateMod.ImageState.EMPTY & Double = js.native
    
    /* 3 */ val ERROR: typingsJapgolly.ol.imageStateMod.ImageState.ERROR & Double = js.native
    
    /* 0 */ val IDLE: typingsJapgolly.ol.imageStateMod.ImageState.IDLE & Double = js.native
    
    /* 2 */ val LOADED: typingsJapgolly.ol.imageStateMod.ImageState.LOADED & Double = js.native
    
    /* 1 */ val LOADING: typingsJapgolly.ol.imageStateMod.ImageState.LOADING & Double = js.native
  }
  
  @js.native
  sealed trait ImageState extends StObject
  @JSImport("ol/ImageState", "ImageState")
  @js.native
  object ImageState extends StObject {
    
    @js.native
    sealed trait EMPTY
      extends StObject
         with ImageState
    
    @js.native
    sealed trait ERROR
      extends StObject
         with ImageState
    
    @js.native
    sealed trait IDLE
      extends StObject
         with ImageState
    
    @js.native
    sealed trait LOADED
      extends StObject
         with ImageState
    
    @js.native
    sealed trait LOADING
      extends StObject
         with ImageState
  }
}
