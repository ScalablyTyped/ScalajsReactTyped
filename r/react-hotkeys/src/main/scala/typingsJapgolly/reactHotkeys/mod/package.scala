package typingsJapgolly.reactHotkeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionName = java.lang.String
  type ApplicationKeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeyMapDisplayOptions}
    */ typingsJapgolly.reactHotkeys.reactHotkeysStrings.ApplicationKeyMap with js.Any
  type HotKeysEnabled = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactHotkeys.mod.HotKeysProps with js.Object, js.Object]
  type HotKeysIgnoreOverride = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactHotkeys.mod.HotKeysProps with js.Object, js.Object]
  type KeyMap = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in react-hotkeys.react-hotkeys.ActionName ]: react-hotkeys.react-hotkeys.KeySequence}
    */ typingsJapgolly.reactHotkeys.reactHotkeysStrings.KeyMap with js.Any
  type KeyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactHotkeys.mod.MouseTrapKeySequence
    - typingsJapgolly.reactHotkeys.mod.KeyMapOptions
    - typingsJapgolly.reactHotkeys.mod.ExtendedKeyMapOptions
    - js.Array[
  typingsJapgolly.reactHotkeys.mod.KeyMapOptions | typingsJapgolly.reactHotkeys.mod.MouseTrapKeySequence]
  */
  type KeySequence = typingsJapgolly.reactHotkeys.mod._KeySequence | (js.Array[
    typingsJapgolly.reactHotkeys.mod.KeyMapOptions | typingsJapgolly.reactHotkeys.mod.MouseTrapKeySequence
  ]) | typingsJapgolly.reactHotkeys.mod.MouseTrapKeySequence
  type ListOfKeys = java.lang.String | js.Array[java.lang.String]
  type MouseTrapKeySequence = java.lang.String | js.Array[java.lang.String]
  type ReactComponent = japgolly.scalajs.react.raw.React.ComponentClassP[js.Object] | java.lang.String | typingsJapgolly.react.mod.SFC[typingsJapgolly.reactHotkeys.mod.ComponentProps]
  type TabIndex = java.lang.String | scala.Double
  type cancelKeyCombinationListener = js.Function0[scala.Unit]
}
