package typingsJapgolly.transliteration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type IntervalArray = js.Array[js.Tuple2[scala.Double, scala.Double]]
  type OptionReplaceArray = js.Array[typingsJapgolly.transliteration.typesMod.OptionReplaceArrayItem]
  type OptionReplaceArrayItem = js.Tuple2[java.lang.String | js.RegExp, java.lang.String]
  type OptionReplaceCombined = typingsJapgolly.transliteration.typesMod.OptionReplaceArray | typingsJapgolly.transliteration.typesMod.OptionReplaceObject
  type OptionReplaceObject = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type SlugifyFunction = typingsJapgolly.transliteration.typesMod.TransliterationFunction[typingsJapgolly.transliteration.typesMod.OptionsSlugify]
  type TransliterateFunction = typingsJapgolly.transliteration.typesMod.TransliterationFunction[typingsJapgolly.transliteration.typesMod.OptionsTransliterate]
}
