package typingsJapgolly.reactOnsenui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HTMLAttributes[K /* <: java.lang.String */] = typingsJapgolly.std.Partial[typingsJapgolly.std.Pick[typingsJapgolly.react.mod.HTMLAttributes[js.Object], K]]
  type InputHTMLAttributes[K /* <: java.lang.String */] = typingsJapgolly.std.Partial[
    typingsJapgolly.std.Pick[typingsJapgolly.react.mod.InputHTMLAttributes[js.Object], K]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactOnsenui.reactOnsenuiStrings.slide
    - typingsJapgolly.reactOnsenui.reactOnsenuiStrings.lift
    - typingsJapgolly.reactOnsenui.reactOnsenuiStrings.fade
    - typingsJapgolly.reactOnsenui.reactOnsenuiStrings.none
    - java.lang.String
  */
  type NavigatorAnimationTypes = typingsJapgolly.reactOnsenui.mod._NavigatorAnimationTypes | java.lang.String
}
