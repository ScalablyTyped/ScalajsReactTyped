package typingsJapgolly.ngxInfiniteScroll

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.SimpleChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServicesNgxInsUtilsMod {
  
  @JSImport("ngx-infinite-scroll/lib/services/ngx-ins-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findElement(selector: String, customRoot: Any, fromRoot: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any], customRoot.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findElement(selector: String, customRoot: ElementRef[Any], fromRoot: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any], customRoot.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findElement(selector: Any, customRoot: Any, fromRoot: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any], customRoot.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def findElement(selector: Any, customRoot: ElementRef[Any], fromRoot: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(selector.asInstanceOf[js.Any], customRoot.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def hasWindowDefined(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasWindowDefined")().asInstanceOf[Boolean]
  
  inline def inputPropChanged(prop: SimpleChange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inputPropChanged")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveContainerElement(selector: String, scrollWindow: Any, defaultElement: Any, fromRoot: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainerElement")(selector.asInstanceOf[js.Any], scrollWindow.asInstanceOf[js.Any], defaultElement.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def resolveContainerElement(selector: Any, scrollWindow: Any, defaultElement: Any, fromRoot: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveContainerElement")(selector.asInstanceOf[js.Any], scrollWindow.asInstanceOf[js.Any], defaultElement.asInstanceOf[js.Any], fromRoot.asInstanceOf[js.Any])).asInstanceOf[Any]
}
