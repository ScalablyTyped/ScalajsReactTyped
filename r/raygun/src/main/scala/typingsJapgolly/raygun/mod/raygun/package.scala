package typingsJapgolly.raygun.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object raygun {
  type GroupingKey = js.Function5[
    /* payload */ typingsJapgolly.raygun.mod.raygun.RaygunPayload, 
    /* exception */ js.Error, 
    /* customData */ typingsJapgolly.raygun.mod.raygun.KeyValueObject, 
    /* request */ typingsJapgolly.raygun.mod.raygun.RaygunRequest, 
    /* tags */ js.Array[java.lang.String], 
    java.lang.String
  ]
  type OnBeforeSend = js.Function5[
    /* payload */ typingsJapgolly.raygun.mod.raygun.RaygunPayload, 
    /* exception */ js.Error, 
    /* customData */ typingsJapgolly.raygun.mod.raygun.KeyValueObject, 
    /* request */ typingsJapgolly.raygun.mod.raygun.RaygunRequest, 
    /* tags */ js.Array[java.lang.String], 
    scala.Boolean | typingsJapgolly.raygun.mod.raygun.RaygunPayload
  ]
}
