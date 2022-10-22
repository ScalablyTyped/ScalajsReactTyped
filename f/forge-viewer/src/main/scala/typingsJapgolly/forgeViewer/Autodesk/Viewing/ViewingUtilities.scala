package typingsJapgolly.forgeViewer.Autodesk.Viewing

import typingsJapgolly.forgeViewer.THREE.Box3
import typingsJapgolly.forgeViewer.THREE.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewingUtilities extends StObject {
  
  def getBoundingBox(): Box3 = js.native
  def getBoundingBox(ignoreSelection: Boolean): Box3 = js.native
  
  def getHitPoint(x: Double, y: Double): Vector3 = js.native
}
