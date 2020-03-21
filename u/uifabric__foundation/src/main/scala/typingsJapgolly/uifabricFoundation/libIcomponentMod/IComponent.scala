package typingsJapgolly.uifabricFoundation.libIcomponentMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.std.ReturnType
import typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<@uifabric/foundation.@uifabric/foundation/lib/IComponent.IComponentOptions<TComponentProps, TTokens, TStyleSet, TViewProps, TStatics>> & {  view  :@uifabric/foundation.@uifabric/foundation/lib/IComponent.IViewComponent<TViewProps>} */
trait IComponent[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics] extends js.Object {
  var displayName: String
  var factoryOptions: IFactoryOptions[TComponentProps]
  var fields: js.Array[String]
  var state: IStateComponentType[TComponentProps, TViewProps]
  var statics: TStatics
  var styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]
  var tokens: ITokenFunctionOrObject[TViewProps, TTokens]
  /**
    * Component that generates view output.
    */
  var view: IViewComponent[TViewProps]
}

object IComponent {
  @scala.inline
  def apply[TComponentProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps, TStatics](
    displayName: String,
    factoryOptions: IFactoryOptions[TComponentProps],
    fields: js.Array[String],
    state: TComponentProps => CallbackTo[TViewProps],
    statics: TStatics,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet],
    tokens: ITokenFunctionOrObject[TViewProps, TTokens],
    view: /* props */ PropsWithChildren[TViewProps] => CallbackTo[ReturnType[FunctionComponent[js.Object]]]
  ): IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics] = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], factoryOptions = factoryOptions.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], statics = statics.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(js.Any.fromFunction1((t0: TComponentProps) => state(t0).runNow()))
    __obj.updateDynamic("view")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.react.mod.PropsWithChildren[TViewProps]) => view(t0).runNow()))
    __obj.asInstanceOf[IComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]]
  }
}

