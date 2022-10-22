package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.TypeScript.ILineAndCharacter
import typingsJapgolly.typescriptServices.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.LineMap")
@js.native
open class LineMap protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.LineMap {
  def this(_computeLineStarts: js.Function0[js.Array[Double]], length: Double) = this()
  
  /* private */ /* CompleteClass */
  var _computeLineStarts: Any = js.native
  
  /* private */ /* CompleteClass */
  var _lineStarts: Any = js.native
  
  /* CompleteClass */
  override def equals(other: typingsJapgolly.typescriptServices.TypeScript.LineMap): Boolean = js.native
  
  /* CompleteClass */
  override def fillLineAndCharacterFromPosition(position: Double, lineAndCharacter: ILineAndCharacter): Unit = js.native
  
  /* CompleteClass */
  override def getLineAndCharacterFromPosition(position: Double): typingsJapgolly.typescriptServices.TypeScript.LineAndCharacter = js.native
  
  /* CompleteClass */
  override def getLineNumberFromPosition(position: Double): Double = js.native
  
  /* CompleteClass */
  override def getLineStartPosition(lineNumber: Double): Double = js.native
  
  /* CompleteClass */
  override def getPosition(line: Double, character: Double): Double = js.native
  
  /* private */ /* CompleteClass */
  var length: Any = js.native
  
  /* CompleteClass */
  override def lineCount(): Double = js.native
  
  /* CompleteClass */
  override def lineStarts(): js.Array[Double] = js.native
  
  /* CompleteClass */
  override def toJSON(key: Any): Length = js.native
}
object LineMap {
  
  @JSGlobal("TypeScript.LineMap")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.LineMap.empty")
  @js.native
  def empty: typingsJapgolly.typescriptServices.TypeScript.LineMap = js.native
  inline def empty_=(x: typingsJapgolly.typescriptServices.TypeScript.LineMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
}
