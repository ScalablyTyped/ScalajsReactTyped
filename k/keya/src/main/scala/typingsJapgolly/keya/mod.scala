package typingsJapgolly.keya

import org.scalajs.dom.raw.IDBObjectStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("keya/out/browser/indexeddb", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait IndexedDBStore
    extends typingsJapgolly.keya.storeMod.default {
    var index: IDBObjectStore = js.native
  }
  
  @js.native
  class default () extends IndexedDBStore
  
  /* static members */
  @js.native
  object default extends js.Object {
    def stores(): js.Promise[js.Array[String]] = js.native
  }
  
}

