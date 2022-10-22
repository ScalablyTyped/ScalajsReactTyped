package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.orbitUiReactComponents.distSharedSrcSizeMod.Size
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIconsSrcEmbeddedIconMod {
  
  @JSImport("@orbit-ui/react-components/dist/icons/src/EmbeddedIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object EmbeddedIcon {
    
    inline def apply(hasSizeChildrenRest: EmbeddedIconProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasSizeChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@orbit-ui/react-components/dist/icons/src/EmbeddedIcon", "EmbeddedIcon")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@orbit-ui/react-components/dist/icons/src/EmbeddedIcon", "EmbeddedIcon.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def embeddedIconSize(size: Size): `2xs` | xs | sm | md | lg | inherit = ^.asInstanceOf[js.Dynamic].applyDynamic("embeddedIconSize")(size.asInstanceOf[js.Any]).asInstanceOf[`2xs` | xs | sm | md | lg | inherit]
  
  trait EmbeddedIconProps
    extends StObject
       with /**
    * Allow any extra props
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * React children.
      */
    var children: Node
    
    /**
      * An icon can vary in size.
      */
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
  }
  object EmbeddedIconProps {
    
    inline def apply(): EmbeddedIconProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[EmbeddedIconProps]
    }
    
    extension [Self <: EmbeddedIconProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
