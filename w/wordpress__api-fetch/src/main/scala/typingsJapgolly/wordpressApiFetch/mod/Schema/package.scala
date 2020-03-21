package typingsJapgolly.wordpressApiFetch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Schema {
  // prettier-ignore
  type Block[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */] = typingsJapgolly.wordpressApiFetch.mod.Schema.BaseBlock[T] | (typingsJapgolly.std.Pick[
    typingsJapgolly.wordpressApiFetch.mod.Schema.BaseBlock[T], 
    typingsJapgolly.wordpressApiFetch.mod.Schema.ViewKeys.Block | typingsJapgolly.wordpressApiFetch.mod.Schema.EmbedKeys.Block
  ])
  // prettier-ignore
  type Comment[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */] = typingsJapgolly.wordpressApiFetch.mod.Schema.BaseComment[T] | (typingsJapgolly.std.Pick[
    typingsJapgolly.wordpressApiFetch.mod.Schema.BaseComment[T], 
    typingsJapgolly.wordpressApiFetch.mod.Schema.ViewKeys.Comment | typingsJapgolly.wordpressApiFetch.mod.Schema.EmbedKeys.Comment
  ])
  type Contextual[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */, TAdditional, TEditAdditional] = (typingsJapgolly.wordpressApiFetch.AnonRendered with TAdditional) | (typingsJapgolly.wordpressApiFetch.AnonRaw with TAdditional with TEditAdditional)
  type Decontextualize[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: T[k] extends / * Inlined @wordpress/api-fetch.@wordpress/api-fetch.Schema.Contextual<any, {}, {}> * /
  {  rendered  :string}? string : T[k]}
    */ typingsJapgolly.wordpressApiFetch.wordpressApiFetchStrings.Decontextualize with js.Any
  // prettier-ignore
  type Media[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */] = typingsJapgolly.wordpressApiFetch.mod.Schema.BaseMedia[T] | (typingsJapgolly.std.Pick[
    typingsJapgolly.wordpressApiFetch.mod.Schema.BaseMedia[T], 
    typingsJapgolly.wordpressApiFetch.mod.Schema.ViewKeys.Media | typingsJapgolly.wordpressApiFetch.mod.Schema.EmbedKeys.Media
  ])
  // prettier-ignore
  type Post[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */] = typingsJapgolly.wordpressApiFetch.mod.Schema.BasePost[T] | (typingsJapgolly.std.Pick[
    typingsJapgolly.wordpressApiFetch.mod.Schema.BasePost[T], 
    typingsJapgolly.wordpressApiFetch.mod.Schema.ViewKeys.Post | typingsJapgolly.wordpressApiFetch.mod.Schema.EmbedKeys.Post
  ])
  // prettier-ignore
  type PostRevision[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */] = typingsJapgolly.wordpressApiFetch.mod.Schema.BasePostRevision[T] | (typingsJapgolly.std.Pick[
    typingsJapgolly.wordpressApiFetch.mod.Schema.BasePostRevision[T], 
    typingsJapgolly.wordpressApiFetch.mod.Schema.ViewKeys.PostRevision | typingsJapgolly.wordpressApiFetch.mod.Schema.EmbedKeys.PostRevision
  ])
  // prettier-ignore
  type Taxonomy[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */] = typingsJapgolly.wordpressApiFetch.mod.Schema.BaseTaxonomy[T] | (typingsJapgolly.std.Pick[
    typingsJapgolly.wordpressApiFetch.mod.Schema.BaseTaxonomy[T], 
    typingsJapgolly.wordpressApiFetch.mod.Schema.ViewKeys.Taxonomy | typingsJapgolly.wordpressApiFetch.mod.Schema.EmbedKeys.Taxonomy
  ])
  // prettier-ignore
  type Type[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */] = typingsJapgolly.wordpressApiFetch.mod.Schema.BaseType[T] | (typingsJapgolly.std.Pick[
    typingsJapgolly.wordpressApiFetch.mod.Schema.BaseType[T], 
    typingsJapgolly.wordpressApiFetch.mod.Schema.ViewKeys.Type | typingsJapgolly.wordpressApiFetch.mod.Schema.EmbedKeys.Type
  ])
  // prettier-ignore
  type User[T /* <: typingsJapgolly.wordpressApiFetch.mod.Schema.Context */] = typingsJapgolly.wordpressApiFetch.mod.Schema.BaseUser[T] | (typingsJapgolly.std.Pick[
    typingsJapgolly.wordpressApiFetch.mod.Schema.BaseUser[T], 
    typingsJapgolly.wordpressApiFetch.mod.Schema.ViewKeys.User | typingsJapgolly.wordpressApiFetch.mod.Schema.EmbedKeys.User
  ])
}
