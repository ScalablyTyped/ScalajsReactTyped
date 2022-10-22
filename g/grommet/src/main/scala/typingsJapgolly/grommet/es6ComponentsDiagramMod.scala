package typingsJapgolly.grommet

import typingsJapgolly.grommet.anon.Anchor
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsDiagramMod {
  
  @JSImport("grommet/es6/components/Diagram", "Diagram")
  @js.native
  val Diagram: FC[DiagramExtendedProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.grommet.grommetStrings.pulse
    - typingsJapgolly.grommet.grommetStrings.draw
    - typingsJapgolly.grommet.anon.Size
  */
  type DiagramAnimationType = _DiagramAnimationType | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grommet.grommetStrings.center
    - typingsJapgolly.grommet.grommetStrings.vertical
    - typingsJapgolly.grommet.grommetStrings.horizontal
  */
  trait DiagramConnectionAnchor extends StObject
  object DiagramConnectionAnchor {
    
    inline def center: typingsJapgolly.grommet.grommetStrings.center = "center".asInstanceOf[typingsJapgolly.grommet.grommetStrings.center]
    
    inline def horizontal: typingsJapgolly.grommet.grommetStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.grommet.grommetStrings.horizontal]
    
    inline def vertical: typingsJapgolly.grommet.grommetStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.grommet.grommetStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grommet.grommetStrings.direct
    - typingsJapgolly.grommet.grommetStrings.curved
    - typingsJapgolly.grommet.grommetStrings.rectilinear
  */
  trait DiagramConnectionType extends StObject
  object DiagramConnectionType {
    
    inline def curved: typingsJapgolly.grommet.grommetStrings.curved = "curved".asInstanceOf[typingsJapgolly.grommet.grommetStrings.curved]
    
    inline def direct: typingsJapgolly.grommet.grommetStrings.direct = "direct".asInstanceOf[typingsJapgolly.grommet.grommetStrings.direct]
    
    inline def rectilinear: typingsJapgolly.grommet.grommetStrings.rectilinear = "rectilinear".asInstanceOf[typingsJapgolly.grommet.grommetStrings.rectilinear]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize */ @js.native
  trait DiagramExtendedProps
    extends StObject
       with DiagramProps
  
  trait DiagramProps extends StObject {
    
    var animation: js.UndefOr[DiagramAnimationType] = js.undefined
    
    var connections: js.Array[Anchor]
  }
  object DiagramProps {
    
    inline def apply(connections: js.Array[Anchor]): DiagramProps = {
      val __obj = js.Dynamic.literal(connections = connections.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiagramProps]
    }
    
    extension [Self <: DiagramProps](x: Self) {
      
      inline def setAnimation(value: DiagramAnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setConnections(value: js.Array[Anchor]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsVarargs(value: Anchor*): Self = StObject.set(x, "connections", js.Array(value*))
    }
  }
  
  trait _DiagramAnimationType extends StObject
  
  /* Inlined react.react.<global>.JSX.IntrinsicElements['svg'] */
  type divProps = scala.Nothing
}
