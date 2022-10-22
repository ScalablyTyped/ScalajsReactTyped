package typingsJapgolly.sharedb.mod

import typingsJapgolly.sharedb.anon.Results
import typingsJapgolly.sharedb.libSharedbMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use the `Connection` type from 'sharedb/lib/client' instead, as that's where it
  *   lives in the actual source code.
  */
@JSImport("sharedb", "Connection")
@js.native
open class Connection protected () extends StObject {
  def this(socket: Socket) = this()
  
  def createFetchQuery(
    collectionName: String,
    query: String,
    options: Results,
    callback: js.Function2[/* err */ Error, /* results */ Any, Any]
  ): typingsJapgolly.sharedb.libSharedbMod.Query[Any] = js.native
  
  def createSubscribeQuery(
    collectionName: String,
    query: String,
    options: Results,
    callback: js.Function2[/* err */ Error, /* results */ Any, Any]
  ): typingsJapgolly.sharedb.libSharedbMod.Query[Any] = js.native
  
  def get(collectionName: String, documentID: String): typingsJapgolly.sharedb.libSharedbMod.Doc[Any] = js.native
}
