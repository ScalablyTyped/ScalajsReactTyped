package typingsJapgolly.antvG2.libConstantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELEMENT_STATE extends StObject
@JSImport("@antv/g2/lib/constant", "ELEMENT_STATE")
@js.native
object ELEMENT_STATE extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ELEMENT_STATE & String] = js.native
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with ELEMENT_STATE
  /* "active" */ val ACTIVE: typingsJapgolly.antvG2.libConstantMod.ELEMENT_STATE.ACTIVE & String = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with ELEMENT_STATE
  /* "default" */ val DEFAULT: typingsJapgolly.antvG2.libConstantMod.ELEMENT_STATE.DEFAULT & String = js.native
  
  @js.native
  sealed trait INACTIVE
    extends StObject
       with ELEMENT_STATE
  /* "inactive" */ val INACTIVE: typingsJapgolly.antvG2.libConstantMod.ELEMENT_STATE.INACTIVE & String = js.native
  
  @js.native
  sealed trait SELECTED
    extends StObject
       with ELEMENT_STATE
  /* "selected" */ val SELECTED: typingsJapgolly.antvG2.libConstantMod.ELEMENT_STATE.SELECTED & String = js.native
}
