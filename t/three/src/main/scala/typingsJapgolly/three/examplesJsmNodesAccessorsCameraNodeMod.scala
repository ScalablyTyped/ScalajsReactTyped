package typingsJapgolly.three

import typingsJapgolly.three.examplesJsmNodesAccessorsObject3DNodeMod.Object3DNodeScope
import typingsJapgolly.three.threeStrings.projectionMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsCameraNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/CameraNode", JSImport.Default)
  @js.native
  open class default () extends CameraNode {
    def this(scope: CameraNodeScope) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/accessors/CameraNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/accessors/CameraNode", "default.PROJECTION_MATRIX")
    @js.native
    def PROJECTION_MATRIX: projectionMatrix = js.native
    inline def PROJECTION_MATRIX_=(x: projectionMatrix): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROJECTION_MATRIX")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CameraNode
    extends typingsJapgolly.three.examplesJsmNodesAccessorsObject3DNodeMod.default {
    
    // @ts-expect-error
    @JSName("scope")
    var scope_CameraNode: CameraNodeScope = js.native
  }
  
  type CameraNodeScope = Object3DNodeScope | (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CameraNode.PROJECTION_MATRIX */ Any)
}
