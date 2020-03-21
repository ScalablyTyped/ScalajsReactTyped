package typingsJapgolly.tensorflowTfjsCore

import typingsJapgolly.tensorflowTfjsCore.gpgpuMathMod.GPGPUProgram
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`Linefeed  vec4 result Equalssign logLeftparenthesisxRightparenthesisSemicolonLinefeed  vec4 isNaN Equalssign vec4LeftparenthesislessThanLeftparenthesisxComma vec4Leftparenthesis0Dot0RightparenthesisRightparenthesisRightparenthesisSemicolonLinefeed  resultDotr Equalssign isNaNDotr EqualssignEqualssign 1Dot0 Questionmark NAN Colon resultDotrSemicolonLinefeed  resultDotg Equalssign isNaNDotg EqualssignEqualssign 1Dot0 Questionmark NAN Colon resultDotgSemicolonLinefeed  resultDotb Equalssign isNaNDo`
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`Linefeed  vec4 result Equalssign minLeftparenthesisxComma vec4Leftparenthesis6DotRightparenthesisRightparenthesis Asterisk vec4LeftparenthesisgreaterThanEqualLeftparenthesisxComma vec4Leftparenthesis0Dot0RightparenthesisRightparenthesisRightparenthesisSemicolonLinefeed  bvec4 isNaN Equalssign isnanLeftparenthesisxRightparenthesisSemicolonLinefeedLinefeed  resultDotr Equalssign isNaNDotr Questionmark xDotr Colon resultDotrSemicolonLinefeed  resultDotg Equalssign isNaNDotg Questionmark xDotg Colon`
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`Linefeed  vec4 result Equalssign x Asterisk vec4LeftparenthesisgreaterThanEqualLeftparenthesisxComma vec4Leftparenthesis0Dot0RightparenthesisRightparenthesisRightparenthesisSemicolonLinefeed  bvec4 isNaN Equalssign isnanLeftparenthesisxRightparenthesisSemicolonLinefeedLinefeed  resultDotr Equalssign isNaNDotr Questionmark xDotr Colon resultDotrSemicolonLinefeed  resultDotg Equalssign isNaNDotg Questionmark xDotg Colon resultDotgSemicolonLinefeed  resultDotb Equalssign isNaNDotb Questionmark xDot`
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`Linefeed  vec4 resultSemicolonLinefeedLinefeed  resultDotr Equalssign LeftparenthesisxDotr GreaterthansignEqualssign 0Dot0Rightparenthesis Questionmark xDotr Colon LeftparenthesisexpLeftparenthesisxDotrRightparenthesis - 1Dot0RightparenthesisSemicolonLinefeed  resultDotg Equalssign LeftparenthesisxDotg GreaterthansignEqualssign 0Dot0Rightparenthesis Questionmark xDotg Colon LeftparenthesisexpLeftparenthesisxDotgRightparenthesis - 1Dot0RightparenthesisSemicolonLinefeed  resultDotb Equalssign Left`
import typingsJapgolly.tensorflowTfjsCore.tensorflowTfjsCoreStrings.`return xSemicolon`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/webgl/unaryop_packed_gpu", JSImport.Namespace)
@js.native
object unaryopPackedGpuMod extends js.Object {
  @js.native
  class UnaryOpPackedProgram protected () extends GPGPUProgram {
    def this(aShape: js.Array[Double], opSnippet: String) = this()
    /* CompleteClass */
    override var outputShape: js.Array[Double] = js.native
    @JSName("packedInputs")
    var packedInputs_UnaryOpPackedProgram: Boolean = js.native
    @JSName("packedOutput")
    var packedOutput_UnaryOpPackedProgram: Boolean = js.native
    /* CompleteClass */
    override var userCode: String = js.native
    /* CompleteClass */
    override var variableNames: js.Array[String] = js.native
  }
  
  val ELU: `Linefeed  vec4 resultSemicolonLinefeedLinefeed  resultDotr Equalssign LeftparenthesisxDotr GreaterthansignEqualssign 0Dot0Rightparenthesis Questionmark xDotr Colon LeftparenthesisexpLeftparenthesisxDotrRightparenthesis - 1Dot0RightparenthesisSemicolonLinefeed  resultDotg Equalssign LeftparenthesisxDotg GreaterthansignEqualssign 0Dot0Rightparenthesis Questionmark xDotg Colon LeftparenthesisexpLeftparenthesisxDotgRightparenthesis - 1Dot0RightparenthesisSemicolonLinefeed  resultDotb Equalssign Left` = js.native
  val LINEAR: `return xSemicolon` = js.native
  val LOG: `Linefeed  vec4 result Equalssign logLeftparenthesisxRightparenthesisSemicolonLinefeed  vec4 isNaN Equalssign vec4LeftparenthesislessThanLeftparenthesisxComma vec4Leftparenthesis0Dot0RightparenthesisRightparenthesisRightparenthesisSemicolonLinefeed  resultDotr Equalssign isNaNDotr EqualssignEqualssign 1Dot0 Questionmark NAN Colon resultDotrSemicolonLinefeed  resultDotg Equalssign isNaNDotg EqualssignEqualssign 1Dot0 Questionmark NAN Colon resultDotgSemicolonLinefeed  resultDotb Equalssign isNaNDo` = js.native
  val RELU: `Linefeed  vec4 result Equalssign x Asterisk vec4LeftparenthesisgreaterThanEqualLeftparenthesisxComma vec4Leftparenthesis0Dot0RightparenthesisRightparenthesisRightparenthesisSemicolonLinefeed  bvec4 isNaN Equalssign isnanLeftparenthesisxRightparenthesisSemicolonLinefeedLinefeed  resultDotr Equalssign isNaNDotr Questionmark xDotr Colon resultDotrSemicolonLinefeed  resultDotg Equalssign isNaNDotg Questionmark xDotg Colon resultDotgSemicolonLinefeed  resultDotb Equalssign isNaNDotb Questionmark xDot` = js.native
  val RELU6: `Linefeed  vec4 result Equalssign minLeftparenthesisxComma vec4Leftparenthesis6DotRightparenthesisRightparenthesis Asterisk vec4LeftparenthesisgreaterThanEqualLeftparenthesisxComma vec4Leftparenthesis0Dot0RightparenthesisRightparenthesisRightparenthesisSemicolonLinefeed  bvec4 isNaN Equalssign isnanLeftparenthesisxRightparenthesisSemicolonLinefeedLinefeed  resultDotr Equalssign isNaNDotr Questionmark xDotr Colon resultDotrSemicolonLinefeed  resultDotg Equalssign isNaNDotg Questionmark xDotg Colon` = js.native
}

