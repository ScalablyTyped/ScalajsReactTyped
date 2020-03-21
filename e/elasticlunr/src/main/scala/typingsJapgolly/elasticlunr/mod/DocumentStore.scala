package typingsJapgolly.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticlunr", "DocumentStore")
@js.native
class DocumentStore[T] () extends js.Object {
  def this(save: Boolean) = this()
  def addDoc(docRef: DocumentReference, doc: T): Unit = js.native
  def addFieldLength(docRef: DocumentReference, fieldName: String, length: Double): Unit = js.native
  def getDoc(docRef: DocumentReference): T = js.native
  def getFieldLength(docRef: DocumentReference, fieldName: String): Double = js.native
  def hasDoc(docRef: DocumentReference): Boolean = js.native
  def isDocStored(): Boolean = js.native
  def removeDoc(docRef: DocumentReference): Unit = js.native
  def toJSON(): SerialisedDocumentStore[T] = js.native
  def updateFieldLength(docRef: DocumentReference, fieldName: String, length: Double): Unit = js.native
}

/* static members */
@JSImport("elasticlunr", "DocumentStore")
@js.native
object DocumentStore extends js.Object {
  def load[T](serialisedData: SerialisedDocumentStore[T]): DocumentStore[T] = js.native
}

