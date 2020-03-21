package typingsJapgolly.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArangoDB {
  type CollectionType = typingsJapgolly.arangodb.ArangoDB.DocumentCollectionType | typingsJapgolly.arangodb.ArangoDB.EdgeCollectionType
  type Document[T /* <: js.Object */] = typingsJapgolly.arangodb.AnonDictkey with typingsJapgolly.arangodb.arangodbStrings.Document with T with typingsJapgolly.arangodb.ArangoDB.DocumentMetadata
  // Collection
  type DocumentCollectionType = typingsJapgolly.arangodb.arangodbNumbers.`2`
  type DocumentIterator[T /* <: js.Object */] = js.Function2[
    /* document */ typingsJapgolly.arangodb.ArangoDB.Document[T], 
    /* number */ scala.Double, 
    scala.Unit
  ]
  type Edge[T /* <: js.Object */] = typingsJapgolly.arangodb.ArangoDB.Document[T] with typingsJapgolly.arangodb.AnonFrom
  type EdgeCollectionType = typingsJapgolly.arangodb.arangodbNumbers.`3`
  type Patch[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? T[K] | / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias arangodb.ArangoDB.Patch<T[K]> * / object}
    */ typingsJapgolly.arangodb.arangodbStrings.Patch_ with T
  type ViewType = typingsJapgolly.arangodb.arangodbStrings.arangosearch
}
