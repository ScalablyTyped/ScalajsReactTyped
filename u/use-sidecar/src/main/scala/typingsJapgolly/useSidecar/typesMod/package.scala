package typingsJapgolly.useSidecar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DefaultOrNot[T] = typingsJapgolly.useSidecar.AnonDefault[T] | T
  type Importer[T] = js.Function0[
    js.Promise[
      typingsJapgolly.useSidecar.typesMod.DefaultOrNot[typingsJapgolly.react.mod.ComponentType[T]]
    ]
  ]
  type MediumCallback[T] = js.Function1[/* data */ T, js.Any]
  type MiddlewareCallback[T] = js.Function2[/* data */ T, /* assigned */ scala.Boolean, T]
  type SideCarComponent[T] = typingsJapgolly.react.mod.FunctionComponent[T with typingsJapgolly.useSidecar.typesMod.SideCarHOC]
  type SideCarMedium = typingsJapgolly.useSidecar.typesMod.SideMedium[typingsJapgolly.react.mod.ComponentType[js.Object]]
  type removeCb = js.Function0[scala.Unit]
}
