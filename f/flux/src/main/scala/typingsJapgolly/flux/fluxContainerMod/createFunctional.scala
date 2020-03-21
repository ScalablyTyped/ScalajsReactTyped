package typingsJapgolly.flux.fluxContainerMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.flux.fluxStoreMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flux/lib/FluxContainer", "createFunctional")
@js.native
object createFunctional extends js.Object {
  def apply[TProps, TState](
    viewFn: js.Function1[/* props */ TState, Element],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[^[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ]
  ): Component[TProps, TState, _] = js.native
  def apply[TProps, TState](
    viewFn: js.Function1[/* props */ TState, Element],
    getStores: js.Function2[
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      js.Array[^[_]]
    ],
    calculateState: js.Function3[
      /* prevState */ js.UndefOr[TState], 
      /* maybeProps */ js.UndefOr[TProps], 
      /* maybeContext */ js.UndefOr[js.Any], 
      TState
    ],
    options: RealOptions
  ): Component[TProps, TState, _] = js.native
}

