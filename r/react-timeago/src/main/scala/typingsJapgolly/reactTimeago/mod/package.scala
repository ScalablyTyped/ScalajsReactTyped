package typingsJapgolly.reactTimeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Formatter = js.Function5[
    /* value */ scala.Double, 
    /* unit */ typingsJapgolly.reactTimeago.mod.Unit, 
    /* suffix */ typingsJapgolly.reactTimeago.mod.Suffix, 
    /* epochMiliseconds */ scala.Double, 
    /* nextFormatter */ js.UndefOr[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-timeago.react-timeago.Formatter */ js.Object
    ], 
    japgolly.scalajs.react.raw.React.Node
  ]
  type ReactTimeago[T /* <: typingsJapgolly.react.mod.ComponentType[js.Object] */] = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactTimeago.mod.ReactTimeagoProps[T] with typingsJapgolly.react.mod.ComponentProps[T] with js.Object, 
    js.Object
  ]
}
