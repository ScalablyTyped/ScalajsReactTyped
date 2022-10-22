package typingsJapgolly.pizzicato.mod.Effects

import org.scalajs.dom.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("pizzicato", "Effects.StereoPanner")
@js.native
open class StereoPannerCls ()
  extends StObject
     with StereoPanner {
  def this(options: StereoPannerOptions) = this()
  
  /* CompleteClass */
  override def connect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  override def disconnect(audioNode: AudioNode): this.type = js.native
  
  /* CompleteClass */
  var pan: Double = js.native
}
