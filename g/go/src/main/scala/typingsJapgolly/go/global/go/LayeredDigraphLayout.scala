package typingsJapgolly.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This arranges nodes into layers.
  * The method uses a hierarchical approach
  * for creating drawings of digraphs with nodes arranged in layers.
  * The layout algorithm consists of four-major steps: Cycle Removal,
  * Layer Assignment, Crossing Reduction, and Straightening and Packing.
  */
@JSGlobal("go.LayeredDigraphLayout")
@js.native
/**
  * Constructs a LayeredDigraphLayout with no Layout.network and with no owning Layout.diagram.
  */
open class LayeredDigraphLayout ()
  extends typingsJapgolly.go.mod.LayeredDigraphLayout
object LayeredDigraphLayout {
  
  @JSGlobal("go.LayeredDigraphLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /**The faster, less aggressive, crossing reduction algorithm; a valid value for LayeredDigraphLayout.aggressiveOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.AggressiveLess")
  @js.native
  def AggressiveLess: typingsJapgolly.go.mod.EnumValue = js.native
  inline def AggressiveLess_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AggressiveLess")(x.asInstanceOf[js.Any])
  
  /**The slower, more aggressive, crossing reduction algorithm, a valid value for LayeredDigraphLayout.aggressiveOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.AggressiveMore")
  @js.native
  def AggressiveMore: typingsJapgolly.go.mod.EnumValue = js.native
  inline def AggressiveMore_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AggressiveMore")(x.asInstanceOf[js.Any])
  
  /**The fastest, but poorest, crossing reduction algorithm; a valid value for LayeredDigraphLayout.aggressiveOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.AggressiveNone")
  @js.native
  def AggressiveNone: typingsJapgolly.go.mod.EnumValue = js.native
  inline def AggressiveNone_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AggressiveNone")(x.asInstanceOf[js.Any])
  
  /**Remove cycles using depth first cycle removal; a valid value of LayeredDigraphLayout.cycleRemoveOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.CycleDepthFirst")
  @js.native
  def CycleDepthFirst: typingsJapgolly.go.mod.EnumValue = js.native
  inline def CycleDepthFirst_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleDepthFirst")(x.asInstanceOf[js.Any])
  
  /**Remove cycles using greedy cycle removal; a valid value of LayeredDigraphLayout.cycleRemoveOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.CycleGreedy")
  @js.native
  def CycleGreedy: typingsJapgolly.go.mod.EnumValue = js.native
  inline def CycleGreedy_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CycleGreedy")(x.asInstanceOf[js.Any])
  
  /**Initialize using depth first in initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.InitDepthFirstIn")
  @js.native
  def InitDepthFirstIn: typingsJapgolly.go.mod.EnumValue = js.native
  inline def InitDepthFirstIn_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InitDepthFirstIn")(x.asInstanceOf[js.Any])
  
  /**Initialize using depth first out initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.InitDepthFirstOut")
  @js.native
  def InitDepthFirstOut: typingsJapgolly.go.mod.EnumValue = js.native
  inline def InitDepthFirstOut_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InitDepthFirstOut")(x.asInstanceOf[js.Any])
  
  /**Initialize using naive initialization; a valid value for LayeredDigraphLayout.initializeOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.InitNaive")
  @js.native
  def InitNaive: typingsJapgolly.go.mod.EnumValue = js.native
  inline def InitNaive_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InitNaive")(x.asInstanceOf[js.Any])
  
  /**Assign layers using longest path sink layering; a valid value for LayeredDigraphLayout.layeringOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.LayerLongestPathSink")
  @js.native
  def LayerLongestPathSink: typingsJapgolly.go.mod.EnumValue = js.native
  inline def LayerLongestPathSink_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerLongestPathSink")(x.asInstanceOf[js.Any])
  
  /**Assign layers using longest path source layering; a valid value for LayeredDigraphLayout.layeringOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.LayerLongestPathSource")
  @js.native
  def LayerLongestPathSource: typingsJapgolly.go.mod.EnumValue = js.native
  inline def LayerLongestPathSource_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerLongestPathSource")(x.asInstanceOf[js.Any])
  
  /**Assign layers using optimal link length layering; A valid value for LayeredDigraphLayout.layeringOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.LayerOptimalLinkLength")
  @js.native
  def LayerOptimalLinkLength: typingsJapgolly.go.mod.EnumValue = js.native
  inline def LayerOptimalLinkLength_=(x: typingsJapgolly.go.mod.EnumValue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayerOptimalLinkLength")(x.asInstanceOf[js.Any])
  
  /**Enable all options for the LayeredDigraphLayout.packOption property; See also LayeredDigraphLayout.PackExpand, LayeredDigraphLayout.PackStraighten, and LayeredDigraphLayout.PackMedian.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.PackAll")
  @js.native
  def PackAll: Double = js.native
  inline def PackAll_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackAll")(x.asInstanceOf[js.Any])
  
  /**This option gives more chances for the packing algorithm to improve the network, but is very expensive in time for large networks; a valid value for LayeredDigraphLayout.packOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.PackExpand")
  @js.native
  def PackExpand: Double = js.native
  inline def PackExpand_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackExpand")(x.asInstanceOf[js.Any])
  
  /**This option tries to have the packing algorithm center groups of nodes based on their relationships with nodes in other layers, a valid value for LayeredDigraphLayout.packOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.PackMedian")
  @js.native
  def PackMedian: Double = js.native
  inline def PackMedian_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackMedian")(x.asInstanceOf[js.Any])
  
  /**Does minimal work in packing the nodes; a valid value for LayeredDigraphLayout.packOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.PackNone")
  @js.native
  def PackNone: Double = js.native
  inline def PackNone_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackNone")(x.asInstanceOf[js.Any])
  
  /**This option tries to have the packing algorithm straighten many of the links that cross layers, a valid value for LayeredDigraphLayout.packOption.*/
  /* static member */
  @JSGlobal("go.LayeredDigraphLayout.PackStraighten")
  @js.native
  def PackStraighten: Double = js.native
  inline def PackStraighten_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PackStraighten")(x.asInstanceOf[js.Any])
}
