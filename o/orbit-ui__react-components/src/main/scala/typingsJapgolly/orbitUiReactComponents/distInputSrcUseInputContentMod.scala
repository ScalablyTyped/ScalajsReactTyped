package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.`2xs`
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.inherit
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.lg
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.md
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.sm
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xl
import typingsJapgolly.orbitUiReactComponents.orbitUiReactComponentsStrings.xs
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputSrcUseInputContentMod {
  
  @JSImport("@orbit-ui/react-components/dist/input/src/useInputContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInputButton(button: Element, isActive: Boolean): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def useInputButton(button: Element, isActive: Boolean, props: Record[String, Any]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputButton")(button.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def useInputIcon(icon: Node): typingsJapgolly.react.mod.global.JSX.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  inline def useInputIcon(icon: Node, props: UseInputIconProps): typingsJapgolly.react.mod.global.JSX.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("useInputIcon")(icon.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.react.mod.global.JSX.Element]
  
  /* Inlined std.Omit<@orbit-ui/react-components.@orbit-ui/react-components/dist/icons.EmbeddedIconProps, 'className' | 'children'> */
  trait UseInputIconProps extends StObject {
    
    var size: js.UndefOr[`2xs` | xs | sm | md | lg | xl | inherit] = js.undefined
  }
  object UseInputIconProps {
    
    inline def apply(): UseInputIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseInputIconProps]
    }
    
    extension [Self <: UseInputIconProps](x: Self) {
      
      inline def setSize(value: `2xs` | xs | sm | md | lg | xl | inherit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
