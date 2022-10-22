package typingsJapgolly.yuka.srcYukaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yuka/src/Yuka", "GraphUtils")
@js.native
open class GraphUtils ()
  extends typingsJapgolly.yuka.srcNavigationExtraGraphUtilsMod.GraphUtils
/* static members */
object GraphUtils {
  
  @JSImport("yuka/src/Yuka", "GraphUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates a navigation graph with a planar grid layout based on the given parameters.
    *
    * @param size - The size (width and depth) in x and z direction
    * @param segments - The amount of segments in x and z direction.
    * @return The new graph.
    */
  inline def createGridLayout(size: Double, segments: Double): typingsJapgolly.yuka.srcGraphCoreGraphMod.Graph[
    typingsJapgolly.yuka.srcGraphCoreNodeMod.Node, 
    typingsJapgolly.yuka.srcGraphCoreEdgeMod.Edge
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createGridLayout")(size.asInstanceOf[js.Any], segments.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.yuka.srcGraphCoreGraphMod.Graph[
    typingsJapgolly.yuka.srcGraphCoreNodeMod.Node, 
    typingsJapgolly.yuka.srcGraphCoreEdgeMod.Edge
  ]]
}
