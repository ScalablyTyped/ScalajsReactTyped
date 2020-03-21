package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/ImageState", JSImport.Namespace)
@js.native
object imageStateMod extends js.Object {
  @js.native
  sealed trait ImageState extends js.Object
  
  @js.native
  object ImageState extends js.Object {
    @js.native
    sealed trait EMPTY extends ImageState
    
    @js.native
    sealed trait ERROR extends ImageState
    
    @js.native
    sealed trait IDLE extends ImageState
    
    @js.native
    sealed trait LOADED extends ImageState
    
    @js.native
    sealed trait LOADING extends ImageState
    
  }
  
  @js.native
  object default extends js.Object {
    /* 4 */ val EMPTY: typingsJapgolly.ol.imageStateMod.ImageState.EMPTY with Double = js.native
    /* 3 */ val ERROR: typingsJapgolly.ol.imageStateMod.ImageState.ERROR with Double = js.native
    /* 0 */ val IDLE: typingsJapgolly.ol.imageStateMod.ImageState.IDLE with Double = js.native
    /* 2 */ val LOADED: typingsJapgolly.ol.imageStateMod.ImageState.LOADED with Double = js.native
    /* 1 */ val LOADING: typingsJapgolly.ol.imageStateMod.ImageState.LOADING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ImageState with Double] = js.native
  }
  
}

