package typingsJapgolly.reactMosaicComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMosaicComponent.libMosaicWindowMod.MosaicWindowProps
import typingsJapgolly.reactMosaicComponent.libTypesMod.CreateNode
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicBranch
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import typingsJapgolly.reactMosaicComponent.reactMosaicComponentStrings.drop
import typingsJapgolly.reactMosaicComponent.reactMosaicComponentStrings.reset__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MosaicWindow {
  
  inline def apply[T /* <: MosaicKey */](path: js.Array[MosaicBranch], title: String): Builder[T] = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[MosaicWindowProps[T]]))
  }
  
  @JSImport("react-mosaic-component", "MosaicWindow")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: MosaicKey */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMosaicComponent.mod.MosaicWindow[T]] {
    
    inline def additionalControlButtonText(value: String): this.type = set("additionalControlButtonText", value.asInstanceOf[js.Any])
    
    inline def additionalControls(value: VdomNode): this.type = set("additionalControls", value.rawNode.asInstanceOf[js.Any])
    
    inline def additionalControlsNull: this.type = set("additionalControls", null)
    
    inline def additionalControlsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("additionalControls", js.Array(value*))
    
    inline def additionalControlsVdomElement(value: VdomElement): this.type = set("additionalControls", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def createNode(value: CreateNode[T]): this.type = set("createNode", value.asInstanceOf[js.Any])
    
    inline def draggable(value: Boolean): this.type = set("draggable", value.asInstanceOf[js.Any])
    
    inline def onAdditionalControlsToggle(value: /* toggle */ Boolean => Callback): this.type = set("onAdditionalControlsToggle", js.Any.fromFunction1((t0: /* toggle */ Boolean) => value(t0).runNow()))
    
    inline def onDragEnd(value: /* type */ drop | reset__ => Callback): this.type = set("onDragEnd", js.Any.fromFunction1((t0: /* type */ drop | reset__) => value(t0).runNow()))
    
    inline def onDragStart(value: Callback): this.type = set("onDragStart", value.toJsFn)
    
    inline def renderPreview(value: /* props */ MosaicWindowProps[T] => typingsJapgolly.react.mod.global.JSX.Element): this.type = set("renderPreview", js.Any.fromFunction1(value))
    
    inline def renderToolbar(
      value: (/* props */ MosaicWindowProps[T], /* draggable */ js.UndefOr[Boolean]) => typingsJapgolly.react.mod.global.JSX.Element
    ): this.type = set("renderToolbar", js.Any.fromFunction2(value))
    
    inline def renderToolbarNull: this.type = set("renderToolbar", null)
    
    inline def toolbarControls(value: VdomNode): this.type = set("toolbarControls", value.rawNode.asInstanceOf[js.Any])
    
    inline def toolbarControlsNull: this.type = set("toolbarControls", null)
    
    inline def toolbarControlsVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("toolbarControls", js.Array(value*))
    
    inline def toolbarControlsVdomElement(value: VdomElement): this.type = set("toolbarControls", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: MosaicKey */](p: MosaicWindowProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
