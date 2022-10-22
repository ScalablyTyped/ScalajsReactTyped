package typingsJapgolly.three.examplesJsmNodesNodesMod

import typingsJapgolly.three.examplesJsmNodesAccessorsPositionNodeMod.PositionNodeScope
import typingsJapgolly.three.examplesJsmNodesAccessorsPositionNodeMod.default
import typingsJapgolly.three.threeStrings.geometry
import typingsJapgolly.three.threeStrings.local
import typingsJapgolly.three.threeStrings.view
import typingsJapgolly.three.threeStrings.viewDirection
import typingsJapgolly.three.threeStrings.world
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "PositionNode")
@js.native
open class PositionNode () extends default {
  def this(scope: PositionNodeScope) = this()
}
/* static members */
object PositionNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.GEOMETRY")
  @js.native
  def GEOMETRY: geometry = js.native
  inline def GEOMETRY_=(x: geometry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.LOCAL")
  @js.native
  def LOCAL: local = js.native
  inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.VIEW")
  @js.native
  def VIEW: view = js.native
  inline def VIEW_=(x: view): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.VIEW_DIRECTION")
  @js.native
  def VIEW_DIRECTION: viewDirection = js.native
  inline def VIEW_DIRECTION_=(x: viewDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_DIRECTION")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "PositionNode.WORLD")
  @js.native
  def WORLD: world = js.native
  inline def WORLD_=(x: world): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD")(x.asInstanceOf[js.Any])
}
