package typingsJapgolly.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queriesMod {
  type AllByBoundAttribute = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], 
    js.Array[org.scalajs.dom.raw.HTMLElement]
  ]
  type AllByRole = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions], 
    js.Array[org.scalajs.dom.raw.HTMLElement]
  ]
  type AllByText = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    js.Array[org.scalajs.dom.raw.HTMLElement]
  ]
  type FindAllByBoundAttribute = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement]]
  ]
  type FindAllByRole_ = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement]]
  ]
  type FindAllByText_ = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement]]
  ]
  type FindByBoundAttribute = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  type FindByRole_ = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  type FindByText_ = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsJapgolly.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  type GetByBoundAttribute = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], 
    org.scalajs.dom.raw.HTMLElement
  ]
  type GetByRole_ = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions], 
    org.scalajs.dom.raw.HTMLElement
  ]
  type GetByText_ = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    org.scalajs.dom.raw.HTMLElement
  ]
  type QueryByBoundAttribute = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], 
    org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
  type QueryByRole_ = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queriesMod.ByRoleOptions], 
    org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
  type QueryByText_ = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
}
