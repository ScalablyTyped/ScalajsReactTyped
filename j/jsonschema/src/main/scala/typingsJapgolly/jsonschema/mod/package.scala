package typingsJapgolly.jsonschema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomFormat = js.Function1[/* input */ js.Any, scala.Boolean]
  type CustomProperty = js.Function4[
    /* instance */ js.Any, 
    /* schema */ typingsJapgolly.jsonschema.mod.Schema, 
    /* options */ typingsJapgolly.jsonschema.mod.Options, 
    /* ctx */ typingsJapgolly.jsonschema.mod.SchemaContext, 
    java.lang.String | typingsJapgolly.jsonschema.mod.ValidatorResult
  ]
  type RewriteFunction = js.Function4[
    /* instance */ js.Any, 
    /* schema */ typingsJapgolly.jsonschema.mod.Schema, 
    /* options */ typingsJapgolly.jsonschema.mod.Options, 
    /* ctx */ typingsJapgolly.jsonschema.mod.SchemaContext, 
    js.Any
  ]
}
