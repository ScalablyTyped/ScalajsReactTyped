package typingsJapgolly.reactWithStyles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentClassProps[C] = js.Any
  type ElementConfig[C] = typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes[C, typingsJapgolly.reactWithStyles.mod.ElementProps[C]]
  type ElementProps[C] = typingsJapgolly.reactWithStyles.mod.SFCProps[C] | typingsJapgolly.reactWithStyles.mod.ComponentClassProps[C]
  type Nullable[T] = js.UndefOr[T | scala.Null]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type SFCProps[C] = js.Any
  type Styles = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.reactWithStyles.mod.Nullable[typingsJapgolly.reactWithStyles.CSSPropertiespseudoSelect]
  ]
  type Theme = org.scalablytyped.runtime.StringDictionary[js.Any]
}
