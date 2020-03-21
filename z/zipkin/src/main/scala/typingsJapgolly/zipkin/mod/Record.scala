package typingsJapgolly.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var annotation: IAnnotation
  var timestamp: Double
  var traceId: TraceId
}

object Record {
  @scala.inline
  def apply(annotation: IAnnotation, timestamp: Double, traceId: TraceId): Record = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Record]
  }
}

