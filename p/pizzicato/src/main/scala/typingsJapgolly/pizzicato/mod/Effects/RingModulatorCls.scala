package typingsJapgolly.pizzicato.mod.Effects

import org.scalajs.dom.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("pizzicato", "Effects.RingModulator")
@js.native
open class RingModulatorCls ()
  extends StObject
     with RingModulator {
  def this(options: RingModulatorOptions) = this()
  
  /* CompleteClass */
  override def connect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  override def disconnect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  var distortion: Double = js.native
  
  /* CompleteClass */
  var mix: Double = js.native
  
  /* CompleteClass */
  var speed: Double = js.native
}
