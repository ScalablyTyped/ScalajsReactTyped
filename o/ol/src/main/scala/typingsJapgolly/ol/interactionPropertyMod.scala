package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionPropertyMod {
  
  @JSImport("ol/interaction/Property", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Property & String] = js.native
    
    /* "active" */ val ACTIVE: typingsJapgolly.ol.interactionPropertyMod.Property.ACTIVE & String = js.native
  }
  
  @js.native
  sealed trait Property extends StObject
  @JSImport("ol/interaction/Property", "Property")
  @js.native
  object Property extends StObject {
    
    @js.native
    sealed trait ACTIVE
      extends StObject
         with Property
  }
}
