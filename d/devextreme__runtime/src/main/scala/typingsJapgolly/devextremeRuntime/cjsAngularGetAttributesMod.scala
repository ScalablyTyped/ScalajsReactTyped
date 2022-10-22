package typingsJapgolly.devextremeRuntime

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAngularGetAttributesMod {
  
  @JSImport("@devextreme/runtime/cjs/angular/get-attributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAttributes(element: ElementRef[HTMLElement]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributes")(element.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
}
