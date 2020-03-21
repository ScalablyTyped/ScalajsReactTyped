package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackProps
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Stack/Stack", JSImport.Namespace)
@js.native
object stackStackMod extends js.Object {
  @js.native
  object Stack extends js.Object {
    var Item: FunctionComponent[IStackItemProps] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialIStackProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapIStackPr] = js.native
    def apply(props: PropsWithChildren[IStackProps]): Element | Null = js.native
    def apply(props: PropsWithChildren[IStackProps], context: js.Any): Element | Null = js.native
  }
  
  @js.native
  object default extends js.Object {
    var Item: FunctionComponent[IStackItemProps] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialIStackProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapIStackPr] = js.native
    def apply(props: PropsWithChildren[IStackProps]): Element | Null = js.native
    def apply(props: PropsWithChildren[IStackProps], context: js.Any): Element | Null = js.native
  }
  
}

