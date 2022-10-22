package typingsJapgolly.vexflow.Vex.Flow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory extends StObject {
  
  def Accidental(params: Any): typingsJapgolly.vexflow.Vex.Flow.Accidental = js.native
  
  def Annotation(params: Any): typingsJapgolly.vexflow.Vex.Flow.Annotation = js.native
  
  def Articulation(params: Any): typingsJapgolly.vexflow.Vex.Flow.Articulation = js.native
  
  def BarNote(params: Any): typingsJapgolly.vexflow.Vex.Flow.BarNote = js.native
  
  def Beam(params: Any): typingsJapgolly.vexflow.Vex.Flow.Beam = js.native
  
  def ClefNote(params: Any): typingsJapgolly.vexflow.Vex.Flow.ClefNote = js.native
  
  def Curve(params: Any): typingsJapgolly.vexflow.Vex.Flow.Curve = js.native
  
  def EasyScore(): typingsJapgolly.vexflow.Vex.Flow.EasyScore = js.native
  def EasyScore(params: js.Object): typingsJapgolly.vexflow.Vex.Flow.EasyScore = js.native
  
  def Fingering(params: Any): FretHandFinger = js.native
  
  def Formatter(): typingsJapgolly.vexflow.Vex.Flow.Formatter = js.native
  
  def GhostNote(noteStruct: Any): typingsJapgolly.vexflow.Vex.Flow.GhostNote = js.native
  
  def GlyphNote(glyph: Any, noteStruct: Any, options: Any): typingsJapgolly.vexflow.Vex.Flow.GlyphNote = js.native
  
  def GraceNote(noteStruct: Any): typingsJapgolly.vexflow.Vex.Flow.GraceNote = js.native
  
  def GraceNoteGroup(params: Any): typingsJapgolly.vexflow.Vex.Flow.GraceNoteGroup = js.native
  
  def KeySigNote(params: Any): typingsJapgolly.vexflow.Vex.Flow.KeySigNote = js.native
  
  def ModifierContext(): typingsJapgolly.vexflow.Vex.Flow.ModifierContext = js.native
  
  def MultiMeasureRest(params: Any): typingsJapgolly.vexflow.Vex.Flow.MultiMeasureRest = js.native
  
  def NoteSubGroup(): typingsJapgolly.vexflow.Vex.Flow.NoteSubGroup = js.native
  def NoteSubGroup(params: js.Object): typingsJapgolly.vexflow.Vex.Flow.NoteSubGroup = js.native
  
  def PedalMarking(): typingsJapgolly.vexflow.Vex.Flow.PedalMarking = js.native
  def PedalMarking(params: js.Object): typingsJapgolly.vexflow.Vex.Flow.PedalMarking = js.native
  
  def RepeatNote(`type`: Any, noteStruct: Any, options: Any): typingsJapgolly.vexflow.Vex.Flow.RepeatNote = js.native
  
  def Stave(params: Any): typingsJapgolly.vexflow.Vex.Flow.Stave = js.native
  
  def StaveConnector(params: Any): typingsJapgolly.vexflow.Vex.Flow.StaveConnector = js.native
  
  def StaveLine(params: Any): typingsJapgolly.vexflow.Vex.Flow.StaveLine = js.native
  
  def StaveNote(noteStruct: Any): typingsJapgolly.vexflow.Vex.Flow.StaveNote = js.native
  
  def StaveTie(params: Any): typingsJapgolly.vexflow.Vex.Flow.StaveTie = js.native
  
  def StringNumber(params: Any): typingsJapgolly.vexflow.Vex.Flow.StringNumber = js.native
  
  def System(): typingsJapgolly.vexflow.Vex.Flow.System = js.native
  def System(params: js.Object): typingsJapgolly.vexflow.Vex.Flow.System = js.native
  
  def TabNote(noteStruct: Any): typingsJapgolly.vexflow.Vex.Flow.TabNote = js.native
  
  def TabStave(params: Any): typingsJapgolly.vexflow.Vex.Flow.TabStave = js.native
  
  def TextBracket(params: Any): typingsJapgolly.vexflow.Vex.Flow.TextBracket = js.native
  
  def TextDynamics(params: Any): typingsJapgolly.vexflow.Vex.Flow.TextDynamics = js.native
  
  def TextNote(textNoteStruct: Any): typingsJapgolly.vexflow.Vex.Flow.TextNote = js.native
  
  def TickContext(): typingsJapgolly.vexflow.Vex.Flow.TickContext = js.native
  
  def TimeSigNote(params: Any): typingsJapgolly.vexflow.Vex.Flow.TimeSigNote = js.native
  
  def Tuplet(params: Any): typingsJapgolly.vexflow.Vex.Flow.Tuplet = js.native
  
  def VibratoBracket(params: Any): typingsJapgolly.vexflow.Vex.Flow.VibratoBracket = js.native
  
  def Voice(params: Any): typingsJapgolly.vexflow.Vex.Flow.Voice = js.native
  
  var context: Any = js.native
  
  def draw(): Unit = js.native
  
  def getContext(): Any = js.native
  
  def getOptions(): typingsJapgolly.vexflow.anon.Renderer = js.native
  
  def getStave(): Stave = js.native
  
  def getVoices(): js.Array[Any] = js.native
  
  def initRenderer(): Unit = js.native
  
  var options: typingsJapgolly.vexflow.anon.Renderer = js.native
  
  var renderQ: js.Array[Any] = js.native
  
  def reset(): Unit = js.native
  
  def setContext(context: Any): Factory = js.native
  
  def setOptions(options: Any): Unit = js.native
  
  def space(spacing: Any): Double = js.native
  
  var stave: Stave = js.native
  
  var staves: js.Array[Any] = js.native
  
  var systems: js.Array[Any] = js.native
  
  var voices: js.Array[Any] = js.native
}
