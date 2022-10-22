package typingsJapgolly.three.examplesJsmNodesNodesMod

import typingsJapgolly.three.examplesJsmNodesUtilsTimerNodeMod.TimerNodeScope
import typingsJapgolly.three.examplesJsmNodesUtilsTimerNodeMod.default
import typingsJapgolly.three.threeStrings.delta
import typingsJapgolly.three.threeStrings.global
import typingsJapgolly.three.threeStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/examples/jsm/nodes/Nodes", "TimerNode")
@js.native
open class TimerNode () extends default {
  def this(scope: TimerNodeScope) = this()
  def this(scope: Unit, scale: Double) = this()
  def this(scope: TimerNodeScope, scale: Double) = this()
  def this(scope: Unit, scale: Double, value: Double) = this()
  def this(scope: Unit, scale: Unit, value: Double) = this()
  def this(scope: TimerNodeScope, scale: Double, value: Double) = this()
  def this(scope: TimerNodeScope, scale: Unit, value: Double) = this()
}
/* static members */
object TimerNode {
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode.DELTA")
  @js.native
  def DELTA: delta = js.native
  inline def DELTA_=(x: delta): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELTA")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode.GLOBAL")
  @js.native
  def GLOBAL: global = js.native
  inline def GLOBAL_=(x: global): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GLOBAL")(x.asInstanceOf[js.Any])
  
  @JSImport("three/examples/jsm/nodes/Nodes", "TimerNode.LOCAL")
  @js.native
  def LOCAL: local = js.native
  inline def LOCAL_=(x: local): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(x.asInstanceOf[js.Any])
}
