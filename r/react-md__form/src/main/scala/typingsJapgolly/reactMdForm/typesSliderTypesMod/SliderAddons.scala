package typingsJapgolly.reactMdForm.typesSliderTypesMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderAddons extends StObject {
  
  /**
    * An optional addon to render after the slider's track. This can be anything
    * and will be wrapped in the `TextIconSpacing` component from
    * `@react-md/icon`.
    *
    * When the `vertical` prop is enabled, the addon will appear above the track.
    */
  var afterAddon: js.UndefOr[Node] = js.undefined
  
  /**
    * An optional addon to render before the slider's track. This can be anything
    * and will be wrapped in the `TextIconSpacing` component from
    * `@react-md/icon`.
    *
    * When the `vertical` prop is enabled, the addon will appear underneath the
    * track.
    */
  var beforeAddon: js.UndefOr[Node] = js.undefined
}
object SliderAddons {
  
  inline def apply(): SliderAddons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderAddons]
  }
  
  extension [Self <: SliderAddons](x: Self) {
    
    inline def setAfterAddon(value: VdomNode): Self = StObject.set(x, "afterAddon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setAfterAddonNull: Self = StObject.set(x, "afterAddon", null)
    
    inline def setAfterAddonUndefined: Self = StObject.set(x, "afterAddon", js.undefined)
    
    inline def setAfterAddonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "afterAddon", js.Array(value*))
    
    inline def setAfterAddonVdomElement(value: VdomElement): Self = StObject.set(x, "afterAddon", value.rawElement.asInstanceOf[js.Any])
    
    inline def setBeforeAddon(value: VdomNode): Self = StObject.set(x, "beforeAddon", value.rawNode.asInstanceOf[js.Any])
    
    inline def setBeforeAddonNull: Self = StObject.set(x, "beforeAddon", null)
    
    inline def setBeforeAddonUndefined: Self = StObject.set(x, "beforeAddon", js.undefined)
    
    inline def setBeforeAddonVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "beforeAddon", js.Array(value*))
    
    inline def setBeforeAddonVdomElement(value: VdomElement): Self = StObject.set(x, "beforeAddon", value.rawElement.asInstanceOf[js.Any])
  }
}
