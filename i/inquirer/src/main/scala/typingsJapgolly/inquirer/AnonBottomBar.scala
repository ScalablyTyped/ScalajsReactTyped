package typingsJapgolly.inquirer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.inquirer.bottomBarMod.^
import typingsJapgolly.inquirer.mod.StreamOptions
import typingsJapgolly.inquirer.mod.prompts.PromptCollection
import typingsJapgolly.inquirer.mod.ui.BottomBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomBar extends js.Object {
  /**
    * Represents the bottom-bar UI.
    */
  var BottomBar: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^]
  /**
    * Represents the prompt ui.
    */
  var Prompt: Instantiable2[
    /* prompts */ PromptCollection, 
    js.UndefOr[/* options */ StreamOptions], 
    typingsJapgolly.inquirer.promptMod.^
  ]
}

object AnonBottomBar {
  @scala.inline
  def apply(
    BottomBar: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^],
    Prompt: Instantiable2[
      /* prompts */ PromptCollection, 
      js.UndefOr[/* options */ StreamOptions], 
      typingsJapgolly.inquirer.promptMod.^
    ]
  ): AnonBottomBar = {
    val __obj = js.Dynamic.literal(BottomBar = BottomBar.asInstanceOf[js.Any], Prompt = Prompt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBottomBar]
  }
}

