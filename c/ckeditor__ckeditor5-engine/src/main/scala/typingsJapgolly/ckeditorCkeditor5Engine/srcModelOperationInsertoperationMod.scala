package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ckeditorCkeditor5Engine.anon.BaseVersion
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`13`
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.insert
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.NodeSet
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationInsertoperationMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/insertoperation", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with InsertOperation {
    /**
      * Creates an insert operation.
      */
    def this(position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default, nodes: NodeSet) = this()
    def this(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      nodes: NodeSet,
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
    override def clone_MInsertOperation(): InsertOperation = js.native
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    /* CompleteClass */
    @JSName("getReversed")
    override def getReversed_MInsertOperation(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default = js.native
    
    /**
      * Total offset size of inserted nodes.
      */
    /* CompleteClass */
    override val howMany: Double = js.native
    
    /**
      * Defines whether operation is executed on attached or detached {@link module:engine/model/item~Item items}.
      */
    /* CompleteClass */
    override val isDocumentOperation: Boolean = js.native
    
    /**
      * List of nodes to insert.
      */
    /* CompleteClass */
    override val nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodelistMod.default = js.native
    
    /**
      * Position of insertion.
      */
    /* CompleteClass */
    var position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    /**
      * Flag deciding how the operation should be transformed. If set to `true`, nodes might get additional attributes
      * during operational transformation. This happens when the operation insertion position is inside of a range
      * where attributes have changed.
      */
    /* CompleteClass */
    var shouldReceiveAttributes: Boolean = js.native
    
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
    override val type_InsertOperation: insert = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/insertoperation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/insertoperation", "default.className")
    @js.native
    val className: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.InsertOperation = js.native
    
    /**
      * Creates `InsertOperation` object from deserilized object, i.e. from parsed JSON string.
      */
    inline def fromJSON(json: BaseVersion, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): InsertOperation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[InsertOperation]
  }
  
  trait InsertOperation
    extends StObject
       with Operation {
    
    /**
      * Creates and returns an operation that has the same parameters as this operation.
      */
    @JSName("clone")
    def clone_MInsertOperation(): InsertOperation
    
    /**
      * See {@link module:engine/model/operation/operation~Operation#getReversed `Operation#getReversed()`}.
      */
    @JSName("getReversed")
    def getReversed_MInsertOperation(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default
    
    /**
      * Total offset size of inserted nodes.
      */
    val howMany: Double
    
    /**
      * List of nodes to insert.
      */
    val nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodelistMod.default
    
    /**
      * Position of insertion.
      */
    var position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    
    /**
      * Flag deciding how the operation should be transformed. If set to `true`, nodes might get additional attributes
      * during operational transformation. This happens when the operation insertion position is inside of a range
      * where attributes have changed.
      */
    var shouldReceiveAttributes: Boolean
    
    @JSName("type")
    val type_InsertOperation: insert
  }
  object InsertOperation {
    
    inline def apply(
      clone_ : CallbackTo[InsertOperation],
      getReversed: CallbackTo[
          typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default
        ],
      howMany: Double,
      isDocumentOperation: Boolean,
      nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodelistMod.default,
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      shouldReceiveAttributes: Boolean,
      toJSON: CallbackTo[`13`]
    ): InsertOperation = {
      val __obj = js.Dynamic.literal(getReversed = getReversed.toJsFn, howMany = howMany.asInstanceOf[js.Any], isDocumentOperation = isDocumentOperation.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], shouldReceiveAttributes = shouldReceiveAttributes.asInstanceOf[js.Any], toJSON = toJSON.toJsFn, baseVersion = null, batch = null)
      __obj.updateDynamic("clone")(clone_.toJsFn)
      __obj.updateDynamic("type")("insert")
      __obj.asInstanceOf[InsertOperation]
    }
    
    extension [Self <: InsertOperation](x: Self) {
      
      inline def setClone_(value: CallbackTo[InsertOperation]): Self = StObject.set(x, "clone", value.toJsFn)
      
      inline def setGetReversed(
        value: CallbackTo[
              typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default
            ]
      ): Self = StObject.set(x, "getReversed", value.toJsFn)
      
      inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodelistMod.default): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setShouldReceiveAttributes(value: Boolean): Self = StObject.set(x, "shouldReceiveAttributes", value.asInstanceOf[js.Any])
      
      inline def setType(value: insert): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
