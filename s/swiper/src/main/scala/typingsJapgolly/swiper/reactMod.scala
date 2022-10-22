package typingsJapgolly.swiper

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.VoidFunctionComponent
import typingsJapgolly.swiper.reactSwiperReactMod.SlideData
import typingsJapgolly.swiper.reactSwiperReactMod.SwiperProps
import typingsJapgolly.swiper.reactSwiperReactMod.SwiperSlideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("swiper/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("swiper/react", "Swiper")
  @js.native
  val Swiper: FunctionComponent[SwiperProps] = js.native
  
  @JSImport("swiper/react", "SwiperSlide")
  @js.native
  val SwiperSlide: VoidFunctionComponent[SwiperSlideProps] = js.native
  
  inline def useSwiper(): typingsJapgolly.swiper.typesMod.Swiper = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiper")().asInstanceOf[typingsJapgolly.swiper.typesMod.Swiper]
  
  inline def useSwiperSlide(): SlideData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSwiperSlide")().asInstanceOf[SlideData]
}
