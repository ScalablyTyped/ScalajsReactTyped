package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/interaction/Property", JSImport.Namespace)
@js.native
object propertyMod extends js.Object {
  @js.native
  sealed trait Property extends js.Object
  
  @js.native
  object Property extends js.Object {
    @js.native
    sealed trait ACTIVE extends Property
    
  }
  
  @js.native
  object default extends js.Object {
    /* "active" */ val ACTIVE: typingsJapgolly.ol.propertyMod.Property.ACTIVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Property with String] = js.native
  }
  
}

