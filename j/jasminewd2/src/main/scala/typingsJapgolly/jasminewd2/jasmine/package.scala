package typingsJapgolly.jasminewd2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type AsyncCustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jasminewd2.jasmine.AsyncCustomMatcherFactory]
  type AsyncCustomMatcherFactory = js.Function2[
    /* util */ typingsJapgolly.jasmine.jasmine.MatchersUtil_, 
    /* customEqualityTesters */ js.Array[typingsJapgolly.jasmine.jasmine.CustomEqualityTester], 
    typingsJapgolly.jasminewd2.jasmine.AsyncCustomMatcher
  ]
}
