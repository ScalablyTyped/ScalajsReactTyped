package typingsJapgolly.winrtUwp.Windows.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Text {
  /** Defines the signature of a function that is provided to SelectableWordsSegmenter.Tokenize . */
  type SelectableWordSegmentsTokenizingHandler = js.Function2[
    /* precedingWords */ typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrtUwp.Windows.Data.Text.SelectableWordSegment], 
    /* words */ typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrtUwp.Windows.Data.Text.SelectableWordSegment], 
    scala.Unit
  ]
  /** Defines the signature of a function that is provided to WordsSegmenter.Tokenize . */
  type WordSegmentsTokenizingHandler = js.Function2[
    /* precedingWords */ typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrtUwp.Windows.Data.Text.WordSegment], 
    /* words */ typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable[typingsJapgolly.winrtUwp.Windows.Data.Text.WordSegment], 
    scala.Unit
  ]
}
