package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidget
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWidgetsLinkWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/widgets/LinkWidget", "LinkWidget")
  @js.native
  open class LinkWidget protected () extends BaseWidget[LinkProps, LinkState] {
    def this(props: LinkProps) = this()
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MLinkWidget(): Boolean = js.native
  }
  
  trait LinkProps
    extends StObject
       with BaseWidgetProps {
    
    var children: js.UndefOr[Any] = js.undefined
    
    var diagramEngine: DiagramEngine
    
    var link: LinkModel[LinkModelListener]
  }
  object LinkProps {
    
    inline def apply(diagramEngine: DiagramEngine, link: LinkModel[LinkModelListener]): LinkProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      inline def setLink(value: LinkModel[LinkModelListener]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkState extends StObject
}
