package typingsJapgolly.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Sound {
  type EachActiveSoundCallback = js.Function4[
    /* manager */ typingsJapgolly.phaser.Phaser.Sound.BaseSoundManager, 
    /* sound */ typingsJapgolly.phaser.Phaser.Sound.BaseSound, 
    /* index */ scala.Double, 
    /* sounds */ js.Array[typingsJapgolly.phaser.Phaser.Sound.BaseSound], 
    scala.Unit
  ]
}
