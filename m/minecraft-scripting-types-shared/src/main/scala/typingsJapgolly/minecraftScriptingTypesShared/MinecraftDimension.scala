package typingsJapgolly.minecraftScriptingTypesShared

import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.`the end`
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.nether
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.overworld
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: move this stuff somewhere else
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.overworld
  - typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.nether
  - typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.`the end`
*/
trait MinecraftDimension extends js.Object

object MinecraftDimension {
  @scala.inline
  def End: `the end` = this.cast("the end")
  @scala.inline
  def Nether: nether = this.cast("nether")
  @scala.inline
  def Overworld: overworld = this.cast("overworld")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

