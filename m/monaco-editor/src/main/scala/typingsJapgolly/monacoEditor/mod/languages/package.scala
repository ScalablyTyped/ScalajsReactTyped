package typingsJapgolly.monacoEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languages {
  type CharacterPair = js.Tuple2[java.lang.String, java.lang.String]
  type Definition = typingsJapgolly.monacoEditor.mod.languages.Location | (js.Array[
    typingsJapgolly.monacoEditor.mod.languages.Location | typingsJapgolly.monacoEditor.mod.languages.LocationLink
  ])
  type IMonarchLanguageAction = typingsJapgolly.monacoEditor.mod.languages.IShortMonarchLanguageAction | typingsJapgolly.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | (js.Array[
    typingsJapgolly.monacoEditor.mod.languages.IExpandedMonarchLanguageAction | typingsJapgolly.monacoEditor.mod.languages.IShortMonarchLanguageAction
  ])
  type IMonarchLanguageRule = typingsJapgolly.monacoEditor.mod.languages.IShortMonarchLanguageRule1 | typingsJapgolly.monacoEditor.mod.languages.IShortMonarchLanguageRule2 | typingsJapgolly.monacoEditor.mod.languages.IExpandedMonarchLanguageRule
  type IShortMonarchLanguageAction = java.lang.String
  type IShortMonarchLanguageRule1 = js.Tuple2[js.RegExp, typingsJapgolly.monacoEditor.mod.languages.IMonarchLanguageAction]
  type IShortMonarchLanguageRule2 = js.Tuple3[
    js.RegExp, 
    typingsJapgolly.monacoEditor.mod.languages.IMonarchLanguageAction, 
    java.lang.String
  ]
  type ProviderResult[T] = js.UndefOr[
    T | scala.Null | (typingsJapgolly.monacoEditor.mod.Thenable[js.UndefOr[T | scala.Null]])
  ]
}
