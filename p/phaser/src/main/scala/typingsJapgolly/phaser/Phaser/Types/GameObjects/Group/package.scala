package typingsJapgolly.phaser.Phaser.Types.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Group {
  type GroupCallback = js.Function1[/* item */ typingsJapgolly.phaser.Phaser.GameObjects.GameObject, scala.Unit]
  type GroupMultipleCreateCallback = js.Function1[
    /* items */ js.Array[typingsJapgolly.phaser.Phaser.GameObjects.GameObject], 
    scala.Unit
  ]
}
