package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsBoxMod.BoxProps
import typingsJapgolly.grommet.es6ComponentsLayerMod.LayerPositionType
import typingsJapgolly.grommet.es6ComponentsTextMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerLabel extends StObject {
  
  var container: js.UndefOr[BoxProps] = js.undefined
  
  var label: js.UndefOr[TextProps] = js.undefined
  
  var position: js.UndefOr[LayerPositionType] = js.undefined
}
object ContainerLabel {
  
  inline def apply(): ContainerLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerLabel]
  }
  
  extension [Self <: ContainerLabel](x: Self) {
    
    inline def setContainer(value: BoxProps): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setLabel(value: TextProps): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPosition(value: LayerPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
