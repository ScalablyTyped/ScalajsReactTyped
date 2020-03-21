package typingsJapgolly.elasticApmNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CaptureErrorCallback = js.Function2[/* err */ js.Error | scala.Null, /* id */ java.lang.String, scala.Unit]
  type FilterFn = js.Function1[
    /* payload */ typingsJapgolly.elasticApmNode.mod.Payload, 
    typingsJapgolly.elasticApmNode.mod.Payload | scala.Boolean | scala.Unit
  ]
  type KeyValueConfig = java.lang.String | typingsJapgolly.elasticApmNode.mod.Labels | js.Array[js.Array[typingsJapgolly.elasticApmNode.mod.LabelValue]]
  type LabelValue = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
  type Labels = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.elasticApmNode.mod.LabelValue]
  type PatchHandler = js.Function3[
    /* exports */ js.Any, 
    /* agent */ typingsJapgolly.elasticApmNode.mod.Agent, 
    /* options */ typingsJapgolly.elasticApmNode.mod.PatchOptions, 
    js.Any
  ]
  type Payload = org.scalablytyped.runtime.StringDictionary[js.Any]
}
