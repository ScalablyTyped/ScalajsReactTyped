package typingsJapgolly.reactOverlays.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var placement: typingsJapgolly.reactOverlays.esmUsePopperMod.Placement
  
  var popper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ Any
  
  var reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ Any
}
object Placement {
  
  inline def apply(
    placement: typingsJapgolly.reactOverlays.esmUsePopperMod.Placement,
    popper: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ Any,
    reference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ Any
  ): Placement = {
    val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  extension [Self <: Placement](x: Self) {
    
    inline def setPlacement(value: typingsJapgolly.reactOverlays.esmUsePopperMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPopper(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ Any
    ): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
    
    inline def setReference(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Rect */ Any
    ): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
  }
}
