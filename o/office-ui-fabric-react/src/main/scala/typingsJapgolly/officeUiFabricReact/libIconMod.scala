package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.officeUiFabricReact.libComponentsIconFontIconMod.IIconContent
import typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IFontIconProps
import typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IImageIconProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconMod {
  
  @JSImport("office-ui-fabric-react/lib/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Icon", "FontIcon")
  @js.native
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Icon", "Icon")
  @js.native
  val Icon: FunctionComponent[IIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Icon", "IconBase")
  @js.native
  open class IconBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsIconMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Icon", "IconType")
  @js.native
  object IconType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType & Double
      ] = js.native
    
    /* 0 */ val default: typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType.default & Double = js.native
    
    /* 100000 */ val Default: typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType.Default & Double = js.native
    
    /* 100001 */ val Image: typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType.Image & Double = js.native
    
    /* 1 */ val image: typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType.image & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Icon", "ImageIcon")
  @js.native
  val ImageIcon: FunctionComponent[IImageIconProps] = js.native
  
  inline def getFontIcon(iconName: String): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def getFontIcon(iconName: String, className: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getFontIcon(iconName: String, className: String, ariaLabel: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  inline def getFontIcon(iconName: String, className: Unit, ariaLabel: String): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def getIconContent(): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")().asInstanceOf[IIconContent | Null]
  inline def getIconContent(iconName: String): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")(iconName.asInstanceOf[js.Any]).asInstanceOf[IIconContent | Null]
}
