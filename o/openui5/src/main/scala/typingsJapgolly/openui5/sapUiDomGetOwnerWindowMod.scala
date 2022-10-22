package typingsJapgolly.openui5

import org.scalajs.dom.Element
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDomGetOwnerWindowMod {
  
  @JSImport("sap/ui/dom/getOwnerWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(/**
    * The DOM reference
    */
  oDomRef: Element): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(oDomRef.asInstanceOf[js.Any]).asInstanceOf[Window]
}
