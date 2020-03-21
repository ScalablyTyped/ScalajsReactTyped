package typingsJapgolly.jest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jasmine {
  type CustomEqualityTester = js.Function2[/* first */ js.Any, /* second */ js.Any, scala.Boolean]
  type CustomMatcherFactories = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.jest.mod.jasmine.CustomMatcherFactory]
  type CustomMatcherFactory = js.Function2[
    /* util */ typingsJapgolly.jest.mod.jasmine.MatchersUtil, 
    /* customEqualityTesters */ js.Array[typingsJapgolly.jest.mod.jasmine.CustomEqualityTester], 
    typingsJapgolly.jest.mod.jasmine.CustomMatcher
  ]
}
