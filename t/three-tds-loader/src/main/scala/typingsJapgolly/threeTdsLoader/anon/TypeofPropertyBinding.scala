package typingsJapgolly.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.three.mod.PropertyBinding
import typingsJapgolly.three.srcAnimationPropertyBindingMod.ParseTrackNameResults
import typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding.Composite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPropertyBinding
  extends StObject
     with Instantiable2[/* rootNode */ Any, /* path */ String, PropertyBinding] {
  
  def create(root: Any, path: Any): typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding | Composite = js.native
  def create(root: Any, path: Any, parsedPath: Any): typingsJapgolly.three.srcAnimationPropertyBindingMod.PropertyBinding | Composite = js.native
  
  def findNode(root: Any, nodeName: String): Any = js.native
  
  def parseTrackName(trackName: String): ParseTrackNameResults = js.native
  
  def sanitizeNodeName(name: String): String = js.native
}
