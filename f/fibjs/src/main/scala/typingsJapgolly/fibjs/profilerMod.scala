package typingsJapgolly.fibjs

import typingsJapgolly.fibjs.fibjsNumbers.`0`
import typingsJapgolly.fibjs.fibjsNumbers.`10`
import typingsJapgolly.fibjs.fibjsNumbers.`11`
import typingsJapgolly.fibjs.fibjsNumbers.`12`
import typingsJapgolly.fibjs.fibjsNumbers.`13`
import typingsJapgolly.fibjs.fibjsNumbers.`1`
import typingsJapgolly.fibjs.fibjsNumbers.`2`
import typingsJapgolly.fibjs.fibjsNumbers.`3`
import typingsJapgolly.fibjs.fibjsNumbers.`4`
import typingsJapgolly.fibjs.fibjsNumbers.`5`
import typingsJapgolly.fibjs.fibjsNumbers.`6`
import typingsJapgolly.fibjs.fibjsNumbers.`7`
import typingsJapgolly.fibjs.fibjsNumbers.`8`
import typingsJapgolly.fibjs.fibjsNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 内存 profiler 模块
	* @detail 使用方法：,```JavaScript,var profiler = require('profiler');,```
	*/
@JSImport("profiler", JSImport.Namespace)
@js.native
object profilerMod extends js.Object {
  @JSName("Edge_ContextVariable")
  val EdgeContextVariable: `0` = js.native
  @JSName("Edge_Element")
  val EdgeElement: `1` = js.native
  @JSName("Edge_Hidden")
  val EdgeHidden: `4` = js.native
  @JSName("Edge_Internal")
  val EdgeInternal: `3` = js.native
  @JSName("Edge_Property")
  val EdgeProperty: `2` = js.native
  @JSName("Edge_Shortcut")
  val EdgeShortcut: `5` = js.native
  @JSName("Edge_Weak")
  val EdgeWeak: `6` = js.native
  @JSName("Node_Array")
  val NodeArray: `1` = js.native
  @JSName("Node_Closure")
  val NodeClosure: `5` = js.native
  @JSName("Node_Code")
  val NodeCode: `4` = js.native
  @JSName("Node_ConsString")
  val NodeConsString: `10` = js.native
  @JSName("Node_HeapNumber")
  val NodeHeapNumber: `7` = js.native
  @JSName("Node_Hidden")
  val NodeHidden: `0` = js.native
  @JSName("Node_Native")
  val NodeNative: `8` = js.native
  @JSName("Node_Object")
  val NodeObject: `3` = js.native
  @JSName("Node_RegExp")
  val NodeRegExp: `6` = js.native
  @JSName("Node_SimdValue")
  val NodeSimdValue: `13` = js.native
  @JSName("Node_SlicedString")
  val NodeSlicedString: `11` = js.native
  @JSName("Node_String")
  val NodeString: `2` = js.native
  @JSName("Node_Symbol")
  val NodeSymbol: `12` = js.native
  @JSName("Node_Synthetic")
  val NodeSynthetic: `9` = js.native
  def diff(test: js.Function): js.Object = js.native
  def loadSnapshot(fname: String): ClassHeapSnapshot = js.native
  def saveSnapshot(fname: String): Unit = js.native
  def start(fname: String): ClassTimer = js.native
  def start(fname: String, time: Double): ClassTimer = js.native
  def start(fname: String, time: Double, interval: Double): ClassTimer = js.native
  def takeSnapshot(): ClassHeapSnapshot = js.native
}

