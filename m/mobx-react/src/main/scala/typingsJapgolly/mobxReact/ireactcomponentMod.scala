package typingsJapgolly.mobxReact

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react/dist/types/IReactComponent", JSImport.Namespace)
@js.native
object ireactcomponentMod extends js.Object {
  type IReactComponent[P] = ClassicComponentClass[P] | (ComponentClassP[P with js.Object]) | FunctionComponent[P] | ForwardRefExoticComponent[P]
}

