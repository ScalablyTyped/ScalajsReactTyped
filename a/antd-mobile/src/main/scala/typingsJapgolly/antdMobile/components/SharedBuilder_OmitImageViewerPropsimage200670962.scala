package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esUtilsRenderToContainerMod.GetContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_OmitImageViewerPropsimage200670962[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def afterClose(value: Callback): this.type = set("afterClose", value.toJsFn)
  
  inline def defaultIndex(value: Double): this.type = set("defaultIndex", value.asInstanceOf[js.Any])
  
  inline def getContainer(value: GetContainer): this.type = set("getContainer", value.asInstanceOf[js.Any])
  
  inline def getContainerCallbackTo(value: CallbackTo[HTMLElement]): this.type = set("getContainer", value.toJsFn)
  
  inline def getContainerNull: this.type = set("getContainer", null)
  
  inline def images(value: js.Array[String]): this.type = set("images", value.asInstanceOf[js.Any])
  
  inline def imagesVarargs(value: String*): this.type = set("images", js.Array(value*))
  
  inline def maxZoom(value: Double): this.type = set("maxZoom", value.asInstanceOf[js.Any])
  
  inline def onClose(value: Callback): this.type = set("onClose", value.toJsFn)
  
  inline def onIndexChange(value: /* index */ Double => Callback): this.type = set("onIndexChange", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
  
  inline def renderFooter(value: (/* image */ String, /* index */ Double) => Node): this.type = set("renderFooter", js.Any.fromFunction2(value))
  
  inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
}
