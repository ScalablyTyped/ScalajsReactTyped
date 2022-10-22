package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixStyleReact.distTypesHeadingMod.HeadingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseModalLayoutLayoutBlocksHeaderModalHeadingMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/BaseModalLayout/LayoutBlocks/Header/ModalHeading", JSImport.Default)
  @js.native
  val default: FunctionComponent[ModalHeadingProps] = js.native
  
  trait ModalHeadingProps
    extends StObject
       with HeadingProps {
    
    var headingAppearance: js.UndefOr[
        typingsJapgolly.wixStyleReact.distTypesBaseModalLayoutLayoutBlocksHeaderModalHeadingMod.headingAppearance
      ] = js.undefined
  }
  object ModalHeadingProps {
    
    inline def apply(): ModalHeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModalHeadingProps]
    }
    
    extension [Self <: ModalHeadingProps](x: Self) {
      
      inline def setHeadingAppearance(value: headingAppearance): Self = StObject.set(x, "headingAppearance", value.asInstanceOf[js.Any])
      
      inline def setHeadingAppearanceUndefined: Self = StObject.set(x, "headingAppearance", js.undefined)
    }
  }
  
  type _To = FunctionComponent[ModalHeadingProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesBaseModalLayoutLayoutBlocksHeaderModalHeadingMod.foo` */
  override def _to: FunctionComponent[ModalHeadingProps] = default
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.H2
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom
  */
  trait headingAppearance extends StObject
  object headingAppearance {
    
    inline def H2: typingsJapgolly.wixStyleReact.wixStyleReactStrings.H2 = "H2".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.H2]
    
    inline def custom: typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom = "custom".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.custom]
  }
}
