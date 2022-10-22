package typingsJapgolly.twoJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends StObject
@JSImport("two.js", "Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events & Double] = js.native
  
  @js.native
  sealed trait change
    extends StObject
       with Events
  /* 0 */ val change: typingsJapgolly.twoJs.mod.Events.change & Double = js.native
  
  @js.native
  sealed trait insert
    extends StObject
       with Events
  /* 1 */ val insert: typingsJapgolly.twoJs.mod.Events.insert & Double = js.native
  
  @js.native
  sealed trait load
    extends StObject
       with Events
  /* 2 */ val load: typingsJapgolly.twoJs.mod.Events.load & Double = js.native
  
  @js.native
  sealed trait order
    extends StObject
       with Events
  /* 3 */ val order: typingsJapgolly.twoJs.mod.Events.order & Double = js.native
  
  @js.native
  sealed trait pause
    extends StObject
       with Events
  /* 4 */ val pause: typingsJapgolly.twoJs.mod.Events.pause & Double = js.native
  
  @js.native
  sealed trait play
    extends StObject
       with Events
  /* 5 */ val play: typingsJapgolly.twoJs.mod.Events.play & Double = js.native
  
  @js.native
  sealed trait remove
    extends StObject
       with Events
  /* 6 */ val remove: typingsJapgolly.twoJs.mod.Events.remove & Double = js.native
  
  @js.native
  sealed trait render
    extends StObject
       with Events
  /* 7 */ val render: typingsJapgolly.twoJs.mod.Events.render & Double = js.native
  
  @js.native
  sealed trait resize
    extends StObject
       with Events
  /* 8 */ val resize: typingsJapgolly.twoJs.mod.Events.resize & Double = js.native
  
  @js.native
  sealed trait update
    extends StObject
       with Events
  /* 9 */ val update: typingsJapgolly.twoJs.mod.Events.update & Double = js.native
}
