package typingsJapgolly.reduxShortcuts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ActionBindings = typingsJapgolly.redux.mod.ActionCreator[typingsJapgolly.redux.mod.Action[js.Any]] | (js.Array[
    typingsJapgolly.redux.mod.ActionCreator[typingsJapgolly.redux.mod.Action[js.Any]]
  ])
  type BasicShortcutDefinition = js.Tuple2[
    typingsJapgolly.reduxShortcuts.mod.KeyBindings, 
    typingsJapgolly.reduxShortcuts.mod.ActionBindings
  ]
  type KeyBindings = java.lang.String | js.Array[java.lang.String]
  type Mousetrap_ = typingsJapgolly.reduxShortcuts.mod.Mousetrap__
  type ShortcutDefinition = typingsJapgolly.reduxShortcuts.mod.BasicShortcutDefinition | typingsJapgolly.reduxShortcuts.mod.ShortcutDefinitionWithPreventDefault
  type ShortcutDefinitionWithPreventDefault = js.Tuple3[
    typingsJapgolly.reduxShortcuts.mod.KeyBindings, 
    typingsJapgolly.reduxShortcuts.mod.ActionBindings, 
    scala.Boolean
  ]
}
