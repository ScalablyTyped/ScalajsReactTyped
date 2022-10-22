package typingsJapgolly.materialAnimation

import org.scalajs.dom.Window
import typingsJapgolly.materialAnimation.typesMod.PrefixedCssPropertyName
import typingsJapgolly.materialAnimation.typesMod.PrefixedJsEventType
import typingsJapgolly.materialAnimation.typesMod.StandardCssPropertyName
import typingsJapgolly.materialAnimation.typesMod.StandardJsEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@material/animation/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCorrectEventName(windowObj: Window, eventType: StandardJsEventType): StandardJsEventType | PrefixedJsEventType = (^.asInstanceOf[js.Dynamic].applyDynamic("getCorrectEventName")(windowObj.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[StandardJsEventType | PrefixedJsEventType]
  
  inline def getCorrectPropertyName(windowObj: Window, cssProperty: StandardCssPropertyName): StandardCssPropertyName | PrefixedCssPropertyName = (^.asInstanceOf[js.Dynamic].applyDynamic("getCorrectPropertyName")(windowObj.asInstanceOf[js.Any], cssProperty.asInstanceOf[js.Any])).asInstanceOf[StandardCssPropertyName | PrefixedCssPropertyName]
}
