package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import typingsJapgolly.reactInstantsearchCore.mod.TranslatableExposed
import typingsJapgolly.reactInstantsearchCore.mod.TranslatableProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "translatable")
@js.native
object translatable extends js.Object {
  def apply(defaultTranslations: StringDictionary[String | (js.Function1[/* repeated */ js.Any, String])]): js.Function1[
    /* ctor */ ComponentType[TranslatableProvided], 
    ComponentClassP[
      (Omit[TranslatableProvided, TranslatableProvided]) with TranslatableExposed with js.Object
    ]
  ] = js.native
}

