package typingsJapgolly.nukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Carousel = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.nukaCarousel.mod.CarouselProps with js.Object, js.Object]
  type CarouselRenderControl = js.Function1[
    /* props */ typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps, 
    japgolly.scalajs.react.raw.React.Node
  ]
  type CarouselSlideWidthProp = java.lang.String | scala.Double
  type CarouselSlidesToScrollProp = scala.Double | typingsJapgolly.nukaCarousel.nukaCarouselStrings.auto
  type NextButtonProps = typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps
  type PagingDotsProps = typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps
  type PreviousButtonProps = typingsJapgolly.nukaCarousel.mod.CarouselSlideRenderControlProps
}
