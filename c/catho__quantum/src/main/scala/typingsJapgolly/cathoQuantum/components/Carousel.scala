package typingsJapgolly.cathoQuantum.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.BaseFontSizeBreakpoints
import typingsJapgolly.cathoQuantum.anon.Description
import typingsJapgolly.cathoQuantum.carouselMod.CarouselProps
import typingsJapgolly.cathoQuantum.carouselMod.NonEmptyArray
import typingsJapgolly.cathoQuantum.carouselMod.default
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.error
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.large
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.medium
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.neutral
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.primary
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.small
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.success
import typingsJapgolly.cathoQuantum.cathoQuantumStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Carousel {
  
  inline def apply(cards: NonEmptyArray[Description]): Builder = {
    val __props = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CarouselProps]))
  }
  
  @JSImport("@catho/quantum/Carousel", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def arrowColor(value: primary | success | error | neutral | warning): this.type = set("arrowColor", value.asInstanceOf[js.Any])
    
    inline def cardSize(value: small | medium | large): this.type = set("cardSize", value.asInstanceOf[js.Any])
    
    inline def dotsPagination(value: Boolean): this.type = set("dotsPagination", value.asInstanceOf[js.Any])
    
    inline def slidesToScroll(value: Double): this.type = set("slidesToScroll", value.asInstanceOf[js.Any])
    
    inline def speed(value: Double): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def theme(value: BaseFontSizeBreakpoints): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CarouselProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
