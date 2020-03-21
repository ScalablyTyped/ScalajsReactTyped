package typingsJapgolly.zdog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DragEndListener = js.ThisFunction0[/* this */ typingsJapgolly.zdog.mod.Dragger, scala.Unit]
  type DragMoveListener = js.ThisFunction3[
    /* this */ typingsJapgolly.zdog.mod.Dragger, 
    /* pointer */ typingsJapgolly.zdog.mod.PointerPosition, 
    /* moveX */ scala.Double, 
    /* moveY */ scala.Double, 
    scala.Unit
  ]
  type DragStartListener = js.ThisFunction1[
    /* this */ typingsJapgolly.zdog.mod.Dragger, 
    /* pointer */ typingsJapgolly.zdog.mod.PointerPosition, 
    scala.Unit
  ]
  type PrerenderListener = js.ThisFunction1[
    /* this */ typingsJapgolly.zdog.mod.Illustration, 
    /* context */ org.scalajs.dom.raw.CanvasRenderingContext2D | org.scalajs.dom.raw.SVGSVGElement, 
    scala.Unit
  ]
  type ResizeListener = js.ThisFunction2[
    /* this */ typingsJapgolly.zdog.mod.Illustration, 
    /* width */ scala.Double, 
    /* height */ scala.Double, 
    scala.Unit
  ]
}
