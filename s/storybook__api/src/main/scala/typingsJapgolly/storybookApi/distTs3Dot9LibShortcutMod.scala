package typingsJapgolly.storybookApi

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.storybookApi.distTs3Dot9ModulesShortcutsMod.Event
import typingsJapgolly.storybookApi.distTs3Dot9ModulesShortcutsMod.KeyCollection
import typingsJapgolly.storybookApi.storybookApiStrings.Optionkey
import typingsJapgolly.storybookApi.storybookApiStrings.Placeofinterestsign
import typingsJapgolly.storybookApi.storybookApiStrings.alt
import typingsJapgolly.storybookApi.storybookApiStrings.control
import typingsJapgolly.storybookApi.storybookApiStrings.ctrl
import typingsJapgolly.storybookApi.storybookApiStrings.meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9LibShortcutMod {
  
  @JSImport("@storybook/api/dist/ts3.9/lib/shortcut", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def controlOrMetaKey(): meta | control = ^.asInstanceOf[js.Dynamic].applyDynamic("controlOrMetaKey")().asInstanceOf[meta | control]
  
  inline def controlOrMetaSymbol(): Placeofinterestsign | ctrl = ^.asInstanceOf[js.Dynamic].applyDynamic("controlOrMetaSymbol")().asInstanceOf[Placeofinterestsign | ctrl]
  
  inline def eventMatchesShortcut(e: Event, shortcut: KeyCollection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eventMatchesShortcut")(e.asInstanceOf[js.Any], shortcut.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def eventToShortcut(e: KeyboardEvent): KeyCollection | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("eventToShortcut")(e.asInstanceOf[js.Any]).asInstanceOf[KeyCollection | Null]
  
  inline def isMacLike(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacLike")().asInstanceOf[Boolean]
  
  inline def isShortcutTaken(arr1: js.Array[String], arr2: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isShortcutTaken")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def keyToSymbol(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyToSymbol")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def optionOrAltSymbol(): Optionkey | alt = ^.asInstanceOf[js.Dynamic].applyDynamic("optionOrAltSymbol")().asInstanceOf[Optionkey | alt]
  
  inline def shortcutMatchesShortcut(inputShortcut: KeyCollection, shortcut: KeyCollection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shortcutMatchesShortcut")(inputShortcut.asInstanceOf[js.Any], shortcut.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def shortcutToHumanString(shortcut: KeyCollection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("shortcutToHumanString")(shortcut.asInstanceOf[js.Any]).asInstanceOf[String]
}
