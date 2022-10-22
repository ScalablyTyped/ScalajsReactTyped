package typingsJapgolly.nukaCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollMode extends StObject
@JSImport("nuka-carousel/lib/types", "ScrollMode")
@js.native
object ScrollMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScrollMode & String] = js.native
  
  @js.native
  sealed trait page
    extends StObject
       with ScrollMode
  /* "page" */ val page: typingsJapgolly.nukaCarousel.libTypesMod.ScrollMode.page & String = js.native
  
  @js.native
  sealed trait remainder
    extends StObject
       with ScrollMode
  /* "remainder" */ val remainder: typingsJapgolly.nukaCarousel.libTypesMod.ScrollMode.remainder & String = js.native
}
