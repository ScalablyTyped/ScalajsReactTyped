package typingsJapgolly.wordpressElement.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.wordpressElement.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/element", "RawHTML")
@js.native
object RawHTML extends js.Object {
  /**
    * Component used as equivalent of Fragment with unescaped HTML, in cases where
    * it is desirable to render dangerous HTML without needing a wrapper element.
    * To preserve additional props, a `div` wrapper _will_ be created if any props
    * aside from `children` are passed.
    *
    * @param props.children - HTML to render.
    *
    * @return Dangerously-rendering element.
    */
  def apply(
    props: AnonChildren with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any)
  ): Element = js.native
}

