package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticTRANSITIONS
import typingsJapgolly.semanticUiReact.distCommonjsModulesTransitionTransitionMod.TransitionPropDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_TransitionGroupProps1414684637[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animation(value: SemanticTRANSITIONS | String): this.type = set("animation", value.asInstanceOf[js.Any])
  
  inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  inline def directional(value: Boolean): this.type = set("directional", value.asInstanceOf[js.Any])
  
  inline def duration(value: Double | String | TransitionPropDuration): this.type = set("duration", value.asInstanceOf[js.Any])
}
