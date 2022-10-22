package typingsJapgolly.reactNepalMap.components

import typingsJapgolly.reactNepalMap.mod.MapPropsTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ZonalMap {
  
  @JSImport("react-nepal-map", "ZonalMap")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ZonalMap.type): SharedBuilder_MapPropsTypes1442901977 = new SharedBuilder_MapPropsTypes1442901977(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MapPropsTypes): SharedBuilder_MapPropsTypes1442901977 = new SharedBuilder_MapPropsTypes1442901977(js.Array(this.component, p.asInstanceOf[js.Any]))
}
