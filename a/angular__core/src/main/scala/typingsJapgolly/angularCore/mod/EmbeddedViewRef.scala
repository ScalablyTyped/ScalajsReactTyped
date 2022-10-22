package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/core", "EmbeddedViewRef")
@js.native
open class EmbeddedViewRef[C] () extends ViewRef {
  
  /**
    * The context for this view, inherited from the anchor element.
    */
  var context: C = js.native
  
  /**
    * The root nodes for this embedded view.
    */
  def rootNodes: js.Array[Any] = js.native
}
