package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.Callback
import typingsJapgolly.ckeditorCkeditor5Engine.anon.ClassName
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`0`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`1`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`2`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`3`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`4`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`5`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`6`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`7`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`8`
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelOperationOperationfactoryMod {
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/operationfactory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OperationFactory {
    
    /* CompleteClass */
    @JSName("_")
    override def _underscore(): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-engine/src/model/operation/operationfactory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: ClassName, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationAttributeoperationMod.default[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationAttributeoperationMod.default[Any, Any]]
    inline def fromJSON(json: `0`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationInsertoperationMod.default]
    inline def fromJSON(json: `1`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMarkeroperationMod.default]
    inline def fromJSON(json: `2`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMoveoperationMod.default]
    inline def fromJSON(json: `3`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationNooperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationNooperationMod.default]
    inline def fromJSON(json: `4`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationRenameoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationRenameoperationMod.default]
    inline def fromJSON(json: `5`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationRootattributeoperationMod.default[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationRootattributeoperationMod.default[Any, Any]]
    inline def fromJSON(json: `6`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationSplitoperationMod.default]
    inline def fromJSON(json: `7`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationMergeoperationMod.default]
    inline def fromJSON(json: `8`, document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default): Operation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Operation]
  }
  
  trait OperationFactory extends StObject {
    
    @JSName("_")
    def _underscore(): Unit
  }
  object OperationFactory {
    
    inline def apply(_underscore: Callback): OperationFactory = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.toJsFn)
      __obj.asInstanceOf[OperationFactory]
    }
    
    extension [Self <: OperationFactory](x: Self) {
      
      inline def set_underscore(value: Callback): Self = StObject.set(x, "_", value.toJsFn)
    }
  }
}
