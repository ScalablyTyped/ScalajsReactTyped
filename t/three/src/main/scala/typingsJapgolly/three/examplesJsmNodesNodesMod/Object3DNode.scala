package typingsJapgolly.three.examplesJsmNodesNodesMod

import typingsJapgolly.three.examplesJsmNodesAccessorsObject3DNodeMod.Object3DNodeScope
import typingsJapgolly.three.examplesJsmNodesAccessorsObject3DNodeMod.default
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.three.srcThreeMod.Object3D
import typingsJapgolly.three.threeStrings.normalMatrix
import typingsJapgolly.three.threeStrings.position
import typingsJapgolly.three.threeStrings.viewMatrix
import typingsJapgolly.three.threeStrings.viewPosition
import typingsJapgolly.three.threeStrings.worldMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "Object3DNode")
@js.native
open class Object3DNode () extends default {
  def this(scope: Object3DNodeScope) = this()
  def this(scope: Unit, object3d: Object3D[Event]) = this()
  def this(scope: Object3DNodeScope, object3d: Object3D[Event]) = this()
}
/* static members */
object Object3DNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "Object3DNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "Object3DNode.NORMAL_MATRIX")
  @js.native
  def NORMAL_MATRIX: normalMatrix = js.native
  inline def NORMAL_MATRIX_=(x: normalMatrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL_MATRIX")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "Object3DNode.POSITION")
  @js.native
  def POSITION: position = js.native
  inline def POSITION_=(x: position): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "Object3DNode.VIEW_MATRIX")
  @js.native
  def VIEW_MATRIX: viewMatrix = js.native
  inline def VIEW_MATRIX_=(x: viewMatrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_MATRIX")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "Object3DNode.VIEW_POSITION")
  @js.native
  def VIEW_POSITION: viewPosition = js.native
  inline def VIEW_POSITION_=(x: viewPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW_POSITION")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "Object3DNode.WORLD_MATRIX")
  @js.native
  def WORLD_MATRIX: worldMatrix = js.native
  inline def WORLD_MATRIX_=(x: worldMatrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD_MATRIX")(x.asInstanceOf[js.Any])
}
