package typingsJapgolly.yjs

import typingsJapgolly.std.Map
import typingsJapgolly.yjs.anon.Filter
import typingsJapgolly.yjs.distSrcTypesYmapMod.YMap
import typingsJapgolly.yjs.distSrcUtilsDeleteSetMod.DeleteSet
import typingsJapgolly.yjs.distSrcUtilsDocMod.Doc
import typingsJapgolly.yjs.distSrcUtilsIDMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsPermanentUserDataMod {
  
  @JSImport("yjs/dist/src/utils/PermanentUserData", "PermanentUserData")
  @js.native
  open class PermanentUserData protected () extends StObject {
    /**
      * @param {Doc} doc
      * @param {YMap<any>} [storeType]
      */
    def this(doc: Doc) = this()
    def this(doc: Doc, storeType: YMap[Any]) = this()
    
    /**
      * Maps from clientid to userDescription
      *
      * @type {Map<number,string>}
      */
    var clients: Map[Double, String] = js.native
    
    var doc: Doc = js.native
    
    var dss: Map[String, DeleteSet] = js.native
    
    /**
      * @param {number} clientid
      * @return {any}
      */
    def getUserByClientId(clientid: Double): Any = js.native
    
    /**
      * @param {ID} id
      * @return {string | null}
      */
    def getUserByDeletedId(id: ID): String | Null = js.native
    
    /**
      * @param {Doc} doc
      * @param {number} clientid
      * @param {string} userDescription
      * @param {Object} [conf]
      * @param {function(Transaction, DeleteSet):boolean} [conf.filter]
      */
    def setUserMapping(doc: Doc, clientid: Double, userDescription: String): Unit = js.native
    def setUserMapping(doc: Doc, clientid: Double, userDescription: String, hasFilter: Filter): Unit = js.native
    
    var yusers: YMap[Any] = js.native
  }
}
