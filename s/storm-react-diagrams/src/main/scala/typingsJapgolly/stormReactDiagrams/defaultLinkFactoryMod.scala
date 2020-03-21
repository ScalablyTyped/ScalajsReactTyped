package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.stormReactDiagrams.abstractLinkFactoryMod.AbstractLinkFactory
import typingsJapgolly.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typingsJapgolly.stormReactDiagrams.defaultLinkWidgetMod.DefaultLinkWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/factories/DefaultLinkFactory", JSImport.Namespace)
@js.native
object defaultLinkFactoryMod extends js.Object {
  @js.native
  class DefaultLinkFactory () extends AbstractLinkFactory[DefaultLinkModel] {
    def generateLinkSegment(model: DefaultLinkModel, widget: DefaultLinkWidget, selected: Boolean, path: String): Element = js.native
  }
  
}

