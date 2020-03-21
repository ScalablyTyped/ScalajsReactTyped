package typingsJapgolly.paper

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.paper.paper.Path.Arc
import typingsJapgolly.paper.paper.Path.Circle
import typingsJapgolly.paper.paper.Path.Ellipse
import typingsJapgolly.paper.paper.Path.Line
import typingsJapgolly.paper.paper.Path.RegularPolygon
import typingsJapgolly.paper.paper.Path.Star
import typingsJapgolly.paper.paper.Point
import typingsJapgolly.paper.paper.Rectangle
import typingsJapgolly.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofPath extends js.Object {
  var Arc: Instantiable3[
    /* from */ Point, 
    /* through */ Point, 
    /* to */ Point, 
    typingsJapgolly.paper.paper.Path.Arc
  ]
  var Circle: Instantiable2[/* center */ Point, /* radius */ Double, typingsJapgolly.paper.paper.Path.Circle]
  var Ellipse: Instantiable1[/* rectangle */ Rectangle, typingsJapgolly.paper.paper.Path.Ellipse]
  var Line: Instantiable2[/* from */ Point, /* to */ Point, typingsJapgolly.paper.paper.Path.Line]
  var Rectangle: Instantiable2[
    /* rectangle */ typingsJapgolly.paper.paper.Rectangle, 
    js.UndefOr[/* radius */ Size], 
    typingsJapgolly.paper.paper.Path.Rectangle
  ]
  var RegularPolygon: Instantiable3[
    /* center */ Point, 
    /* sides */ Double, 
    /* radius */ Double, 
    typingsJapgolly.paper.paper.Path.RegularPolygon
  ]
  var Star: Instantiable4[
    /* center */ Point, 
    /* points */ Double, 
    /* radius1 */ Double, 
    /* radius2 */ Double, 
    typingsJapgolly.paper.paper.Path.Star
  ]
}

object TypeofPath {
  @scala.inline
  def apply(
    Arc: Instantiable3[/* from */ Point, /* through */ Point, /* to */ Point, Arc],
    Circle: Instantiable2[/* center */ Point, /* radius */ Double, Circle],
    Ellipse: Instantiable1[/* rectangle */ Rectangle, Ellipse],
    Line: Instantiable2[/* from */ Point, /* to */ Point, Line],
    Rectangle: Instantiable2[
      /* rectangle */ Rectangle, 
      js.UndefOr[/* radius */ Size], 
      typingsJapgolly.paper.paper.Path.Rectangle
    ],
    RegularPolygon: Instantiable3[/* center */ Point, /* sides */ Double, /* radius */ Double, RegularPolygon],
    Star: Instantiable4[
      /* center */ Point, 
      /* points */ Double, 
      /* radius1 */ Double, 
      /* radius2 */ Double, 
      Star
    ]
  ): TypeofPath = {
    val __obj = js.Dynamic.literal(Arc = Arc.asInstanceOf[js.Any], Circle = Circle.asInstanceOf[js.Any], Ellipse = Ellipse.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any], RegularPolygon = RegularPolygon.asInstanceOf[js.Any], Star = Star.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofPath]
  }
}

