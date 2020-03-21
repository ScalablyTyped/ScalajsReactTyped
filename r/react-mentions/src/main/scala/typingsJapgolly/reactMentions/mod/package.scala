package typingsJapgolly.reactMentions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataFunc = js.Function2[
    /* query */ java.lang.String, 
    /* callback */ js.Function1[
      /* data */ js.Array[typingsJapgolly.reactMentions.mod.SuggestionDataItem], 
      scala.Unit
    ], 
    scala.Unit | js.Array[typingsJapgolly.reactMentions.mod.SuggestionDataItem]
  ]
  type DisplayTransformFunc = js.Function2[/* id */ java.lang.String, /* display */ java.lang.String, java.lang.String]
  type MentionsInputClass = japgolly.scalajs.react.raw.React.ComponentClassP[typingsJapgolly.reactMentions.mod.MentionsInputProps with js.Object]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type OnChangeHandlerFunc = js.Function4[
    /* event */ typingsJapgolly.reactMentions.AnonTarget, 
    /* newValue */ java.lang.String, 
    /* newPlainTextValue */ java.lang.String, 
    /* mentions */ js.Array[typingsJapgolly.reactMentions.mod.MentionItem], 
    scala.Unit
  ]
}
