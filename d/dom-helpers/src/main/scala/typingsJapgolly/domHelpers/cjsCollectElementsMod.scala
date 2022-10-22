package typingsJapgolly.domHelpers

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsCollectElementsMod {
  
  @JSImport("dom-helpers/cjs/collectElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Element, direction: TraverseDirection): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def default(node: Null, direction: TraverseDirection): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.domHelpers.domHelpersStrings.parentElement
    - typingsJapgolly.domHelpers.domHelpersStrings.previousElementSibling
    - typingsJapgolly.domHelpers.domHelpersStrings.nextElementSibling
  */
  trait TraverseDirection extends StObject
  object TraverseDirection {
    
    inline def nextElementSibling: typingsJapgolly.domHelpers.domHelpersStrings.nextElementSibling = "nextElementSibling".asInstanceOf[typingsJapgolly.domHelpers.domHelpersStrings.nextElementSibling]
    
    inline def parentElement: typingsJapgolly.domHelpers.domHelpersStrings.parentElement = "parentElement".asInstanceOf[typingsJapgolly.domHelpers.domHelpersStrings.parentElement]
    
    inline def previousElementSibling: typingsJapgolly.domHelpers.domHelpersStrings.previousElementSibling = "previousElementSibling".asInstanceOf[typingsJapgolly.domHelpers.domHelpersStrings.previousElementSibling]
  }
}
