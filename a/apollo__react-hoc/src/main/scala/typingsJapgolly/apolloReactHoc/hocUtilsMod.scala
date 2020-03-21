package typingsJapgolly.apolloReactHoc

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.apolloReactCommon.parserMod.IDocumentDefinition
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/react-hoc/lib/hoc-utils", JSImport.Namespace)
@js.native
object hocUtilsMod extends js.Object {
  @js.native
  class GraphQLBase[TProps, TChildProps, TState] protected ()
    extends Component[TProps, TState, js.Any] {
    def this(props: TProps) = this()
    var withRef: Boolean = js.native
    var wrappedInstance: js.UndefOr[js.Any] = js.native
    def getWrappedInstance(): js.UndefOr[ComponentClassP[TChildProps with js.Object]] = js.native
    def setWrappedInstance(ref: ComponentClassP[TChildProps with js.Object]): Unit = js.native
  }
  
  def calculateVariablesFromProps[TProps](operation: IDocumentDefinition, props: TProps): Record[String, _] = js.native
  def defaultMapPropsToOptions(): js.Object = js.native
  def defaultMapPropsToSkip(): Boolean = js.native
  def defaultMapResultToProps[P](props: P): P = js.native
  def getDisplayName[P](WrappedComponent: ComponentType[P]): String = js.native
  type RefSetter[TChildProps] = js.Function1[/* ref */ ComponentClassP[TChildProps with js.Object], Unit]
}

