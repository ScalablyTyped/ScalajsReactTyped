package typingsJapgolly.stormReactDiagrams.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.stormReactDiagrams.distSrcActionsBaseActionMod.BaseAction
import typingsJapgolly.stormReactDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typingsJapgolly.stormReactDiagrams.distSrcWidgetsDiagramWidgetMod.DiagramProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DiagramWidget {
  
  inline def apply(diagramEngine: DiagramEngine): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DiagramProps]))
  }
  
  @JSImport("storm-react-diagrams", "DiagramWidget")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.stormReactDiagrams.mod.DiagramWidget] {
    
    inline def actionStartedFiring(value: /* action */ BaseAction => Boolean): this.type = set("actionStartedFiring", js.Any.fromFunction1(value))
    
    inline def actionStillFiring(value: /* action */ BaseAction => Callback): this.type = set("actionStillFiring", js.Any.fromFunction1((t0: /* action */ BaseAction) => value(t0).runNow()))
    
    inline def actionStoppedFiring(value: /* action */ BaseAction => Callback): this.type = set("actionStoppedFiring", js.Any.fromFunction1((t0: /* action */ BaseAction) => value(t0).runNow()))
    
    inline def allowCanvasTranslation(value: Boolean): this.type = set("allowCanvasTranslation", value.asInstanceOf[js.Any])
    
    inline def allowCanvasZoom(value: Boolean): this.type = set("allowCanvasZoom", value.asInstanceOf[js.Any])
    
    inline def allowLooseLinks(value: Boolean): this.type = set("allowLooseLinks", value.asInstanceOf[js.Any])
    
    inline def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def deleteKeys(value: js.Array[Double]): this.type = set("deleteKeys", value.asInstanceOf[js.Any])
    
    inline def deleteKeysVarargs(value: Double*): this.type = set("deleteKeys", js.Array(value*))
    
    inline def extraProps(value: Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
    
    inline def inverseZoom(value: Boolean): this.type = set("inverseZoom", value.asInstanceOf[js.Any])
    
    inline def maxNumberPointsPerLink(value: Double): this.type = set("maxNumberPointsPerLink", value.asInstanceOf[js.Any])
    
    inline def smartRouting(value: Boolean): this.type = set("smartRouting", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DiagramProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
