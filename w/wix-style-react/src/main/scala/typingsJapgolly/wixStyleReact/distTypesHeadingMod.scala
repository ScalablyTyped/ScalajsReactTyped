package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLHeadingElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.wixStyleReact.distTypesCommonEllipsisMod.EllipsisCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHeadingMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Heading", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<HeadingProps> */ Any = js.native
  
  @JSImport("wix-style-react/dist/types/Heading", "Heading")
  @js.native
  val Heading: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<HeadingProps> */ Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.H1
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.H2
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.H3
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.H4
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.H5
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.H6
  */
  trait HeadingAppearance extends StObject
  object HeadingAppearance {
    
    inline def H1: typingsJapgolly.wixStyleReact.wixStyleReactStrings.H1 = "H1".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.H1]
    
    inline def H2: typingsJapgolly.wixStyleReact.wixStyleReactStrings.H2 = "H2".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.H2]
    
    inline def H3: typingsJapgolly.wixStyleReact.wixStyleReactStrings.H3 = "H3".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.H3]
    
    inline def H4: typingsJapgolly.wixStyleReact.wixStyleReactStrings.H4 = "H4".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.H4]
    
    inline def H5: typingsJapgolly.wixStyleReact.wixStyleReactStrings.H5 = "H5".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.H5]
    
    inline def H6: typingsJapgolly.wixStyleReact.wixStyleReactStrings.H6 = "H6".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.H6]
  }
  
  trait HeadingProps
    extends StObject
       with HTMLAttributes[HTMLHeadingElement]
       with EllipsisCommonProps {
    
    var appearance: js.UndefOr[HeadingAppearance] = js.undefined
    
    var as: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
      ] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    @JSName("size")
    var size_HeadingProps: js.UndefOr[Size] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    extension [Self <: HeadingProps](x: Self) {
      
      inline def setAppearance(value: HeadingAppearance): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setAs(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 112, starting with typingsJapgolly.wixStyleReact.wixStyleReactStrings.a, typingsJapgolly.wixStyleReact.wixStyleReactStrings.abbr, typingsJapgolly.wixStyleReact.wixStyleReactStrings.address */ Any
      ): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.extraLarge
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.small
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.extraTiny
  */
  trait Size extends StObject
  object Size {
    
    inline def extraLarge: typingsJapgolly.wixStyleReact.wixStyleReactStrings.extraLarge = "extraLarge".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.extraLarge]
    
    inline def extraTiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.extraTiny = "extraTiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.extraTiny]
    
    inline def large: typingsJapgolly.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typingsJapgolly.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  type _To = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<HeadingProps> */ Any
  
  /* This means you don't have to write `default`, but can instead just say `distTypesHeadingMod.foo` */
  override def _to: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.SFC<HeadingProps> */ Any = default
}
