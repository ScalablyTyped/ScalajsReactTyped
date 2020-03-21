package typingsJapgolly.reactSideEffect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClassDecorator[TProp, TPeek, TRewind] = js.Function1[
    /* component */ typingsJapgolly.react.mod.ComponentType[TProp], 
    typingsJapgolly.react.mod.ComponentType[TProp] with (typingsJapgolly.reactSideEffect.AnonPeek[TPeek, TRewind])
  ]
}
