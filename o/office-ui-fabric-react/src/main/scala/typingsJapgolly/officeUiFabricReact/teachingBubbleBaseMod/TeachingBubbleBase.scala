package typingsJapgolly.officeUiFabricReact.teachingBubbleBaseMod

import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.officeUiFabricReact.AnonCalloutProps
import typingsJapgolly.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typingsJapgolly.officeUiFabricReact.utilitiesMod.BaseComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
@js.native
class TeachingBubbleBase protected () extends BaseComponent[ITeachingBubbleProps, ITeachingBubbleState] {
  def this(props: ITeachingBubbleProps) = this()
  var _defaultCalloutProps: js.Any = js.native
  var rootElement: RefHandle[HTMLDivElement] = js.native
  def focus(): Unit = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
@js.native
object TeachingBubbleBase extends js.Object {
  var defaultProps: AnonCalloutProps = js.native
}

