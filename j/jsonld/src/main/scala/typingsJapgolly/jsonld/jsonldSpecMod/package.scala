package typingsJapgolly.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonldSpecMod {
  type Context = typingsJapgolly.jsonld.jsonldSpecMod.Document
  type DOMString = java.lang.String
  type Document = typingsJapgolly.jsonld.jsonldSpecMod.JsonLd | typingsJapgolly.jsonld.jsonldSpecMod.Url
  type Frame = typingsJapgolly.jsonld.jsonldSpecMod.JsonLdObj | typingsJapgolly.jsonld.jsonldSpecMod.Url
  type Iri = typingsJapgolly.jsonld.jsonldSpecMod.Url
  type JsonLd = typingsJapgolly.jsonld.jsonldSpecMod.JsonLdObj | typingsJapgolly.jsonld.jsonldSpecMod.JsonLdArray
  type JsonLdArray = js.Array[typingsJapgolly.jsonld.jsonldSpecMod.JsonLdObj]
  type JsonLdObj = js.Object
  type LoadDocumentCallback = js.Function1[
    /* url */ typingsJapgolly.jsonld.jsonldSpecMod.Url, 
    js.Promise[typingsJapgolly.jsonld.jsonldSpecMod.RemoteDocument]
  ]
  type Url = typingsJapgolly.jsonld.jsonldSpecMod.DOMString
}
