package typingsJapgolly.nukaCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Directions extends StObject
@JSImport("nuka-carousel/lib/types", "Directions")
@js.native
object Directions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Directions & String] = js.native
  
  @js.native
  sealed trait Down
    extends StObject
       with Directions
  /* "down" */ val Down: typingsJapgolly.nukaCarousel.libTypesMod.Directions.Down & String = js.native
  
  @js.native
  sealed trait Next
    extends StObject
       with Directions
  /* "next" */ val Next: typingsJapgolly.nukaCarousel.libTypesMod.Directions.Next & String = js.native
  
  @js.native
  sealed trait Prev
    extends StObject
       with Directions
  /* "prev" */ val Prev: typingsJapgolly.nukaCarousel.libTypesMod.Directions.Prev & String = js.native
  
  @js.native
  sealed trait Up
    extends StObject
       with Directions
  /* "up" */ val Up: typingsJapgolly.nukaCarousel.libTypesMod.Directions.Up & String = js.native
}
