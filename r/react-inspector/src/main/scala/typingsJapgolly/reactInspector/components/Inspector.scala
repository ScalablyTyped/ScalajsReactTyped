package typingsJapgolly.reactInspector.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Inspector {
  
  object ObjectInspectorProps {
    
    inline def apply(): Default[js.Object] = {
      val __props = js.Dynamic.literal(table = false)
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactInspector.mod.ObjectInspectorProps]))
    }
    
    @JSImport("react-inspector", "Inspector")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: typingsJapgolly.reactInspector.mod.ObjectInspectorProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object TableInspectorProps {
    
    inline def apply(): Default[js.Object] = {
      val __props = js.Dynamic.literal(table = true)
      new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactInspector.mod.TableInspectorProps]))
    }
    
    @JSImport("react-inspector", "Inspector")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: typingsJapgolly.reactInspector.mod.TableInspectorProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
