package typingsJapgolly.reactAriaModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AriaModal = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactAriaModal.mod.AriaModalProps with (typingsJapgolly.reactAriaModal.mod.RequiredAriaTypes[
      typingsJapgolly.reactAriaModal.PickAriaModalPropstitleId, 
      typingsJapgolly.reactAriaModal.PickAriaModalPropstitleTe
    ]) with js.Object, 
    js.Object
  ]
  type RequiredAriaTypes[T, U] = (typingsJapgolly.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with T with js.Any) | (typingsJapgolly.reactAriaModal.reactAriaModalStrings.RequiredAriaTypes with js.Any with U)
}
