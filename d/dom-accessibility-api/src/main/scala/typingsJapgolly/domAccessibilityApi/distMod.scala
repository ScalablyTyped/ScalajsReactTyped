package typingsJapgolly.domAccessibilityApi

import org.scalajs.dom.Element
import typingsJapgolly.domAccessibilityApi.distAccessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import typingsJapgolly.domAccessibilityApi.distIsInaccessibleMod.IsInaccessibleOptions
import typingsJapgolly.domAccessibilityApi.distIsInaccessibleMod.IsSubtreeInaccessibleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("dom-accessibility-api/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeAccessibleDescription(root: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleDescription")(root.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeAccessibleDescription(root: Element, options: ComputeTextAlternativeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleDescription")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def computeAccessibleName(root: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleName")(root.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeAccessibleName(root: Element, options: ComputeTextAlternativeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleName")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRole(element: Element): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRole")(element.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def isInaccessible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInaccessible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isInaccessible(element: Element, options: IsInaccessibleOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInaccessible")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSubtreeInaccessible(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubtreeInaccessible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSubtreeInaccessible(element: Element, options: IsSubtreeInaccessibleOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubtreeInaccessible")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
