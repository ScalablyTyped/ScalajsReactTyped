package typingsJapgolly.reactSketchapp

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSketchapp.propsMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp/lib/components/Svg/TSpan", JSImport.Namespace)
@js.native
object tspanMod extends js.Object {
  @js.native
  trait TSpan
    extends Component[TextProps, js.Object, js.Any] {
    def getChildContext(): AnonIsInAParentText = js.native
  }
  
  @js.native
  class default () extends TSpan
  
}

