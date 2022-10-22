package typingsJapgolly.three.examplesJsmNodesNodesMod

import typingsJapgolly.three.examplesJsmNodesDisplayColorSpaceNodeMod.ColorSpaceNodeMethod
import typingsJapgolly.three.examplesJsmNodesDisplayColorSpaceNodeMod.default
import typingsJapgolly.three.threeStrings.LinearToLinear
import typingsJapgolly.three.threeStrings.LinearTosRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "ColorSpaceNode")
@js.native
open class ColorSpaceNode protected () extends default {
  def this(method: Null, node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default) = this()
  def this(method: ColorSpaceNodeMethod, node: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default) = this()
}
/* static members */
object ColorSpaceNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ColorSpaceNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ColorSpaceNode.LINEAR_TO_LINEAR")
  @js.native
  def LINEAR_TO_LINEAR: LinearToLinear = js.native
  inline def LINEAR_TO_LINEAR_=(x: LinearToLinear): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR_TO_LINEAR")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "ColorSpaceNode.LINEAR_TO_SRGB")
  @js.native
  def LINEAR_TO_SRGB: LinearTosRGB = js.native
  inline def LINEAR_TO_SRGB_=(x: LinearTosRGB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINEAR_TO_SRGB")(x.asInstanceOf[js.Any])
}
