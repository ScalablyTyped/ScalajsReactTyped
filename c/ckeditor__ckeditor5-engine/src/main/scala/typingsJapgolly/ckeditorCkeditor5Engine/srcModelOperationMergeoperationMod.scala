package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditorCkeditor5Engine.anon.GraveyardPosition
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`13`
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.merge
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationMergeoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/mergeoperation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MergeOperation {
    /**
      * Creates a merge operation.
      */
    def this(
      sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      howMany: Double,
      targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      graveyardPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ) = this()
    def this(
      sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      howMany: Double,
      targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      graveyardPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      baseVersion: Double
    ) = this()
    
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
    override def clone_MMergeOperation(): MergeOperation = js.native
    
    /**
      * Position before the merged element (which will be deleted).
      */
    /* CompleteClass */
    override val deletionPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MMergeOperation(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default = js.native
    
    /**
      * Position in graveyard to which the merged element will be moved.
      */
    /* CompleteClass */
    override val graveyardPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * Summary offset size of nodes which will be moved from the merged element to the new parent.
      */
    /* CompleteClass */
    override val howMany: Double = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Artificial range that contains all the nodes from the merged element that will be moved to {@link ~MergeOperation#sourcePosition}.
      * The range starts at {@link ~MergeOperation#sourcePosition} and ends in the same parent, at `POSITIVE_INFINITY` offset.
      */
    /* CompleteClass */
    override val movedRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    /**
      * Position inside the merged element. All nodes from that element after that position will be moved to {@link ~#targetPosition}.
      */
    /* CompleteClass */
    var sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * Position which the nodes from the merged elements will be moved to.
      */
    /* CompleteClass */
    var targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
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
    override val type_MergeOperation: merge = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/mergeoperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/mergeoperation", "default.className")
    @js.native
    val className: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.MergeOperation = js.native
    
    /**
      * Creates `MergeOperation` object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(
      json: GraveyardPosition,
      document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default
    ): MergeOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[MergeOperation]
  }
  
  trait MergeOperation
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MMergeOperation(): MergeOperation
    
    /**
      * Position before the merged element (which will be deleted).
      */
    val deletionPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MMergeOperation(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default
    
    /**
      * Position in graveyard to which the merged element will be moved.
      */
    val graveyardPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    /**
      * Summary offset size of nodes which will be moved from the merged element to the new parent.
      */
    val howMany: Double
    
    /**
      * Artificial range that contains all the nodes from the merged element that will be moved to {@link ~MergeOperation#sourcePosition}.
      * The range starts at {@link ~MergeOperation#sourcePosition} and ends in the same parent, at `POSITIVE_INFINITY` offset.
      */
    val movedRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
    
    /**
      * Position inside the merged element. All nodes from that element after that position will be moved to {@link ~#targetPosition}.
      */
    var sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    /**
      * Position which the nodes from the merged elements will be moved to.
      */
    var targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    @JSName("type")
    val type_MergeOperation: merge
  }
  object MergeOperation {
    
    inline def apply(
      clone_ : CallbackTo[MergeOperation],
      deletionPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      getReversed: CallbackTo[
          typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default
        ],
      graveyardPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      howMany: Double,
      isDocumentOperation: Boolean,
      movedRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      toJSON: CallbackTo[`13`]
    ): MergeOperation = {
      val __obj = js.Dynamic.literal(deletionPosition = deletionPosition.asInstanceOf[js.Any], getReversed = getReversed.toJsFn, graveyardPosition = graveyardPosition.asInstanceOf[js.Any], howMany = howMany.asInstanceOf[js.Any], isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], movedRange = movedRange.asInstanceOf[js.Any], sourcePosition = sourcePosition.asInstanceOf[js.Any], targetPosition = targetPosition.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, baseVersion = null, batch = null)
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("type")("merge")
      __obj.asInstanceOf[MergeOperation]
    }
    
    extension [Self <: MergeOperation](x: Self) {
      
      inline def setClone_(value: CallbackTo[MergeOperation]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setDeletionPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "deletionPosition", value.asInstanceOf[js.Any])
      
      inline def setGetReversed(
        value: CallbackTo[
              typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default
            ]
      ): Self = StObject.set(x, "getReversed", value.toJsFn)
      
      inline def setGraveyardPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "graveyardPosition", value.asInstanceOf[js.Any])
      
      inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
      
      inline def setMovedRange(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "movedRange", value.asInstanceOf[js.Any])
      
      inline def setSourcePosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
      
      inline def setTargetPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "targetPosition", value.asInstanceOf[js.Any])
      
      inline def setType(value: merge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
