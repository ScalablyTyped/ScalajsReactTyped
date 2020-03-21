package typingsJapgolly.flux

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fluxContainerMod {
  type Component[TProps, TState, TContext] = typingsJapgolly.flux.fluxContainerMod.ComponentConstructor[TProps] with (typingsJapgolly.flux.fluxContainerMod.ComponentStatic[TProps, TState, TContext])
  type ComponentConstructor[TProps] = (japgolly.scalajs.react.raw.React.ComponentClassP[TProps with js.Object]) | typingsJapgolly.react.mod.StatelessComponent[TProps]
  type StoresList = js.Array[typingsJapgolly.flux.fluxStoreMod.^[js.Any]]
}
