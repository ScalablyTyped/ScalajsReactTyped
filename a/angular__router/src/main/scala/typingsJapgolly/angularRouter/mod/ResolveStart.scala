package typingsJapgolly.angularRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.angularRouter.mod.Event2 because Already inherited */ @JSImport("@angular/router", "ResolveStart")
@js.native
open class ResolveStart protected () extends RouterEvent {
  def this(
    /** @docsNotRequired */
  id: Double,
    /** @docsNotRequired */
  url: String,
    /** @docsNotRequired */
  urlAfterRedirects: String,
    /** @docsNotRequired */
  state: RouterStateSnapshot
  ) = this()
  
  /** @docsNotRequired */
  var state: RouterStateSnapshot = js.native
  
  val `type`: String | Double = js.native
  
  /** @docsNotRequired */
  var urlAfterRedirects: String = js.native
}
