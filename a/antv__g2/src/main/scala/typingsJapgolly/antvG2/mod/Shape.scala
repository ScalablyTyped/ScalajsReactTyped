package typingsJapgolly.antvG2.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.antvG2.AnonDraw
import typingsJapgolly.antvG2.AnonDrawShape
import typingsJapgolly.antvG2.AnonParsePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shape extends js.Object {
  var getLinearValue: js.UndefOr[js.Function1[/* percent */ js.Any, _]] = js.undefined
  var registerShape: js.UndefOr[
    js.Function3[
      /* chartType */ String, 
      /* shapeName */ String, 
      /* config */ AnonDraw | AnonDrawShape, 
      AnonParsePath
    ]
  ] = js.undefined
}

@JSImport("@antv/g2", "Shape")
@js.native
object Shape extends TopLevel[Shape]

