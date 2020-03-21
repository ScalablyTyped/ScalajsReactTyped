package typingsJapgolly.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("VBIDE.CodePane")
@js.native
class CodePane protected () extends js.Object {
  val CodeModule: typingsJapgolly.activexVbide.VBIDE.CodeModule = js.native
  val CodePaneView: vbextCodePaneview = js.native
  @JSName("Collection")
  val Collection_Original: CodePanes = js.native
  val CountOfVisibleLines: Double = js.native
  var TopLine: Double = js.native
  val VBE: typingsJapgolly.activexVbide.VBIDE.VBE = js.native
  @JSName("VBIDE.CodePane_typekey")
  var VBIDEDotCodePane_typekey: CodePane = js.native
  val Window: typingsJapgolly.activexVbide.VBIDE.Window = js.native
  def Collection(index: js.Any): CodePane = js.native
  def GetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
  def SetSelection(StartLine: Double, StartColumn: Double, EndLine: Double, EndColumn: Double): Unit = js.native
  def Show(): Unit = js.native
}

