package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiInteraction.anon.ReadonlyInteractionTracki
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "InteractionTrackingData")
@js.native
open class InteractionTrackingData protected ()
  extends typingsJapgolly.pixiInteraction.mod.InteractionTrackingData {
  /**
    * @param {number} pointerId - Unique pointer id of the event
    * @private
    */
  def this(pointerId: Double) = this()
}
/* static members */
object InteractionTrackingData {
  
  @JSImport("pixi.js", "InteractionTrackingData")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "InteractionTrackingData.FLAGS")
  @js.native
  def FLAGS: ReadonlyInteractionTracki = js.native
  inline def FLAGS_=(x: ReadonlyInteractionTracki): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLAGS")(x.asInstanceOf[js.Any])
}
