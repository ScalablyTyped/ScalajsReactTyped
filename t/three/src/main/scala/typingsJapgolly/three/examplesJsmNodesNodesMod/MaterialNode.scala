package typingsJapgolly.three.examplesJsmNodesNodesMod

import typingsJapgolly.three.examplesJsmNodesAccessorsMaterialNodeMod.MaterialNodeScope
import typingsJapgolly.three.examplesJsmNodesAccessorsMaterialNodeMod.default
import typingsJapgolly.three.threeStrings.emissive
import typingsJapgolly.three.threeStrings.opacity
import typingsJapgolly.three.threeStrings.rotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode")
@js.native
open class MaterialNode () extends default {
  def this(scope: MaterialNodeScope) = this()
}
/* static members */
object MaterialNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode.ALPHA_TEST")
  @js.native
  def ALPHA_TEST: typingsJapgolly.three.threeStrings.alphaTest = js.native
  inline def ALPHA_TEST_=(x: typingsJapgolly.three.threeStrings.alphaTest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALPHA_TEST")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode.COLOR")
  @js.native
  def COLOR: typingsJapgolly.three.threeStrings.color = js.native
  inline def COLOR_=(x: typingsJapgolly.three.threeStrings.color): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLOR")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode.EMISSIVE")
  @js.native
  def EMISSIVE: emissive = js.native
  inline def EMISSIVE_=(x: emissive): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMISSIVE")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode.METALNESS")
  @js.native
  def METALNESS: typingsJapgolly.three.threeStrings.metalness = js.native
  inline def METALNESS_=(x: typingsJapgolly.three.threeStrings.metalness): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METALNESS")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode.OPACITY")
  @js.native
  def OPACITY: opacity = js.native
  inline def OPACITY_=(x: opacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPACITY")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode.ROTATION")
  @js.native
  def ROTATION: rotation = js.native
  inline def ROTATION_=(x: rotation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATION")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "MaterialNode.ROUGHNESS")
  @js.native
  def ROUGHNESS: typingsJapgolly.three.threeStrings.roughness = js.native
  inline def ROUGHNESS_=(x: typingsJapgolly.three.threeStrings.roughness): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROUGHNESS")(x.asInstanceOf[js.Any])
}
