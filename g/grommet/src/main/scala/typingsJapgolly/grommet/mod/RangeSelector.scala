package typingsJapgolly.grommet.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.grommet.grommetStrings.color
import typingsJapgolly.grommet.rangeSelectorMod.RangeSelectorProps
import typingsJapgolly.grommet.utilsMod.Omit
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet", "RangeSelector")
@js.native
class RangeSelector protected ()
  extends Component[
      RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: RangeSelectorProps with (Omit[
        DetailedHTMLProps[
          HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
          org.scalajs.dom.raw.HTMLDivElement
        ], 
        color
      ])) = this()
  def this(
    props: RangeSelectorProps with (Omit[
        DetailedHTMLProps[
          HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
          org.scalajs.dom.raw.HTMLDivElement
        ], 
        color
      ]),
    context: js.Any
  ) = this()
}

@JSImport("grommet", "RangeSelector")
@js.native
object RangeSelector extends TopLevel[
      ComponentClass[
        RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
        ComponentState
      ]
    ]

