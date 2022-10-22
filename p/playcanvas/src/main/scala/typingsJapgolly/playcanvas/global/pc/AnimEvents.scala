package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AnimEvents stores a sorted array of animation events which should fire sequentially during the
  * playback of an pc.AnimTrack.
  */
@JSGlobal("pc.AnimEvents")
@js.native
open class AnimEvents protected ()
  extends typingsJapgolly.playcanvas.mod.AnimEvents {
  /**
    * Create a new AnimEvents instance.
    *
    * @param {object[]} events - An array of animation events.
    * @example
    * const events = new pc.AnimEvents([
    *     {
    *         name: 'my_event',
    *         time: 1.3, // given in seconds
    *         // any additional properties added are optional and will be available in the EventHandler callback's event object
    *         myProperty: 'test',
    *         myOtherProperty: true
    *     }
    * ]);
    * animTrack.events = events;
    */
  def this(events: js.Array[js.Object]) = this()
}
