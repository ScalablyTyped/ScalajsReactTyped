package typingsJapgolly.testingLibraryUserEvent

import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.testingLibraryUserEvent.distTypesUtilsEditSetFilesMod.global.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDocumentTrackValueMod {
  
  @JSImport("@testing-library/user-event/dist/types/document/trackValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def commitValueAfterInput(element: HTMLTextAreaElement, cursorOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitValueAfterInput")(element.asInstanceOf[js.Any], cursorOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def commitValueAfterInput(element: HTMLInputElement, cursorOffset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("commitValueAfterInput")(element.asInstanceOf[js.Any], cursorOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def startTrackValue(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTrackValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def startTrackValue(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startTrackValue")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trackOrSetValue(element: HTMLTextAreaElement, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackOrSetValue")(element.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def trackOrSetValue(element: HTMLInputElement, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackOrSetValue")(element.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object global {
    
    @js.native
    trait Element extends StObject
    
    trait Window extends StObject {
      
      var REACT_VERSION: js.UndefOr[Double] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setREACT_VERSION(value: Double): Self = StObject.set(x, "REACT_VERSION", value.asInstanceOf[js.Any])
        
        inline def setREACT_VERSIONUndefined: Self = StObject.set(x, "REACT_VERSION", js.undefined)
      }
    }
  }
}
