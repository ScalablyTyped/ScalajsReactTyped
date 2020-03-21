package typingsJapgolly.d3Shape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CurveFactory = /**
    * Returns a curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[
    /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | typingsJapgolly.d3Path.mod.Path_, 
    typingsJapgolly.d3Shape.mod.CurveGenerator
  ]
  type CurveFactoryLineOnly = /**
    * Returns a "lines only" curve generator which renders to the specified context.
    *
    * @param context A rendering context.
    */
  js.Function1[
    /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | typingsJapgolly.d3Path.mod.Path_, 
    typingsJapgolly.d3Shape.mod.CurveGeneratorLineOnly
  ]
  type RadialArea_[Datum] = typingsJapgolly.d3Shape.mod.AreaRadial_[Datum]
  type RadialLine_[Datum] = typingsJapgolly.d3Shape.mod.LineRadial_[Datum]
  type RadialLink[This, LinkDatum, NodeDatum] = typingsJapgolly.d3Shape.mod.LinkRadial_[This, LinkDatum, NodeDatum]
}
