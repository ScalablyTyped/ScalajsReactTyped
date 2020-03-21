package typingsJapgolly.enzyme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentType[Props] = typingsJapgolly.enzyme.mod.ComponentClass[Props] | typingsJapgolly.enzyme.mod.StatelessComponent[Props]
  type EnzymePropSelector = org.scalablytyped.runtime.StringDictionary[js.Any]
  type EnzymeSelector = java.lang.String | typingsJapgolly.enzyme.mod.StatelessComponent[js.Any] | typingsJapgolly.enzyme.mod.ComponentClass[js.Any] | typingsJapgolly.enzyme.mod.EnzymePropSelector
  type HTMLAttributes = typingsJapgolly.react.mod.AllHTMLAttributes[js.Object] with typingsJapgolly.react.mod.SVGAttributes[js.Object]
  type Intercepter[T] = js.Function1[/* intercepter */ T, scala.Unit]
  type Parameters[T] = js.Any
  type StatelessComponent[Props] = js.Function2[
    /* props */ Props, 
    /* context */ js.UndefOr[js.Any], 
    japgolly.scalajs.react.raw.React.Element | scala.Null
  ]
}
