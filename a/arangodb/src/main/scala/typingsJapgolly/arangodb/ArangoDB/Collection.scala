package typingsJapgolly.arangodb.ArangoDB

import typingsJapgolly.arangodb.anon.IsSystem
import typingsJapgolly.arangodb.anon.Limit
import typingsJapgolly.arangodb.arangodbBooleans.`false`
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collection[T /* <: js.Object */] extends StObject {
  
  // Document
  def all(): Cursor[Document[T]] = js.native
  
  def any(): Document[T] = js.native
  
  def byExample(example: Partial[Document[T]]): Cursor[Document[T]] = js.native
  
  def checksum(): CollectionChecksum = js.native
  def checksum(withRevisions: Boolean): CollectionChecksum = js.native
  def checksum(withRevisions: Boolean, withData: Boolean): CollectionChecksum = js.native
  def checksum(withRevisions: Unit, withData: Boolean): CollectionChecksum = js.native
  
  def count(): Double = js.native
  
  def document(selector: String): Document[T] = js.native
  def document(selectors: js.Array[String | DocumentLike]): js.Array[Document[T]] = js.native
  def document(selector: DocumentLike): Document[T] = js.native
  
  def documentId(documentKey: String): String = js.native
  
  def drop(): Unit = js.native
  def drop(options: IsSystem): Unit = js.native
  
  // Indexes
  def dropIndex(index: String): Boolean = js.native
  def dropIndex(index: IndexLike): Boolean = js.native
  
  def edges(vertex: String): js.Array[Edge[T]] = js.native
  def edges(vertex: js.Array[String | ObjectWithId]): js.Array[Edge[T]] = js.native
  def edges(vertex: ObjectWithId): js.Array[Edge[T]] = js.native
  
  def ensureIndex(description: IndexDescription[T]): Index[T] = js.native
  
  def exists(name: String): DocumentMetadata | `false` = js.native
  
  def figures(): CollectionFigures = js.native
  
  def firstExample(example: Partial[Document[T]]): Document[T] | Null = js.native
  
  def getIndexes(): js.Array[Index[T]] = js.native
  
  def getResponsibleShard(document: DocumentLike): String = js.native
  
  def inEdges(vertex: String): js.Array[Edge[T]] = js.native
  def inEdges(vertex: js.Array[String | ObjectWithId]): js.Array[Edge[T]] = js.native
  def inEdges(vertex: ObjectWithId): js.Array[Edge[T]] = js.native
  
  def index(index: String): Index[T] | Null = js.native
  def index(index: IndexLike): Index[T] | Null = js.native
  
  def insert(array: js.Array[DocumentData[T]]): js.Array[InsertResult[T]] = js.native
  def insert(array: js.Array[DocumentData[T]], options: InsertOptions): js.Array[InsertResult[T]] = js.native
  def insert(data: DocumentData[T]): InsertResult[T] = js.native
  def insert(data: DocumentData[T], options: InsertOptions): InsertResult[T] = js.native
  def insert(from: String, to: String, data: DocumentData[T]): InsertResult[T] = js.native
  def insert(from: String, to: String, data: DocumentData[T], options: InsertOptions): InsertResult[T] = js.native
  
  def iterate(iterator: DocumentIterator[T]): Unit = js.native
  def iterate(iterator: DocumentIterator[T], options: IterateOptions): Unit = js.native
  
  def load(): Unit = js.native
  
  // Collection
  def name(): String = js.native
  
  def outEdges(vertex: String): js.Array[Edge[T]] = js.native
  def outEdges(vertex: js.Array[String | ObjectWithId]): js.Array[Edge[T]] = js.native
  def outEdges(vertex: ObjectWithId): js.Array[Edge[T]] = js.native
  
  def path(): String = js.native
  
  def properties(): CollectionProperties = js.native
  def properties(properties: CollectionPropertiesOptions): CollectionProperties = js.native
  
  def remove(selector: String): RemoveResult[Any] = js.native
  def remove(selector: String, options: RemoveOptions): RemoveResult[Any] = js.native
  def remove(selectors: js.Array[String | DocumentLike]): js.Array[RemoveResult[Any]] = js.native
  def remove(selectors: js.Array[String | DocumentLike], options: RemoveOptions): js.Array[RemoveResult[Any]] = js.native
  def remove(selector: DocumentLike): RemoveResult[Any] = js.native
  def remove(selector: DocumentLike, options: RemoveOptions): RemoveResult[Any] = js.native
  
  def removeByExample(example: Partial[Document[T]]): Double = js.native
  def removeByExample(example: Partial[Document[T]], options: RemoveByExampleOptions): Double = js.native
  def removeByExample(example: Partial[Document[T]], waitForSync: Boolean): Double = js.native
  def removeByExample(example: Partial[Document[T]], waitForSync: Boolean, limit: Double): Double = js.native
  def removeByExample(example: Partial[Document[T]], waitForSync: Unit, limit: Double): Double = js.native
  
  def rename(newName: String): Unit = js.native
  
  def replace(selector: String, data: DocumentData[T]): UpdateResult[T] = js.native
  def replace(selector: String, data: DocumentData[T], options: ReplaceOptions): UpdateResult[T] = js.native
  def replace(selectors: js.Array[String | DocumentLike], data: js.Array[DocumentData[T]]): js.Array[UpdateResult[T]] = js.native
  def replace(
    selectors: js.Array[String | DocumentLike],
    data: js.Array[DocumentData[T]],
    options: ReplaceOptions
  ): js.Array[UpdateResult[T]] = js.native
  def replace(selector: DocumentLike, data: DocumentData[T]): UpdateResult[T] = js.native
  def replace(selector: DocumentLike, data: DocumentData[T], options: ReplaceOptions): UpdateResult[T] = js.native
  
  def replaceByExample(example: Partial[Document[T]], newValue: DocumentData[T]): Double = js.native
  def replaceByExample(example: Partial[Document[T]], newValue: DocumentData[T], options: Limit): Double = js.native
  def replaceByExample(example: Partial[Document[T]], newValue: DocumentData[T], waitForSync: Boolean): Double = js.native
  def replaceByExample(example: Partial[Document[T]], newValue: DocumentData[T], waitForSync: Boolean, limit: Double): Double = js.native
  def replaceByExample(example: Partial[Document[T]], newValue: DocumentData[T], waitForSync: Unit, limit: Double): Double = js.native
  
  def revision(): String = js.native
  
  def rotate(): Unit = js.native
  
  def save(array: js.Array[DocumentData[T]]): js.Array[InsertResult[T]] = js.native
  def save(array: js.Array[DocumentData[T]], options: InsertOptions): js.Array[InsertResult[T]] = js.native
  def save(data: DocumentData[T]): InsertResult[T] = js.native
  def save(data: DocumentData[T], options: InsertOptions): InsertResult[T] = js.native
  def save(from: String, to: String, data: DocumentData[T]): InsertResult[T] = js.native
  def save(from: String, to: String, data: DocumentData[T], options: InsertOptions): InsertResult[T] = js.native
  
  def toArray(): js.Array[Document[T]] = js.native
  
  def truncate(): Unit = js.native
  
  def `type`(): CollectionType = js.native
  
  def unload(): Unit = js.native
  
  def update(selector: String, data: Patch[Document[T]]): UpdateResult[T] = js.native
  def update(selector: String, data: Patch[Document[T]], options: UpdateOptions): UpdateResult[T] = js.native
  def update(selectors: js.Array[String | DocumentLike], data: js.Array[Patch[Document[T]]]): js.Array[UpdateResult[T]] = js.native
  def update(
    selectors: js.Array[String | DocumentLike],
    data: js.Array[Patch[Document[T]]],
    options: UpdateOptions
  ): js.Array[UpdateResult[T]] = js.native
  def update(selector: DocumentLike, data: Patch[Document[T]]): UpdateResult[T] = js.native
  def update(selector: DocumentLike, data: Patch[Document[T]], options: UpdateOptions): UpdateResult[T] = js.native
  
  def updateByExample(example: Partial[Document[T]], newValue: Patch[Document[T]]): Double = js.native
  def updateByExample(example: Partial[Document[T]], newValue: Patch[Document[T]], keepNull: Boolean): Double = js.native
  def updateByExample(
    example: Partial[Document[T]],
    newValue: Patch[Document[T]],
    keepNull: Boolean,
    waitForSync: Boolean
  ): Double = js.native
  def updateByExample(
    example: Partial[Document[T]],
    newValue: Patch[Document[T]],
    keepNull: Boolean,
    waitForSync: Boolean,
    limit: Double
  ): Double = js.native
  def updateByExample(
    example: Partial[Document[T]],
    newValue: Patch[Document[T]],
    keepNull: Boolean,
    waitForSync: Unit,
    limit: Double
  ): Double = js.native
  def updateByExample(example: Partial[Document[T]], newValue: Patch[Document[T]], keepNull: Unit, waitForSync: Boolean): Double = js.native
  def updateByExample(
    example: Partial[Document[T]],
    newValue: Patch[Document[T]],
    keepNull: Unit,
    waitForSync: Boolean,
    limit: Double
  ): Double = js.native
  def updateByExample(
    example: Partial[Document[T]],
    newValue: Patch[Document[T]],
    keepNull: Unit,
    waitForSync: Unit,
    limit: Double
  ): Double = js.native
  def updateByExample(example: Partial[Document[T]], newValue: Patch[Document[T]], options: UpdateByExampleOptions): Double = js.native
}
