package typingsJapgolly.reactNativeElements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DividerProps = typingsJapgolly.reactNative.mod.ViewProperties
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.react.mod.ReactElement
    - typingsJapgolly.reactNativeElements.mod.TextProps
    - typingsJapgolly.reactNativeElements.mod.HeaderIcon
  */
  type HeaderSubComponent = typingsJapgolly.reactNativeElements.mod._HeaderSubComponent | japgolly.scalajs.react.raw.React.Element
  type IconNode = scala.Boolean | japgolly.scalajs.react.raw.React.Element | typingsJapgolly.reactNativeElements.mod.IconProps
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.material
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`material-community`
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`simple-line-icon`
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.zocial
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.`font-awesome`
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.octicon
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.ionicon
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.foundation
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.evilicon
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.entypo
    - typingsJapgolly.reactNativeElements.reactNativeElementsStrings.antdesign
    - java.lang.String
  */
  type IconType = typingsJapgolly.reactNativeElements.mod._IconType | java.lang.String
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native-elements.react-native-elements.RecursivePartial<T[P]> * / object}
    */ typingsJapgolly.reactNativeElements.reactNativeElementsStrings.RecursivePartial with js.Any
  type ReplaceTheme = js.Function1[
    /* updates */ typingsJapgolly.reactNativeElements.RecursivePartialFullTheme, 
    scala.Unit
  ]
  type SearchBarProps = typingsJapgolly.reactNativeElements.mod.SearchBarWrapper with typingsJapgolly.reactNativeElements.mod.SearchBarBase with typingsJapgolly.reactNativeElements.mod.SearchBarPlatform with typingsJapgolly.reactNativeElements.mod.SearchBarDefault with typingsJapgolly.reactNativeElements.mod.SearchBarIOS with typingsJapgolly.reactNativeElements.mod.SearchBarAndroid
  type Theme[T] = typingsJapgolly.reactNativeElements.PartialFullTheme with T
  type UpdateTheme = js.Function1[
    /* updates */ typingsJapgolly.reactNativeElements.RecursivePartialFullTheme, 
    scala.Unit
  ]
}
