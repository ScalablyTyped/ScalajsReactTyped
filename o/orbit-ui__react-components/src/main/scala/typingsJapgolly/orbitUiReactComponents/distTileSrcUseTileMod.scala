package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.orbitUiReactComponents.anon.Markup
import typingsJapgolly.orbitUiReactComponents.distSharedSrcTypesMod.InteractionStatesProps
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.checkable
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.horizontal
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.link
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTileSrcUseTileMod {
  
  @JSImport("@orbit-ui/react-components/dist/tile/src/useTile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useTile(hasVariantOrientationActiveFocusHoverChildren: UseTileProps): Markup = ^.asInstanceOf[js.Dynamic].applyDynamic("useTile")(hasVariantOrientationActiveFocusHoverChildren.asInstanceOf[js.Any]).asInstanceOf[Markup]
  
  trait UseTileProps
    extends StObject
       with InteractionStatesProps {
    
    var children: Node
    
    var orientation: horizontal | vertical
    
    var variant: checkable | link
  }
  object UseTileProps {
    
    inline def apply(orientation: horizontal | vertical, variant: checkable | link): UseTileProps = {
      val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[UseTileProps]
    }
    
    extension [Self <: UseTileProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: checkable | link): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
}
