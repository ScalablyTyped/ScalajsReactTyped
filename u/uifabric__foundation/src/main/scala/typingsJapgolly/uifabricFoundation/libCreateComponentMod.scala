package typingsJapgolly.uifabricFoundation

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IComponentOptions
import typingsJapgolly.uifabricFoundation.libIcomponentMod.IViewComponent
import typingsJapgolly.uifabricFoundation.libIslotsMod.ValidProps
import typingsJapgolly.uifabricMergeStyles.libIstylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateComponentMod {
  
  @JSImport("@uifabric/foundation/lib/createComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] & TStatics = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(view.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[TComponentProps] & TStatics]
  inline def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] & TStatics = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps] & TStatics]
}
