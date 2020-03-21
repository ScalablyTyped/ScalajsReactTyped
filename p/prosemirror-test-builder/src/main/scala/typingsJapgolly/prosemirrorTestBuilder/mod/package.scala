package typingsJapgolly.prosemirrorTestBuilder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Args = js.Array[
    java.lang.String | typingsJapgolly.prosemirrorTestBuilder.mod.TaggedProsemirrorNode[js.Any] | typingsJapgolly.prosemirrorTestBuilder.mod.TaggedFlatObject[js.Any]
  ]
  type Builder = js.Function2[
    /* testSchema */ typingsJapgolly.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String], 
    /* names */ typingsJapgolly.std.Record[
      java.lang.String, 
      typingsJapgolly.prosemirrorTestBuilder.mod.NodeTypeAttributes | typingsJapgolly.prosemirrorTestBuilder.mod.MarkTypeAttributes
    ], 
    (typingsJapgolly.std.Record[
      java.lang.String, 
      typingsJapgolly.prosemirrorTestBuilder.mod.NodeBuilderMethod[typingsJapgolly.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String]]
    ]) with (typingsJapgolly.std.Record[
      java.lang.String, 
      typingsJapgolly.prosemirrorTestBuilder.mod.MarkBuilderMethod[typingsJapgolly.prosemirrorModel.mod.Schema[java.lang.String, java.lang.String]]
    ]) with typingsJapgolly.prosemirrorTestBuilder.prosemirrorTestBuilderStrings.Builder with (typingsJapgolly.std.Record[
      java.lang.String, 
      typingsJapgolly.prosemirrorTestBuilder.mod.NodeTypeAttributes | typingsJapgolly.prosemirrorTestBuilder.mod.MarkTypeAttributes
    ])
  ]
  type MarkBuilderMethod[S /* <: typingsJapgolly.prosemirrorModel.mod.Schema[_, _] */] = js.Function1[
    /* args */ typingsJapgolly.prosemirrorTestBuilder.mod.Args, 
    typingsJapgolly.prosemirrorTestBuilder.mod.TaggedFlatObject[S]
  ]
  type NodeBuilderMethod[S /* <: typingsJapgolly.prosemirrorModel.mod.Schema[_, _] */] = js.Function1[
    /* args */ typingsJapgolly.prosemirrorTestBuilder.mod.Args, 
    typingsJapgolly.prosemirrorTestBuilder.mod.TaggedProsemirrorNode[S]
  ]
  type TestSchema = typingsJapgolly.prosemirrorModel.mod.Schema[
    typingsJapgolly.prosemirrorTestBuilder.mod.TestNodesUnion, 
    typingsJapgolly.prosemirrorTestBuilder.mod.TestMarksUnion
  ]
}
