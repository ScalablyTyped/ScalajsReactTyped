package typingsJapgolly.fluxStandardAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorFSA[CustomError /* <: js.Error */, Meta, Type /* <: java.lang.String */] = typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardAction[Type, CustomError, Meta]
  type ErrorFSAAuto[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardActionAuto[Type, CustomError, Meta]
  type ErrorFSAWithMeta[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardActionWithMeta[Type, CustomError, Meta]
  type ErrorFSAWithPayload[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]
  type ErrorFSAWithPayloadAndMeta[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]
  type ErrorFluxStandardActionAuto[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = (typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardActionWithPayloadAndMeta[Type, CustomError, Meta]) | (typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardActionWithPayload[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithMeta[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = (typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardAction[Type, CustomError, Meta]) with (typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithPayload[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = (typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardAction[Type, CustomError, Meta]) with (typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, CustomError, Meta])
  type ErrorFluxStandardActionWithPayloadAndMeta[Type /* <: java.lang.String */, CustomError /* <: js.Error */, Meta] = (typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardActionWithPayload[Type, CustomError, Meta]) with (typingsJapgolly.fluxStandardAction.mod.ErrorFluxStandardActionWithMeta[Type, CustomError, Meta])
  type FSA[Type /* <: java.lang.String */, Payload, Meta] = typingsJapgolly.fluxStandardAction.mod.FluxStandardAction[Type, Payload, Meta]
  type FSAAuto[Type /* <: java.lang.String */, Payload, Meta] = typingsJapgolly.fluxStandardAction.mod.FluxStandardActionAuto[Type, Payload, Meta]
  type FSAWithMeta[Type /* <: java.lang.String */, Payload, Meta] = typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta]
  type FSAWithPayload[Type /* <: java.lang.String */, Payload, Meta] = typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta]
  type FSAWithPayloadAndMeta[Type /* <: java.lang.String */, Payload, Meta] = typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta]
    - typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta]
    - typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta]
    - typingsJapgolly.fluxStandardAction.mod.FluxStandardAction[Type, Payload, Meta]
  */
  type FluxStandardActionAuto[Type /* <: java.lang.String */, Payload, Meta] = (typingsJapgolly.fluxStandardAction.mod._FluxStandardActionAuto[Type, Payload, Meta]) | (typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithPayloadAndMeta[Type, Payload, Meta])
  type FluxStandardActionWithPayloadAndMeta[Type /* <: java.lang.String */, Payload, Meta] = (typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithPayload[Type, Payload, Meta]) with (typingsJapgolly.fluxStandardAction.mod.FluxStandardActionWithMeta[Type, Payload, Meta])
}
