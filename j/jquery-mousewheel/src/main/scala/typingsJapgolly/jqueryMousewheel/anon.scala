package typingsJapgolly.jqueryMousewheel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdjustOldDeltas extends StObject {
    
    var adjustOldDeltas: Boolean
    
    var normalizeOffset: Boolean
  }
  object AdjustOldDeltas {
    
    inline def apply(adjustOldDeltas: Boolean, normalizeOffset: Boolean): AdjustOldDeltas = {
      val __obj = js.Dynamic.literal(adjustOldDeltas = adjustOldDeltas.asInstanceOf[js.Any], normalizeOffset = normalizeOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdjustOldDeltas]
    }
    
    extension [Self <: AdjustOldDeltas](x: Self) {
      
      inline def setAdjustOldDeltas(value: Boolean): Self = StObject.set(x, "adjustOldDeltas", value.asInstanceOf[js.Any])
      
      inline def setNormalizeOffset(value: Boolean): Self = StObject.set(x, "normalizeOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Setup extends StObject {
    
    var setup: Any
  }
  object Setup {
    
    inline def apply(setup: Any): Setup = {
      val __obj = js.Dynamic.literal(setup = setup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Setup]
    }
    
    extension [Self <: Setup](x: Self) {
      
      inline def setSetup(value: Any): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
    }
  }
  
  trait Teardown extends StObject {
    
    var teardown: Any
  }
  object Teardown {
    
    inline def apply(teardown: Any): Teardown = {
      val __obj = js.Dynamic.literal(teardown = teardown.asInstanceOf[js.Any])
      __obj.asInstanceOf[Teardown]
    }
    
    extension [Self <: Teardown](x: Self) {
      
      inline def setTeardown(value: Any): Self = StObject.set(x, "teardown", value.asInstanceOf[js.Any])
    }
  }
}
