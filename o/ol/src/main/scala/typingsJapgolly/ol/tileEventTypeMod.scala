package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/TileEventType", JSImport.Namespace)
@js.native
object tileEventTypeMod extends js.Object {
  @js.native
  sealed trait TileEventType extends js.Object
  
  @js.native
  object TileEventType extends js.Object {
    @js.native
    sealed trait TILELOADEND extends TileEventType
    
    @js.native
    sealed trait TILELOADERROR extends TileEventType
    
    @js.native
    sealed trait TILELOADSTART extends TileEventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "tileloadend" */ val TILELOADEND: typingsJapgolly.ol.tileEventTypeMod.TileEventType.TILELOADEND with String = js.native
    /* "tileloaderror" */ val TILELOADERROR: typingsJapgolly.ol.tileEventTypeMod.TileEventType.TILELOADERROR with String = js.native
    /* "tileloadstart" */ val TILELOADSTART: typingsJapgolly.ol.tileEventTypeMod.TileEventType.TILELOADSTART with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TileEventType with String] = js.native
  }
  
}

