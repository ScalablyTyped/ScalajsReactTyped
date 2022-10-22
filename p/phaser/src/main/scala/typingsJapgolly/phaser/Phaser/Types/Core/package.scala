package typingsJapgolly.phaser.Phaser.Types.Core

import typingsJapgolly.phaser.Phaser.Game
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BootCallback = js.Function1[/* game */ Game, Unit]

/**
  * This callback type is completely empty, a no-operation.
  */
type NOOP = js.Function0[Unit]

type TimeStepCallback = js.Function3[/* time */ Double, /* average */ Double, /* interpolation */ Double, Unit]
