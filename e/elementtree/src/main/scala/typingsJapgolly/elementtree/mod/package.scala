package typingsJapgolly.elementtree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type ElementTag = (js.Function1[
    js.UndefOr[typingsJapgolly.elementtree.mod.ElementText], 
    typingsJapgolly.elementtree.mod.Element
  ]) | (js.Function2[
    /* target */ typingsJapgolly.elementtree.mod.ElementText, 
    /* text */ js.UndefOr[typingsJapgolly.elementtree.mod.ElementText], 
    typingsJapgolly.elementtree.mod.Element
  ]) | java.lang.String
  type ElementText = typingsJapgolly.elementtree.AnonToString | java.lang.String
}
