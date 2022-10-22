package typingsJapgolly.reactOverlays.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var modifiers: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['modifiers'] */ js.Any
  ] = js.undefined
  
  var placement: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['placement'] */ js.Any
  ] = js.undefined
  
  var strategy: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['strategy'] */ js.Any
  ] = js.undefined
}
object Enabled {
  
  inline def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setModifiers(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['modifiers'] */ js.Any
    ): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setPlacement(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['placement'] */ js.Any
    ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setStrategy(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-overlays.react-overlays/esm/usePopper.Options['strategy'] */ js.Any
    ): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
