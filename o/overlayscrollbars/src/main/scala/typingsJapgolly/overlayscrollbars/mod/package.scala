package typingsJapgolly.overlayscrollbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BasicEventCallback = js.ThisFunction0[/* this */ typingsJapgolly.overlayscrollbars.mod.OverlayScrollbars, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.overlayscrollbars.AnonX
    - typingsJapgolly.overlayscrollbars.AnonL
    - typingsJapgolly.overlayscrollbars.AnonLeft
    - js.Tuple2[
  typingsJapgolly.overlayscrollbars.mod.Position, 
  typingsJapgolly.overlayscrollbars.mod.Position]
    - typingsJapgolly.overlayscrollbars.mod.Position
    - typingsJapgolly.std.HTMLElement
    - typingsJapgolly.overlayscrollbars.mod.JQuery
    - typingsJapgolly.overlayscrollbars.AnonBlock
  */
  type Coordinates = typingsJapgolly.overlayscrollbars.mod._Coordinates | (js.Tuple2[
    typingsJapgolly.overlayscrollbars.mod.Position, 
    typingsJapgolly.overlayscrollbars.mod.Position
  ]) | typingsJapgolly.overlayscrollbars.mod.Position | org.scalajs.dom.raw.HTMLElement
  type DirectionChangedCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsJapgolly.overlayscrollbars.mod.DirectionChangedArgs], 
    scala.Unit
  ]
  type Easing = js.UndefOr[java.lang.String | scala.Null]
  type Extensions = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[js.Object]
  type Margin = scala.Double | scala.Boolean
  type OverflowAmountChangedCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsJapgolly.overlayscrollbars.mod.OverflowAmountChangedArgs], 
    scala.Unit
  ]
  type OverflowChangedCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsJapgolly.overlayscrollbars.mod.OverflowChangedArgs], 
    scala.Unit
  ]
  type Position = scala.Double | java.lang.String
  type ScrollEventCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[org.scalajs.dom.raw.UIEvent], 
    scala.Unit
  ]
  type SizeChangedCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsJapgolly.overlayscrollbars.mod.SizeChangedArgs], 
    scala.Unit
  ]
  type UpdatedCallback = js.ThisFunction1[
    /* this */ typingsJapgolly.overlayscrollbars.mod.OverlayScrollbars, 
    /* args */ js.UndefOr[typingsJapgolly.overlayscrollbars.mod.UpdatedArgs], 
    scala.Unit
  ]
}
