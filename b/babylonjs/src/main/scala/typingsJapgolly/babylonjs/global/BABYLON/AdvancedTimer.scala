package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.ITimerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.AdvancedTimer")
@js.native
open class AdvancedTimer[T] protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.AdvancedTimer[T] {
  /**
    * Will construct a new advanced timer based on the options provided. Timer will not start until start() is called.
    * @param options construction options for this advanced timer
    */
  def this(options: ITimerOptions[T]) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
