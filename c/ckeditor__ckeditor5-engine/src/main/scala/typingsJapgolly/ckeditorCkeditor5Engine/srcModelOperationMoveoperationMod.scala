package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditorCkeditor5Engine.anon.SourcePosition
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`13`
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.move
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.reinsert
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.remove
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationMoveoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/moveoperation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MoveOperation {
    /**
      * Creates a move operation.
      */
    def this(
      sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      howMany: Double,
      targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ) = this()
    def this(
      sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      howMany: Double,
      targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
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
    override def clone_MMoveOperation(): MoveOperation = js.native
    
    /**
      * Returns the start position of the moved range after it got moved. This may be different than
      * {@link module:engine/model/operation/moveoperation~MoveOperation#targetPosition} in some cases, i.e. when a range is moved
      * inside the same parent but {@link module:engine/model/operation/moveoperation~MoveOperation#targetPosition targetPosition}
      * is after {@link module:engine/model/operation/moveoperation~MoveOperation#sourcePosition sourcePosition}.
      *
      *     vv              vv
      *    abcdefg ===> adefbcg
      *         ^          ^
      *         targetPos  movedRangeStart
      *         offset 6  offset 4
      */
    /* CompleteClass */
    override def getMovedRangeStart(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MMoveOperation(): MoveOperation = js.native
    
    /**
      * Offset size of moved range.
      */
    /* CompleteClass */
    var howMany: Double = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * Position before the first {@link module:engine/model/item~Item model item} to move.
      */
    /* CompleteClass */
    var sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * Position at which moved nodes will be inserted.
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
    override val type_MoveOperation: remove | reinsert | move = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/moveoperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/moveoperation", "default.className")
    @js.native
    val className: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.MoveOperation = js.native
    
    /**
      * Creates `MoveOperation` object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(
      json: SourcePosition,
      document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default
    ): MoveOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[MoveOperation]
  }
  
  trait MoveOperation
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MMoveOperation(): MoveOperation
    
    /**
      * Returns the start position of the moved range after it got moved. This may be different than
      * {@link module:engine/model/operation/moveoperation~MoveOperation#targetPosition} in some cases, i.e. when a range is moved
      * inside the same parent but {@link module:engine/model/operation/moveoperation~MoveOperation#targetPosition targetPosition}
      * is after {@link module:engine/model/operation/moveoperation~MoveOperation#sourcePosition sourcePosition}.
      *
      *     vv              vv
      *    abcdefg ===> adefbcg
      *         ^          ^
      *         targetPos  movedRangeStart
      *         offset 6  offset 4
      */
    def getMovedRangeStart(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MMoveOperation(): MoveOperation
    
    /**
      * Offset size of moved range.
      */
    var howMany: Double
    
    /**
      * Position before the first {@link module:engine/model/item~Item model item} to move.
      */
    var sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    /**
      * Position at which moved nodes will be inserted.
      */
    var targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    @JSName("type")
    val type_MoveOperation: remove | reinsert | move
  }
  object MoveOperation {
    
    inline def apply(
      clone_ : CallbackTo[MoveOperation],
      getMovedRangeStart: CallbackTo[typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default],
      getReversed: CallbackTo[MoveOperation],
      howMany: Double,
      isDocumentOperation: Boolean,
      sourcePosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      toJSON: CallbackTo[`13`],
      `type`: remove | reinsert | move
    ): MoveOperation = {
      val __obj = js.Dynamic.literal(getMovedRangeStart = getMovedRangeStart.toJsFn, getReversed = getReversed.toJsFn, howMany = howMany.asInstanceOf[js.Any], isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], sourcePosition = sourcePosition.asInstanceOf[js.Any], targetPosition = targetPosition.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, baseVersion = null, batch = null)
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOperation]
    }
    
    extension [Self <: MoveOperation](x: Self) {
      
      inline def setClone_(value: CallbackTo[MoveOperation]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setGetMovedRangeStart(value: CallbackTo[typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default]): Self = StObject.set(x, "getMovedRangeStart", value.toJsFn)
      
      inline def setGetReversed(value: CallbackTo[MoveOperation]): Self = StObject.set(x, "getReversed", value.toJsFn)
      
      inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
      
      inline def setSourcePosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
      
      inline def setTargetPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "targetPosition", value.asInstanceOf[js.Any])
      
      inline def setType(value: remove | reinsert | move): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
