package typingsJapgolly.nukaCarousel.libTypesMod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.nukaCarousel.anon.Count
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.firstSlide
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.lastSlide
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.nextSlide
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.pause
import typingsJapgolly.nukaCarousel.nukaCarouselStrings.previousSlide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type EasingFunction = js.Function1[/* normalizedTime */ Double, Double]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.nukaCarousel.nukaCarouselStrings.nextSlide
  - typingsJapgolly.nukaCarousel.nukaCarouselStrings.previousSlide
  - typingsJapgolly.nukaCarousel.nukaCarouselStrings.firstSlide
  - typingsJapgolly.nukaCarousel.nukaCarouselStrings.lastSlide
  - typingsJapgolly.nukaCarousel.nukaCarouselStrings.pause
  - scala.Null
*/
type KeyCodeFunction = _KeyCodeFunction | Null

type KeyCodeMap = NumberDictionary[firstSlide | lastSlide | nextSlide | pause | previousSlide]

type RenderAnnounceSlideMessage = js.Function1[/* props */ Count, String]

/**
  * A function to override what to render on an edge/corner of the modal.
  *
  * Pass in null to not render the default controls on an edge.
  */
type RenderControls = (js.Function1[/* props */ ControlProps, Node]) | Null
