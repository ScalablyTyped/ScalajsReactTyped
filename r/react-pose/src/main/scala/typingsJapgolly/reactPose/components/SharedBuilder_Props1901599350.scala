package typingsJapgolly.reactPose.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props1901599350[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def animateOnMount(value: Boolean): this.type = set("animateOnMount", value.asInstanceOf[js.Any])
  
  inline def enterAfterExit(value: Boolean): this.type = set("enterAfterExit", value.asInstanceOf[js.Any])
  
  inline def enterPose(value: String): this.type = set("enterPose", value.asInstanceOf[js.Any])
  
  inline def exitPose(value: String): this.type = set("exitPose", value.asInstanceOf[js.Any])
  
  inline def flipMove(value: Boolean): this.type = set("flipMove", value.asInstanceOf[js.Any])
  
  inline def onRest(value: Callback): this.type = set("onRest", value.toJsFn)
  
  inline def preEnterPose(value: String): this.type = set("preEnterPose", value.asInstanceOf[js.Any])
}
