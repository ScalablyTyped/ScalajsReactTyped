package typingsJapgolly.minappEnv.DB

import typingsJapgolly.minappEnv.OQ
import typingsJapgolly.minappEnv.Promise
import typingsJapgolly.minappEnv.anon.RQIGetDocumentOptions
import typingsJapgolly.minappEnv.anon.RQIRemoveSingleDocumentOp
import typingsJapgolly.minappEnv.anon.RQISetSingleDocumentOptio
import typingsJapgolly.minappEnv.anon.RQIUpdateSingleDocumentOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentReference extends StObject {
  
  def field(`object`: js.Object): this.type = js.native
  
  // get(options?: IGetDocumentOptions): Promise<IQuerySingleResult> | void
  // set(options?: ISetSingleDocumentOptions): Promise<ISetResult> | void
  // update(options?: IUpdateSingleDocumentOptions): Promise<IUpdateResult> | void
  // remove(options?: IRemoveSingleDocumentOptions): Promise<IRemoveResult> | void
  // get(options?: IGetDocumentOptions): Promise<IQuerySingleResult> | void
  def get(): Promise[IQuerySingleResult] = js.native
  def get(options: OQ[IGetDocumentOptions]): Unit = js.native
  def get(options: RQIGetDocumentOptions): Promise[IQuerySingleResult] = js.native
  
  // remove(options?: IRemoveSingleDocumentOptions): Promise<IRemoveResult> | void
  def remove(): Promise[IRemoveResult] = js.native
  def remove(options: OQ[IRemoveSingleDocumentOptions]): Unit = js.native
  def remove(options: RQIRemoveSingleDocumentOp): Promise[IRemoveResult] = js.native
  
  // set(options?: ISetSingleDocumentOptions): Promise<ISetResult> | void
  def set(): Promise[ISetResult] = js.native
  def set(options: OQ[ISetSingleDocumentOptions]): Unit = js.native
  def set(options: RQISetSingleDocumentOptio): Promise[ISetResult] = js.native
  
  // update(options?: IUpdateSingleDocumentOptions): Promise<IUpdateResult> | void
  def update(): Promise[IUpdateResult] = js.native
  def update(options: OQ[IUpdateSingleDocumentOptions]): Unit = js.native
  def update(options: RQIUpdateSingleDocumentOp): Promise[IUpdateResult] = js.native
}
