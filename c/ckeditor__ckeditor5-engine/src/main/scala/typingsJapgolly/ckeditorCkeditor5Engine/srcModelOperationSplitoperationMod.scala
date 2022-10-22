package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditorCkeditor5Engine.anon.InsertionPosition
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`13`
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.split
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationSplitoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/splitoperation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SplitOperation {
    /**
      * Creates a split operation.
      */
    def this(
      splitPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      howMany: Double,
      insertionPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      graveyardPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ) = this()
    def this(
      splitPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      howMany: Double,
      insertionPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
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
    override def clone_MSplitOperation(): SplitOperation = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MSplitOperation(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default = js.native
    
    /**
      * Position in the graveyard root before the element which should be used as a parent of the nodes after `position`.
      * If it is not set, a copy of the the `position` parent will be used.
      *
      * The default behavior is to clone the split element. Element from graveyard is used during undo.
      */
    /* CompleteClass */
    var graveyardPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null = js.native
    
    /**
      * Total offset size of elements that are in the split element after `position`.
      */
    /* CompleteClass */
    override val howMany: Double = js.native
    
    /**
      * Position at which the clone of split element (or element from graveyard) will be inserted.
      */
    /* CompleteClass */
    override val insertionPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Position inside the new clone of a split element.
      *
      * This is a position where nodes that are after the split position will be moved to.
      */
    /* CompleteClass */
    override val moveTargetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * Artificial range that contains all the nodes from the split element that will be moved to the new element.
      * The range starts at {@link ~#splitPosition} and ends in the same parent, at `POSITIVE_INFINITY` offset.
      */
    /* CompleteClass */
    override val movedRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    /**
      * Position at which an element should be split.
      */
    /* CompleteClass */
    var splitPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
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
    override val type_SplitOperation: split = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/splitoperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/splitoperation", "default.className")
    @js.native
    val className: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.SplitOperation = js.native
    
    /**
      * Creates `SplitOperation` object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(
      json: InsertionPosition,
      document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default
    ): SplitOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[SplitOperation]
    
    /**
      * Helper function that returns a default insertion position basing on given `splitPosition`. The default insertion
      * position is after the split element.
      */
    inline def getInsertionPosition(splitPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getInsertionPosition")(splitPosition.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default]
  }
  
  trait SplitOperation
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MSplitOperation(): SplitOperation
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MSplitOperation(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default
    
    /**
      * Position in the graveyard root before the element which should be used as a parent of the nodes after `position`.
      * If it is not set, a copy of the the `position` parent will be used.
      *
      * The default behavior is to clone the split element. Element from graveyard is used during undo.
      */
    var graveyardPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default | Null
    
    /**
      * Total offset size of elements that are in the split element after `position`.
      */
    val howMany: Double
    
    /**
      * Position at which the clone of split element (or element from graveyard) will be inserted.
      */
    val insertionPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    /**
      * Position inside the new clone of a split element.
      *
      * This is a position where nodes that are after the split position will be moved to.
      */
    val moveTargetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    /**
      * Artificial range that contains all the nodes from the split element that will be moved to the new element.
      * The range starts at {@link ~#splitPosition} and ends in the same parent, at `POSITIVE_INFINITY` offset.
      */
    val movedRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
    
    /**
      * Position at which an element should be split.
      */
    var splitPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    @JSName("type")
    val type_SplitOperation: split
  }
  object SplitOperation {
    
    inline def apply(
      clone_ : CallbackTo[SplitOperation],
      getReversed: CallbackTo[
          typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default
        ],
      howMany: Double,
      insertionPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      isDocumentOperation: Boolean,
      moveTargetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      movedRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      splitPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      toJSON: CallbackTo[`13`]
    ): SplitOperation = {
      val __obj = js.Dynamic.literal(getReversed = getReversed.toJsFn, howMany = howMany.asInstanceOf[js.Any], insertionPosition = insertionPosition.asInstanceOf[js.Any], isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], moveTargetPosition = moveTargetPosition.asInstanceOf[js.Any], movedRange = movedRange.asInstanceOf[js.Any], splitPosition = splitPosition.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, baseVersion = null, batch = null, graveyardPosition = null)
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("type")("split")
      __obj.asInstanceOf[SplitOperation]
    }
    
    extension [Self <: SplitOperation](x: Self) {
      
      inline def setClone_(value: CallbackTo[SplitOperation]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setGetReversed(
        value: CallbackTo[
              typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default
            ]
      ): Self = StObject.set(x, "getReversed", value.toJsFn)
      
      inline def setGraveyardPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "graveyardPosition", value.asInstanceOf[js.Any])
      
      inline def setGraveyardPositionNull: Self = StObject.set(x, "graveyardPosition", null)
      
      inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
      
      inline def setInsertionPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "insertionPosition", value.asInstanceOf[js.Any])
      
      inline def setMoveTargetPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "moveTargetPosition", value.asInstanceOf[js.Any])
      
      inline def setMovedRange(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "movedRange", value.asInstanceOf[js.Any])
      
      inline def setSplitPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "splitPosition", value.asInstanceOf[js.Any])
      
      inline def setType(value: split): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
