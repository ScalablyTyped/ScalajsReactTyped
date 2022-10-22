package typingsJapgolly.testingLibraryUserEvent

import typingsJapgolly.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node
import typingsJapgolly.testingLibraryUserEvent.distTypesEventTypesMod.PointerCoords
import typingsJapgolly.testingLibraryUserEvent.distTypesSystemPointerButtonsMod.MouseButton
import typingsJapgolly.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.mouse
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pen
import typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemPointerSharedMod {
  
  @JSImport("@testing-library/user-event/dist/types/system/pointer/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDifferentPointerPosition(positionA: PointerPosition, positionB: PointerPosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDifferentPointerPosition")(positionA.asInstanceOf[js.Any], positionB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait CaretPosition extends StObject {
    
    var node: js.UndefOr[Node] = js.undefined
    
    var offset: js.UndefOr[Double] = js.undefined
  }
  object CaretPosition {
    
    inline def apply(): CaretPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaretPosition]
    }
    
    extension [Self <: CaretPosition](x: Self) {
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  trait PointerPosition extends StObject {
    
    var caret: js.UndefOr[CaretPosition] = js.undefined
    
    var coords: js.UndefOr[PointerCoords] = js.undefined
    
    var target: js.UndefOr[Element] = js.undefined
  }
  object PointerPosition {
    
    inline def apply(): PointerPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointerPosition]
    }
    
    extension [Self <: PointerPosition](x: Self) {
      
      inline def setCaret(value: CaretPosition): Self = StObject.set(x, "caret", value.asInstanceOf[js.Any])
      
      inline def setCaretUndefined: Self = StObject.set(x, "caret", js.undefined)
      
      inline def setCoords(value: PointerCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait pointerKey extends StObject {
    
    /** Type of button */
    var button: js.UndefOr[MouseButton] = js.undefined
    
    /** Name of the pointer key */
    var name: String
    
    /** Type of the pointer device */
    var pointerType: mouse | pen | touch
  }
  object pointerKey {
    
    inline def apply(name: String, pointerType: mouse | pen | touch): pointerKey = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pointerType = pointerType.asInstanceOf[js.Any])
      __obj.asInstanceOf[pointerKey]
    }
    
    extension [Self <: pointerKey](x: Self) {
      
      inline def setButton(value: MouseButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPointerType(value: mouse | pen | touch): Self = StObject.set(x, "pointerType", value.asInstanceOf[js.Any])
    }
  }
}
