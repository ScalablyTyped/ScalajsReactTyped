package typingsJapgolly.nivoChord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChordArcMouseHandler = js.Function2[
    /* arc */ typingsJapgolly.nivoChord.mod.ArcData, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  type ChordRibbonMouseHandler = js.Function2[
    /* ribbon */ typingsJapgolly.nivoChord.mod.RibbonData, 
    /* event */ japgolly.scalajs.react.ReactMouseEventFrom[js.Any with org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  type LabelAccessor = js.Function1[/* datum */ typingsJapgolly.nivoChord.OmitArcDatalabel, java.lang.String]
  type ValueFormatter = js.Function1[
    /* datum */ typingsJapgolly.nivoChord.OmitArcDataformattedValue, 
    java.lang.String | scala.Double
  ]
}
