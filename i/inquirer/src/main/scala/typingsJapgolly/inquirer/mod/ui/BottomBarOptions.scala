package typingsJapgolly.inquirer.mod.ui

import typingsJapgolly.inquirer.mod.StreamOptions
import typingsJapgolly.node.processMod._Global_.NodeJS.ReadStream
import typingsJapgolly.node.processMod._Global_.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the bottom-bar UI.
  */
trait BottomBarOptions extends StreamOptions {
  /**
    * The initial text to display.
    */
  var bottomBar: js.UndefOr[String] = js.undefined
}

object BottomBarOptions {
  @scala.inline
  def apply(bottomBar: String = null, input: ReadStream = null, output: WriteStream = null): BottomBarOptions = {
    val __obj = js.Dynamic.literal()
    if (bottomBar != null) __obj.updateDynamic("bottomBar")(bottomBar.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomBarOptions]
  }
}

