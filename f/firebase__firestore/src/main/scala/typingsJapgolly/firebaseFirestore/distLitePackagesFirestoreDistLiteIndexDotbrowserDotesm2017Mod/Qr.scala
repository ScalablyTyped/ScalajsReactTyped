package typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreDistLiteIndexDotbrowserDotesm2017Mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright 2020 Google LLC
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *   http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
/**
  * A write batch, used to perform multiple writes as a single atomic unit.
  *
  * A `WriteBatch` object can be acquired by calling {@link writeBatch}. It
  * provides methods for adding writes to the write batch. None of the writes
  * will be committed (or visible locally) until {@link WriteBatch.commit} is
  * called.
  */ trait Qr extends StObject {
  
  var _commitHandler: Any
  
  var _committed: Boolean
  
  var _dataReader: Cn
  
  var _firestore: Any
  
  var _mutations: js.Array[Any]
  
  def _verifyNotCommitted(): Unit
  
  /**
    * Commits all of the writes in this write batch as a single atomic unit.
    *
    * The result of these writes will only be reflected in document reads that
    * occur after the returned promise resolves. If the client is offline, the
    * write fails. If you would like to see local modifications or buffer writes
    * until the client is online, use the full Firestore SDK.
    *
    * @returns A `Promise` resolved once all of the writes in the batch have been
    * successfully written to the backend as an atomic unit (note that it won't
    * resolve while you're offline).
    */ def commit(): Any
  
  /**
    * Deletes the document referred to by the provided {@link DocumentReference}.
    *
    * @param documentRef - A reference to the document to be deleted.
    * @returns This `WriteBatch` instance. Used for chaining method calls.
    */ def delete(t: Any): Qr
  
  def set(t: Any, e: Any, n: Any): Qr
  
  def update(t: Any, e: Any, n: Any, r: Any*): Qr
}
object Qr {
  
  inline def apply(
    _commitHandler: Any,
    _committed: Boolean,
    _dataReader: Cn,
    _firestore: Any,
    _mutations: js.Array[Any],
    _verifyNotCommitted: Callback,
    commit: CallbackTo[Any],
    delete: Any => Qr,
    set: (Any, Any, Any) => Qr,
    update: (Any, Any, Any, /* repeated */ Any) => Qr
  ): Qr = {
    val __obj = js.Dynamic.literal(_commitHandler = _commitHandler.asInstanceOf[js.Any], _committed = _committed.asInstanceOf[js.Any], _dataReader = _dataReader.asInstanceOf[js.Any], _firestore = _firestore.asInstanceOf[js.Any], _mutations = _mutations.asInstanceOf[js.Any], _verifyNotCommitted = _verifyNotCommitted.toJsFn, commit = commit.toJsFn, delete = js.Any.fromFunction1(delete), set = js.Any.fromFunction3(set), update = js.Any.fromFunction4(update))
    __obj.asInstanceOf[Qr]
  }
  
  extension [Self <: Qr](x: Self) {
    
    inline def setCommit(value: CallbackTo[Any]): Self = StObject.set(x, "commit", value.toJsFn)
    
    inline def setDelete(value: Any => Qr): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setSet(value: (Any, Any, Any) => Qr): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (Any, Any, Any, /* repeated */ Any) => Qr): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
    
    inline def set_commitHandler(value: Any): Self = StObject.set(x, "_commitHandler", value.asInstanceOf[js.Any])
    
    inline def set_committed(value: Boolean): Self = StObject.set(x, "_committed", value.asInstanceOf[js.Any])
    
    inline def set_dataReader(value: Cn): Self = StObject.set(x, "_dataReader", value.asInstanceOf[js.Any])
    
    inline def set_firestore(value: Any): Self = StObject.set(x, "_firestore", value.asInstanceOf[js.Any])
    
    inline def set_mutations(value: js.Array[Any]): Self = StObject.set(x, "_mutations", value.asInstanceOf[js.Any])
    
    inline def set_mutationsVarargs(value: Any*): Self = StObject.set(x, "_mutations", js.Array(value*))
    
    inline def set_verifyNotCommitted(value: Callback): Self = StObject.set(x, "_verifyNotCommitted", value.toJsFn)
  }
}
