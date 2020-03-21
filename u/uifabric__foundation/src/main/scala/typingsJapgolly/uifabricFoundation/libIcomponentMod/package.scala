package typingsJapgolly.uifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libIcomponentMod {
  type IComponentStyles[TSlots] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof TSlots ]:? @uifabric/merge-styles.@uifabric/merge-styles/lib/IStyle.IStyle}
    */ typingsJapgolly.uifabricFoundation.uifabricFoundationStrings.IComponentStyles with js.Any
  type IPropsWithChildren[TProps] = typingsJapgolly.react.mod.PropsWithChildren[TProps]
  type IStateComponentType[TComponentProps, TViewProps] = js.Function1[/* props */ TComponentProps, TViewProps]
  type IStylesFunction[TViewProps, TTokens, TStyleSet /* <: typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */] = js.Function3[
    /* props */ TViewProps, 
    /* theme */ typingsJapgolly.uifabricStyling.ithemeMod.ITheme, 
    /* tokens */ TTokens, 
    TStyleSet
  ]
  type IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet /* <: typingsJapgolly.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */] = (typingsJapgolly.uifabricFoundation.libIcomponentMod.IStylesFunction[TViewProps, TTokens, TStyleSet]) | TStyleSet
  type IToken[TViewProps, TTokens] = (typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenBase[TViewProps, TTokens]) | (typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenBaseArray[TViewProps, TTokens])
  type ITokenBase[TViewProps, TTokens] = js.UndefOr[
    (typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[TViewProps, TTokens]) | typingsJapgolly.uifabricFoundation.uifabricFoundationBooleans.`false` | scala.Null
  ]
  type ITokenFunctionOrObject[TViewProps, TTokens] = (typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenFunction[TViewProps, TTokens]) | TTokens
  type IViewComponent[TViewProps] = js.Function1[
    /* props */ typingsJapgolly.react.mod.PropsWithChildren[TViewProps], 
    typingsJapgolly.std.ReturnType[typingsJapgolly.react.mod.FunctionComponent[js.Object]]
  ]
}
