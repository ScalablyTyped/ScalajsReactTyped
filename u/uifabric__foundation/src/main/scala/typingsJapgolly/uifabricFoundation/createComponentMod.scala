package typingsJapgolly.uifabricFoundation

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IComponentOptions
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IViewComponent
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps
import typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/createComponent", JSImport.Namespace)
@js.native
object createComponentMod extends js.Object {
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] with TStatics = js.native
}

