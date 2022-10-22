package typingsJapgolly.reactMosaicComponent

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRootDropTargetsMod {
  
  @JSImport("react-mosaic-component/lib/RootDropTargets", "RootDropTargets")
  @js.native
  val RootDropTargets: ComponentType[js.Object] = js.native
  
  trait RootDropTargetsProps extends StObject {
    
    var isDragging: Boolean
  }
  object RootDropTargetsProps {
    
    inline def apply(isDragging: Boolean): RootDropTargetsProps = {
      val __obj = js.Dynamic.literal(isDragging = isDragging.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootDropTargetsProps]
    }
    
    extension [Self <: RootDropTargetsProps](x: Self) {
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    }
  }
}
