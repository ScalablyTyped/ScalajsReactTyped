package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/TileState", JSImport.Namespace)
@js.native
object tileStateMod extends js.Object {
  @js.native
  sealed trait TileState extends js.Object
  
  @js.native
  object TileState extends js.Object {
    @js.native
    sealed trait ABORT extends TileState
    
    @js.native
    sealed trait EMPTY extends TileState
    
    @js.native
    sealed trait ERROR extends TileState
    
    @js.native
    sealed trait IDLE extends TileState
    
    @js.native
    sealed trait LOADED extends TileState
    
    @js.native
    sealed trait LOADING extends TileState
    
  }
  
  @js.native
  object default extends js.Object {
    /* 5 */ val ABORT: typingsJapgolly.ol.tileStateMod.TileState.ABORT with Double = js.native
    /* 4 */ val EMPTY: typingsJapgolly.ol.tileStateMod.TileState.EMPTY with Double = js.native
    /* 3 */ val ERROR: typingsJapgolly.ol.tileStateMod.TileState.ERROR with Double = js.native
    /* 0 */ val IDLE: typingsJapgolly.ol.tileStateMod.TileState.IDLE with Double = js.native
    /* 2 */ val LOADED: typingsJapgolly.ol.tileStateMod.TileState.LOADED with Double = js.native
    /* 1 */ val LOADING: typingsJapgolly.ol.tileStateMod.TileState.LOADING with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TileState with Double] = js.native
  }
  
}

