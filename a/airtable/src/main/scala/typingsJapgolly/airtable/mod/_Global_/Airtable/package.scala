package typingsJapgolly.airtable.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Airtable {
  type Base = js.Function1[
    /* tableName */ java.lang.String, 
    typingsJapgolly.airtable.mod._Global_.Airtable.Table[js.Object]
  ]
  type FieldSet = org.scalablytyped.runtime.StringDictionary[
    js.UndefOr[
      java.lang.String | scala.Double | scala.Boolean | typingsJapgolly.airtable.mod._Global_.Airtable.Collaborator | (js.Array[
        typingsJapgolly.airtable.mod._Global_.Airtable.Attachment | typingsJapgolly.airtable.mod._Global_.Airtable.Collaborator | java.lang.String
      ])
    ]
  ]
  type Records[TFields] = js.Array[typingsJapgolly.airtable.mod._Global_.Airtable.Record[TFields]]
}
