package typingsJapgolly.jsoneditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AutoCompleteCompletion = scala.Null | js.Array[java.lang.String] | typingsJapgolly.jsoneditor.AnonOptions
  type AutoCompleteOptionsGetter = js.Function4[
    /* text */ java.lang.String, 
    /* path */ typingsJapgolly.jsoneditor.mod.JSONPath, 
    /* input */ java.lang.String, 
    /* editor */ typingsJapgolly.jsoneditor.mod.JSONEditor, 
    typingsJapgolly.jsoneditor.mod.AutoCompleteCompletion | js.Promise[typingsJapgolly.jsoneditor.mod.AutoCompleteCompletion]
  ]
  type JSONPath = js.Array[java.lang.String | scala.Double]
}
