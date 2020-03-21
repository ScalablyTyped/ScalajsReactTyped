package typingsJapgolly.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean]
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.chunkedDc.jasmine.CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ typingsJapgolly.chunkedDc.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typingsJapgolly.chunkedDc.jasmine.CustomEqualityTester], 
    typingsJapgolly.chunkedDc.jasmine.CustomMatcher
  ]
  type SpecFunction = js.Function1[/* spec */ js.UndefOr[typingsJapgolly.chunkedDc.jasmine.Spec], scala.Unit]
  type StringPrettyPrinter = typingsJapgolly.chunkedDc.jasmine.PrettyPrinter
}
