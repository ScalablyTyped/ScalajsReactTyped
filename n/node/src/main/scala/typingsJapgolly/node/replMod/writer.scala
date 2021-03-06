package typingsJapgolly.node.replMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.node.AnonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the default "writer" value, if none is passed in the REPL options,
  * and it can be overridden by custom print functions.
  */
@JSImport("repl", "writer")
@js.native
object writer extends TopLevel[REPLWriter with AnonOptions]

