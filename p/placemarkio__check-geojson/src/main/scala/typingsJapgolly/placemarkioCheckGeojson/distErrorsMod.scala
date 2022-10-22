package typingsJapgolly.placemarkioCheckGeojson

import org.scalajs.dom.Node
import typingsJapgolly.placemarkioCheckGeojson.distTypesMod.HintIssue
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorsMod {
  
  @JSImport("@placemarkio/check-geojson/dist/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@placemarkio/check-geojson/dist/errors", "HintError")
  @js.native
  open class HintError protected ()
    extends StObject
       with Error {
    def this(issues: js.Array[HintIssue]) = this()
    
    var issues: js.Array[HintIssue] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    @JSName("message")
    def message_MHintError: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def makeIssue(message: String, node: Node): HintIssue = (^.asInstanceOf[js.Dynamic].applyDynamic("makeIssue")(message.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[HintIssue]
}
