package typingsJapgolly.yjs

import typingsJapgolly.yjs.distSrcStructsAbstractStructMod.AbstractStruct
import typingsJapgolly.yjs.distSrcUtilsIDMod.ID
import typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore
import typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
import typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV1
import typingsJapgolly.yjs.distSrcUtilsUpdateEncoderMod.UpdateEncoderV2
import typingsJapgolly.yjs.yjsInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStructsGCMod {
  
  @JSImport("yjs/dist/src/structs/GC", "GC")
  @js.native
  open class GC protected () extends AbstractStruct {
    /**
      * @param {ID} id
      * @param {number} length
      */
    def this(id: ID, length: Double) = this()
    
    def delete(): Unit = js.native
    
    /**
      * @param {Transaction} transaction
      * @param {StructStore} store
      * @return {null | number}
      */
    def getMissing(transaction: Transaction, store: StructStore): Null | Double = js.native
    
    /**
      * @param {GC} right
      * @return {boolean}
      */
    def mergeWith(right: GC): Boolean = js.native
    
    /**
      * @param {UpdateEncoderV1 | UpdateEncoderV2} encoder
      * @param {number} offset
      */
    def write(encoder: UpdateEncoderV1, offset: Double): Unit = js.native
    def write(encoder: UpdateEncoderV2, offset: Double): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/structs/GC", "structGCRefNumber")
  @js.native
  val structGCRefNumber: `0` = js.native
}
