package typingsJapgolly.commander.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommanderStatic
  extends typingsJapgolly.commander.mod.local.Command {
  var Command: Instantiable1[js.UndefOr[/* name */ String], typingsJapgolly.commander.mod.local.Command] = js.native
  var CommandOptions: typingsJapgolly.commander.mod.CommandOptions = js.native
  var Option: Instantiable2[
    /* flags */ String, 
    js.UndefOr[/* description */ String], 
    typingsJapgolly.commander.mod.local.Option
  ] = js.native
  var ParseOptionsResult: typingsJapgolly.commander.mod.ParseOptionsResult = js.native
}

