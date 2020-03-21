package typingsJapgolly.bookshelf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventFunction[T] = js.Function3[
    /* model */ T, 
    /* attrs */ js.Any, 
    /* options */ js.Any, 
    typingsJapgolly.bluebird.mod.^[js.Any] | scala.Unit
  ]
  type FetchAllOptions = typingsJapgolly.bookshelf.mod.FetchOptions
  type WithRelatedQuery = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* query */ typingsJapgolly.knex.mod.QueryBuilder[js.Any, js.Array[typingsJapgolly.knex.mod.SafePartial[js.Any]]], 
      typingsJapgolly.knex.mod.QueryBuilder[js.Any, js.Array[typingsJapgolly.knex.mod.SafePartial[js.Any]]]
    ]
  ]
}
