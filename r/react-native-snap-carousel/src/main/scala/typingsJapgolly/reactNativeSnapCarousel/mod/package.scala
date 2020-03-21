package typingsJapgolly.reactNativeSnapCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Carousel[T] = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactNativeSnapCarousel.mod.CarouselProperties[T] with js.Object, 
    js.Object
  ]
  type CarouselProperties[T] = typingsJapgolly.reactNative.mod.ScrollViewProps with typingsJapgolly.reactNativeSnapCarousel.mod.CarouselProps[T] with typingsJapgolly.react.mod.Props[typingsJapgolly.reactNativeSnapCarousel.mod.CarouselStatic[T]]
  type PaginationProperties = typingsJapgolly.reactNativeSnapCarousel.mod.PaginationProps with (typingsJapgolly.react.mod.Props[
    japgolly.scalajs.react.raw.React.ComponentClassP[typingsJapgolly.reactNativeSnapCarousel.mod.PaginationProps with js.Object]
  ])
  type PaginationStatic = japgolly.scalajs.react.raw.React.ComponentClassP[typingsJapgolly.reactNativeSnapCarousel.mod.PaginationProps with js.Object]
  type ParallaxImageProperties = typingsJapgolly.reactNativeSnapCarousel.mod.ParallaxImageProps with (typingsJapgolly.react.mod.Props[
    japgolly.scalajs.react.raw.React.ComponentClassP[typingsJapgolly.reactNativeSnapCarousel.mod.ParallaxImageProps with js.Object]
  ])
  type ParallaxImageStatic = japgolly.scalajs.react.raw.React.ComponentClassP[typingsJapgolly.reactNativeSnapCarousel.mod.ParallaxImageProps with js.Object]
}
