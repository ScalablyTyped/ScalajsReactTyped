package typingsJapgolly.fluentFfmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Codecs = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.fluentFfmpeg.mod.Codec]
  type CodecsCallback = js.Function2[/* err */ js.Error, /* codecs */ typingsJapgolly.fluentFfmpeg.mod.Codecs, scala.Unit]
  type Encoders = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.fluentFfmpeg.mod.Encoder]
  type EncodersCallback = js.Function2[
    /* err */ js.Error, 
    /* encoders */ typingsJapgolly.fluentFfmpeg.mod.Encoders, 
    scala.Unit
  ]
  type Filters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.fluentFfmpeg.mod.Filter]
  type FiltersCallback = js.Function2[
    /* err */ js.Error, 
    /* filters */ typingsJapgolly.fluentFfmpeg.mod.Filters, 
    scala.Unit
  ]
  type Formats = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.fluentFfmpeg.mod.Format]
  type FormatsCallback = js.Function2[
    /* err */ js.Error, 
    /* formats */ typingsJapgolly.fluentFfmpeg.mod.Formats, 
    scala.Unit
  ]
  type GetPreset = js.Function1[/* command */ typingsJapgolly.fluentFfmpeg.mod.FfmpegCommand, java.lang.String]
}
