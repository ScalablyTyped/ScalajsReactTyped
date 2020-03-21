package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/source/VectorEventType", JSImport.Namespace)
@js.native
object vectorEventTypeMod extends js.Object {
  @js.native
  sealed trait VectorEventType extends js.Object
  
  @js.native
  object VectorEventType extends js.Object {
    @js.native
    sealed trait ADDFEATURE extends VectorEventType
    
    @js.native
    sealed trait CHANGEFEATURE extends VectorEventType
    
    @js.native
    sealed trait CLEAR extends VectorEventType
    
    @js.native
    sealed trait REMOVEFEATURE extends VectorEventType
    
  }
  
  @js.native
  object default extends js.Object {
    /* "addfeature" */ val ADDFEATURE: typingsJapgolly.ol.vectorEventTypeMod.VectorEventType.ADDFEATURE with String = js.native
    /* "changefeature" */ val CHANGEFEATURE: typingsJapgolly.ol.vectorEventTypeMod.VectorEventType.CHANGEFEATURE with String = js.native
    /* "clear" */ val CLEAR: typingsJapgolly.ol.vectorEventTypeMod.VectorEventType.CLEAR with String = js.native
    /* "removefeature" */ val REMOVEFEATURE: typingsJapgolly.ol.vectorEventTypeMod.VectorEventType.REMOVEFEATURE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VectorEventType with String] = js.native
  }
  
}

