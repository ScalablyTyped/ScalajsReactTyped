package typingsJapgolly.reactVirtualizedSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VirtualizedSelect[TValue] = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactVirtualizedSelect.mod.VirtualizedSelectProps[TValue] with js.Object, 
    js.Object
  ]
  type VirtualizedSelectProps[TValue] = ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> */ js.Any) with typingsJapgolly.reactVirtualizedSelect.mod.AdditionalVirtualizedSelectProps[TValue] with typingsJapgolly.reactVirtualizedSelect.AnonAsync) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> */ js.Any) with typingsJapgolly.reactVirtualizedSelect.mod.AdditionalVirtualizedSelectProps[TValue])
}
