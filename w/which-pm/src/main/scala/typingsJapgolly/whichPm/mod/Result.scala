package typingsJapgolly.whichPm.mod

import typingsJapgolly.whichPm.whichPmStrings.npm
import typingsJapgolly.whichPm.whichPmStrings.pnpm
import typingsJapgolly.whichPm.whichPmStrings.yarn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.whichPm.mod.NPM
  - typingsJapgolly.whichPm.mod.YARN
  - typingsJapgolly.whichPm.mod.PNPM
  - typingsJapgolly.whichPm.mod.Other
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def NPM(name: npm): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def YARN(name: yarn): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def PNPM(name: pnpm, version: String): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def Other(name: String, version: String = null): Result = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

