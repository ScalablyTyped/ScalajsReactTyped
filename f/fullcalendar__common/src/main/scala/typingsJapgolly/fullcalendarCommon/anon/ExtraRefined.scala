package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.mod.Dictionary
import typingsJapgolly.fullcalendarCommon.mod.GenericRefiners
import typingsJapgolly.fullcalendarCommon.mod.RefinedOptionsFromRefiners
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraRefined[Refiners /* <: GenericRefiners */] extends StObject {
  
  var extra: Dictionary
  
  var refined: RefinedOptionsFromRefiners[Refiners]
}
object ExtraRefined {
  
  inline def apply[Refiners /* <: GenericRefiners */](extra: Dictionary, refined: RefinedOptionsFromRefiners[Refiners]): ExtraRefined[Refiners] = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], refined = refined.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraRefined[Refiners]]
  }
  
  extension [Self <: ExtraRefined[?], Refiners /* <: GenericRefiners */](x: Self & ExtraRefined[Refiners]) {
    
    inline def setExtra(value: Dictionary): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setRefined(value: RefinedOptionsFromRefiners[Refiners]): Self = StObject.set(x, "refined", value.asInstanceOf[js.Any])
  }
}
