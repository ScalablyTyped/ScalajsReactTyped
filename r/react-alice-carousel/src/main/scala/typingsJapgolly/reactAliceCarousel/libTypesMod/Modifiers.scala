package typingsJapgolly.reactAliceCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Modifiers extends StObject
@JSImport("react-alice-carousel/lib/types", "Modifiers")
@js.native
object Modifiers extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Modifiers & String] = js.native
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with Modifiers
  /* "__active" */ val ACTIVE: typingsJapgolly.reactAliceCarousel.libTypesMod.Modifiers.ACTIVE & String = js.native
  
  @js.native
  sealed trait CLONED
    extends StObject
       with Modifiers
  /* "__cloned" */ val CLONED: typingsJapgolly.reactAliceCarousel.libTypesMod.Modifiers.CLONED & String = js.native
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with Modifiers
  /* "__custom" */ val CUSTOM: typingsJapgolly.reactAliceCarousel.libTypesMod.Modifiers.CUSTOM & String = js.native
  
  @js.native
  sealed trait INACTIVE
    extends StObject
       with Modifiers
  /* "__inactive" */ val INACTIVE: typingsJapgolly.reactAliceCarousel.libTypesMod.Modifiers.INACTIVE & String = js.native
  
  @js.native
  sealed trait PAUSE
    extends StObject
       with Modifiers
  /* "__pause" */ val PAUSE: typingsJapgolly.reactAliceCarousel.libTypesMod.Modifiers.PAUSE & String = js.native
  
  @js.native
  sealed trait SEPARATOR
    extends StObject
       with Modifiers
  /* "__separator" */ val SEPARATOR: typingsJapgolly.reactAliceCarousel.libTypesMod.Modifiers.SEPARATOR & String = js.native
  
  @js.native
  sealed trait SSR
    extends StObject
       with Modifiers
  /* "__ssr" */ val SSR: typingsJapgolly.reactAliceCarousel.libTypesMod.Modifiers.SSR & String = js.native
  
  @js.native
  sealed trait TARGET
    extends StObject
       with Modifiers
  /* "__target" */ val TARGET: typingsJapgolly.reactAliceCarousel.libTypesMod.Modifiers.TARGET & String = js.native
}
