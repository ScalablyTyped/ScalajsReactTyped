package typingsJapgolly.sigmajs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sigmajs.SigmaJs.Edge
import typingsJapgolly.sigmajs.SigmaJs.SVGEdgeLabels
import typingsJapgolly.sigmajs.SigmaJs.SVGObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictrenderType extends /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] {
  var labels: SVGEdgeLabels
}

object AnonDictrenderType {
  @scala.inline
  def apply(
    labels: SVGEdgeLabels,
    StringDictionary: /* renderType */ StringDictionary[SVGObject[Edge] | SVGEdgeLabels] = null
  ): AnonDictrenderType = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictrenderType]
  }
}

