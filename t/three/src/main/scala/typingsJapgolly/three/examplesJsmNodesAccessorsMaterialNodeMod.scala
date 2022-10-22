package typingsJapgolly.three

import typingsJapgolly.three.threeStrings.alphaTest
import typingsJapgolly.three.threeStrings.color
import typingsJapgolly.three.threeStrings.emissive
import typingsJapgolly.three.threeStrings.metalness
import typingsJapgolly.three.threeStrings.opacity
import typingsJapgolly.three.threeStrings.rotation
import typingsJapgolly.three.threeStrings.roughness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesAccessorsMaterialNodeMod {
  
  @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", JSImport.Default)
  @js.native
  open class default () extends MaterialNode {
    def this(scope: MaterialNodeScope) = this()
  }
  /* static members */
  object default {
    
    @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", "default.ALPHA_TEST")
    @js.native
    def ALPHA_TEST: alphaTest = js.native
    inline def ALPHA_TEST_=(x: alphaTest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALPHA_TEST")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", "default.COLOR")
    @js.native
    def COLOR: color = js.native
    inline def COLOR_=(x: color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLOR")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", "default.EMISSIVE")
    @js.native
    def EMISSIVE: emissive = js.native
    inline def EMISSIVE_=(x: emissive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMISSIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", "default.METALNESS")
    @js.native
    def METALNESS: metalness = js.native
    inline def METALNESS_=(x: metalness): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METALNESS")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", "default.OPACITY")
    @js.native
    def OPACITY: opacity = js.native
    inline def OPACITY_=(x: opacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPACITY")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", "default.ROTATION")
    @js.native
    def ROTATION: rotation = js.native
    inline def ROTATION_=(x: rotation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATION")(x.asInstanceOf[js.Any])
    
    @JSImport("three/examples/jsm/nodes/accessors/MaterialNode", "default.ROUGHNESS")
    @js.native
    def ROUGHNESS: roughness = js.native
    inline def ROUGHNESS_=(x: roughness): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROUGHNESS")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MaterialNode
    extends typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default {
    
    var scope: MaterialNodeScope = js.native
  }
  
  type MaterialNodeScope = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MaterialNode.ALPHA_TEST */ Any
}
