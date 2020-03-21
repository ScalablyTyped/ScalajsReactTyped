package typingsJapgolly.jupyterlabFileeditor.tabspacestatusMod.TabSpaceComponent

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The props for TabSpaceComponent.
  */
trait IProps extends js.Object {
  /**
    * Whether to use spaces or tabs.
    */
  var isSpaces: Boolean
  /**
    * The number of spaces to insert on tab.
    */
  var tabSpace: Double
  /**
    * A click handler for the TabSpace component. By default
    * opens a menu allowing the user to select tabs vs spaces.
    */
  def handleClick(): Unit
}

object IProps {
  @scala.inline
  def apply(handleClick: Callback, isSpaces: Boolean, tabSpace: Double): IProps = {
    val __obj = js.Dynamic.literal(isSpaces = isSpaces.asInstanceOf[js.Any], tabSpace = tabSpace.asInstanceOf[js.Any])
    __obj.updateDynamic("handleClick")(handleClick.toJsFn)
    __obj.asInstanceOf[IProps]
  }
}

