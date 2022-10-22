package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsDiagramMod.DiagramAnimationType
import typingsJapgolly.grommet.es6ComponentsDiagramMod.DiagramConnectionAnchor
import typingsJapgolly.grommet.es6ComponentsDiagramMod.DiagramConnectionType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.grommetStrings.hair
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anchor extends StObject {
  
  var anchor: js.UndefOr[DiagramConnectionAnchor] = js.undefined
  
  var animation: js.UndefOr[DiagramAnimationType] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var fromTarget: String | js.Object
  
  var label: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[xsmall | small | medium | large | String] = js.undefined
  
  var thickness: js.UndefOr[hair | xxsmall | xsmall | small | medium | large | String] = js.undefined
  
  var toTarget: String | js.Object
  
  var `type`: js.UndefOr[DiagramConnectionType] = js.undefined
}
object Anchor {
  
  inline def apply(fromTarget: String | js.Object, toTarget: String | js.Object): Anchor = {
    val __obj = js.Dynamic.literal(fromTarget = fromTarget.asInstanceOf[js.Any], toTarget = toTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  
  extension [Self <: Anchor](x: Self) {
    
    inline def setAnchor(value: DiagramConnectionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAnimation(value: DiagramAnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFromTarget(value: String | js.Object): Self = StObject.set(x, "fromTarget", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOffset(value: xsmall | small | medium | large | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setThickness(value: hair | xxsmall | xsmall | small | medium | large | String): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    inline def setToTarget(value: String | js.Object): Self = StObject.set(x, "toTarget", value.asInstanceOf[js.Any])
    
    inline def setType(value: DiagramConnectionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
