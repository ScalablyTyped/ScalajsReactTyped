package typingsJapgolly.phaser.global.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.EventQueue")
@js.native
open class EventQueue protected ()
  extends StObject
     with typingsJapgolly.phaser.spine.EventQueue {
  def this(animState: typingsJapgolly.phaser.spine.AnimationState) = this()
  
  /* CompleteClass */
  var animState: typingsJapgolly.phaser.spine.AnimationState = js.native
  
  /* CompleteClass */
  override def clear(): Unit = js.native
  
  /* CompleteClass */
  override def complete(entry: typingsJapgolly.phaser.spine.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  override def dispose(entry: typingsJapgolly.phaser.spine.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  override def drain(): Unit = js.native
  
  /* CompleteClass */
  var drainDisabled: Boolean = js.native
  
  /* CompleteClass */
  override def end(entry: typingsJapgolly.phaser.spine.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  override def event(entry: typingsJapgolly.phaser.spine.TrackEntry, event: typingsJapgolly.phaser.spine.Event): Unit = js.native
  
  /* CompleteClass */
  override def interrupt(entry: typingsJapgolly.phaser.spine.TrackEntry): Unit = js.native
  
  /* CompleteClass */
  var objects: js.Array[Any] = js.native
  
  /* CompleteClass */
  override def start(entry: typingsJapgolly.phaser.spine.TrackEntry): Unit = js.native
}
