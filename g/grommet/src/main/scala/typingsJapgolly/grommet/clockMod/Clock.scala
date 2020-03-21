package typingsJapgolly.grommet.clockMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.std.HTMLDivElement
import typingsJapgolly.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grommet/components/Clock", "Clock")
@js.native
class Clock protected ()
  extends Component[
      ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
      ComponentState, 
      js.Any
    ] {
  def this(props: ClockProps with ((DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]) | SVGProps[org.scalajs.dom.raw.SVGSVGElement])) = this()
  def this(
    props: ClockProps with ((DetailedHTMLProps[
        HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement], 
        org.scalajs.dom.raw.HTMLDivElement
      ]) | SVGProps[org.scalajs.dom.raw.SVGSVGElement]),
    context: js.Any
  ) = this()
}

@JSImport("grommet/components/Clock", "Clock")
@js.native
object Clock extends TopLevel[
      ComponentClass[
        ClockProps with ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
        ComponentState
      ]
    ]

