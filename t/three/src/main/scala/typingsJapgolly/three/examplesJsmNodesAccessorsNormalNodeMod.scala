package typingsJapgolly.three

import typingsJapgolly.three.threeStrings.geometry
import typingsJapgolly.three.threeStrings.local
import typingsJapgolly.three.threeStrings.view
import typingsJapgolly.three.threeStrings.world
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsNormalNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/NormalNode", JSImport.Default)
  @js.native
  open class default () extends NormalNode {
    def this(scope: NormalNodeScope) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/accessors/NormalNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/accessors/NormalNode", "default.GEOMETRY")
    @js.native
    def GEOMETRY: geometry = js.native
    inline def GEOMETRY_=(x: geometry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GEOMETRY")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/NormalNode", "default.LOCAL")
    @js.native
    def LOCAL: local = js.native
    inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/NormalNode", "default.VIEW")
    @js.native
    def VIEW: view = js.native
    inline def VIEW_=(x: view): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIEW")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/NormalNode", "default.WORLD")
    @js.native
    def WORLD: world = js.native
    inline def WORLD_=(x: world): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait NormalNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    var scope: NormalNodeScope = js.native
  }
  
  type NormalNodeScope = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NormalNode.GEOMETRY */ Any
}
