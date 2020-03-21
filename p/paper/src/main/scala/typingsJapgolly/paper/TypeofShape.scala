package typingsJapgolly.paper

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.paper.paper.Point
import typingsJapgolly.paper.paper.Rectangle
import typingsJapgolly.paper.paper.Shape.Circle
import typingsJapgolly.paper.paper.Shape.Ellipse
import typingsJapgolly.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofShape extends js.Object {
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsJapgolly.paper.paper.Shape.Circle]
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsJapgolly.paper.paper.Shape.Ellipse]
  var Rectangle: Instantiable2[
    /* rectangle */ typingsJapgolly.paper.paper.Rectangle, 
    js.UndefOr[/* radius */ Size], 
    typingsJapgolly.paper.paper.Shape.Rectangle
  ]
}

object TypeofShape {
  @scala.inline
  def apply(
    Circle: Instantiable2[/* center */ Point, /* radius */ Double, Circle],
    Ellipse: Instantiable1[/* rectangle */ Rectangle, Ellipse],
    Rectangle: Instantiable2[
      /* rectangle */ Rectangle, 
      js.UndefOr[/* radius */ Size], 
      typingsJapgolly.paper.paper.Shape.Rectangle
    ]
  ): TypeofShape = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofShape]
  }
}

