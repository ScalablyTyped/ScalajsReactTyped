package typingsJapgolly.three.mod

import typingsJapgolly.three.srcAnimationPropertyBindingMod.ParseTrackNameResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "PropertyBinding")
@js.native
open class PropertyBinding protected ()
  extends typingsJapgolly.three.srcThreeMod.PropertyBinding {
  def this(rootNode: Any, path: String) = this()
  def this(rootNode: Any, path: String, parsedPath: Any) = this()
}
/* static members */
object PropertyBinding {
  
  @JSImport("three", "PropertyBinding")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "PropertyBinding.Composite")
  @js.native
  open class Composite protected ()
    extends typingsJapgolly.three.srcThreeMod.PropertyBinding.Composite {
    def this(targetGroup: Any, path: Any) = this()
    def this(targetGroup: Any, path: Any, parsedPath: Any) = this()
  }
  
  inline def create(root: Any, path: Any): typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding | typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding | typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite]
  inline def create(root: Any, path: Any, parsedPath: Any): typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding | typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(root.asInstanceOf[js.Any], path.asInstanceOf[js.Any], parsedPath.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding | typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite]
  
  inline def findNode(root: Any, nodeName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findNode")(root.asInstanceOf[js.Any], nodeName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def parseTrackName(trackName: String): ParseTrackNameResults = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTrackName")(trackName.asInstanceOf[js.Any]).asInstanceOf[ParseTrackNameResults]
  
  inline def sanitizeNodeName(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeNodeName")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
