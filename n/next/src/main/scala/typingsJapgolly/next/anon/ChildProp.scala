package typingsJapgolly.next.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.next.distClientComponentsLayoutRouterDotclientMod.ErrorComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildProp extends StObject {
  
  var childProp: typingsJapgolly.next.distServerAppRenderMod.ChildProp
  
  var error: ErrorComponent
  
  var loading: js.UndefOr[Node] = js.undefined
  
  var parallelRouterKey: String
  
  var rootLayoutIncluded: Boolean
  
  var segmentPath: typingsJapgolly.next.distServerAppRenderMod.FlightSegmentPath
  
  var template: Node
}
object ChildProp {
  
  inline def apply(
    childProp: typingsJapgolly.next.distServerAppRenderMod.ChildProp,
    error: ErrorComponent,
    parallelRouterKey: String,
    rootLayoutIncluded: Boolean,
    segmentPath: typingsJapgolly.next.distServerAppRenderMod.FlightSegmentPath
  ): ChildProp = {
    val __obj = js.Dynamic.literal(childProp = childProp.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], parallelRouterKey = parallelRouterKey.asInstanceOf[js.Any], rootLayoutIncluded = rootLayoutIncluded.asInstanceOf[js.Any], segmentPath = segmentPath.asInstanceOf[js.Any], template = null)
    __obj.asInstanceOf[ChildProp]
  }
  
  extension [Self <: ChildProp](x: Self) {
    
    inline def setChildProp(value: typingsJapgolly.next.distServerAppRenderMod.ChildProp): Self = StObject.set(x, "childProp", value.asInstanceOf[js.Any])
    
    inline def setError(value: ErrorComponent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: VdomNode): Self = StObject.set(x, "loading", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLoadingNull: Self = StObject.set(x, "loading", null)
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setLoadingVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "loading", js.Array(value*))
    
    inline def setLoadingVdomElement(value: VdomElement): Self = StObject.set(x, "loading", value.rawElement.asInstanceOf[js.Any])
    
    inline def setParallelRouterKey(value: String): Self = StObject.set(x, "parallelRouterKey", value.asInstanceOf[js.Any])
    
    inline def setRootLayoutIncluded(value: Boolean): Self = StObject.set(x, "rootLayoutIncluded", value.asInstanceOf[js.Any])
    
    inline def setSegmentPath(value: typingsJapgolly.next.distServerAppRenderMod.FlightSegmentPath): Self = StObject.set(x, "segmentPath", value.asInstanceOf[js.Any])
    
    inline def setSegmentPathVarargs(value: Any*): Self = StObject.set(x, "segmentPath", js.Array(value*))
    
    inline def setTemplate(value: VdomNode): Self = StObject.set(x, "template", value.rawNode.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setTemplateVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "template", js.Array(value*))
    
    inline def setTemplateVdomElement(value: VdomElement): Self = StObject.set(x, "template", value.rawElement.asInstanceOf[js.Any])
  }
}
