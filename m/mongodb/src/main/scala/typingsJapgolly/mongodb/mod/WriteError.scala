package typingsJapgolly.mongodb.mod

import typingsJapgolly.bson.mod.Document
import typingsJapgolly.mongodb.anon.Errmsg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "WriteError")
@js.native
open class WriteError protected () extends StObject {
  def this(err: BulkWriteOperationError) = this()
  
  /** WriteError code. */
  def code: scala.Double = js.native
  
  var err: BulkWriteOperationError = js.native
  
  /** WriteError details. */
  def errInfo: js.UndefOr[Document] = js.native
  
  /** WriteError message. */
  def errmsg: js.UndefOr[String] = js.native
  
  /** Returns the underlying operation that caused the error */
  def getOperation(): Document = js.native
  
  /** WriteError original bulk operation index. */
  def index: scala.Double = js.native
  
  def toJSON(): Errmsg = js.native
}
