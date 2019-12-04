package typingsJapgolly.atStorybookApi

import typingsJapgolly.atStorybookApi.atStorybookApiStrings.BACKSLASHu2318
import typingsJapgolly.atStorybookApi.atStorybookApiStrings.BACKSLASHu2325
import typingsJapgolly.atStorybookApi.atStorybookApiStrings.alt
import typingsJapgolly.atStorybookApi.atStorybookApiStrings.control
import typingsJapgolly.atStorybookApi.atStorybookApiStrings.ctrl
import typingsJapgolly.atStorybookApi.atStorybookApiStrings.meta
import typingsJapgolly.atStorybookApi.distModulesShortcutsMod.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/api/dist/lib/shortcut", JSImport.Namespace)
@js.native
object distLibShortcutMod extends js.Object {
  def controlOrMetaKey(): meta | control = js.native
  def controlOrMetaSymbol(): BACKSLASHu2318 | ctrl = js.native
  def eventMatchesShortcut(e: Event, shortcut: js.Array[String]): Boolean = js.native
  def eventToShortcut(e: Event): js.Array[String] = js.native
  def isMacLike(): Boolean = js.native
  def isShortcutTaken(arr1: js.Array[String], arr2: js.Array[String]): Boolean = js.native
  def keyToSymbol(key: String): String = js.native
  def optionOrAltSymbol(): BACKSLASHu2325 | alt = js.native
  def shortcutMatchesShortcut(inputShortcut: js.Array[String], shortcut: js.Array[String]): Boolean = js.native
  def shortcutToHumanString(shortcut: js.Array[String]): String = js.native
}

