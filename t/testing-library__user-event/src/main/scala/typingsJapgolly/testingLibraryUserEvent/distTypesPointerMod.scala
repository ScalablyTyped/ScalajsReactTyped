package typingsJapgolly.testingLibraryUserEvent

import typingsJapgolly.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node
import typingsJapgolly.testingLibraryUserEvent.distTypesEventTypesMod.PointerCoords
import typingsJapgolly.testingLibraryUserEvent.distTypesSystemPointerSharedMod.pointerKey
import typingsJapgolly.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPointerMod {
  
  @JSImport("@testing-library/user-event/dist/types/pointer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointer(input: PointerInput): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("pointer")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction
    - typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction
  */
  trait PointerAction
    extends StObject
       with _PointerActionInput
  object PointerAction {
    
    inline def PointerMoveAction(): typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction]
    }
    
    inline def PointerPressAction(keyDef: pointerKey, releasePrevious: Boolean, releaseSelf: Boolean): typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction = {
      val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], releaseSelf = releaseSelf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.testingLibraryUserEvent.anon.keysstringPointerActionPo
    - typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerAction
  */
  type PointerActionInput = _PointerActionInput | String
  
  trait PointerActionPosition extends StObject {
    
    var coords: js.UndefOr[PointerCoords] = js.undefined
    
    var node: js.UndefOr[Node] = js.undefined
    
    /**
      * If `node` is set, this is the DOM offset.
      * Otherwise this is the `textContent`/`value` offset on the `target`.
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
  }
  object PointerActionPosition {
    
    inline def apply(): PointerActionPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointerActionPosition]
    }
    
    extension [Self <: PointerActionPosition](x: Self) {
      
      inline def setCoords(value: PointerCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type PointerInput = PointerActionInput | js.Array[PointerActionInput]
  
  trait PointerMoveAction
    extends StObject
       with PointerActionPosition
       with PointerAction {
    
    var pointerName: js.UndefOr[String] = js.undefined
  }
  object PointerMoveAction {
    
    inline def apply(): PointerMoveAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointerMoveAction]
    }
    
    extension [Self <: PointerMoveAction](x: Self) {
      
      inline def setPointerName(value: String): Self = StObject.set(x, "pointerName", value.asInstanceOf[js.Any])
      
      inline def setPointerNameUndefined: Self = StObject.set(x, "pointerName", js.undefined)
    }
  }
  
  trait PointerPressAction
    extends StObject
       with PointerActionPosition
       with PointerAction {
    
    var keyDef: pointerKey
    
    var releasePrevious: Boolean
    
    var releaseSelf: Boolean
  }
  object PointerPressAction {
    
    inline def apply(keyDef: pointerKey, releasePrevious: Boolean, releaseSelf: Boolean): PointerPressAction = {
      val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], releaseSelf = releaseSelf.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointerPressAction]
    }
    
    extension [Self <: PointerPressAction](x: Self) {
      
      inline def setKeyDef(value: pointerKey): Self = StObject.set(x, "keyDef", value.asInstanceOf[js.Any])
      
      inline def setReleasePrevious(value: Boolean): Self = StObject.set(x, "releasePrevious", value.asInstanceOf[js.Any])
      
      inline def setReleaseSelf(value: Boolean): Self = StObject.set(x, "releaseSelf", value.asInstanceOf[js.Any])
    }
  }
  
  trait _PointerActionInput extends StObject
  object _PointerActionInput {
    
    inline def PointerMoveAction(): typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerMoveAction]
    }
    
    inline def PointerPressAction(keyDef: pointerKey, releasePrevious: Boolean, releaseSelf: Boolean): typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction = {
      val __obj = js.Dynamic.literal(keyDef = keyDef.asInstanceOf[js.Any], releasePrevious = releasePrevious.asInstanceOf[js.Any], releaseSelf = releaseSelf.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.testingLibraryUserEvent.distTypesPointerMod.PointerPressAction]
    }
    
    inline def keysstringPointerActionPo(keys: String): typingsJapgolly.testingLibraryUserEvent.anon.keysstringPointerActionPo = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.testingLibraryUserEvent.anon.keysstringPointerActionPo]
    }
  }
}
