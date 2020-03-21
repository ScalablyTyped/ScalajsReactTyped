package typingsJapgolly.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryHelpersMod {
  type AllByAttribute = js.Function4[
    /* attribute */ java.lang.String, 
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], 
    js.Array[org.scalajs.dom.raw.HTMLElement]
  ]
  type BuiltQueryMethods[Arguments /* <: js.Array[_] */] = js.Tuple5[
    typingsJapgolly.testingLibraryDom.queryHelpersMod.QueryBy[Arguments], 
    typingsJapgolly.testingLibraryDom.queryHelpersMod.GetAllBy[Arguments], 
    typingsJapgolly.testingLibraryDom.queryHelpersMod.GetBy[Arguments], 
    typingsJapgolly.testingLibraryDom.queryHelpersMod.FindAllBy[Arguments], 
    typingsJapgolly.testingLibraryDom.queryHelpersMod.FindBy[Arguments]
  ]
  type FindAllBy[Arguments /* <: js.Array[_] */] = typingsJapgolly.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement]]]
  type FindBy[Arguments /* <: js.Array[_] */] = typingsJapgolly.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, js.Promise[org.scalajs.dom.raw.HTMLElement]]
  type GetAllBy[Arguments /* <: js.Array[_] */] = typingsJapgolly.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, js.Array[org.scalajs.dom.raw.HTMLElement]]
  type GetBy[Arguments /* <: js.Array[_] */] = typingsJapgolly.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, org.scalajs.dom.raw.HTMLElement]
  type QueryBy[Arguments /* <: js.Array[_] */] = typingsJapgolly.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, org.scalajs.dom.raw.HTMLElement | scala.Null]
  type QueryByAttribute_ = js.Function4[
    /* attribute */ java.lang.String, 
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsJapgolly.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsJapgolly.testingLibraryDom.matchesMod.MatcherOptions], 
    org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
  type QueryMethod[Arguments /* <: js.Array[_] */, Return] = js.Function2[/* container */ org.scalajs.dom.raw.HTMLElement, /* args */ Arguments, Return]
}
