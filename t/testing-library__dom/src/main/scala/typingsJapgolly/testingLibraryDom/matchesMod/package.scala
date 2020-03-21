package typingsJapgolly.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object matchesMod {
  type Match = js.Function4[
    /* textToMatch */ java.lang.String, 
    /* node */ org.scalajs.dom.raw.HTMLElement | scala.Null, 
    /* matcher */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], 
    scala.Boolean
  ]
  type Matcher = java.lang.String | js.RegExp | typingsJapgolly.testingLibraryDom.matchesMod.MatcherFunction
  type MatcherFunction = js.Function2[
    /* content */ java.lang.String, 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    scala.Boolean
  ]
  type NormalizerFn = js.Function1[/* text */ java.lang.String, java.lang.String]
}
