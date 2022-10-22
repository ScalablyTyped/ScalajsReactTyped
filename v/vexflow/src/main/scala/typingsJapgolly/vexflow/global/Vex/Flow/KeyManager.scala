package typingsJapgolly.vexflow.global.Vex.Flow

import typingsJapgolly.vexflow.anon.AccidentalNote
import typingsJapgolly.vexflow.anon.Change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Vex.Flow.KeyManager")
@js.native
open class KeyManager protected ()
  extends StObject
     with typingsJapgolly.vexflow.Vex.Flow.KeyManager {
  def this(key: String) = this()
  
  /* CompleteClass */
  override def getAccidental(key: String): AccidentalNote = js.native
  
  /* CompleteClass */
  override def getKey(): String = js.native
  
  /* CompleteClass */
  override def reset(): typingsJapgolly.vexflow.Vex.Flow.KeyManager = js.native
  
  /* CompleteClass */
  override def selectNote(note: String): Change = js.native
  
  /* CompleteClass */
  override def setKey(key: String): typingsJapgolly.vexflow.Vex.Flow.KeyManager = js.native
}
