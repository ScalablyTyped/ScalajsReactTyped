package typingsJapgolly.reactEmailEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventCallback = js.Function1[/* data */ js.Object, scala.Unit]
  type ExportHtmlCallback = js.Function1[/* data */ typingsJapgolly.reactEmailEditor.mod.HtmlExport, scala.Unit]
  type FileUploadCallback = js.Function2[
    /* file */ typingsJapgolly.reactEmailEditor.mod.FileInfo, 
    /* done */ typingsJapgolly.reactEmailEditor.mod.FileUploadDoneCallback, 
    scala.Unit
  ]
  type FileUploadDoneCallback = js.Function1[/* data */ typingsJapgolly.reactEmailEditor.mod.FileUploadDoneData, scala.Unit]
  type SaveDesignCallback = js.Function1[/* data */ typingsJapgolly.reactEmailEditor.mod.Design, scala.Unit]
  type StringList = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type ToolsConfig = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.reactEmailEditor.mod.ToolConfig]
}
