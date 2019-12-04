package typingsJapgolly.inquirer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.inquirer.inquirerMod.StreamOptions
import typingsJapgolly.inquirer.inquirerMod.prompts.PromptCollection
import typingsJapgolly.inquirer.inquirerMod.ui.BottomBarOptions
import typingsJapgolly.inquirer.libUiBottomDashBarMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomBar extends js.Object {
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
    typingsJapgolly.inquirer.libUiPromptMod.^
  ]
}

object Anon_BottomBar {
  @scala.inline
  def apply(
    BottomBar: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^],
    Prompt: Instantiable2[
      /* prompts */ PromptCollection, 
      js.UndefOr[/* options */ StreamOptions], 
      typingsJapgolly.inquirer.libUiPromptMod.^
    ]
  ): Anon_BottomBar = {
    val __obj = js.Dynamic.literal(BottomBar = BottomBar.asInstanceOf[js.Any], Prompt = Prompt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BottomBar]
  }
}

