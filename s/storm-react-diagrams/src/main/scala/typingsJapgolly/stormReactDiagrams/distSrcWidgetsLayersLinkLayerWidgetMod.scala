package typingsJapgolly.stormReactDiagrams

import org.scalajs.dom.MouseEvent
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcModelsPointModelMod.PointModel
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidget
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWidgetsLayersLinkLayerWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/layers/LinkLayerWidget", "LinkLayerWidget")
  @js.native
  open class LinkLayerWidget protected () extends BaseWidget[LinkLayerProps, LinkLayerState] {
    def this(props: LinkLayerProps) = this()
  }
  
  trait LinkLayerProps
    extends StObject
       with BaseWidgetProps {
    
    var diagramEngine: DiagramEngine
    
    def pointAdded(point: PointModel, event: MouseEvent): Any
  }
  object LinkLayerProps {
    
    inline def apply(diagramEngine: DiagramEngine, pointAdded: (PointModel, MouseEvent) => Any): LinkLayerProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], pointAdded = js.Any.fromFunction2(pointAdded))
      __obj.asInstanceOf[LinkLayerProps]
    }
    
    extension [Self <: LinkLayerProps](x: Self) {
      
      inline def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      inline def setPointAdded(value: (PointModel, MouseEvent) => Any): Self = StObject.set(x, "pointAdded", js.Any.fromFunction2(value))
    }
  }
  
  trait LinkLayerState extends StObject
}
