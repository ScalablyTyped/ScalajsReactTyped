package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/MapProperty", JSImport.Namespace)
@js.native
object mapPropertyMod extends js.Object {
  @js.native
  sealed trait MapProperty extends js.Object
  
  @js.native
  object MapProperty extends js.Object {
    @js.native
    sealed trait LAYERGROUP extends MapProperty
    
    @js.native
    sealed trait SIZE extends MapProperty
    
    @js.native
    sealed trait TARGET extends MapProperty
    
    @js.native
    sealed trait VIEW extends MapProperty
    
  }
  
  @js.native
  object default extends js.Object {
    /* "layergroup" */ val LAYERGROUP: typingsJapgolly.ol.mapPropertyMod.MapProperty.LAYERGROUP with String = js.native
    /* "size" */ val SIZE: typingsJapgolly.ol.mapPropertyMod.MapProperty.SIZE with String = js.native
    /* "target" */ val TARGET: typingsJapgolly.ol.mapPropertyMod.MapProperty.TARGET with String = js.native
    /* "view" */ val VIEW: typingsJapgolly.ol.mapPropertyMod.MapProperty.VIEW with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MapProperty with String] = js.native
  }
  
}

