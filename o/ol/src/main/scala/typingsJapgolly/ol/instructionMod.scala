package typingsJapgolly.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/Instruction", JSImport.Namespace)
@js.native
object instructionMod extends js.Object {
  @js.native
  sealed trait Instruction extends js.Object
  
  @js.native
  object Instruction extends js.Object {
    @js.native
    sealed trait BEGIN_GEOMETRY extends Instruction
    
    @js.native
    sealed trait BEGIN_PATH extends Instruction
    
    @js.native
    sealed trait CIRCLE extends Instruction
    
    @js.native
    sealed trait CLOSE_PATH extends Instruction
    
    @js.native
    sealed trait CUSTOM extends Instruction
    
    @js.native
    sealed trait DRAW_CHARS extends Instruction
    
    @js.native
    sealed trait DRAW_IMAGE extends Instruction
    
    @js.native
    sealed trait END_GEOMETRY extends Instruction
    
    @js.native
    sealed trait FILL extends Instruction
    
    @js.native
    sealed trait MOVE_TO_LINE_TO extends Instruction
    
    @js.native
    sealed trait SET_FILL_STYLE extends Instruction
    
    @js.native
    sealed trait SET_STROKE_STYLE extends Instruction
    
    @js.native
    sealed trait STROKE extends Instruction
    
  }
  
  @js.native
  object default extends js.Object {
    /* 0 */ val BEGIN_GEOMETRY: typingsJapgolly.ol.instructionMod.Instruction.BEGIN_GEOMETRY with Double = js.native
    /* 1 */ val BEGIN_PATH: typingsJapgolly.ol.instructionMod.Instruction.BEGIN_PATH with Double = js.native
    /* 2 */ val CIRCLE: typingsJapgolly.ol.instructionMod.Instruction.CIRCLE with Double = js.native
    /* 3 */ val CLOSE_PATH: typingsJapgolly.ol.instructionMod.Instruction.CLOSE_PATH with Double = js.native
    /* 4 */ val CUSTOM: typingsJapgolly.ol.instructionMod.Instruction.CUSTOM with Double = js.native
    /* 5 */ val DRAW_CHARS: typingsJapgolly.ol.instructionMod.Instruction.DRAW_CHARS with Double = js.native
    /* 6 */ val DRAW_IMAGE: typingsJapgolly.ol.instructionMod.Instruction.DRAW_IMAGE with Double = js.native
    /* 7 */ val END_GEOMETRY: typingsJapgolly.ol.instructionMod.Instruction.END_GEOMETRY with Double = js.native
    /* 8 */ val FILL: typingsJapgolly.ol.instructionMod.Instruction.FILL with Double = js.native
    /* 9 */ val MOVE_TO_LINE_TO: typingsJapgolly.ol.instructionMod.Instruction.MOVE_TO_LINE_TO with Double = js.native
    /* 10 */ val SET_FILL_STYLE: typingsJapgolly.ol.instructionMod.Instruction.SET_FILL_STYLE with Double = js.native
    /* 11 */ val SET_STROKE_STYLE: typingsJapgolly.ol.instructionMod.Instruction.SET_STROKE_STYLE with Double = js.native
    /* 12 */ val STROKE: typingsJapgolly.ol.instructionMod.Instruction.STROKE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Instruction with Double] = js.native
  }
  
}

