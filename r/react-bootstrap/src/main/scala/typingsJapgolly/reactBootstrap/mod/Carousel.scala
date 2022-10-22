package typingsJapgolly.reactBootstrap.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap", "Carousel")
@js.native
open class Carousel ()
  extends typingsJapgolly.reactBootstrap.libMod.Carousel
object Carousel {
  
  @JSImport("react-bootstrap", "Carousel")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Carousel.Caption")
  @js.native
  open class Caption ()
    extends typingsJapgolly.reactBootstrap.libCarouselCaptionMod.^
  /* static member */
  @JSImport("react-bootstrap", "Carousel.Caption")
  @js.native
  def Caption: Instantiable0[typingsJapgolly.reactBootstrap.libCarouselCaptionMod.^] = js.native
  inline def Caption_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libCarouselCaptionMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Caption")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Carousel.Item")
  @js.native
  open class Item ()
    extends typingsJapgolly.reactBootstrap.libCarouselItemMod.^
  /* static member */
  @JSImport("react-bootstrap", "Carousel.Item")
  @js.native
  def Item: Instantiable0[typingsJapgolly.reactBootstrap.libCarouselItemMod.^] = js.native
  inline def Item_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libCarouselItemMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
}
