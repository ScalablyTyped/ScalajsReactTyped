package typingsJapgolly.storybookAddonKnobs

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlConfig
import typingsJapgolly.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/components/types/Text", JSImport.Namespace)
@js.native
object textMod extends js.Object {
  @js.native
  trait TextType
    extends Component[TextTypeProps, js.Object, js.Any] {
    def handleChange(event: ReactEventFrom[HTMLTextAreaElement]): Unit = js.native
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTextType(nextProps: TextTypeProps): Boolean = js.native
  }
  
  @js.native
  class default () extends TextType
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: TextTypeProps = js.native
    var propTypes: AnonOnChange = js.native
    def deserialize(value: String): String = js.native
    def serialize(value: String): String = js.native
  }
  
  type TextTypeKnob = KnobControlConfig[TextTypeKnobValue]
  type TextTypeKnobValue = String
  type TextTypeProps = KnobControlProps[TextTypeKnobValue]
}

