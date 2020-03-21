package typingsJapgolly.w2ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object W2UI_ {
  type W2EventHandler = (js.Function1[/* e */ typingsJapgolly.w2ui.W2UI_.W2Event, scala.Unit]) | (js.Function2[/* id */ java.lang.String, /* e */ typingsJapgolly.w2ui.W2UI_.W2Event, scala.Unit])
  type W2Grid = typingsJapgolly.w2ui.W2UI_.W2Grid_
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.w2ui.W2UI_.W2Layout
    - typingsJapgolly.w2ui.W2UI_.W2Grid
    - typingsJapgolly.w2ui.W2UI_.W2Toolbar
    - typingsJapgolly.w2ui.W2UI_.W2Sidebar
    - typingsJapgolly.w2ui.W2UI_.W2Tabs
    - typingsJapgolly.w2ui.W2UI_.W2Form
    - typingsJapgolly.w2ui.W2UI_.W2Popup
  */
  type W2Object = typingsJapgolly.w2ui.W2UI_._W2Object | typingsJapgolly.w2ui.W2UI_.W2Grid
  type W2UI = // morally, [s: string]<T extends W2Common>: T;
  org.scalablytyped.runtime.StringDictionary[js.Any]
}
