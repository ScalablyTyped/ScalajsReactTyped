package typingsJapgolly.reactGridLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ItemCallback = js.Function6[
    /* layout */ js.Array[typingsJapgolly.reactGridLayout.mod.Layout], 
    /* oldItem */ typingsJapgolly.reactGridLayout.mod.Layout, 
    /* newItem */ typingsJapgolly.reactGridLayout.mod.Layout, 
    /* placeholder */ typingsJapgolly.reactGridLayout.mod.Layout, 
    /* event */ org.scalajs.dom.raw.MouseEvent, 
    /* element */ org.scalajs.dom.raw.HTMLElement, 
    scala.Unit
  ]
  type Layouts = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.reactGridLayout.mod.Layout]]
  type ReactGridLayout = japgolly.scalajs.react.raw.React.Component[typingsJapgolly.reactGridLayout.mod.ReactGridLayoutProps with js.Object, js.Object]
}
