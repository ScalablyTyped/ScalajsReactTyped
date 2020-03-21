package typingsJapgolly.flux.fluxReduceStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the basic building block of a Flux application. All of your stores
  * should extend this class.
  */
@JSImport("flux/lib/FluxReduceStore", JSImport.Namespace)
@js.native
abstract class ^[TState, TPayload] () extends FluxReduceStore[TState, TPayload]

