package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`13`
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.noop
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationNooperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/nooperation", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NoOperation {
    
    /* CompleteClass */
    override val baseVersion: Double | Null = js.native
    
    /**
      * {@link module:engine/model/batch~Batch Batch} to which the operation is added or `null` if the operation is not
      * added to any batch yet.
      */
    /* CompleteClass */
    var batch: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default | Null = js.native
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    /* CompleteClass */
    @JSName("clone")
    override def clone_MNoOperation(): NoOperation = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MNoOperation(): NoOperation = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Custom toJSON method to solve child-parent circular dependencies.
      */
    /* CompleteClass */
    override def toJSON(): `13` = js.native
    
    /**
      * Operation type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
    /* CompleteClass */
    @JSName("type")
    override val type_NoOperation: noop = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/nooperation", "default.className")
    @js.native
    val className: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.NoOperation = js.native
  }
  
  trait NoOperation
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MNoOperation(): NoOperation
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MNoOperation(): NoOperation
    
    @JSName("type")
    val type_NoOperation: noop
  }
  object NoOperation {
    
    inline def apply(
      clone_ : CallbackTo[NoOperation],
      getReversed: CallbackTo[NoOperation],
      isDocumentOperation: Boolean,
      toJSON: CallbackTo[`13`]
    ): NoOperation = {
      val __obj = js.Dynamic.literal(getReversed = getReversed.toJsFn, isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, baseVersion = null, batch = null)
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("type")("noop")
      __obj.asInstanceOf[NoOperation]
    }
    
    extension [Self <: NoOperation](x: Self) {
      
      inline def setClone_(value: CallbackTo[NoOperation]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setGetReversed(value: CallbackTo[NoOperation]): Self = StObject.set(x, "getReversed", value.toJsFn)
      
      inline def setType(value: noop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
