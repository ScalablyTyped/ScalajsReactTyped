package typingsJapgolly.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Input {
  type HitAreaCallback = js.Function4[
    /* hitArea */ js.Any, 
    /* x */ scala.Double, 
    /* y */ scala.Double, 
    /* gameObject */ typingsJapgolly.phaser.Phaser.GameObjects.GameObject, 
    scala.Unit
  ]
}
