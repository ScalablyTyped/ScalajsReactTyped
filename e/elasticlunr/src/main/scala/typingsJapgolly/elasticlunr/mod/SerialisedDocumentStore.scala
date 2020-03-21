package typingsJapgolly.elasticlunr.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialisedDocumentStore[T] extends js.Object {
  var docInfo: StringDictionary[
    typingsJapgolly.elasticlunr.elasticlunrStrings.SerialisedDocumentStore with js.Any
  ]
  var docs: StringDictionary[T]
}

object SerialisedDocumentStore {
  @scala.inline
  def apply[T](
    docInfo: StringDictionary[
      typingsJapgolly.elasticlunr.elasticlunrStrings.SerialisedDocumentStore with js.Any
    ],
    docs: StringDictionary[T]
  ): SerialisedDocumentStore[T] = {
    val __obj = js.Dynamic.literal(docInfo = docInfo.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerialisedDocumentStore[T]]
  }
}

