package typingsJapgolly.reactSketchapp.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrappedSketchLayer extends js.Object {
  var sketchObject: SketchLayer
}

object WrappedSketchLayer {
  @scala.inline
  def apply(sketchObject: SketchLayer): WrappedSketchLayer = {
    val __obj = js.Dynamic.literal(sketchObject = sketchObject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WrappedSketchLayer]
  }
}

