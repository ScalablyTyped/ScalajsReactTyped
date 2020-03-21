package typingsJapgolly.libxslt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalTypesMod {
  type ApplyCallback = js.Function2[
    /* err */ js.Error, 
    /* result */ typingsJapgolly.libxslt.internalTypesMod.ApplyResult, 
    scala.Unit
  ]
  type ApplyDocumentCallback = js.Function2[/* err */ js.Error, /* result */ typingsJapgolly.libxmljs.mod.Document, scala.Unit]
  type ApplyResult = java.lang.String | typingsJapgolly.libxmljs.mod.Document
  type ApplyStringCallback = js.Function2[/* err */ js.Error, /* result */ java.lang.String, scala.Unit]
  type ParseCallback = js.Function2[
    /* err */ js.Error, 
    /* stylesheet */ typingsJapgolly.libxslt.mod.Stylesheet, 
    scala.Unit
  ]
}
