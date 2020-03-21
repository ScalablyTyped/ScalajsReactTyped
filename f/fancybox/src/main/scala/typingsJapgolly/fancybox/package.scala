package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fancybox {
  type FancyBoxInteractionMethod = js.Function2[
    /* slide */ js.UndefOr[typingsJapgolly.fancybox.FancyBoxSlide], 
    /* event */ js.UndefOr[typingsJapgolly.jquery.JQuery_.Event], 
    typingsJapgolly.fancybox.FancyBoxInteractionTypes
  ]
  type FancyBoxInteractions = typingsJapgolly.fancybox.FancyBoxInteractionTypes | typingsJapgolly.fancybox.FancyBoxInteractionMethod
  type FancyBoxInternationalizationOptions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.fancybox.FancyBoxInternationalizatioObject]
  type FancyBoxPlainObject = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Function0[scala.Unit]]
}
