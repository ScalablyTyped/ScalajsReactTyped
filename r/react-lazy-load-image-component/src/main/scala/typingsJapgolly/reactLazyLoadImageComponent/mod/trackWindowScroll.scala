package typingsJapgolly.reactLazyLoadImageComponent.mod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactLazyLoadImageComponent.reactLazyLoadImageComponentStrings.scrollPosition
import typingsJapgolly.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lazy-load-image-component", "trackWindowScroll")
@js.native
object trackWindowScroll extends js.Object {
  def apply[P /* <: LazyComponentProps */](BaseComponent: ComponentType[P]): ComponentType[Omit[P, scrollPosition]] = js.native
}

