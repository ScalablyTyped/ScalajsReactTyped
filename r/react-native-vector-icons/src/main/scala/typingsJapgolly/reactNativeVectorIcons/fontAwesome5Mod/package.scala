package typingsJapgolly.reactNativeVectorIcons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fontAwesome5Mod {
  type AllowOnlyOne[T, Keys /* <: java.lang.String */] = (typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.Omit[T, Keys]) with (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Partial<std.Pick<T, K>> & std.Partial<std.Record<std.Exclude<Keys, K>, undefined>>}[Keys] */ js.Any)
  type FontAwesome5Icon = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconProps with js.Object, 
    js.Object
  ]
  type FontAwesome5IconProps = typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.AllowOnlyOne[
    typingsJapgolly.reactNativeVectorIcons.KinFontAwesome5IconVarian, 
    typingsJapgolly.reactNativeVectorIcons.fontAwesome5Mod.FontAwesome5IconVariants
  ]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
